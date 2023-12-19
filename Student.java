import java.util.Date;

public class Student extends Person {
    private String firstName;
    private String lastName;
    private Date DOB;
    private double GPA;
    private int YOG;

    public Student(String firstName, String lastName, Date DOB, double GPA, int YOG) {
        super(firstName, lastName, DOB);

        this.GPA = GPA;
        this.YOG = YOG;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYOG() {
        return YOG;
    }
}
