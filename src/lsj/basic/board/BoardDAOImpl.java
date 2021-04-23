package lsj.basic.board;

import lsj.basic.jdbc.JDBCUtil;
import oracle.jdbc.proxy.annotation.Pre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO {

    private JDBCUtil jdbc;
    private String insertSQL = "INSERT INTO board (title, userid, contents) " +
            " values(?,?,?) ";
    private String selectSQL = "SELECT bdno,userid,title,mid(regdate,1,10),thumbup,views" +
            " FROM board ";
    private String selectOneSQL = "SELECT * FROM board where bdno = ?";
    private String addViews = "UPDATE board set views = views + 1 where bdno = ?";
    private String thumpsUp = "UPDATE board set thumbup = thumbup + 1 where bdno = ?";
    private String updateSQL = "UPDATE board \n" +
            "set title = ?, contents = ?, regdate = current_timestamp \n" +
            "where bdno = ? ";
    private String deleteSQL = "DELETE FROM board where bdno = ? ";

    public BoardDAOImpl() { jdbc = new JDBCUtil(); }

    @Override
    public int insertBoard(BoardVO bd) {
        int cnt = 0;
        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(insertSQL);
                ){
            pstmt.setString(1, bd.getTitle());
            pstmt.setString(2, bd.getUserid());
            pstmt.setString(3, bd.getContents());

            cnt = pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

        return cnt;
    }

    @Override
    public List<BoardVO> selectBoard() {
        List<BoardVO> bdList = new ArrayList<>();
        try(
                PreparedStatement pstmt = connection(selectSQL);
                ResultSet rs = pstmt.executeQuery();
                ) {
            while (rs.next()) {
                BoardVO bd = new BoardVO();
                bd.setBdno(rs.getString(1));
                bd.setUserid(rs.getString(2));
                bd.setTitle(rs.getString(3));
                bd.setRegdate(rs.getString(4));
                bd.setThumsup(rs.getInt(5));
                bd.setViews(rs.getInt(6));
                bdList.add(bd);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return bdList;
    }

    @Override
    public BoardVO selectOneBoard(int bdno) {
        BoardVO bd = new BoardVO();
        try(PreparedStatement pstmt = connection(selectOneSQL);
            PreparedStatement pstmt2 = connection(addViews)) {
            pstmt.setInt(1, bdno);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                bd.setBdno(rs.getString(1));
                bd.setTitle(rs.getString(2));
                bd.setUserid(rs.getString(3));
                bd.setRegdate(rs.getString(4));
                bd.setViews(rs.getInt(5));
                bd.setThumsup(rs.getInt(6));
                bd.setContents(rs.getString(7));
            }
            pstmt2.setString(1, bd.getBdno());
            pstmt2.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return bd;
    }

    @Override
    public int thumpsUP(BoardVO bd) {
        int cnt = 0;
        try(PreparedStatement pstmt = connection(thumpsUp)){
            pstmt.setString(1, bd.getBdno());
            cnt = pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return cnt;
    }

    @Override
    public int updateBoard(BoardVO bd) {
        int cnt = 0;
        try(PreparedStatement pstmt = connection(updateSQL)){
            pstmt.setString(1, bd.getTitle());
            pstmt.setString(2, bd.getContents());
            pstmt.setString(3, bd.getBdno());
            cnt = pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

        return cnt;
    }

    @Override
    public int deleteBoard(int bd) {
        int cnt = 0;
        try(PreparedStatement pstmt = connection(deleteSQL)){
            pstmt.setInt(1, bd);
            cnt = pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return cnt;
    }

    public PreparedStatement connection(String sql) throws SQLException {
        Connection conn = jdbc.openConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        return pstmt;
    }
}
