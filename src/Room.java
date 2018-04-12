
/**
 * class Room
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
public abstract class Room
{
    //variabel instance untuk class Room
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    /**
     * Constructor untuk class Room
     */
    public Room(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        this.hotel=hotel;
        this.nomor_kamar=nomor_kamar;
        this.status_kamar=status_kamar;
    }

    /**
     * metode untuk menetapkan nilai hotel
     * @param hotel
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    
    /**
     * metode untuk menetapkan nomor kamar
     * @param nomor_kamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    
    /**
     * metode untuk menetapkan nilai dailyTarif
     * @param dailyTariff
     */
    public void setDailyTariff(double dailyTariff)
    {
        this.dailyTariff = dailyTariff;
    }
    
    /**
     * metode untuk menetapkan status kamar
     * @param status_kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    public void setPesanan(Pesanan pesan)
    {
        this.pesan=pesan;
    }
    
    /**
     * metode untuk mengambil nilai hotel
     * @return hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }
    
    /**
     * metode untuk mengambil nilai nomor kamar
     * @return nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    
    /**
     * metode untuk mengambil nilai daily tarif
     * @return dailyTarif
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }

    public abstract TipeKamar getTipeKamar();

    public Pesanan getPesanan(Pesanan pesan)
    {
        return pesan;
    }

    /**
     * metode untuk mencetak data kamar
     */
    public String toString()
    {

           return "Nama Hotel:" + hotel.getNama()+"\nTipe Kamar"+
           getTipeKamar()+"\nHarga"+dailyTariff+"\nStatus Kamar" +status_kamar;
        }

}
