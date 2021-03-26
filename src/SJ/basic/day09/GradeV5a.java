package SJ.basic.day09;

public class GradeV5a {
    public static void main(String[] args) {
        MidExam ex = new MidExam("seungjun", 66,64,77);
        ex.computeGrade();
        //ex.outputGrade();

        FinalExam fe = new FinalExam("seungjun", 87,99,99,
                88,96);

        fe.computeGrade();
        fe.outputGrade();
    }
}

class MidExam {
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int total;
    protected double avg;
    protected char grade;

    public MidExam() {}

    public MidExam(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor + eng + math;
        avg = (double) total / 3;
    }

    public void computeGrade() {
        switch ((int) avg / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
            case 5:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
    }

    public void outputGrade() {
        String fmt = "%s %d %d %d\n%d %.1f %c";
        System.out.printf(fmt, name, kor, eng, math, total, avg, grade);
    }
}

class FinalExam extends MidExam{
    private int soc;
    private int sci;

    public FinalExam() {}

    public FinalExam(String name, int kor, int eng, int math, int soc, int sci) {
        super(name, kor, eng, math);
        this.soc = soc;
        this.sci = sci;

        total = kor + eng + math + soc + sci;
        avg = (double) total / 5;
    }

    @Override
    public void computeGrade() {
        super.computeGrade();
    }

    public void outputGrade() {
        String fmt = "%s %d %d %d %d %d\n%d %.1f %c";
        System.out.printf(fmt, name, kor, eng, math, soc, sci, total, avg, grade);
    }

}