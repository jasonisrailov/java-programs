/*
Tunes.java
Driver for demonstrating the use of an array of objects.
Page 312 in AP Java book. Listing 6.7.
*/
//import CDCollection.java;
public class Tunes
{
    // Creates a CDCollection object and adds some CDs to it.
    // Prints reports on the status of the collection.

    public static void main (String[] args)
    {
        CDCollection music = new CDCollection ();

        music.addCD ("By the Way", "Red Hot Chili Peppers", 14.95, 10);
        music.addCD ("Come On Over", "Shania Twain", 14.95, 16);
        music.addCD ("Soundtrack", "The Producers", 17.95, 33);
        music.addCD ("Ply", "Jennifer Lopez", 13.90, 11);

        System.out.println (music);

        music.addCD ("Double Live", "Garth Brooks", 19.99, 26);
        music.addCD ("Greatest Hits", "Stone Temple Pilots", 15.95, 13);

        System.out.println (music);
    } // end of main method
} // End of class
