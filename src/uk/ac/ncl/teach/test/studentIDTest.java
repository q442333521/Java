package uk.ac.ncl.teach.test;

import org.junit.Before;
import org.junit.Test;
import uk.ac.ncl.teach.students.studentID;

import static org.junit.Assert.*;

public class studentIDTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void valueOf() {
    }

//    //-------------------TEST check method
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//        studentID cr = studentID.getInstance("XJ03 QWE");
//        System.out.println(cr);
//
//    }
//    //print:Carnumber: XJ03 QWE

    @Test
    public void testToString() {
    }
    /**
     * Show two examples where registration number is correct, so we do
     * assertNotNull to show its correct.
     */


    @Test
    public void StudentIDCorrectTest() {
        studentID StudnetRegId;
        StudnetRegId = studentID.valueOf("a1234");
        assertNotNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("z9999");
        assertNotNull(StudnetRegId);
    }


    /**
     * We check for what values we have wrong instantiation of the class, so
     * we assertNull to show that we get null in the values.
     */
    @Test
    public void WrongFormatTest() {
        studentID StudnetRegId;
        // check for identifiers with the wrong format, for what values we have wrong instantiation of the class
        StudnetRegId = studentID.valueOf("a");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("abcde");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("abcd1");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("abc12");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("ab123");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("12345");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("1234a");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("aaaaaaaaaaa");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("11111111111`");
        assertNull(StudnetRegId);
        StudnetRegId = studentID.valueOf("aaaaaaaaaaa11111111111");
        assertNull(StudnetRegId);
        // check for unique identifiers
        StudnetRegId = studentID.valueOf("a2222");
        StudnetRegId = studentID.valueOf("a2222");
        assertNull(StudnetRegId);
    }

    @Test
    public void testGetComponents() {
        studentID StudnetRegId;
        String sid = "a1234";
        StudnetRegId = studentID.valueOf(sid);

        assertEquals(StudnetRegId.getComponents(), sid);

    }

    @Test
    public void testtoString() {
        studentID StudnetRegId;
        String id = "a2222";
        StudnetRegId = studentID.valueOf(id);
        assertEquals(StudnetRegId.toString(), id);
    }

}