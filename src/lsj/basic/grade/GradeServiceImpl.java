package lsj.basic.grade;

import java.util.Scanner;

public class GradeServiceImpl implements GradeService{

    // singleton pattern
    private  static GradeService gs = null;

    private GradeServiceImpl() {}

    public static GradeService getInstance() {
        if(gs == null)
            gs = new GradeServiceImpl();
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

        System.out.println("Successfully read!!");

        return new GradeVO(name, kor ,eng, math);
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

    /*@Override
    public void writeGrade(GradeVO go) {
        String fmt = "name: %s Korean: %d English: %d Math: %d\ntotal: %d Average: %.1f Grade: %c\n\n\n";
        System.out.printf(fmt,go.getName(), go.getKor(), go.getEng(), go.getMath(), go.getTotal(), go.getAvg(), go.getGrade());
    }*/
}

