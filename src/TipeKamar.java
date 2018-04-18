
/**
 * class enum TipeKamar
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
public enum TipeKamar
{
    
    Single("Single"),Double("Double"),Premium("Premium");
    //variabel class dari class TipeKamar
    private String deskripsi;
    
    /**
     * method TipeKamar merupakan constructor dari class enum
     * TipeKamar
     * 
     * @param
     * method TipeKamar
     */
    private TipeKamar(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }


    //public toString()
    {
    }
    
}
