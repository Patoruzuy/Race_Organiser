import java.util.*;
/**
 * class RaceOrganiser models information
 * used by a race officer at a sailing club.
 *
 * @author M250 module team
 * @version v1
 */
public class RaceOrganiser
{
    //Question D-i
    private ArrayList<Dinghy> racers;
    
    /**
     * Question D-i
     * Constructor to create a new race list.
     */
    public RaceOrganiser()
    {
        racers = new ArrayList<>();
    }
    
    /**
     * method to clear the racers list
     */
    public void clear()
    {
        racers.clear();
    }
    
    /**
      * @returns the size of the racers collection
      */
     public int getRacersSize()
     {
         return racers.size();
     }
    
     /**
      * Question C-ii
      * Add a Dinghy to the race list if it is not already present,
      * otherwise display a message
      * 
      * @param  Object Dinghy   The dinghy to add to the race
      */
     public void addRacer(Dinghy d)
     {
         if(!racers.contains(d)) {
             racers.add(d);
         }
         else {
             System.out.println("The dinghy " + d.getBoatName() + 
                                " is already entered in the race");
         }
     }
     
     /**
      * Question C-iii
      * Display the details of dinghies entered into a race
      */
     public void printRacers()
     {
         ArrayList<Dinghy> racersCopy = new ArrayList<>(racers);
         Collections.sort(racersCopy);
         System.out.printf("%-15s %-10s %-4s", "Dinghy name", "Class", "Sail number");
         System.out.println();
         System.out.println();
         for(Dinghy d: racersCopy) {
             System.out.printf("%-15s %-10s %-4d", d.getBoatName(), 
                               d.getClassName(), d.getSailNumber());
             System.out.println(); // new line
         }
     }
}