/*
GradeReport.java
Demonstrates the use of a switch statement.
Page 147 in ONLINE AP Java book.
*/

import cs1.Keyboard;

public class GradeReport
{
    // Reads a grade from the user and prints comments accprdingly.
    public static void main (String[] args)
    {
        int grade, category;

        System.out.println("Enter a numeric grade (0 to 100) ");
        grade = Keyboard.readInt();

        category = grade / 10;

        System.out.print("That grade is ");
        
        /* A switchstatement could be implemented as a series of if-else statements
        but the switch is sometimes a more convenient and readable con-struct. */
        
        switch(category)
        {
            case 10:
                System.out.println("a perfect score. Well done.");
                break;
            case 9:
                System.out.println("well above average. Nice job.");
                break;
            case 8:
                System.out.println("above average. Nice job.");
                break;
            case 7:
                System.out.println("average.");
                break;
            case 6:
                System.out.println("below average. You should see the");
                System.out.println("instructor to clarify the material "
                + " presented in class.");
                break;
            default:
                System.out.println("not passing");
        } // end of switch
    } // end of main method
} // End of class
