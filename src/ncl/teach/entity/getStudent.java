package ncl.teach.entity;

import ncl.teach.myabstract.Student;

/**
 * The type Get student.
 */
public class getStudent extends Student {
    /**
     * Instantiates a new Get student.
     *
     * @param studentIDNumber the student id number
     * @param typeOfStudent   the type of student
     * @param firstName       the first name
     * @param lastName        the last name
     * @param dateOfBirth     the date of birth
     */
    public getStudent(String studentIDNumber, String typeOfStudent, String firstName, String lastName, myDate dateOfBirth) {
        this.studentIDNumber = studentIDNumber;
        this.typeOfStudent = typeOfStudent;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.DateOfBirth = DateOfBirth;
    }
}
