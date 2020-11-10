package uk.ac.ncl.teach.schoolSystem;


import uk.ac.ncl.teach.students.studentID;
import uk.ac.ncl.teach.students.Student;

public interface SchoolSystem  {
    /**
     * This method returns the number of cars of the specified type that are
     * available to rent.
     *
     * @param carType
     *            The type of car.
     * @return The number of cars that the {@code carType} argument specifies
     *         that are available to rent.
     */
    void noOfStudents();

    /**
     * This is a factory method that is used to create car objects.
     *
     * @param carType
     *            The type of car to instantiate.
     * @param carRegistrationNumber
     *            An instance to a {@code CarRegistrationNumber} object.
     * @return A car object.
     */
    void registerStudent();
    /**
     * This method terminates the given person's rental contract. If the given
     * person has no current rental contract, this method does nothing.
     *
     * @param person
     *            The person that rented the car.
     */

    void amendStudentData();
    /**
     * This method terminates the given person's rental contract. If the given
     * person has no current rental contract, this method does nothing.
     *
     * @param person
     *            The person that rented the car.
     * @return the amount of fuel in Litres required to fill the car's tank.
     */
    void terminateStudent();
     void showAllStudent();







}
