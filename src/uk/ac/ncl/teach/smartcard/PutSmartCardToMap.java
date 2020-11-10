package uk.ac.ncl.teach.smartcard;

import uk.ac.ncl.teach.students.Student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * {@code DefaultDrivingLicence} is an implementation of a driving licence, that
 * has three components. It extends the {@code DrivingLicence} class.
 * <p>
 * The first component is the concatenation of the initial of the first name of
 * the driver with the initial of the last name of the driver. The second
 * component is the year of issue of the licence. The third component is an
 * arbitrary serial number. For example, the string representation of the
 * licence number for a licence issued to Mark Smith in 1990 would have the
 * form:
 * <ul>
 * <li>MS-1990-10</li>
 * </ul>
 * where the 10 is a serial number that, with the initials and year, guarantees
 * the uniqueness of the licence number as a whole.
 * </p>
 */
public class PutSmartCardToMap extends AbstractSmartCard {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy");
    private static Random rnd = new Random();



//    public PutSmartCardToMap(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, MyDate DateOfBirth) {
//        super(studentIDNumber, typeOfStudent, FirstName, LastName, DateOfBirth);
//    }




    public static Student CreateStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, MyDate DateOfBirth) {
        //Date dateOfBirth = new GregorianCalendar(date.getYear(), date.getMonth(), date.getDay()).getTime();
        Student student = new Student(studentIDNumber, typeOfStudent, FirstName,LastName,DateOfBirth );
        return student;
    }
    public static PutSmartCardToMap createSmardCard(Student student) {
        Date time = Calendar.getInstance().getTime();
        Calendar ca = Calendar.getInstance();
        int nowyear =ca.get(Calendar.YEAR);
        int brithyear = student.getDateOfBirth().getYear();
        int age = nowyear -brithyear;
        if (student.gettypeOfStudent().equals("UG") & age < 17) {
            //return false;
        }else if (student.gettypeOfStudent().equals("PGR") & age < 20){
            //return false;
        }else if (student.gettypeOfStudent().equals("PGT") & age < 20){
           // return false;
        }

        return new PutSmartCardToMap(student, time);
    }

    /**
     * Constructor.
     *
     * @param firstName   The person's first name.
     * @param lastName    The person's last name.
     * @param dateOfBirth
     */
//    public PutSmartCardToMap(String firstName, String lastName, Date dateOfBirth) {
//        super(firstName, lastName, dateOfBirth);
//    }

    /**
     * Constructor.
     * @param student
     *            The owner of this driving licence.
     * @param dateOfIssue
     *            The date that the driving licence was issued.
     */
    public PutSmartCardToMap(Student student, Date dateOfIssue) {
        component = new String[3];
        String firstNameInitial = student.getFirstName().substring(0, 1);
        String lastNameInitial = student.getLastName().substring(0, 1);
        this.dateOfIssue = dateOfIssue;
        //this.fullLicence = fullLicence;
        this.component[0] = firstNameInitial + lastNameInitial;
        this.component[1] = dateFormat.format(dateOfIssue);
        this.component[2] = String.valueOf(rnd.nextInt(Integer.MAX_VALUE)).substring(0, 2);
        while (uniqueSmartCard.get(this.toString()) != null) {
            this.component[2] = String.valueOf(rnd.nextInt(Integer.MAX_VALUE)).substring(0, 2);
        }
        uniqueSmartCard.put(this.toString(), this);
    }

    /**
     * Constructor.
     *
     * @param firstName   The person's first name.
     * @param lastName    The person's last name.
     * @param dateOfBirth
     */
    private static final Map<String,Date> ExpiryDate = new HashMap<>();
    public static void setExpiryDate(String strcard, Student student) {

        AbstractSmartCard smartCard = uniqueSmartCard.get(strcard);
        Date cardDateOfIssue = smartCard.getDateOfIssue();
        Calendar cal = Calendar.getInstance();
        cal.setTime(cardDateOfIssue);//设置起时间
        switch (student.gettypeOfStudent()) {
            case "UG" -> {
                cal.add(Calendar.YEAR, 4);//增加一年

                Date newdate = cal.getTime();
                ExpiryDate.put(strcard, newdate);
            }
            case "PGT" -> {
                cal.add(Calendar.YEAR, 2);//增加一年

                Date newdate = cal.getTime();
                ExpiryDate.put(strcard, newdate);
            }
            case "PGR" -> {
                cal.add(Calendar.YEAR, 5);//增加一年

                Date newdate = cal.getTime();
                ExpiryDate.put(strcard, newdate);
            }
        }
    }



    public static void getExpiryDate(String strcard) {
        Date expiryDate = ExpiryDate.get(strcard);
        System.out.println(strcard+" ---------Expiry Date--------"+ expiryDate);
    }
//
//
//    /**
//     * This method overrides the {@code toString()} method in {@code Object}.
//     * <p>
//     * This method is used to provide a string representation of the driving
//     * licence. It seperates the components with a "-" character.
//     *
//     * @return a string representation of the driving licence.
//     */
    public String toString() {
        return component[0] + "-" + component[1] + "-" + component[2];
    }
}
