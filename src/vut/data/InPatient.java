
package vut.data;

/**
 *
 * @author MASWANGANYE HR
 */
public class InPatient extends Patient{    
    private int numberofDays;
    private boolean intensiveCare;

    public InPatient() {    }
    
    public InPatient(String surname, String idNr, String telNr, Address homeAdress,int numberofDays, boolean intensiveCare) {
        super(surname, idNr, telNr, homeAdress);
        this.numberofDays = numberofDays;
        this.intensiveCare = intensiveCare;    }

    public int getNumberofDays() {
        return numberofDays;    }

    public boolean isIntensiveCare() {
        return intensiveCare;   }    
    
    @Override
     public double calculateAmountDue(){
         final double INTENSIVE_CARE_RATE = 1500;
         final double NORMAL_WARD_RATE = 1000;
         Boolean intensiveC= true;         
         
         if (this.intensiveCare == intensiveC){
             return INTENSIVE_CARE_RATE *numberofDays;          
         }else
              
           return NORMAL_WARD_RATE * numberofDays;      }     
        
    @Override
    public String toString() {
        return "In Patient; " + super.toString()+ ";" + numberofDays + ";" + intensiveCare;
    }
     
    
}
