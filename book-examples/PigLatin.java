/*
PigLatin.java
Driver to exercise the PigLatinTranslator class.
Page 215 in AP Java book. Listing 4.8.
*/
import cs1.Keyboard;
public class PigLatin
{
    // Reads sentences and translates them into Pig Latin.
    public static void main (String[] args)
    {
        String sentence, result, another;

        PigLatinTranslator translator = new PigLatinTranslator();

        do
        {
            System.out.println ();
            System.out.println ("Enter a sentence (no punctuation):");
            sentence = Keyboard.readString();

            System.out.println ();
            result = translator.translate (sentence);
            System.out.println ("That sentence in Pig Latin is:");
            System.out.println (result);

            System.out.println ();
            System.out.println ("Translate another sentence (y/n)? ");
            another = Keyboard.readString();

        } while (another.equalsIgnoreCase("y"));

    } // end of main method
} // end of class
