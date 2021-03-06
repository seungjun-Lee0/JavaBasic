package lsj.basic.grade;

import java.io.Serializable;

public class GradeVO  implements Serializable {
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int total;
    protected double avg;
    protected char grade;

    public GradeVO(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        String fmt = "{name = %s, Korean = %d, English = %d, Math = %d, total = %d, Average = %.1f, Grade = %c }";
        String result = String.format(fmt, name, kor, eng, math, total, avg, grade);
        return result;
    }
}


