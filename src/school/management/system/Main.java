package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Chaitanya on 22/03/2024
 */

public class Main {
    public static void main (String[] args) {
        Teacher Ash = new Teacher(1, "Ash", 500);
        Teacher Brock = new Teacher(2, "Brock", 600);
        Teacher Misty = new Teacher(3, "Misty", 200);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Ash);
        teacherList.add(Brock);
        teacherList.add(Misty);



        Student Pikachu = new Student(1,"Pikachu", 5);
        Student Charmander = new Student(2, "Charmander", 9);
        Student Squirtle = new Student(3, "Squirtle", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Pikachu);
        studentList.add(Charmander);
        studentList.add(Squirtle);


        School Pokemon_Town_School = new School(teacherList, studentList);
        System.out.println("Pokemon Town School has earned " + Pokemon_Town_School.getTotalMoneyEarned() + "$");




    }
}
