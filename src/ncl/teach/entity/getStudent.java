package ncl.teach.entity;

import ncl.teach.myabstract.Student;

public class getStudent extends Student {
    public getStudent(String studentIDNumber, String typeOfStudent, String firstName, String lastName, MyDate dateOfBirth) {
        this.studentIDNumber = studentIDNumber;
        this.typeOfStudent = typeOfStudent;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.DateOfBirth = DateOfBirth;
    }
}
