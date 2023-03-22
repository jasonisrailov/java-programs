// header
// goes with Names.java
import cs1.Keyboard;
public class TestNames
{
  public static void main (String[] args)
  {
    String firstName1 = "", middleName1 = "", lastName1 = "";
    String firstName2 = "", middleName2 = "", lastName2 = "";
    //Name namesCall = new Name();
    // Person 1 name
    System.out.println("What is the first name of person 1?");
    firstName1 = Keyboard.readString();
    System.out.println("What is the middle name of person 1?");
    middleName1 = Keyboard.readString();
    System.out.println("What is the last name of person 1?");
    lastName1 = Keyboard.readString();
    // Person 2 namdde
    System.out.println("What is the first name of person 2?");
    firstName2 = Keyboard.readString();
    System.out.println("What is the middle name of person 2?");
    middleName2 = Keyboard.readString();
    System.out.println("What is the last name of person 2?");
    lastName2 = Keyboard.readString();
    Name name1 = new Name(firstName1, middleName1, lastName1);
    Name name2 = new Name(firstName2, middleName2, lastName2);
    // a. prints
    /*
     * first-middle-last version
     * last-first-middle version
     * initials
     * length
     */
    System.out.println();
    System.out.println("The first-middle-last version is for person 1: " + name1.firstMiddleLast());
    System.out.println("The last-first-middle version is for person 1: "  + name1.lastFirstMiddle());
    System.out.println("The initials are for person 1: " + name1.initials());
    System.out.println("\nThe length is for person 1: " + name1.length());
    System.out.println();
    // do the same for name 2
    System.out.println();
    System.out.println("The first-middle-last version is for person 2: " + name2.firstMiddleLast());
    System.out.println("The last-first-middle version is for person 2: " + name2.lastFirstMiddle());
    System.out.println("The initials are for person 2: " + name2.initials());
    System.out.println("\nThe length is for person 2: " + name2.length());
    System.out.println();
    // tell whether the names are the same!!
    System.out.println("Now let's check if the names are the same.");
    System.out.println("The names are " + name1.equals(name2));
  } // end of main
} // end of class
