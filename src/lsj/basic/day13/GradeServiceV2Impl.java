package lsj.basic.day13;

import lsj.basic.grade.GradeVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeServiceV2Impl implements GradeServiceV2{

    // declare member variables
    // declare dynamic array list that save grade data
    List<GradeVO> goData = new ArrayList<>();
    GradeVO go = null;

    private  static GradeServiceV2 gs = null;

    private GradeServiceV2Impl() {}

    public static GradeServiceV2 getInstance() {
        if(gs == null)
            gs = new GradeServiceV2Impl();
        return gs;
    }

    @Override
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);


        String displayMenu =
                          "-------------------------\n"
                        + "     Grade Calculator	\n"
                        + "-------------------------\n"
                        + "1. input grade			\n"
                        + "2. view grade			\n"
                        + "3. detail view grade 	\n"
                        + "4. edit grade 			\n"
                        + "5. delete grade			\n"
                        + "0. program exit 			\n"
                        + "-------------------------\n"
                        + "choose option:";

        System.out.println(displayMenu);
    }

    @Override
    public void readGrade() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("input your name");
            String name = sc.nextLine();
            System.out.println("input your kor");
            int kor = sc.nextInt();
            System.out.println("input your eng");
            int eng = sc.nextInt();
            System.out.println("input your math");
            int math = sc.nextInt();
            System.out.println("Successfully read!!");

            // make input grade data to object
            GradeVO go = new GradeVO(name, kor, eng, math);
            // calculate grade data
            computeGrade(go);
            // save grade data to the dynamic array list
            goData.add(go);
        } catch( Exception ex){
            System.out.println("wrong input");
            return;
        }
    }

    // output list of index, korean, english, math
    @Override
    public void writeListOfGrade() {
        String fmt = "index: %d name: %s Korean: %d English: %d Math: %d\n";
        int pos = 0;

        for(GradeVO go : goData){
            System.out.printf(fmt, pos, go.getName(),
                    go.getKor(), go.getEng(), go.getMath());
            pos++;
        }
    }

    @Override
    public void computeGrade(GradeVO go) {
        go.setTotal(go.getKor() + go.getEng() + go.getMath());
        go.setAvg((go.getTotal() / 3));

        switch ((int) go.getAvg() / 10) {
            case 10:
            case 9:
                go.setGrade('A');
                break;
            case 8:
                go.setGrade('B');
                break;
            case 7:
                go.setGrade('C');
                break;
            case 6:
            case 5:
                go.setGrade('D');
                break;
            default:
                go.setGrade('F');
        }
    }

    @Override
    public void writeGrade() {
        String fmt = "number: %d name: %s Korean: %d English: %d Math: %d\n" +
                "total: %d Average: %.1f Grade: %c\n\n\n";
        Scanner sc = new Scanner(System.in);
        System.out.print("input the number of student");
        int pos = sc.nextInt();
        try{
            GradeVO go = goData.get(pos);
            System.out.printf(fmt, pos, go.getName(), go.getKor(), go.getEng(),
                    go.getMath(), go.getTotal(), go.getAvg(), go.getGrade());
        }catch (Exception ex){
            System.out.println("data does not exist");
        }
    }

    @Override
    public void modifyGrade() {

    }

    @Override
    public void removeGrade() {

    }
}
