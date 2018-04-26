package jhotel;
/**
 * class enum StatusKamar 
 *
 * @author Raudina Asrining Putri
 * @version 08-03-2018
 */
public enum StatusKamar
{
   
    Booked("Booked"),Processed("Processed"),Vacant("Vacant");
    //variabel class untuk class StatusKamar
    private final String status;

    StatusKamar(String status) {
        this.status=status;
    }

    public String toString() {
        return this.status;
    }
    
}
