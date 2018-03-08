
/**
 * Write a description of class StatusKamar here.
 *
 * @author Raudina Asrining Putri
 * @version 08-03-2018
 */
public enum StatusKamar
{
   
    Booked("Booked"),Processed("Processed"),Vacant("Vacant");
    
    private final String status;
    
    /**
     * method StatusKamar merupakan constructor dari class enum
     * StatusKamar
     * 
     * @param status dengan tipe data string untuk variable status
     */
    private StatusKamar(String status)
    {
        
        this.status = status;
    }

    /**
     * method IsString digunakan untuk mengembalikan nilai status
     * 
     * @return mengembalikan nilai variable status
     */
    public String IsString()
    {
        return this.status;
    }
}
