import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private Date DOB;

    public Person (String firstName, String lastName, Date DOB) {
      setFirstName(firstName);
      this.lastName = lastName;
      this.DOB = DOB;
    }

    public void setFirstName(String firstName) {
      if (firstName.equals("")) {
        this.firstName = "None";
      }
      
      else {
        this.firstName = firstName;
      }
    }
}
