/**
 * Class ClubBoat simulates a Dinghy that is owned by a sailing club.
 *
 * @author M250 Module team
 * @version v1
 */
public class ClubBoat extends Dinghy
{
     private String memberId;
    
    /**
     * Question A-i
     * Constructor for objects of class ClubBoat
     * 
     * @param aClassName The class of the dinghy (e.g. Laser)
     * @param aBoatName The boatName of the dinghy
     * @param aSailNumber The sail number of the dinghy
     */
    public ClubBoat(String aClassName, String aBoatName, int aSailNumber)
    {
        super(aClassName, aBoatName, aSailNumber);
        memberId = "";
    }
    /**
     * Setter method for memberId.
     * @param anId An id for the member loaning the boat.
     */    
    public void setMemberId(String anId)
    {
        memberId = anId;
    }
    
    /**
     * Getter method for memberId.
     * @return the memberId of the person using this boat.
     */    
    public String getMemberId()
    {
        return memberId;
    } 
    
    /**
     * Question A-ii
     * Return a string representation from its superclass including its 
     * sailing class name, boat name and sail number, plus the memeber id.
     * 
     * @return  a String representation of the dinghy name.
     */
    @Override
    public String toString()
    {
        return super.toString() + ", Membership ID: " + memberId;
    }
    
    /**
     * Question A-iii
     * Compare a received object with this object for equality based
     * on memeber id and class name.
     * 
     * @param obj   Reference the object to be compared with this object.
     * @return      true if the received object is a club boat 
     *              that has the same member id and class name as this object.
     */
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof ClubBoat)
        {
            ClubBoat b = (ClubBoat) obj;

            return  memberId.equals(b.memberId) 
            && getClassName().equals(b.getClassName());
        }
        
        return false;
    }
    
    /**
     * HashCode for a Dinghy based on its boat name and class name.
     * @return the hashcode for this dinghy. 
     */    
    @Override
    public int hashCode()
    {
        return memberId.hashCode() * getClassName().hashCode();
    }
}
