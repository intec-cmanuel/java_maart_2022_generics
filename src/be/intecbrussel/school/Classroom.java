package be.intecbrussel.school;

import java.util.Optional;

public class Classroom {
    private int amountOfStudentsAllowed;
    private Student[] students;

    public Classroom(int amountOfStudentsAllowed) {
        this.amountOfStudentsAllowed = amountOfStudentsAllowed;
        students = new Student[this.amountOfStudentsAllowed];
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
    }

    public Optional<Student> getStudent(String name) {
        for (Student student : students) {
            if (student != null) {
                if (student.getName().equalsIgnoreCase(name)) {
                    return Optional.of(student);
                }
            }
        }

        return Optional.empty();
    }
}
