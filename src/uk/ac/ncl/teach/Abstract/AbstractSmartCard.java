package uk.ac.ncl.teach.Abstract;

import uk.ac.ncl.teach.Module.SmartCard;
import uk.ac.ncl.teach.Module.Student;

import java.util.Date;
import java.util.HashMap;

public abstract class AbstractSmartCard extends Student {

    protected static HashMap<String, SmartCard> uniqueSmartCard = new HashMap<>();
    protected static String[] component;

    private String firstName;
    private String lastName;

    protected static Date dateOfIssue;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() { return lastName; }
    public Date getDateOfIssue() {
        return dateOfIssue;
    }
}
