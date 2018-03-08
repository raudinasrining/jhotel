
/**
 * Write a description of class TipeKamar here.
 *
 * @author Raudina Asrining Putri
 * @version 08-03-2018
 */
public enum TipeKamar
{
    
    Single("Single"),Double("Double"),Premium("Premium");
    
    private final String tipe;
    
    /**
     * method TipeKamar merupakan constructor dari class enum
     * TipeKamar
     * 
     * @param tipe dengan tipe data string sebagai parameter
     * method TipeKamar
     */
    private TipeKamar(String tipe)
    {
        
        this.tipe = tipe;
    }

    /**
     * method IsString untuk mengembalikan nilai tipe
     * 
     * @return tipe mengembalikan nilai variable tipe
     */
    public String IsString()
    {
        return this.tipe;
    }
}
