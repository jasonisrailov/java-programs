/*
 * Jason Israilov
 * 5/10/2017
 * Mrs. Abel, 3rd Hour AP Comp Sci
 * Prelab Assignment, Lessson 7-5: Put It All Together
 */
//import Distances.*;
public class UseDistances
{
  public static void main (String [] args)
  {
    Distances distances1;
    Distances distances2;
    Distances distances3;
    Distances distances4;
    Distances distances5;
    float milesPerh = 0;
    long addedFeet = 0;
    long addedYards = 0;
    long addedMiles = 0;
    
    distances1 = new Distances(2,1750,2);
    distances2 = new Distances(2, 10, 0);
    distances3 = new Distances(6002, 0, 0);
    distances4 = new Distances(0, 5230, 0);
    distances5 = new Distances(15000, 12000, 37);
    
    distances1.printDistance();
    distances2.printDistance();
    addedFeet = ((distances1.feet + distances2.feet) % 3);
    addedYards = (((distances1.yards + distances2.yards)) % (1760));
    addedMiles = (((distances1.miles + distances2.miles + distances1.feet + distances2.feet)/ 3) / 1760);;
    System.out.println("Added Distance = " + addedFeet + " foot, " + addedYards  + " yard, " + addedMiles + " mile(s).");
    
    distances3 = distances3.convertFeet(6002);
    distances3.printDistance();
    distances4 = distances4.convertYards(5230);
    distances4.printDistance();
    milesPerh = distances5.milesPerHour(distances5, 45);
    System.out.println(milesPerh);
    
  } // end of main method
} // end of UseDistances class



