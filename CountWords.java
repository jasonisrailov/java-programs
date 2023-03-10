/*
CountWords.java
Demonstrates the use of the StringTokenizer class and nested loops.
Page 155 in AP Java book.
*/

import cs1.Keyboard;
import java.util.StringTokenizer;

public class CountWords
{
    // Reads several lines of text, counting the number of words and the number of non-space characters.
    public static void main (String[] args)
    {
        int wordCount = 0, characterCount = 0;
        String line, word;
        StringTokenizer tokenizer;

        System.out.println("Please enter text (type DONE to quit): ");
        line = Keyboard.readString();
        
        while(!line.equals("DONE"))
        {
            tokenizer = new StringTokenizer(line);
            while(tokenizer.hasMoreTokens())
            {
                word = tokenizer.nextToken();
                wordCount++;
                characterCount += word.length();
            } // end of inner while loop
            line = Keyboard.readString();
        } // end of outer while loop

            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + characterCount);
    } // end of main method
} // End of class
