//package uk.ac.ncl.teach.test;
//
//
////import uk.ac.ncl.teach.smartcard.DeAbstractSmartCard;
//
//
//public abstract class Helpermethod {
//
//    /**
//     * Helper class that stores a date. Used in unit testing classes for
//     * instantiation of {@code Calendar} objects.
//     */
////    public static class MyDate {
////        private final int day;
////        private final int month;
////        private final int year;
////
////        /**
////         * Constructor.
////         *
////         * @param day
////         *            Day of the month to store. (1-31)
////         * @param month
////         *            Month to store. (1-12)
////         * @param year
////         *            Year to store.
////         */
////        public MyDate(int day, int month, int year) {
////            this.day = day;
////            this.month = month - 1;
////            this.year = year;
////        }
////
////        /**
////         * Returns the day stored.
////         *
////         * @return day stored (1-31).
////         */
////        public int getDay() {
////            return day;
////        }
////
////        /**
////         * Returns the month stored.
////         *
////         * @return month stored (0-11).
////         */
////        public int getMonth() {
////            return month;
////        }
////
////        /**
////         * Returns the year stored.
////         *
////         * @return year stored.
////         */
////        public int getYear() {
////            return year;
////        }
////    }
//
//    /**
//     * Helper method used in unit testing classes, to instantiate
//     * {@code DefaultPerson} objects.
//     *
//
//     *            {@code MyDate} date.
//     * @return {@code DefaultPerson} object.
//     */
////    protected Student createStudent(studentID studentIDNumber, String typeOfStudent, String FirstName, String LastName, MyDate DateOfBirth) {
////        Date dateOfBirth = new GregorianCalendar(DateOfBirth.getYear(), DateOfBirth.getMonth(), DateOfBirth.getDay()).getTime();
////        Student createStudent = new Student(studentIDNumber,typeOfStudent, FirstName, LastName, dateOfBirth);
////        return createStudent;
////    }
//
//    /**
//     * Helper method used in unit testing classes, to instantiate
//     * {@code DefaultDrivingLicence} objects.
//     *
//     * @param smardCard
//     *            {@code Person} object.
//     * @param date
//     *            {@code MyDate} date.
//     * @param full
//     *            Whether licence is full or not.
//     * @return {@code DefaultDrivingLicence} object.
//     */
////    protected DeAbstractSmartCard createSmardCard(SmartCard smardCard, Student.MyDate date) {
////        Date dateOfIssue = new GregorianCalendar(date.getYear(), date.getMonth(), date.getDay()).getTime();
////        DeAbstractSmartCard licence = new DeAbstractSmartCard(smardCard, dateOfIssue);
////        return licence;
////    }
//
//    /**
//     * Helper method used in unit testing classes, to instantiate
//     * {@code DefaultCarRegistrationNumber} objects.
//     *
//     * @param registrationNumber
//     *            a registration number string representation.
//     * @return {@code DefaultCarRegistrationNumber} object.
//     */
////    protected DefaultstudentID createRegistrationNumber(String registrationNumber) {
////        return DefaultstudentID.valueOf(registrationNumber);
////    }
//
//}
