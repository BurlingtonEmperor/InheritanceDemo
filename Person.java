import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private Date DOB;
    private String hairColor;

    public Person (String firstName, String lastName, Date DOB, String hairColor) {
      setFirstName(firstName);
      this.lastName = lastName;
      this.DOB = DOB;
      this.hairColor = hairColor;
    }

    public void setFirstName(String firstName) {
      if (firstName.equals("")) {
        this.firstName = "None";
      }
      
      else {
        this.firstName = firstName;
      }
    }

    public String getHairColor () {
      return hairColor;
    }
}
