package lsj.basic.lab;

public class EmployeeVO {
    protected int empno;
    protected String fname;
    protected String lname;
    protected String email;
    protected String phone;
    protected String hdate;
    protected String jobid;
    protected int salary;
    protected double commission;
    protected int mgrid;
    protected int deptid;
    protected String regdate;

    public EmployeeVO() {};

    public EmployeeVO(int empno, String fname, String lname, String email, String phone, String hdate) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
    }

    public EmployeeVO(String fname, String lname, String email, String phone, String hdate, String jobid, int salary, double commission, int mgrid, int deptid) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
        this.jobid = jobid;
        this.salary = salary;
        this.commission = commission;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    public EmployeeVO(int empno, String fname, String lname, String email, String phone, String hdate, String jobid, int salary, double commission, int mgrid, int deptid, String regdate) {
        // 이미 정의한 생성자를 호출해서 값들을 초기화함
        this(empno, fname, lname, email, phone, hdate);
        this.jobid = jobid;
        this.salary = salary;
        this.commission = commission;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", hdate='" + hdate + '\'' +
                ", jobid='" + jobid + '\'' +
                ", salary=" + salary +
                ", commission=" + commission +
                ", mgrid=" + mgrid +
                ", deptid=" + deptid +
                '}';
    }
}
