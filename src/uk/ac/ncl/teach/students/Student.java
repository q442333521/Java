package uk.ac.ncl.teach.students;


import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author xujie
 *
 */
public class Student extends studentID {

    protected  String studentIDNumber;
    protected  String typeOfStudent;
    protected  String FirstName;
    protected  String LastName;
    protected  MyDate DateOfBirth;

    private  int currentFuelCapacity;
    private  String type;
    private  String supers;

    private  boolean active;
    protected String[] part;

    protected int day;
    protected int month;
    protected int year;

    public Student(){};
    public Student(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, MyDate DateOfBirth) {
        this.studentIDNumber = studentIDNumber;
        this.typeOfStudent = typeOfStudent;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
    }

    public Student(String studentIDNumber) {
        super();
    }


//    public Student(studentID studentIDNumber) {
//        this.studentIDNumber = studentIDNumber;
//    }

    public String GetStudentID() {
        return studentIDNumber;
    }
    public String GetPartOfStudentID(String components){
        part = new String[2];
        part[0] = components.substring(0,1);
        part[1] = components.substring(1,5);
        return part[0] + " " + part[1];
    }
    public static class MyDate {
        private static int day = 0;
        private static int month = 0;
        private static int year = 0;
        /**
         * Constructor.
         *
         * @param day
         *            Day of the month to store. (1-31)
         * @param month
         *            Month to store. (1-12)
         * @param year
         *            Year to store.
         */
        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;

        }

        /**
         * Returns the day stored.
         *
         * @return day stored (1-31).
         */
        public static int getDay() {
            return day;
        }

        /**
         * Returns the month stored.
         *
         * @return month stored (0-11).
         */
        public static int getMonth() {
            return month;
        }

        /**
         * Returns the year stored.
         *
         * @return year stored.
         */
        public static int getYear() {
            return year;
        }

//        public void addyaer(Date date, int i) {
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTimeInMillis(System.currentTimeMillis());
//
//            int currenYear = calendar.get(Calendar.YEAR);
//            calendar.set(Calendar.YEAR, currenYear + i);
//            java.sql.Date newDate = new java.sql.Date(calendar.getTimeInMillis());
//        }
    }




//    public boolean isTankFull() {
//        return (getCurrentFuelCapacity() == getTotalFuelCapacity());
//    }
//
//    public int getCurrentFuelCapacity() {
//        return currentFuelCapacity;
//    }
//
//    public int addFuel(int fuel) {
//        int addedFuel = 0;
//        if (currentFuelCapacity + fuel > getTotalFuelCapacity()) {
//            addedFuel = (getTotalFuelCapacity() - currentFuelCapacity);
//            currentFuelCapacity = getTotalFuelCapacity();
//        } else {
//            currentFuelCapacity += fuel;
//            addedFuel = fuel;
//        }
//        if (addedFuel >= 0) {
//            System.out.println("Added " + addedFuel + " Litres of fuel.");
//        } else {
//            System.out.println("Removed " + Math.abs(addedFuel) + " Litres of fuel.");
//        }
//        return addedFuel;
//    }

//    public int drive(int kilometres) {
//        if (!shouldBeDriving()) {
//            System.out.println("Can't drive car.");
//            kilometres = 0;
//        }
//        int consumedFuel = startJourney(kilometres);
//        this.addFuel(-consumedFuel);
//        return consumedFuel;
//    }
//
//    private boolean shouldBeDriving() {
//        if (isActive() || getCurrentFuelCapacity() <= 0) {
//            return false;
//        }
//        return true;
//    }

    /**
     * This method is used to implement the vehicle specific consumption rate of
     * fuel, given a number of Kilometres and returns the total fuel consumed by
     * the journey.
     *
//     * @param kilometres
     *            the number of whole Kilometres that the vehicle has to drive.
     * @return the amount of whole Litres of fuel consumed during the vehicle's
     *         journey.
     */
//    protected abstract int startJourney(int kilometres);
//
//    public boolean isActive() {
//        return active;
//    }
//
//    public void activate() {
//        this.active = true;
//    }
//
//    public void deactivate() {
//        this.active = false;
//    }

    public String getStudentType() {
        return typeOfStudent;
    }
    public String getStudentsupers() {
        return supers;
    }

    public String  getsid() {
        return studentIDNumber;
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