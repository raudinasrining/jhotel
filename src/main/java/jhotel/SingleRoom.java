package jhotel;
/**
 * Write a description of class SinglerRoom here.
 *
 * @author Raudina Asrining Putri
 * @version 18-04-2018
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR=TipeKamar.Single;

    /**
     * Constructor for objects of class SinglerRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }
    
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

}
