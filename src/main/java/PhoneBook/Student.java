package PhoneBook;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String studentID;

    public Student(String name, String group, String studentID) {
        this.name = name;
        this.group = group;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return name + ", " + group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getGroup(), student.getGroup()) && Objects.equals(getStudentID(), student.getStudentID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGroup(), getStudentID());
    }
}
