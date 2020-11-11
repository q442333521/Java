package ncl.teach.myabstract;

import ncl.teach.entity.StudentID;
import ncl.teach.myinterface.SchoolSystemInterface;


/**
 * The type School.
 */
abstract public class School implements SchoolSystemInterface {
    @Override
    public void registerStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.myDate DateOfBirth) {

    }
    @Override
    public void amendStudentData(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.myDate DateOfBirth){

    }
    @Override
    public void terminateStudent(StudentID studentIDNumber) {

    }
    @Override
    public void showAllStudent() {

    }
    @Override
    public int noOfStudents(String typeOfStudent) {
        return 0;
    }
}
