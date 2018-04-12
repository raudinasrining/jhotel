
/**
 * class Administrasi
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
public class Administrasi
{
    /**
     * metode untuk memproses pemesanan kamar
     * @param pesan,kamar
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
    }

    /**
     * metode untuk memproses kamar yang telah dipesan
     * @param pesan,kamar
     */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }

    /**
     * metode untuk memproses kamar vacant
     * @param kamar
     */
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    
    /**
     * metode untuk memproses pembatalan kamar
     * @param kamar
     */
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = kamar.getPesanan();
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);
        //roomLepasPesanan(kamar);
    }
    
    /**
     * metode untuk menyelesaikan pesanan kamar
     * @param kamar
     */
    public static void pesananSelesai(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    
    /**
     * metode untuk memproses pembatalan pesanan
     * @param pesan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusAktif(false);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    
    /**
     * metode untuk menyelesaikan pesanan
     * @param pesan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusAktif(false);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}