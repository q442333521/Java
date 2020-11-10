package uk.ac.ncl.teach.schoolSystem;

import java.util.List;
import java.util.Map;

import uk.ac.ncl.teach.students.studentInterface;
import uk.ac.ncl.teach.students.studentID;
import uk.ac.ncl.teach.smartcard.SmartCard;
import uk.ac.ncl.teach.students.Student;

abstract class AbstractSchoolSystem implements SchoolSystem {
    protected List<studentInterface> totalStudents;
    protected Map<String, studentInterface> currentlyStudents;



    //public Collection<studentInterface> noOfStudents() {
//        return currentlyStudents.values();
//    }

    public studentInterface getStudentsupers(SmartCard smartCard) {
        return currentlyStudents.get(smartCard.toString());
    }
    public void registerStudent(){};
    public void amendStudentData(){};
    public void terminateStudent(){};
    public void noOfStudents(){};
    public void showAllStudent(){};


}
