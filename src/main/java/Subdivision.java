import java.util.*;

/**
 * @author KlaughTs, Kretova Ksenia, AMM, 3rd year, 3rd group
 * @see Person
 */

public class Subdivision {

    private int ID;
    private String name;

    /**
     * Constructor
     */
    public Subdivision(int id, String n) {
        ID = id;
        name = n;
    }

    /**
     * Get-method for ID
     * @return ID
     */
    public int getID() {
        return ID;
    }
    /**
     * Get-method for name
     * @return name
     */
    public String getName() {
        return name;
    }
}
