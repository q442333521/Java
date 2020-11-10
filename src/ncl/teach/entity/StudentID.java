package ncl.teach.entity;


import java.util.HashMap;
import java.util.Random;

public class StudentID extends Student {

    protected HashMap<String, StudentID> uniquestudentID = new HashMap<>();
    protected String components;

    public static String cstudentID() {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            str.append((char) (Math.random() * 26 + 'a'));
        }
        String num = String.format("%04d",new Random().nextInt(9999));
        return str.toString().concat(num);
    }
    public StudentID valueOf(String sid) {


        if (!sid.matches("^[a-z]{1}\\d{4}") ) {
            System.out.println("Wrong id");
            return null;
        }
        if (uniquestudentID.get(sid) != null) {
            System.out.println("id already exists.");
            return null;
        }
        StudentID obj = new StudentID();
        uniquestudentID.put(sid, obj);
        return obj;
    }
    public String toString() {
        return components;
    }



}
