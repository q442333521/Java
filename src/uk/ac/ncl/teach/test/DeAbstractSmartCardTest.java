//package uk.ac.ncl.teach.test;
//import org.junit.Test;
//import uk.ac.ncl.teach.smartcard.PutSmartCardToMap;
//import uk.ac.ncl.teach.students.studentID;
//import uk.ac.ncl.teach.students.Student;
//
//import java.util.Date;
//
//public class DeAbstractSmartCardTest {
//    //private PutSmartCardToMap a = new PutSmartCardToMap();
//    @Test
//    public void getSmartCard() {
//
//        String StudnetRegId = "a1235";
//        Student student = PutSmartCardToMap.CreateStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
//        PutSmartCardToMap.putSmartCardToMap(student);
//        System.out.println(card.toString());
//    }
//
//
//
//
//    @Test
//    public void setExpiryDate() {
//        String StudnetRegId = "a1235";
//        Student student = PutSmartCardToMap.CreateStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
//        String card = PutSmartCardToMap.createSmardCard(student).toString();
//        PutSmartCardToMap.setExpiryDate(card, student);
//
//    }
//    @Test
//    public void getExpiryDate() {
//        String StudnetRegId = "a1235";
//        Student student = PutSmartCardToMap.CreateStudent(StudnetRegId, "UG", "Dohn", "Coe", new Student.MyDate(30, 12, 1992));
//        String card = PutSmartCardToMap.createSmardCard(student).toString();
//        PutSmartCardToMap.setExpiryDate(card, student);
//        PutSmartCardToMap.getExpiryDate(card);
//        String StudnetRegId1 = "a1236";
//        Student student1 = PutSmartCardToMap.CreateStudent(StudnetRegId1, "PGR", "John", "Eoe", new Student.MyDate(30, 12, 1992));
//        String card1 = PutSmartCardToMap.createSmardCard(student1).toString();
//        PutSmartCardToMap.setExpiryDate(card1, student1);
//        PutSmartCardToMap.getExpiryDate(card1);
//        String StudnetRegId2 = "a1237";
//        Student student2 = PutSmartCardToMap.CreateStudent(StudnetRegId2, "PGT", "Bohn", "Goe", new Student.MyDate(30, 12, 1992));
//        String card2 = PutSmartCardToMap.createSmardCard(student2).toString();
//        PutSmartCardToMap.setExpiryDate(card2, student2);
//        PutSmartCardToMap.getExpiryDate(card2);
//    }
//
//
//}