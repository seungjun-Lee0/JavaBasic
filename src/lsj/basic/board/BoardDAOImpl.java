package lsj.basic.board;

import lsj.basic.jdbc.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO {

    private JDBCUtil jdbc;
    private String insertSQL = "INSERT INTO board (title, userid, contents) " +
            " values(?,?,?) ";
    private String selectSQL = "SELECT bdno,userid,title,mid(regdate,1,10),thumbup,views" +
            " FROM board ";
    private String selectOneSQL = "SELECT * FROM board where bdno = ?";

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
        //BoardVO bd = null;
        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(selectSQL);
                ResultSet rs = pstmt.executeQuery();
                ) {
            while (rs.next()) {
                BoardVO bd = new BoardVO();
                bd.setBdno(rs.getString(1));
                bd.setTitle(rs.getString(2));
                bd.setUserid(rs.getString(3));
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
        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(selectOneSQL);
                ){
            pstmt.setInt(1, bdno);
            try(ResultSet rs = pstmt.executeQuery()){
                while(rs.next()){
                    bd.setBdno(rs.getString(1));
                    bd.setTitle(rs.getString(2));
                    bd.setUserid(rs.getString(3));
                    bd.setRegdate(rs.getString(4));
                    bd.setViews(rs.getInt(5));
                    bd.setThumsup(rs.getInt(6));
                    bd.setContents(rs.getString(7));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return bd;
    }

    @Override
    public int updateBoard(BoardVO bd) {
        return 0;
    }

    @Override
    public int deleteBoard(int bd) {
        return 0;
    }
}
