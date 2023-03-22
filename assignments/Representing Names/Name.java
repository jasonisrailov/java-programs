// header
// goes with TestNames.java
public class Name
{
  String firstNm = "", middleNm = "", lastNm = "";
  // constructor
  public Name (String first, String middle, String last)
  {
    firstNm = first;
    middleNm = middle;
    lastNm = last;
  }
  // returns the first name
  public String getFirst()
  {
    return firstNm;
  }
  // returns the middle name
  public String getMiddle()
  {
    return middleNm;
  }
  // returns the last name
  public String getLast()
  {
    return lastNm;
  }
  // returns a string containing the person’s full name in order, e.g., “Mary Jane Smith”.
  public String firstMiddleLast()
  {
    return firstNm + " " + middleNm + " " + lastNm;
  }
  // returns a string containing the person’s full name with the last name first followed by a comma, e.g., “Smith, Mary Jane”.
  public String lastFirstMiddle()
  {
    return lastNm + " " + firstNm + " " + middleNm;
  }
  // returns true if this name is the same as otherName. Comparisons should not be case sensitive.
  public boolean equals(String name, String otherName)
  {
    if(name.equalsIgnoreCase(otherName))
      return true;
    else
      return false;
  }
  // returns the person’s initials (a 3-character string). The initials should be all in upper case, regardless of what case the name was entered in.
  public String initials()
  {
    String firstInitial = firstNm.substring(0,1);
    String middleInitial = middleNm.substring(0,1);
    String lastInitial = lastNm.substring(0,1);
    return firstInitial + middleInitial + lastInitial;
  }
  // returns the total number of characters in the full name, not including spaces.
  public int length()
  {
    String fullName = firstNm + " " + middleNm + " " + lastNm;
    int spaceCount = 0;
    int fullNameLen = fullName.length();
    System.out.println("!!fullNameLen variable is " + fullNameLen);
    System.out.println("the program is going in a loop  to check");
    for(int i = 1; i <= fullNameLen-1; i++)
    {
      System.out.print("\'" + i + "\' ");
      if(fullName.charAt(i) == 32)
        spaceCount++;
    }
    return fullNameLen - spaceCount;
  }
} // end of class
