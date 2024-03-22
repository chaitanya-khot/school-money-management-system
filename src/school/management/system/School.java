package school.management.system;

import java.util.List;

/**
 * created by Chaitanya on 22/03/2024
 * school contains multiple students and teachers. we just took care of one student and teacher initially
 * can't do multiple teachers by saying teacher1, teacher2, etc.
 * we can use array to store all the teachers, but it means it has a fixed size
 * we can use a list instead which will ensure we can add more names, and it does not have a fixed size
 *
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * created as soon as a new school object is created
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students){

        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }

    /**
     *
     * @return the list of teachers in the school
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * add teacher to the school (list)
     * @param teacher the teacher to be added.
     */

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school.
     */

    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds new student to the school.
     * @param student the student to be added.
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school.
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be added.
     */

    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money spent by the school which is the salary given by the school to it's teachers
     * @param MoneySpent the money spent by the school.
     */

    public void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;

    }
}
