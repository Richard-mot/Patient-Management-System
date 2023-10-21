
package vut.data;

/**
 *
 * @author Mrs S Moyo
 */
public abstract class Patient {     
    protected String idNr,surname,telNr;
    protected Address homeAdress;
    private  static int patientNr = 1000;    

    public Patient() {    }

    public Patient(String surname,String idNr, String telNr, Address homeAdress) {
        this.idNr = idNr;        
        this.surname = surname;
        this.telNr = telNr;
        setHomeAdress(homeAdress);
        this.patientNr += 1 ;    }

    public String getIdNr() { return idNr;    }

    public int getPatientNr() {return patientNr;    }

    public String getSurname() {return surname;    }

    public String getTelNr() {return telNr;    }

    public Address getHomeAdress() {return homeAdress;    }

    private void setIdNr(String idNr) { this.idNr = idNr;    }
   
    public void setSurname(String surname) {this.surname = surname;    }

    public void setTelNr(String telNr) { this.telNr = telNr;    }

    public void setHomeAdress(Address homeAdress) { this.homeAdress = homeAdress;    }
    
    public abstract double calculateAmountDue();

    @Override
    public String toString() {
        return  patientNr + ";"+ surname+";"+ idNr + ";" +  telNr + ";" + homeAdress .toString();    }}
        
        
    
    
    
    

