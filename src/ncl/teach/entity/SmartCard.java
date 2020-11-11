package ncl.teach.entity;

import ncl.teach.myabstract.Student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;

/**
 * The type Smart card.
 */
public class SmartCard extends Student {
    private static Date dateOfIssue;
    /**
     * The Unique smart card.
     */
    protected HashMap<String, SmartCard> uniqueSmartCard = new HashMap<>();
    private final Map<String,Date> ExpiryDate = new HashMap<>();
    /**
     * The Component.
     */
    protected String[] component;
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy");
    private final Random rnd = new Random();

    /**
     * Use student message to Create the student's smartcard.
     * If the studnet don't meet the conditions, it will not create
     * @param student the TYPE OF student
     * @param dateOfIssue the date Of Issue time
     * @reture   a smart card
     */

    public SmartCard SmartCard(Student student, Date dateOfIssue) {
        if (student != null) {
            component = new String[3];
            String firstNameInitial = student.getFirstName().substring(0, 1);
            String lastNameInitial = student.getLastName().substring(0, 1);
            SmartCard.dateOfIssue = dateOfIssue;
            //this.fullLicence = fullLicence;
            component[0] = firstNameInitial + lastNameInitial;
            component[1] = dateFormat.format(dateOfIssue);
            component[2] = String.valueOf(rnd.nextInt(Integer.MAX_VALUE)).substring(0, 2);
            while (uniqueSmartCard.get(this.toString()) != null) {
                component[2] = String.valueOf(rnd.nextInt(Integer.MAX_VALUE)).substring(0, 2);
            }
            uniqueSmartCard.put(this.toString(), this);
            System.out.println("Create Success");
            return SmartCard.this;

        }else {
            System.out.println(" Age Wrong");
        }

        return null;
    }


    /**
     * Gets date of issue.
     *
     * @return the date of issue
     */
    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Create student student.
     *
     * @param studentIDNumber the student id number
     * @param typeOfStudent   the type of student
     * @param FirstName       the first name
     * @param LastName        the last name
     * @param DateOfBirth     the date of birth
     * @return the student
     */
    public Student CreateStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, myDate DateOfBirth) {
        return new getStudent(studentIDNumber, typeOfStudent, FirstName,LastName,DateOfBirth );
    }



    /**
     * Use student message to Create the student's smartcard.
     * If the studnet don't meet the conditions, it will not create
     * @param student the TYPE OF student
     *
     */
    public SmartCard createSmardCard(Student student) {
        Date time = Calendar.getInstance().getTime();
        Calendar ca = Calendar.getInstance();
        int nowyear =ca.get(Calendar.YEAR);
        int brithyear = myDate.getYear();
        int age = nowyear -brithyear;
        if (student.gettypeOfStudent().equals("UG") & age < 17) {
            student=null;
        }else if (student.gettypeOfStudent().equals("PGR") & age < 20){
            student=null;
        }else if (student.gettypeOfStudent().equals("PGT") & age < 20){
            student=null;
        }

        return SmartCard(student, time);
    }





    /**
     * Set Expiry Date of smart card
     * @param strcard the id of smart card
     * @param student the date Of Issue time
     *
     */

    public void setExpiryDate(String strcard, Student student) {
        SmartCard smartCard = uniqueSmartCard.get(strcard);
        Date cardDateOfIssue = smartCard.getDateOfIssue();
        Calendar cal = Calendar.getInstance();
        cal.setTime(cardDateOfIssue);
        switch (student.gettypeOfStudent()) {
            case "UG" -> {
                cal.add(Calendar.YEAR, 4);

                Date newdate = cal.getTime();
                ExpiryDate.put(strcard, newdate);
            }
            case "PGT" -> {
                cal.add(Calendar.YEAR, 2);

                Date newdate = cal.getTime();
                ExpiryDate.put(strcard, newdate);
            }
            case "PGR" -> {
                cal.add(Calendar.YEAR, 5);

                Date newdate = cal.getTime();
                ExpiryDate.put(strcard, newdate);
            }
        }
    }
    /**
     * Get Expiry Date of smart card through string id of smard card
     * @param strcard the id of smart card
     *
     */
    public void getExpiryDate(String strcard) {
        Date expiryDate = ExpiryDate.get(strcard);
        System.out.println(strcard+" ---------Expiry Date--------"+ expiryDate);
    }
    public String toString() {
        return component[0] + "-" + component[1] + "-" + component[2];
    }
}
