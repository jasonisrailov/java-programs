/*
PigLatinTranslator.java
Represents a translation system from English to Pig Latin. Demonstrates method decomposition and the use of StringTokenizer.
Page 216 in AP Java book. Listing 4.9.
*/

import java.util.StringTokenizer;

public class PigLatinTranslator
{
    // Translates a sentence of words into Pig Latin.
    public String translate (String sentence)
    {
        String result = "";

        sentence = sentence.toLowerCase();
        StringTokenizer tokenizer = new StringTokenizer (sentence);

        while(tokenizer.hasMoreTokens())
        {
            result += translateWord (tokenizer.nextToken());
            result += " ";
        }
        return result;
    } // end of translate method

    // Translates one word into Pig Latin. If the word begins with a vowel, the suffix "yay" is appended to the word.
    // Otherwise, the first letter or two are moved to the end of the word, and "ay" is appended.
    private String translateWord (String word)
    {
        String result = "";
        if (beginsWithVowel(word))
            result = word + "yay";
        else
            if (beginsWithBlend(word))
                result = word.substring(2) + word.substring(0,2) + "ay";
            else
                result = word.substring(1) + word.charAt(0) + "ay";

        return result;
    } // end of translateWord method

    // Determines if the specified word begins with a vowel.
    private boolean beginsWithVowel (String word)
    {
        String vowels = "aeiou";
        char letter = word.charAt(0);
        return(vowels.indexOf(letter) != -1);
    } // end of beginsWithVowel method

    // Determines if the specified word begins with a particular two-character consonant blend.
    private boolean beginsWithBlend (String word)
    {
        return( word.startsWith ("bl") || word.startsWith ("sc") ||
                word.startsWith ("br") || word.startsWith ("sh") ||
                word.startsWith ("ch") || word.startsWith ("sk") ||
                word.startsWith ("cl") || word.startsWith ("sl") ||
                word.startsWith ("cr") || word.startsWith ("sn") ||
                word.startsWith ("dr") || word.startsWith ("sm") ||
                word.startsWith ("dw") || word.startsWith ("sp") ||
                word.startsWith ("fl") || word.startsWith ("sq") ||
                word.startsWith ("fr") || word.startsWith ("st") ||
                word.startsWith ("gl") || word.startsWith ("sw") ||
                word.startsWith ("gr") || word.startsWith ("th") ||
                word.startsWith ("kl") || word.startsWith ("tr") ||
                word.startsWith ("ph") || word.startsWith ("tw") ||
                word.startsWith ("pl") || word.startsWith ("wh") ||
                word.startsWith ("pr") || word.startsWith ("wr") );
    } // end of booleanbeginsWithBlend method

} // end of class
