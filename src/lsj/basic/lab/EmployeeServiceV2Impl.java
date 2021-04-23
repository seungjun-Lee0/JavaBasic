package lsj.basic.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceV2Impl implements EmployeeService {

    // 싱글톤 패턴 사용
    private static EmployeeService empsrv = null;
    private static EmployeeDAO empdao = null;

    private EmployeeServiceV2Impl() { empdao = new EmployeeDAOImpl(); }

    public static EmployeeService getInstance(){
        if(empsrv == null) empsrv = new EmployeeServiceV2Impl();
        return empsrv;
    }

    @Override
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);

        String displayMenu =
                          "-------------------------\n"
                        + "    Employee database 	\n"
                        + "-------------------------\n"
                        + "1. input information		\n"
                        + "2. view list of employee	\n"
                        + "3. view employee      	\n"
                        + "4. edit employee info	\n"
                        + "5. delete employee info	\n"
                        + "0. program exit 			\n"
                        + "-------------------------\n"
                        + "choose option:";

        System.out.print(displayMenu);
    }

    @Override
    public void readEmployee() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("input first name");
            String fname = sc.next();

            System.out.println("input last name");
            String lname = sc.next();

            System.out.println("input your email");
            String email = sc.next();

            System.out.println("input your phone");
            String phone = sc.next();

            System.out.println("input your hdate");
            String hdate = sc.next();

            System.out.println("input your job id");
            String jobid = sc.next();

            System.out.println("input your salary");
            int salary = sc.nextInt();

            System.out.println("input your commission");
            double commission = sc.nextDouble();

            System.out.println("input your manager id");
            int mgrid = sc.nextInt();

            System.out.println("input your department id");
            int depid = sc.nextInt();

            EmployeeVO emp = new EmployeeVO(fname, lname, email, phone, hdate,
                                    jobid, salary, commission, mgrid, depid);

            int cnt = empdao.insertEmployeeInfo(emp);
            if (cnt > 0) System.out.println("data successfully added");

        }catch (Exception ex){
            System.out.println("wrong input");
            return;
        }
    }

    @Override
    public void writeListOfEmployee() {
        String fmt = "                                     employee list\n" +
                "---------------------------------------------------------------------------------------\n";
        String fmt2 = "[Employee_ID]: %d [First_name]: %s [Last_name]: %s " +
                "[Job_id]: %s [Salary]: $%d\n" +
                "---------------------------------------------------------------------------------------\n";
        ArrayList<EmployeeVO> empList = (ArrayList<EmployeeVO>) empdao.selectEmployeeInfo();

        StringBuffer sb = new StringBuffer();
        for(EmployeeVO emp : empList){
            String result =  String.format(fmt2, emp.getEmpno(), emp.getFname(), emp.getLname(),
                    emp.getJobid(), emp.getSalary());
            sb.append(result);
        }
        System.out.println(fmt + sb.toString());
    }

    @Override
    public void writeEmployee() {
        String fmt = "[Employee_ID]: %d [First_name]: %s [Last_name]: %s\n" +
                "[Email]: %s [Phone_number]: %s [Hire_date]: %s\n[Job_ID]: %s [Salary]: $%d" +
                " [Commission]: %.1f\n[Manager_ID]: %d [Department_ID]: %d\n[Reg_date]: %s";

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("input employee id number");
            int empno = sc.nextInt();
            EmployeeVO emp = empdao.selectOneEmployeeInfo(empno);

            if(emp.getEmpno() == 0){
                System.out.println("employee does not exist");
            }
            else {
                String result = String.format(fmt, emp.getEmpno(), emp.getFname(), emp.getLname(),
                        emp.getEmail(), emp.getPhone(), emp.getHdate(), emp.getJobid(),
                        emp.getSalary(), emp.getCommission(), emp.getMgrid(),
                        emp.getDeptid(), emp.getRegdate());
                System.out.println(result);
            }
        }catch (Exception e){
            System.out.println("wrong input");
            return;
        }
    }

    @Override
    public void modifyEmployee() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("input employee id number to update new information");
            int empno = sc.nextInt();

            System.out.println("input first name");
            String fname = sc.next();

            System.out.println("input last name");
            String lname = sc.next();

            System.out.println("input your email");
            String email = sc.next();

            System.out.println("input your phone");
            String phone = sc.next();

            System.out.println("input your hdate");
            String hdate = sc.next();

            System.out.println("input your job id");
            String jobid = sc.next();

            System.out.println("input your salary");
            int salary = sc.nextInt();

            System.out.println("input your commission");
            double commission = sc.nextDouble();

            System.out.println("input your manager id");
            int mgrid = sc.nextInt();

            System.out.println("input your department id");
            int depid = sc.nextInt();


            EmployeeVO emp = new EmployeeVO(fname, lname, email, phone,
                    hdate, jobid, salary, commission, mgrid, depid);
            emp.setEmpno(empno);
            int cnt = empdao.updateEmployeeInfo(emp);
            if(cnt > 0) {
                System.out.println("successfully updated");
            }
            else{
                System.out.println("employee does not exist");
            }
        }catch (Exception e){
            System.out.println("wrong input");
            return;
        }

    }

    @Override
    public void removeEmployee() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("input employee id number to delete old information");
            int empno = sc.nextInt();

            int cnt = empdao.deleteEmployeeInfo(empno);
            if (cnt > 0) {
                System.out.println("successfully deleted");
            } else {
                System.out.println("employee does not exist");
                return;
            }
        }catch (Exception e){
            System.out.println("wrong input");
            return;
        }
    }

}
