package SJ.basic.day07;

import java.util.Scanner;

public class GradeV4 {
    public static void main(String[] args) {
        Grade grd = new Grade("seungjun", 97, 88, 38);

        grd.gradeCalculator();
        System.out.printf(grd.toString());
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
        }

        // calculate grade
        public void gradeCalculator(){
            tot = kor + eng + math;
            avg = (double)tot / 3;

            switch((int)avg / 10) {
                case 10 :
                case 9 : grd = 'A'; break;
                case 8 : grd = 'B'; break;
                case 7 : grd = 'C'; break;
                case 6 :
                case 5 : grd = 'D'; break;
                default : grd = 'F';
            }
        }

        @Override
        public String toString() {
            return "Grade{ name="  + name  + ", kor="  + kor   +
                    ", eng="  + eng   + ", math=" + math  +
                    ", tot="  + tot   + ", avg="  + avg   +
                    ", grd="  + grd   + '}';
        }
    }

}
