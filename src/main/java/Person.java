import java.util.*;

/**
 * @author KlaughTs, Kretova Ksenia, AMM, 3rd year, 3rd group
 * @see Subdivision
 */

public class Person {
    private String ID;
    private String name;
    private String gender;
    private Subdivision subdivision;
    private String birthDate;
    private String salary;

    /**
     * Constructor
     */
    public Person(String id, String n, String g, String ns, int ids, String bd, String s) {
        ID = id;
        name = n;
        gender = g;
        subdivision = new Subdivision(ids, ns);
        salary = s;
        birthDate = bd;
    }
    /**
     * Constructor
     */
    public Person() {}

    /**
     * Get-method for ID
     * @return ID
     */
    public String getID() {
        return ID;
    }
    /**
     * Get-method for name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Get-method for gender
     * @return gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * Get-method for Subdivision ID
     * @return Subdivision ID
     */
    public int getSubdivisionID() {
        return subdivision.getID();
    }
    /**
     * Get-method for Subdivision name
     * @return Subdivision name
     */
    public String getSubdivisionName() {
        return subdivision.getName();
    }
    /**
     * Get-method for birthDate
     * @return birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }
    /**
     * Get-method for salary
     * @return salary
     */
    public String getSalary() {
        return salary;
    }

}
