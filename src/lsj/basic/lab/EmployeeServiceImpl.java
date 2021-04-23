package lsj.basic.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private final String[] job = {"AD_PRES", "AD_VP", "AD_ASST", "FI_MGR", "FI_ACCOUNT",
            "AC_MGR", "AC_ACCOUNT", "SA_MAN", "SA_REP", "PU_MAN", "PU_CLERK", "ST_MAN",
            "ST_CLERK", "SH_CLERK", "IT_PROG", "MK_MAN", "MK_REP", "HR_REP", "PR_REP"};

    List<EmployeeVO> empData = new ArrayList<>();
    EmployeeVO emp = null;

    private static EmployeeService es = null;
    private  EmployeeServiceImpl() {}

    public static EmployeeService getInstance(){
        if(es == null)
            es = new EmployeeServiceImpl();
            return es;
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
            System.out.println("input employee number");
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

            System.out.println("Successfully read!!");

            emp = new EmployeeVO(empno, fname, lname, email, phone, hdate);
            makeExtInfo(emp);
            empData.add(emp);
        }catch (Exception ex){
            System.out.println("wrong input" + ex);
            return;
        }

    }

    public void makeExtInfo(EmployeeVO emp){
        Random rnd = new Random();

        emp.setJobid(job[rnd.nextInt(job.length)]);
        emp.setSalary(rnd.nextInt(17000-2100)+ 2100);
        emp.setCommission(rnd.nextDouble() / 2);
        emp.setMgrid(rnd.nextInt(205-100) + 100);
        emp.setDeptid(rnd.nextInt(110 - 10) + 10);
    }

    @Override
    public void writeListOfEmployee() {
        String fmt = "[index]: %d [Employee_ID]: %d [First_name]: %s [Last_name]: %s\n" +
                "[Email]: %s [Phone_number]: %s [Hire_date]: %s\n" +
                "------------------------------------------------------------------\n";
        int pos = 0;

        for(EmployeeVO emp : empData){
            System.out.printf(fmt, pos, emp.getEmpno(), emp.getFname(), emp.getLname(),
                    emp.getEmail(), emp.getPhone(), emp.getHdate());
            pos++;
        }
    }

    @Override
    public void writeEmployee() {
        String fmt = "[Employee_ID]: %d [First_name]: %s [Last_name]: %s\n" +
                "[Email]: %s [Phone_number]: %s [Hire_date]: %s\n[Job_ID]: %s [Salary]: $%d" +
                " [Commission]: %.1f\n[Manager_ID]: %d [Department_ID]: %d\n";
        Scanner sc = new Scanner(System.in);
        System.out.println("input the id number of employee");
        int empno = sc.nextInt();

        try{
            for(EmployeeVO e : empData) {
                if(empno == e.getEmpno())

                System.out.printf(fmt, emp.getEmpno(), emp.getFname(), emp.getLname(),
                        emp.getEmail(), emp.getPhone(), emp.getHdate(), emp.getJobid(),
                        emp.getSalary(), emp.getCommission(), emp.getMgrid(), emp.getDeptid());
            }
        }catch (Exception ex){
            System.out.println("Not exist");
            return;
        }

    }

    @Override
    public void modifyEmployee() {

    }

    @Override
    public void removeEmployee() {

    }
}
