package ncl.teach.test;
import ncl.teach.entity.SmartCard;
import org.junit.Test;
import ncl.teach.myabstract.Student;

public class SmartCardTest {
    //private SmartCard a = new SmartCard();
    private SmartCard application = new SmartCard();
    //private Student Student = new Student();
    @Test
    public void getSmartCard() {

        String StudnetRegId = "a1235";
        Student student = application.CreateStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        SmartCard card = application.createSmardCard(student);
        System.out.println(card.toString());
    }




    @Test
    public void setExpiryDate() {
        String StudnetRegId = "a1235";
        Student student = application.CreateStudent(StudnetRegId, "UG", "John", "Doe", new Student.MyDate(30, 12, 1992));
        String card = application.createSmardCard(student).toString();
        application.setExpiryDate(card, student);

    }
    @Test
    public void getExpiryDate() {
        String StudnetRegId = "a1235";
        Student student = application.CreateStudent(StudnetRegId, "UG", "Dohn", "Coe", new Student.MyDate(30, 12, 1992));
        String card = application.createSmardCard(student).toString();
        application.setExpiryDate(card, student);
        application.getExpiryDate(card);
        String StudnetRegId1 = "a1236";
        Student student1 = application.CreateStudent(StudnetRegId1, "PGR", "John", "Eoe", new Student.MyDate(30, 12, 1992));
        String card1 = application.createSmardCard(student1).toString();
        application.setExpiryDate(card1, student1);
        application.getExpiryDate(card1);
        String StudnetRegId2 = "a1237";
        Student student2 = application.CreateStudent(StudnetRegId2, "PGT", "Bohn", "Goe", new Student.MyDate(30, 12, 1992));
        String card2 = application.createSmardCard(student2).toString();
        application.setExpiryDate(card2, student2);
        application.getExpiryDate(card2);
    }
    @Test
    public void TestWrongage() {
        String StudnetRegId = "a1235";
        Student student = application.CreateStudent(StudnetRegId, "UG", "Dohn", "Coe", new Student.MyDate(30, 12, 2004));
        application.createSmardCard(student);
        String StudnetRegId1 = "a1236";
        Student student1 = application.CreateStudent(StudnetRegId1, "PGR", "Dohn", "Coe", new Student.MyDate(30, 12, 2010));
        application.createSmardCard(student1);
        String StudnetRegId2 = "a1237";
        Student student2 = application.CreateStudent(StudnetRegId2, "PGR", "Dohn", "Coe", new Student.MyDate(30, 12, 1999));
        application.createSmardCard(student2);
    }
    @Test
    public void gettypeOfStudent() {
        String StudnetRegId = "a1235";
        Student student = application.CreateStudent(StudnetRegId, "UG", "Dohn", "Coe", new Student.MyDate(30, 12, 2004));
        String type = student.gettypeOfStudent();
        System.out.println(type);
    }

}