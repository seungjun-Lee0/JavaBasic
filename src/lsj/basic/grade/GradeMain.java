package lsj.basic.grade;

public class GradeMain {
    public static void main(String[] args) {
        //GradeService gs = new GradeServiceImpl();
        GradeService gs = GradeServiceImpl.getInstance();

        GradeVO go = gs.readGrade();
        gs.computeGrade(go);
        System.out.println(go.toString());
        //gs.writeGrade(go);
    }
}
