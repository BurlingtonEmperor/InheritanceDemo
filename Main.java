import java.util.ArrayList;
import java.util.Date;

public class Main {
  public static void main (String args[]) {
    Student s = new Student("Emma", "Jones", new Date(), 3.9, 2024, "Green");
    Student p = new Student("Arshad", "Khan", new Date(), 3, 2023, "Black");
    Administrator a = new Administrator("Hello", "World", new Date(), 5, "Brown");

    ArrayList<Person> people = new ArrayList<>();

    people.add(s); // This is an example of polymorphism
    people.add(p); // A Student is being stored as a Person
    people.add(a); 

    for (Person x : people) {
      System.out.println(x.getName());
      System.out.println(((Student)(x)).getGPA());
    }

    // System.out.println((Student)(people.get(0)).getGPA());

    // System.out.println(s.getName());
    // System.out.println(s.getDOB());
  }
}
