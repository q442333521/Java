package uk.ac.ncl.teach.test;
import org.junit.Test;
import uk.ac.ncl.teach.Module.SmartCard;
import uk.ac.ncl.teach.Module.Student;

public class DeAbstractSmartCardTest {
    //private SmartCard a = new SmartCard();
    @Test
    public void getSmartCard() {

        String StudnetRegId = "a1235";
        Student student = SmartCard.CreateStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        SmartCard card = SmartCard.createSmardCard(student);
        System.out.println(card.toString());
    }




    @Test
    public void setExpiryDate() {
        String StudnetRegId = "a1235";
        Student student = SmartCard.CreateStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        String card = SmartCard.createSmardCard(student).toString();
        SmartCard.setExpiryDate(card, student);

    }
    @Test
    public void getExpiryDate() {
        String StudnetRegId = "a1235";
        Student student = SmartCard.CreateStudent(StudnetRegId, "UG", "Dohn", "Coe", new Student.MyDate(30, 12, 1992));
        String card = SmartCard.createSmardCard(student).toString();
        SmartCard.setExpiryDate(card, student);
        SmartCard.getExpiryDate(card);
        String StudnetRegId1 = "a1236";
        Student student1 = SmartCard.CreateStudent(StudnetRegId1, "PGR", "John", "Eoe", new Student.MyDate(30, 12, 1992));
        String card1 = SmartCard.createSmardCard(student1).toString();
        SmartCard.setExpiryDate(card1, student1);
        SmartCard.getExpiryDate(card1);
        String StudnetRegId2 = "a1237";
        Student student2 = SmartCard.CreateStudent(StudnetRegId2, "PGT", "Bohn", "Goe", new Student.MyDate(30, 12, 1992));
        String card2 = SmartCard.createSmardCard(student2).toString();
        SmartCard.setExpiryDate(card2, student2);
        SmartCard.getExpiryDate(card2);
    }
    @Test
    public void TestWrongage() {
        String StudnetRegId = "a1235";
        Student student = SmartCard.CreateStudent(StudnetRegId, "UG", "Dohn", "Coe", new Student.MyDate(30, 12, 2004));
        SmartCard.createSmardCard(student);
        String StudnetRegId1 = "a1236";
        Student student1 = SmartCard.CreateStudent(StudnetRegId1, "PGR", "Dohn", "Coe", new Student.MyDate(30, 12, 2010));
        SmartCard.createSmardCard(student1);
        String StudnetRegId2 = "a1237";
        Student student2 = SmartCard.CreateStudent(StudnetRegId2, "PGR", "Dohn", "Coe", new Student.MyDate(30, 12, 1999));
        SmartCard.createSmardCard(student2);
    }
    @Test
    public void gettypeOfStudent() {
        String StudnetRegId = "a1235";
        Student student = SmartCard.CreateStudent(StudnetRegId, "UG", "Dohn", "Coe", new Student.MyDate(30, 12, 2004));
        String type = student.gettypeOfStudent();
        System.out.println(type);
    }

}