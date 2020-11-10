package ncl.teach.entity;

import ncl.teach.myabstract.Student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;

public class SmartCard extends Student {
    private static Date dateOfIssue;
    protected HashMap<String, SmartCard> uniqueSmartCard = new HashMap<>();
    protected String[] component;
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy");
    private final Random rnd = new Random();

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


    public Date getDateOfIssue() {
        return dateOfIssue;
    }
    public Student CreateStudent(String studentIDNumber, String typeOfStudent, String FirstName, String LastName, Student.MyDate DateOfBirth) {
        return new getStudent(studentIDNumber, typeOfStudent, FirstName,LastName,DateOfBirth );
    }

    public SmartCard createSmardCard(Student student) {
        Date time = Calendar.getInstance().getTime();
        Calendar ca = Calendar.getInstance();
        int nowyear =ca.get(Calendar.YEAR);
        int brithyear = Student.MyDate.getYear();
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





    private final Map<String,Date> ExpiryDate = new HashMap<>();
    public void setExpiryDate(String strcard, Student student) {

        SmartCard smartCard = uniqueSmartCard.get(strcard);
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

    public void getExpiryDate(String strcard) {
        Date expiryDate = ExpiryDate.get(strcard);
        System.out.println(strcard+" ---------Expiry Date--------"+ expiryDate);
    }
    public String toString() {
        return component[0] + "-" + component[1] + "-" + component[2];
    }
}
