package lsj.basic.grade;

// grade service V1
// input, process, output function
// program menu

public interface GradeService {
    void displayMenu();
    GradeVO readGrade();
    void computeGrade(GradeVO go);
    //void writeGrade(GradeVO go);
}
