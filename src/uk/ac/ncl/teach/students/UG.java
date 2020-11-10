package uk.ac.ncl.teach.students;


/**
 * The {@code SmallCar} class is an implementation of the {@code Drivable}
 * interface and is used for the simple car rental system that is implemented in
 * the {@code DefaultCarRentalApplication} class.
 */
public class UG extends Student {

    /**
     * {@code SmallCar}'s constructor. Sets the vehicle's type as "small".
     *
     * @param carRegistrationNumber
     *            A reference to a RegistrationNumber object.
     */
    public UG(String studentIDNumber) {
        super(studentIDNumber);
        this.typeOfStudent = "UG";
    }

    //@Override
    public int getEnoughCredits() {
        return 120;
    }

//    @Override
//    protected int startJourney(int kilometres) {
//        double consumedFuel = 0;
//        double consumptionRate = 1 / 20.0;
//        consumedFuel = (kilometres * consumptionRate);
//        consumedFuel = Math.ceil(consumedFuel);
//        return (int) consumedFuel;
//    }
}
