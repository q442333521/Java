package uk.ac.ncl.teach.Module;

import java.util.*;

import uk.ac.ncl.teach.Module.Student;
import uk.ac.ncl.teach.Abstract.AbstractSchoolSystem;
import uk.ac.ncl.teach.Module.studentID;

public class SchoolSystemapp extends AbstractSchoolSystem {

    private Map<studentID, Student> students = new HashMap<>();

    public void registerStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.MyDate DateOfBirth) {
        Student s = new Student(studentIDNumber,typeOfStudent,FirstName,LastName,DateOfBirth);
        students.put(studentID.valueOf(studentIDNumber),s);
        System.out.println(" Registered successfully");
    }
    public void amendStudentData(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.MyDate DateOfBirth){
        Student s = new Student(studentIDNumber, typeOfStudent,FirstName,LastName,DateOfBirth);
        s.setsid(studentID.valueOf(studentIDNumber));
        s.settypeOfStudent(typeOfStudent);
        s.setFirstName(FirstName);
        s.setLastName(LastName);
        s.setDateOfBirth(DateOfBirth);
        students.put(studentID.valueOf(studentIDNumber),s);
        System.out.println(" Amend successfully");

    }

    public void terminateStudent(studentID studentIDNumber) {
        Student student = students.remove(studentIDNumber);
        System.out.println("terminateStudent "+ studentIDNumber+" successfully");
    }
    public void showAllStudent() {
        //得到所有的学生信息
        Set<studentID> sids = students.keySet();//返回包含在映射中得值
        Iterator<studentID> iterator = sids.iterator();//返回该集合中元素的迭代
        System.out.println("--------All Student--------");
        while(iterator.hasNext()) {//如果是真，则继续返回元素，而不是抛出异常
            studentID sid = iterator.next();//把下一个迭代赋给学号
            Student student  =  students.get(sid);//根据学号获得对象,返回关联值 （Student) 的键
            System.out.println(student);
        }
        System.out.println("----------------END----------------");
    }

    public int noOfStudents(String typeOfStudent) {
        int count = 0;
        Set<studentID> sids = students.keySet();//返回包含在映射中得值
        //返回该集合中元素的迭代
        //把下一个迭代赋给学号
        for (studentID sid : sids) {
            Student student = students.get(sid);//根据学号获得对象,返回关联值 （Student) 的键

            if (student.getStudentType().equals(typeOfStudent)) {
                count++;
            }
        }
        return count;
    }
}