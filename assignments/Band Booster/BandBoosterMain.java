/*
Jason Israilov
2/06/2017
3rd Hour, Mrs. Abel
Band Booster Class
*/
import cs1.Keyboard;
public class BandBoosterMain
{
  public static void main (String [] args)
  {
    //create a class that uses Band Boosters to track sales of 3 over several weeks
  
    String name;
    BandBooster band1, band2, band3;
    int weeks;
    int boxesSold = 0;
   
    System.out.print("Enter the name of Band Booster 1: ");
    name = Keyboard.readString();
    band1 = new BandBooster(name);
    System.out.print("Enter the name of Band Booster 2: ");
    name = Keyboard.readString();
    band2 = new BandBooster(name);
    System.out.print("Enter the name of Band Booster 3: ");
    name = Keyboard.readString();
    band3 = new BandBooster(name);
    
    System.out.print("How many weeks for the current fundraisig campain");
    weeks = Keyboard.readInt();
    
    for(int i = 0; i < weeks; i++)
    {
      System.out.print("How many boxes sold by " + band1.getName() + " week " + (i + 1) + " ");
      boxesSold = Keyboard.readInt();
      band1.updateSales(boxesSold);
      
      System.out.print("How many boxes sold by " + band2.getName() + " week " + (i + 1) + " ");
      boxesSold = Keyboard.readInt();
      band2.updateSales(boxesSold);
      
       System.out.print("How many boxes sold by " + band3.getName() + " week " + (i + 1) + " ");
      boxesSold = Keyboard.readInt();
      band3.updateSales(boxesSold);
    }
    
    System.out.println(band1);
    System.out.println(band2);
    System.out.println(band3);
  }

} //end of Band Booster Main class

