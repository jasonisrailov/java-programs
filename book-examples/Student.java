/*
Student.java
Represents a college student.
Page 227 in AP Java book. Listing 4.13.
*/

public class Student
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;

    // Sets up this Student object with the specified initial values.
    public Student (String first, String last, Address home, Address school)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }

    // Returns this Student object as a string.
    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress;

        return result;
    }
} // end of class
