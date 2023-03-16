/*
Guests.java
Demonstrates a linear search.
Page 318 in AP Java book. Listing 6.10.
*/

import cs1.Keyboard;

public class Guests
{
    // Creates an array of guests' names and allows the user to
    // search the array for a particular name

    public static void main (String[] args)
    {
      String[] guests = {"Paul", "Wendy", "Jared", "Eric", "Ayame", "Ian", "Isobel", "Hakem"};

        String name;
        boolean found = false;
        System.out.print("Enter a name: ");
        name = Keyboard.readString();

        // Preform a linear search
        for(int index = 0; index < guests.length; index++) 
          if(name.equals(guests[index]))
            found = true;
        
        
        if(found)
            System.out.println(name + " is on the guest list.");
        else
            System.out.println(name + " is not on the guest list.");
    } // end of main method
} // End of class
