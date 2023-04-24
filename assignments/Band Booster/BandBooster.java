/*
Jason Israilov
2/3/2017
3rd Hour, Mrs. Abel
Band Booster Class
*/

//import cs1.Keyboard;
public class BandBooster
{
  private int boxesSold;
  private String name;
  
  //constructors
  public BandBooster(String n)
  {
    name = n; //string containing the name of the band booster
    boxesSold = 0;
  }
  
  public String getName()
  {
    return name; //returns the name of the band booster
  }
  
  public int updateSales(int additionalSold)
  {
    boxesSold += additionalSold; //takes a single int parameter representing the # of additional boxes of candy sold. This method should add this to boxesSold.
    return boxesSold;
  }
  
  public String toString()
  {
    return name + ": " + boxesSold + " boxes";
    //return boxesSold; -- not a  string its an int
  }
  

 
} //end of BandBooster class


