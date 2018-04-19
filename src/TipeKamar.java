
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
    private final String type;
    

    private TipeKamar(String type)

    {
        this.type = type;
    }


    public String toString()
    {
        return this.type;
    }
    
}
