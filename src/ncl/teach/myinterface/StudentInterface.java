package ncl.teach.myinterface;

import ncl.teach.entity.SmartCard;
import ncl.teach.myabstract.Student;

import java.util.Date;

/**
 * The interface is Student interface.
 */
public interface StudentInterface {

    /**
     * Get student id string.
     *
     * @return the string
     */
    String GetStudentID();

    /**
     * Gets student type.
     *
     * @return the student type
     */
    String getStudentType();

    /**
     * Gets student.
     *
     * @param studentIDNumber the student id number
     * @param typeOfStudent   the type of student
     * @param FirstName       the first name
     * @param LastName        the last name
     * @param DateOfBirth     the date of birth
     */
    void getStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.myDate DateOfBirth);

    /**
     * Sets course.
     */
    void setCourse();

    /**
     * Gets course.
     *
     * @return the course
     */
    String getCourse();

    /**
     * Gets course grade.
     *
     * @return the course grade
     */
    int getCourseGrade();

    /**
     * To judge the student get enough credits or not.
     *
     * @return the boolean
     */
    boolean EnoughCredits();


    /**
     * Create smard card smart card.
     *
     * @param student the student
     * @return the smart card
     */
    SmartCard createSmardCard(Student student);

    /**
     * Smart card smart card.
     *
     * @param student     the student
     * @param dateOfIssue the date of issue
     * @return the smart card
     */
    SmartCard SmartCard(Student student, Date dateOfIssue);


    /**
     * Sets Smartcard expiry date.
     *
     * @param strcard the strcard
     * @param student the student
     */
    void setExpiryDate(String strcard, Student student);

    /**
     * Gets Smartcard expiry date.
     *
     * @param strcard the strcard
     */
    void getExpiryDate(String strcard);


}
