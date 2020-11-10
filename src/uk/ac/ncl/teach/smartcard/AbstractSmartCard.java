package uk.ac.ncl.teach.smartcard;

import uk.ac.ncl.teach.students.Student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;


/**
 * {@code DrivingLicence} is an abstract class that is used to implement driving
 * licences for the people or customers of the car rental system.
 * <p>
 * A driving licence is composed by a number of {@code String} components.
 * </p>
 * All {@code DrivingLicence} objects hold a {@code static} reference to a
 * {@code HashMap} collection, that is used to keep track of the created
 * {@code DrivingLicence} objects, to ensure that all of them are unique.
 */
public abstract class AbstractSmartCard extends Student {

    protected static HashMap<String, PutSmartCardToMap> uniqueSmartCard = new HashMap<String, PutSmartCardToMap>();
    protected static String[] component;

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private static String strsmartid;
    protected static Date dateOfIssue;


    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public AbstractSmartCard() {}
//    public static String PutSmartCardToMap() {return strsmartid;}


    /**
     * Constructor.
     *
//     * @param firstName
//     *            The person's first name.
//     * @param lastName
//     *            The person's last name.
//     * @param dateOfBirth
     *            The person's date of birth.
     */
    public AbstractSmartCard(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



   // public void PutSmartCardToMap(){}


//    protected boolean fullLicence;

    /**
     * This method returns the driving licence's components.
     *
     * @return an array of the {@code String} components that the driving
     *         licence is composed of.
     */
//    public String[] getComponents() {
//        return components;
//    }

    /**
     * This method returns driving licence's date of issue.
     *
     * @return The driving licence's date of issue.
     */
    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public static void setExpiryDate() {
    };
    public void getExpiryDate() {

    };



    /**
     * This method returns whether the licence is a full driving licence or not.
     *
     * @return {@code true} if the licence is a full driving licence, or
     *         <p>
     *         {@code false} if not.
     */
//    public boolean isLicenceFull() {
//        return fullLicence;
//    }



//    public String toString() {
//        String dateFormatted = dateFormat.format(dateOfBirth);
//        return (firstName + "-" + lastName + "-" + dateFormatted);
//    }
}
