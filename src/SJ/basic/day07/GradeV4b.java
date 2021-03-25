package SJ.basic.day07;

import java.util.Scanner;

public class GradeV4b {
    // types of class
    // VO/DTO  : value object/data transfer object
    //           class that is used to store value only
    // Service : class that consists business logic
    //           process before data Persistence
    // DAO     : data access object
    //           class that contains code which is related
    //           to data persistence
    //           mainly add/view/edit/delete data by using database

    public static void main(String[] args) {
            Grade grd = new Grade();
            Grade grd2 = new Grade("seungjun Lee", 87,66,88);
            GradeService grdS = new GradeService();
            grdS.readGrade(grd);
            grdS.calculateGrade(grd);
            grdS.printGrade(grd);
    }
    // compose class of properties and functions
    static class Grade {
        // variables
        private String name;
        private int kor;
        private int eng;
        private int math;
        private int tot;
        private double avg;
        private char grd;

        // constructor
        public Grade() { }

        public Grade(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }}
    static class GradeService {
        // input grade data
        public Grade readGrade(Grade gr){
            Scanner sc = new Scanner(System.in);
            System.out.println("input your name");
            gr.name = sc.nextLine();
            System.out.println("input your kor");
            gr.kor = sc.nextInt();
            System.out.println("input your eng");
            gr.eng = sc.nextInt();
            System.out.println("input your math");
            gr.math = sc.nextInt();
            return null;
        }

        // calculate grade
        public void calculateGrade(Grade gr){
            gr.tot = gr.kor + gr.eng + gr.math;
            gr.avg = (double)gr.tot / 3;

            switch((int)gr.avg / 10) {
                case 10 :
                case 9 : gr.grd = 'A'; break;
                case 8 : gr.grd = 'B'; break;
                case 7 : gr.grd = 'C'; break;
                case 6 :
                case 5 : gr.grd = 'D'; break;
                default : gr.grd = 'F';
            }
        }

        public void printGrade(Grade gr) {
            String fmt = "%s %d %d %d\n%d %.1f %c\n";
            System.out.printf(fmt,gr.name, gr.kor, gr.eng, gr.math, gr.tot, gr.avg, gr.grd);
        }
    }

}
