/*
 * Jason Israilov
 * 5/10/2017
 * Mrs. Abel, 3rd Hour AP Comp Sci
 * Prelab Assignment, Lessson 7-5: Put It All Together
 */

// package distances;
public class Distances
{
  //  constants
  static final int FEET_IN_YARDS = 3;  // 1 yard = 3 feet
  static final int YARDS_IN_MILES = 1760; // 1 mile = 1760 yards
  
  // Data fields
  long feet, yards, miles;
  
  // Methods
  public Distances(long ft, long yds, long mil)
  { // Contructors
    feet = ft;
    yards = yds;
    miles = mil;
  }
  
  public Distances addDistance(Distances two)
  { //Returns this plus two
    Distances result = new Distances(0, 0, 0);
    result.feet = (feet + two.feet) % FEET_IN_YARDS;
    result.yards = (yards + two.yards + (feet + two.feet) / FEET_IN_YARDS) % YARDS_IN_MILES;
    result.miles = (miles + two.miles + (feet + two.feet) / FEET_IN_YARDS) / YARDS_IN_MILES;
    result = convertFeet(result.yards);
    return result;
  }
  
  public static Distances convertYards(long yards)
  { // Returns yards converted into a variable of Distances.
    Distances yardsResult = new Distances(0, 0, 0);
    yardsResult.miles = yards / YARDS_IN_MILES;
    yardsResult.yards =  yards % YARDS_IN_MILES;
    return yardsResult;
  }
  
  public static Distances convertFeet(long feet)
  { // Returns feet converted into a variable of Distances.
    Distances feetResult = new Distances(0, 0, 0);
    feetResult.miles = (feet / FEET_IN_YARDS) / YARDS_IN_MILES;
    feetResult.yards = (feet / FEET_IN_YARDS) % YARDS_IN_MILES;
    feetResult.feet = feet % FEET_IN_YARDS;;
    return feetResult;
  }
  
  public static float milesPerHour(Distances distance, long time)
  {
    // convert all units to miles
    long convertYards = distance.yards / YARDS_IN_MILES;
    long convertFeet = distance.feet /(FEET_IN_YARDS * YARDS_IN_MILES);
    long totalMiles = distance.miles + convertYards + convertFeet + 1;
    System.out.println("Total Miles == " + totalMiles);
    // cross multiply to solve for miles per hour
    long crossMulti = totalMiles * 60; // in 60 minutes (1 hour)
    long milesPerHour = crossMulti / 45; // 45 minutes
    return milesPerHour+1;
  }
  
  
  public void printDistance()
  {
    
    System.out.println("" + feet + " feet, " + yards + " yard(s), " + miles + " mile(s).");
  }
  
  
} // end of Distances class



