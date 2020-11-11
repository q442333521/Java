package ncl.teach.myabstract;

import ncl.teach.entity.SmartCard;
import ncl.teach.entity.StudentID;
import ncl.teach.myinterface.StudentInterface;

import java.util.Date;

/**
 * The type Student.
 */
public abstract class Student implements StudentInterface {

    /**
     * The Student id number.
     */
    protected  String studentIDNumber;
    /**
     * The Type of student.
     */
    protected  String typeOfStudent;
    /**
     * The First name.
     */
    protected  String FirstName;
    /**
     * The Last name.
     */
    protected  String LastName;
    /**
     * The Date of birth.
     */
    protected myDate DateOfBirth;
    /**
     * The Part.
     */
    protected static String[] part;

    /**
     * Instantiates a new Student.
     */
    public Student(){}
    @Override
    public void getStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, myDate DateOfBirth) {
        this.studentIDNumber = studentIDNumber;
        this.typeOfStudent = typeOfStudent;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
    }
    @Override
    public void setCourse(){ };
    @Override
    public String getCourse(){
        return null;
    };
    @Override
    public int getCourseGrade() {
        return 0;
    }
    @Override
    public boolean EnoughCredits(){
        return true;
    }

    @Override
    public String GetStudentID() {
        return studentIDNumber;
    }

    /**
     * Get part of student id string.
     *
     * @param components the components
     * @return the string
     */
    public static String GetPartOfStudentID(String components){
        part = new String[2];
        part[0] = components.substring(0,1);
        part[1] = components.substring(1,5);
        return "Part1:" +part[0] + "   Part2:" + part[1];
    }


    /**
     * The type My date.
     */
    public static class myDate {
        private static int day = 0;
        private static int month = 0;
        private static int year = 0;

        /**
         * Instantiates a new My date.
         *
         * @param day   the day
         * @param month the month
         * @param year  the year
         */
        public myDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;

        }

        /**
         * Gets day.
         *
         * @return the day
         */
        public static int getDay() {
            return day;
        }

        /**
         * Gets month.
         *
         * @return the month
         */
        public static int getMonth() {
            return month;
        }

        /**
         * Gets year.
         *
         * @return the year
         */
        public static int getYear() {
            return year;
        }
    }



    public String getStudentType() {
        return typeOfStudent;
    }


    /**
     * Sets .
     *
     * @param studentIDNumber the student id number
     */
    public void setsid(StudentID studentIDNumber) {
        this.studentIDNumber= String.valueOf(studentIDNumber);
    }

    /**
     * Gets of student.
     *
     * @return the of student
     */
    public String  gettypeOfStudent() {
        return typeOfStudent;
    }

    /**
     * Sets of student.
     *
     * @param typeOfStudent the type of student
     */
    public void settypeOfStudent(String typeOfStudent) {
        this.typeOfStudent=typeOfStudent;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String  getFirstName() { return FirstName; }

    /**
     * Sets first name.
     *
     * @param FirstName the first name
     */
    public void setFirstName(String FirstName) {
        this.FirstName=FirstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String  getLastName() {
        return LastName;
    }

    /**
     * Sets last name.
     *
     * @param LastName the last name
     */
    public void setLastName(String LastName) {
        this.LastName=LastName;
    }

    /**
     * Gets date of birth.
     *
     * @return the date of birth
     */
    public myDate getDateOfBirth() {return DateOfBirth; }

    /**
     * Sets date of birth.
     *
     * @param DateOfBirth the date of birth
     */
    public void setDateOfBirth(myDate DateOfBirth) {
        this.DateOfBirth=DateOfBirth;
    }


    public SmartCard createSmardCard(Student student){
        return null;
    };
    public SmartCard SmartCard(Student student, Date dateOfIssue){
        return null;
    };
    public void setExpiryDate(String strcard, Student student){};
    public void getExpiryDate(String strcard){};
    public String toString() {
        return   GetStudentID() + " " + getStudentType()+ " " +  getFirstName()+ " " +  getLastName()  + " " + getDateOfBirth().getDay()+ "." +getDateOfBirth().getMonth()+ "." +getDateOfBirth().getYear();
    }

}