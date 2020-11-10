package ncl.teach.myinterface;

import ncl.teach.entity.SmartCard;
import ncl.teach.entity.Student;

import java.util.Date;

public interface StudentInterface {

    String GetStudentID();
    String getStudentType();

    void getStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.MyDate DateOfBirth);

    void setCourse();
    String getCourse();
    int getCourseGrade();
    boolean EnoughCredits();


    SmartCard createSmardCard(Student student);

    SmartCard SmartCard(Student student, Date dateOfIssue);


    void setExpiryDate(String strcard, Student student);

    void getExpiryDate(String strcard);


}
