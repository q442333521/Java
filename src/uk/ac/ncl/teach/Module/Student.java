package uk.ac.ncl.teach.Module;
public class Student extends studentID {

    protected  String studentIDNumber;
    protected  String typeOfStudent;
    protected  String FirstName;
    protected  String LastName;
    protected  MyDate DateOfBirth;
    protected static String[] part;

    public Student(){}
    public Student(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, MyDate DateOfBirth) {
        this.studentIDNumber = studentIDNumber;
        this.typeOfStudent = typeOfStudent;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
    }

    public String GetStudentID() {
        return studentIDNumber;
    }
    public static String GetPartOfStudentID(String components){
        part = new String[2];
        part[0] = components.substring(0,1);
        part[1] = components.substring(1,5);
        return "Part1:" +part[0] + "   Part2:" + part[1];
    }
    public static class MyDate {
        private static int day = 0;
        private static int month = 0;
        private static int year = 0;
        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;

        }

        public static int getDay() {
            return day;
        }

        public static int getMonth() {
            return month;
        }

        public static int getYear() {
            return year;
        }
    }



    public String getStudentType() {
        return typeOfStudent;
    }


    public void setsid(studentID studentIDNumber) {
        this.studentIDNumber= String.valueOf(studentIDNumber);
    }

    public String  gettypeOfStudent() {
        return typeOfStudent;
    }
    public void settypeOfStudent(String typeOfStudent) {
        this.typeOfStudent=typeOfStudent;
    }
    public String  getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName=FirstName;
    }
    public String  getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName=LastName;
    }

    public MyDate  getDateOfBirth() {return DateOfBirth; }
    public void setDateOfBirth(MyDate DateOfBirth) {
        this.DateOfBirth=DateOfBirth;
    }

    public String toString() {
        return   GetStudentID() + " " + getStudentType()+ " " +  getFirstName()+ " " +  getLastName()  + " " + getDateOfBirth().getDay()+ "." +getDateOfBirth().getMonth()+ "." +getDateOfBirth().getYear();
    }

}