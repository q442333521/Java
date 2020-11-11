package ncl.teach.entity;

import ncl.teach.myabstract.School;
import ncl.teach.myabstract.Student;

import java.util.*;

/**
 * The type School system.
 */
public class SchoolSystem extends School {

    private Map<StudentID, Student> students = new HashMap<>();
    private StudentID StudentID = new StudentID();
    @Override
    public void registerStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.myDate DateOfBirth) {
        Student s = new getStudent(studentIDNumber,typeOfStudent,FirstName,LastName,DateOfBirth);
        students.put(StudentID.valueOf(studentIDNumber),s);
        System.out.println(" Registered successfully");
    }
    @Override
    public void amendStudentData(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.myDate DateOfBirth){
        Student s = new getStudent(studentIDNumber, typeOfStudent,FirstName,LastName,DateOfBirth);
        s.setsid(StudentID.valueOf(studentIDNumber));
        s.settypeOfStudent(typeOfStudent);
        s.setFirstName(FirstName);
        s.setLastName(LastName);
        s.setDateOfBirth(DateOfBirth);
        students.put(StudentID.valueOf(studentIDNumber),s);
        System.out.println(" Amend successfully");

    }
    @Override
    public void terminateStudent(StudentID studentIDNumber) {
        Student student = students.remove(studentIDNumber);
        System.out.println("terminateStudent "+ studentIDNumber+" successfully");
    }
    @Override
    public void showAllStudent() {
        Set<StudentID> sids = students.keySet();
        Iterator<StudentID> iterator = sids.iterator();
        System.out.println("--------All Student--------");
        while(iterator.hasNext()) {
            StudentID sid = iterator.next();
            Student student  =  students.get(sid);
            System.out.println(student);
        }
        System.out.println("----------------END----------------");
    }
    @Override
    public int noOfStudents(String typeOfStudent) {
        int count = 0;
        Set<StudentID> sids = students.keySet();//return the value at map

        for (StudentID sid : sids) {
            Student student = students.get(sid);

            if (student.getStudentType().equals(typeOfStudent)) {
                count++;
            }
        }
        return count;
    }
}
