import java.util.Date;

public class Teacher extends Person {
    private String firstName;
    private String lastName;
    private Date DOB;
    private Date hireDate;
    private double salary;

    public Teacher(String firstName, String lastName, Date DOB, Date hireDate, double salary, String hairColor) {
        super(firstName, lastName, DOB, hairColor);
        
        this.hireDate = hireDate;
        if (salary > 0) {
          this.salary = salary;
        }

        else {
          this.salary = 0;
        }
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }
}
