package school.management.system;

/**
 * Created by Chaitanya on 22/03/2024
 * This class is responsible for keeping the track of teacher's id, name and the salary
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * this constructor creates a new teacher object
     * @param id id of the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */

    public Teacher(int id, String name, int salary){

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    /**
     *
     * @return the id, name, and the salary of the teacher
     */

    public int getId(){
        return id;
    }

    public String getName(){
        return name; // can work with this keyword as well
    }

    public int getSalary(){
        return salary;
    }

    /**
     *
     * @param salary setting the salary
     */

    public void setSalary(int salary){

        this.salary = salary;

    }

    /**
     * Adds to the salary.
     * Removes from the total money earned by the school.
     * @param salary paid to the teacher
     */

    public void receiveSalary(int salary) {

        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);

    }

}
