import java.util.Date;

public class Administrator extends Person {
  // first name, last name, DOB, office number, hair color
  private int officeNumber;

  public Administrator (String firstName, String lastName, Date DOB, int officeNumber, String hairColor) {
    super(firstName, lastName, DOB, hairColor);
    
    this.officeNumber = officeNumber;
  }
}
