
package vut.data;

/**
 *
 * @author MASWANGANYE HR
 */
public class OutPatient extends Patient{    
    private double medicineAmount;
    
   public OutPatient() {    }     

   public OutPatient(String surname,String idNr, String telNr, Address homeAdress,double medicineAmount) {
        super(surname, idNr,telNr, homeAdress);
        this.medicineAmount = medicineAmount;     } 
    
   @Override
   public double calculateAmountDue(){       
      final double CONSULTATION_FEE= 150.00;              
     return this.medicineAmount+CONSULTATION_FEE;       
   } 
        
    @Override
    public String toString() {
        return "Out Patient; " + super.toString();
    }  
}
