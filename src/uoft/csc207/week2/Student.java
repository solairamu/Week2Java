package uoft.csc207.week2;

public class Student extends Person {
    private final String studentid;

    public Student(String[] name, String utorid, String studentid) {
        super(name, utorid);
        this.studentid = studentid;
    }
}
