package ncl.teach.myinterface;

import ncl.teach.entity.StudentID;
import ncl.teach.myabstract.Student;

/**
 * The interface is School system interface.
 */
public interface SchoolSystemInterface {
     /**
      * Register student.
      *
      * @param studentIDNumber the student id number
      * @param typeOfStudent   the type of student
      * @param FirstName       the first name
      * @param LastName        the last name
      * @param DateOfBirth     the date of birth
      */
     void registerStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.myDate DateOfBirth);

     /**
      * Amend student data.
      *
      * @param studentIDNumber the student id number
      * @param typeOfStudent   the type of student
      * @param FirstName       the first name
      * @param LastName        the last name
      * @param DateOfBirth     the date of birth
      */
     void amendStudentData(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.myDate DateOfBirth);


     /**
      * Terminate student.
      *
      * @param studentIDNumber the student id number
      */
     void terminateStudent(StudentID studentIDNumber) ;


     /**
      * Show all student.
      */
     void showAllStudent() ;


     /**
      * No of students int.
      *
      * @param typeOfStudent the type of student
      * @return the int
      */
     int noOfStudents(String typeOfStudent);
}
