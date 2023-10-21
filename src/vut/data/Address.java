
package vut.data;

/**
 *
 * @author MASWWANGANYE HR
 */
public class Address {
    
    private String street;
    private String town;
    private String postalCode;

    public Address(String street, String town,String postalCode)    {
        setStreet(street);
        setTown(town);
        setPostalCode(postalCode);     }
    
    public String getStreet()    {
        return street;    }

    public String getTown()    {
        return town;    }

    public String getPostalCode() {
        return postalCode;    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;    }
    
    public void setStreet(String street)    {        
            this.street = street;    }

    public void setTown(String town)    {
        this.town = town;    }

    @Override
    public String toString() {
        return street + ";" + town + ";" + postalCode;
    }    
}
