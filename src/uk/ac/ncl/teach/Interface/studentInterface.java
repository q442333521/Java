package uk.ac.ncl.teach.Interface;

import uk.ac.ncl.teach.Module.studentID;

public interface studentInterface {

    studentID GetStudentID();
    String getStudentType();

    void getStudentModule();
    boolean getStudentGrade();
    String toString();


}
