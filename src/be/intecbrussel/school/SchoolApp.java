package be.intecbrussel.school;

import java.util.Optional;

public class SchoolApp {
    public static void main(String[] args) {
        Student s1 = new Student("Jean-Champagne");
        Student s2 = new Student("Jean-Marie-Robert-Roger");
        Student s3 = new Student("Tom");

        Classroom classroom = new Classroom(5);

        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);

        Optional<Student> tom = classroom.getStudent("Tom");

        if (tom.isPresent()) {
            System.out.println(tom.get());
        } else {
            System.out.println("Student is not here :(");
        }

        Optional<Student> bob = classroom.getStudent("Bob");

        if (bob.isPresent()) {
            System.out.println(bob.get());
        } else {
            System.out.println("Student is not here :(");
        }

    }
}
