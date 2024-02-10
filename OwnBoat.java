/**
 * Class OwnBoat simulates a Dinghy 
 * that is owned by a sailor who may be a 
 * visitor or a member of the club.
 *
 * @author M250 Module team
 * @version v1
 */
public class OwnBoat extends Dinghy
{
    private boolean visitor;
    
    /**
     * Question B-ii
     * Constructor for objects of class OwnBoat
     * 
     * @param aClassName The class of the dinghy (e.g. Laser)
     * @param aBoatName The boatName of the dinghy
     * @param aSailNumber The sail number of the dinghy
     * @param aVisitor  Set true if the owner is a visitor, otherwise false.
     */
    public OwnBoat(String aClassName, String aBoatName, int aSailNumber, boolean aVisitor)
    {
        super(aClassName, aBoatName, aSailNumber);
        visitor = aVisitor;
    }
    
    /**
     * setter method for visitor
     * @param aVisitor true if the owner is a visitor, otherwise false.
     */    
    public void setVisitor(boolean aVisitor)
    {
        visitor = aVisitor;
    }
    
    /**
     * Tells whether the boat is being used by a visitor the club.
     * @return visitor true if the owner is a visitor, otherwise false.
     */    
    public boolean isVisitor()
    {
        return visitor;
    }
        
    /**
     * Question B-iii
     * Return a string representation from its superclass including its 
     * sailing class name, boat name and sail number, plus 
     * whether or not the sailor is a visitor or a memeber.
     * 
     * @return  a String representation of the dinghy name. 
     */
    @Override
    public String toString()
    {
        if(isVisitor()) {
            return super.toString() + " sailed by a visitor to the club";
        }
        else {
            return super.toString() + " sailed by a club member";
        }
    }
    
        /**
     * Question B-iv
     * Compare a received object with this object for equality based
     * on class name and boat name.
     * 
     * @param obj   Reference the object to be compared with this object.
     * @return      true if the received object is a club boat 
     *              that has the same class name and boat name as this object.
     */
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof OwnBoat)
        {
            OwnBoat b = (OwnBoat) obj;

            return  getClassName().equals(b.getClassName()) 
            && getBoatName().equals(b.getBoatName());
        }
        
        return false;
    }
}