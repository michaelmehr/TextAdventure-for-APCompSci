/**
 * @author Inventory
 */
public class Inventory {

// Private Fields

    private int equipLimit;
    private int currentEquip;

// Constructors

    /*
    Constructor creates Inventory object with default field values
     */
    public Inventory(){
        equipLimit = 10;
        currentEquip = 0;
    }

// Get Methods

    public int getEquipLimit(){
        return equipLimit;
    }

    public int getCurrentEquip(){
        return currentEquip;
    }
}
