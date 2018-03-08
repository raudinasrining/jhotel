
/**
 * Write a description of class Administrasi here.
 *
 * @author Raudina Asrining Putri
 * @version 08-03-2018
 */
public class Administrasi
{
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(kamar);
    }
    
    public void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setStatusKamar(null);
    }
    
    public void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setStatusKamar(null);
    }
    
    public void pesananDibatalkan(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    
    public void pesananSelesai(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    
    public void pesananDibatalkan(Pesanan pesan)
    {
        Room kamar=pesan.getRoom();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
    }
    
    public void pesananSelesai(Pesanan pesan)
    {
        Room kamar = pesan.getRoom();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(true);
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
    }
}