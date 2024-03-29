/*
Address.java
Represents a street address.
Page 228 in AP Java book. Listing 4.14.
*/

public class Address
{
    private String streetAddress, city, state;
    private int zipCode;

    // Sets up this Address object with the specified data.
    public Address (String street, String town, String st, int zip)
    {
        streetAddress = street;
        city = town;
        state = st;
        zipCode = zip;
    }

    // Returns this Address object as a string.
    public String toString()
    {
        String result;
        result = streetAddress + "\n";
        result += city + ", " + state + "  " + zipCode;

        return result;
    }

} // end of class
