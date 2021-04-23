package lsj.basic.lab;

import lsj.basic.board.BoardDAOImpl;
import lsj.basic.jdbc.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private JDBCUtil jdbc;

    String insertSQL = "INSERT INTO employee (fname,lname,email," +
            "phone,hdate,jobid,salary,commission,mgrid,deptid) " +
            "values (?,?,?,?,?,?,?,?,?,?) ";
    String selectSQL = "SELECT empno,fname,lname,jobid,salary FROM employee ";
    String selectOneSQL = "SELECT * FROM employee WHERE empno = ? ";
    String updateSQL = "UPDATE employee SET fname = ?, lname = ?, email = ?, phone = ?," +
            "hdate = ?, jobid = ?, salary = ?, commission = ?, mgrid = ?, deptid = ?, " +
            "regdate = current_timestamp WHERE empno = ?";
    String deleteSQL = "DELETE FROM employee WHERE empno = ?";

    public EmployeeDAOImpl() { jdbc = new JDBCUtil(); }

    @Override
    public int insertEmployeeInfo(EmployeeVO emp) {
        int cnt = 0;
        try(
                PreparedStatement pstmt = connection(insertSQL);
                ){
            pstmt.setString(1, emp.getFname());
            pstmt.setString(2, emp.getLname());
            pstmt.setString(3, emp.getEmail());
            pstmt.setString(4, emp.getPhone());
            pstmt.setString(5, emp.getHdate());
            pstmt.setString(6, emp.getJobid());
            pstmt.setInt(7, emp.getSalary());
            pstmt.setDouble(8, emp.getCommission());
            pstmt.setInt(9, emp.getMgrid());
            pstmt.setInt(10, emp.getDeptid());

            cnt = pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return cnt;
    }

    @Override
    public List<EmployeeVO> selectEmployeeInfo() {
        List<EmployeeVO> empList = new ArrayList<>();
        try(
                PreparedStatement pstmt = connection(selectSQL);
                ResultSet rs = pstmt.executeQuery();
                ){
            while(rs.next()){
                EmployeeVO emp = new EmployeeVO();
                emp.setEmpno(rs.getInt(1));
                emp.setFname(rs.getString(2));
                emp.setLname(rs.getString(3));
                emp.setJobid(rs.getString(4));
                emp.setSalary(rs.getInt(5));
                empList.add(emp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return empList;
    }

    @Override
    public EmployeeVO selectOneEmployeeInfo(int empno) {
        EmployeeVO emp = new EmployeeVO();
        try(
                PreparedStatement pstmt = connection(selectOneSQL);
                ){
                pstmt.setInt(1,empno);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()){
                    emp.setEmpno(rs.getInt(1));
                    emp.setFname(rs.getString(2));
                    emp.setLname(rs.getString(3));
                    emp.setEmail(rs.getString(4));
                    emp.setPhone(rs.getString(5));
                    emp.setHdate(rs.getString(6));
                    emp.setJobid(rs.getString(7));
                    emp.setSalary(rs.getInt(8));
                    emp.setCommission(rs.getDouble(9));
                    emp.setMgrid(rs.getInt(10));
                    emp.setDeptid(rs.getInt(11));
                    emp.setRegdate(rs.getString(12));
                }
        }catch (Exception e){
            e.printStackTrace();
        }
        return emp;
    }

    @Override
    public int updateEmployeeInfo(EmployeeVO emp) {
        int cnt = 0;
        try(
                PreparedStatement pstmt = connection(updateSQL);
                ){
            pstmt.setString(1, emp.getFname());
            pstmt.setString(2, emp.getLname());
            pstmt.setString(3, emp.getEmail());
            pstmt.setString(4, emp.getPhone());
            pstmt.setString(5, emp.getHdate());
            pstmt.setString(6, emp.getJobid());
            pstmt.setInt(7, emp.getSalary());
            pstmt.setDouble(8, emp.getCommission());
            pstmt.setInt(9, emp.getMgrid());
            pstmt.setInt(10, emp.getDeptid());
            pstmt.setInt(11, emp.getEmpno());
            cnt = pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return cnt;
    }

    @Override
    public int deleteEmployeeInfo(int empno) {
        int cnt = 0;
        try(
                PreparedStatement pstmt = connection(deleteSQL);
                ){
            pstmt.setInt(1, empno);
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
