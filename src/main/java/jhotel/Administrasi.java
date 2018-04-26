package jhotel;
/**
 * class Administrasi
 *
 * @author Raudina Asrining Putri
 * @version 18-04-2018
 */
public class Administrasi
{
    public Administrasi()
    {

    }

    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        if (kamar.getStatusKamar().equals((StatusKamar.Vacant)))
        {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);
            DatabaseRoom.getRoom(kamar.getHotel(),kamar.getNomorKamar()).setStatusKamar(StatusKamar.Booked);
        }
       else{
            pesan.setStatusAktif(false);
        }
    }

    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(false);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.Vacant);
    }
    
    /**
     * metode untuk menyelesaikan pesanan kamar
     * @param kamar
     */
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(true);
            pesan.setStatusDiproses(false);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.Vacant);
    }
    
    /**
     * metode untuk memproses pembatalan pesanan
     * @param pesan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.Vacant);
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
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusAktif(false);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}