
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
    private String deskripsi;
    
    /**
     * method StatusKamar merupakan constructor dari class enum
     * StatusKamar
     * 
     * @param status dengan tipe data string untuk variable status
     */
    StatusKamar(String deskripsi)
    {
        this.deskripsi=deskripsi;
    }

    /**
     * method IsString digunakan untuk mengembalikan nilai status
     * 
     * @return mengembalikan nilai variable status
     */
    
}
