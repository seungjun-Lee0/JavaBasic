package lsj.basic.day10;

// use Interface to program grade calculator

import lsj.basic.grade.GradeVO;

import java.util.Scanner;

public class GradeV5 {
    public static void main(String[] args) {
        // className ObjectName = new className();
        // parentClassName ObjectName = new childClassName();
        // interfaceName ObjectName = new className();

        GradeV5Service gs = new GradeV5ServiceImpl();
        GradeVO go = gs.readGrade();

        gs.computeGrade(go);
        gs.writeGrade(go);
    }
}

interface GradeV5Service {
    GradeVO readGrade();
    void computeGrade(GradeVO gr);
    void writeGrade(GradeVO gr);
}

// class that has been created interface
// is recommended to add "impl" at the end of the class
class GradeV5ServiceImpl implements GradeV5Service{

    @Override
    public GradeVO readGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name");
        String name = sc.nextLine();
        System.out.println("input your kor");
        int kor = sc.nextInt();
        System.out.println("input your eng");
        int eng =  sc.nextInt();
        System.out.println("input your math");
        int math = sc.nextInt();

        return new GradeVO(name, kor ,eng, math);
    }

    @Override
    public void computeGrade(GradeVO gr) {
        gr.setTotal(gr.getKor() + gr.getEng() + gr.getMath());
        gr.setAvg((gr.getTotal() / 3));

        switch((int)gr.getAvg() / 10) {
            case 10 :
            case 9 : gr.setGrade('A'); break;
            case 8 : gr.setGrade('B'); break;
            case 7 : gr.setGrade('C'); break;
            case 6 :
            case 5 : gr.setGrade('D'); break;
            default : gr.setGrade('F');
        }
    }

    @Override
    public void writeGrade(GradeVO gr) {
        String fmt = "%s %d %d %d\n%d %.1f %c\n";
        System.out.printf(fmt,gr.getName(), gr.getKor(), gr.getEng(), gr.getMath(), gr.getTotal(), gr.getAvg(), gr.getGrade());
    }
}