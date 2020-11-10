package uk.ac.ncl.teach.Abstract;

import java.util.List;
import java.util.Map;

import uk.ac.ncl.teach.Interface.SchoolSystem;
import uk.ac.ncl.teach.Interface.studentInterface;

public abstract class AbstractSchoolSystem implements SchoolSystem {
    protected List<studentInterface> totalStudents;
    protected Map<String, studentInterface> currentlyStudents;
    public void registerStudent(){}
    public void amendStudentData(){}
    public void terminateStudent(){}
    public void noOfStudents(){}
    public void showAllStudent(){}
}
