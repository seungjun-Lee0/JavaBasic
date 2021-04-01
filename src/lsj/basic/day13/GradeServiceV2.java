package lsj.basic.day13;

// grade service V1
// input, process, output, edit, remove function
// program menu

import lsj.basic.grade.GradeVO;

public interface GradeServiceV2 {
    void displayMenu();
    void computeGrade(GradeVO go);

    void readGrade();
    void writeListOfGrade();
    void writeGrade();

    void modifyGrade();
    void removeGrade();

}
