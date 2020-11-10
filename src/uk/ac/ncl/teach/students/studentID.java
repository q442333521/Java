package uk.ac.ncl.teach.students;

import java.util.HashMap;



/**
 * {@code RegistrationNumber} is an abstract class that is used to implement
 * registration numbers for the vehicles of the car rental system.
 * <p>
 * A registration number is composed by a number of {@code String} components.
 * </p>
 * All {@code RegistrationNumber} objects hold a {@code static} reference to a
 * {@code HashMap} collection, that is used to keep track of the created
 * {@code RegistrationNumber} objects, to ensure that all of them are unique.
 */
public class studentID {

    protected static HashMap<String, studentID> uniquestudentID = new HashMap<String, studentID>();
    protected String components;


    public String getComponents() {
        return components;
    }

    public static studentID valueOf(String sid) {
        studentID obj = null;
        if (!sid.matches("^[a-z]{1}\\d{4}") ) {
            System.out.println("Invalid Car registration format.");
            return null;
        }
        if (uniquestudentID.get(sid) != null) {
            System.out.println("Car registration number already exists.");
            return null;
        }
        //obj = new studentID(sid);
        uniquestudentID.put(sid, obj);
        //return obj;
        return obj;
    }
    public String toString() {
        return components;
    }



}
