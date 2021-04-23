package lsj.basic.lab;

import java.util.List;

public interface EmployeeDAO {
    int insertEmployeeInfo(EmployeeVO emp);
    List<EmployeeVO> selectEmployeeInfo();
    EmployeeVO selectOneEmployeeInfo(int empno);
    int updateEmployeeInfo(EmployeeVO emp);
    int deleteEmployeeInfo(int empno);
}
