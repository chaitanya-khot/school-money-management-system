package school.management.system;
/*
- Created by Chaitanya on 22/03/2024
- This class is responsible to keep the track of Students and their various attributes
- Attributes such as id, name, grade, fees information
 */
public class Student {

    private int id; // this id is not accessible outside this class
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * The role of a constructor is to create a new (Student) object by initializing the object
     * Total fees for each student will be $30,000 p.a.
     * Fees paid initially is zero
     *
     * @param id will be the id for the student: unique
     * @param name name of the student
     * @param grade grade of the student
     */

    public Student(int id, String name, int grade){

        feesPaid = 0; // we don't add this because it is not an argument. This is not necessary though.
        this.feesTotal = 30000; // this time we use this keyword. it does not matter here.

        this.id = id; // this.id means the id which is initialized in the class and id is the argument passed in the constructor
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter the student's name or student's id

    /**
     * used to update the student's grade
     * @param grade new grade of the student
     */

    public void setGrade(int grade){

        this.grade = grade; // we are updating the grade of the student with the grade given

    }

    /**
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * eg- Initially fees 0, fees paid by student: $10000, feesPaid = 10000.
     * if he paid $20000 more, the feesPaid will be updated to 10000 + 20000 which will be 30000.
     *
     * @param fees is the fees that the student pays.
     */

    public void payFees(int fees){

        // adding fees to the feesPaid
        feesPaid += fees;
        // the method should be static to be accessed like this
        School.updateTotalMoneyEarned(feesPaid);
    }

    // alt + insert shorter for getter and setters

    /**
     *
     * @return is going to return the id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */

    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student.
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees need to be paid by the students.
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */

    public int getRemainingFees() {
        return feesTotal - feesPaid;

    }
}
