package uk.ac.ncl.teach.schoolSystem;

import java.util.*;

import uk.ac.ncl.teach.students.*;

import uk.ac.ncl.teach.students.studentInterface;
import uk.ac.ncl.teach.students.studentID;

/**
 * {@code DefaultCarRentalApplication} is an implementation of the student rental
 * system interface, as it extends {@code AbstractCarRentalSystem}. It provides
 * the functionality of the simple student rental system described in the System
 * overview section.
 */
public class SchoolSystemapp extends AbstractSchoolSystem {

    private int UG = 0;
    private int PGT = 0;
    private int PGR = 0;

    private int UGgrade = 120;
    private int PGTgrade = 180;
    private int PGRgrade = 0;

    private Map<studentID,Student> students = new HashMap<>();

    public SchoolSystemapp() {
        totalStudents = new ArrayList<studentInterface>();
        currentlyStudents = new HashMap<String, studentInterface>();

    }

//    public void issueCar(SmartCard smartstudentd, AbstractSmartCard Astudentd, String typeOfStudent) {
//        Student eligibleCar = null;
//        if (availableCars(typeOfStudent) == 0) {
//            System.out.println("Cannot issue student.");
//            return;
//        }
//
//        for (Drivable student : totalAvailableCars) {
//            if (student.getType().equals(typeOfStudent) && student.isActive()) {
//                eligibleCar = (Car) student;
//            }
//        }
//
//        if (eligibleCar == null) {
//            System.out.println("Cannot issue student.");
//            return;
//        }
//
//        if (!Astudentd.isLicenceFull()) {
//            System.out.println("Cannot issue student.");
//            return;
//        }
//
//        if (currentlyRentedCars.get(smartstudentd.toString()) != null) {
//            System.out.println("Cannot issue student.");
//            return;
//        }
//
//        int yearsOld = Utility.calculateAge(smartstudentd.getDateOfBirth());
//        int yearsDriver = Utility.calculateAge(Astudentd.getDateOfIssue());
//
//        if (typeOfStudent.equals("small")) {
//            if (yearsOld < 20 || yearsDriver < 1) {
//                System.out.println("Cannot issue student.");
//                return;
//            }
//        } else if (typeOfStudent.equals("large")) {
//            if (yearsOld < 25 || yearsDriver < 5) {
//                System.out.println("Cannot issue student.");
//                return;
//            }
//        }
//
//        this.currentlyRentedCars.put(smartstudentd.toString(), eligibleCar);
//        eligibleCar.deactivate();
//        System.out.println("Rental contract issued for " + smartstudentd.toString());
//        eligibleCar.addFuel(eligibleCar.getTotalFuelCapacity());
//
//    }




    /**
     * This method will add a student to the list of available students to rent. In
     * order for the application to function correctly, created students need to be
     * added using this method.
     * <p>
     * Since this class implements the student rental system for the student rental
     * company described in the system overview section, this method restricts
     * the total number of small and large students that can be added to the
     * application to 20 and 10 respectively.
     * </p>
     *

     *
     */

    public void registerStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.MyDate DateOfBirth) {
        Student s = new Student(studentIDNumber,typeOfStudent,FirstName,LastName,DateOfBirth);
        /**
         * 返回与键关联的前一个值，如果没有键的映射，则为空
         */
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
