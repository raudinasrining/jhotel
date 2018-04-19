
/**
 * class Room
 *
 * @author Raudina Asrining Putri
 * @version 18-04-2018
 */
public abstract class Room {
    //variabel instance untuk class Room
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;

    /**
     * Constructor untuk class Room
     */
    public Room(Hotel hotel, String nomor_kamar) {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        status_kamar=status_kamar.Vacant;
    }

    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

    public void setNomorKamar(String nomor_kamar) {
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * metode untuk menetapkan nilai dailyTarif
     *
     * @param dailyTariff
     */
    public void setDailyTariff(double dailyTariff)
    {
        this.dailyTariff = dailyTariff;
    }

    /**
     * metode untuk menetapkan status kamar
     *
     * @param status_kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    public StatusKamar getStatusKamar() {
        return status_kamar;
    }

    /**
     * metode untuk mengambil nilai hotel
     *
     * @return hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }

    /**
     * metode untuk mengambil nilai nomor kamar
     *
     * @return nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    /**
     * metode untuk mengambil nilai daily tarif
     *
     * @return dailyTarif
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }


    public abstract TipeKamar getTipeKamar();

    /**
     * metode untuk mencetak data kamar
     */
    public String toString()
    {
        if (DatabasePesanan.getPesanan(this) == null)
        {
            return "\nNama Hotel \t\t:" + getHotel().getNama()
                    + "\nTipe Kamar \t\t:" + getTipeKamar()
                    + "\nHarga \t\t:" + getDailyTariff()
                    + "\nStatus Kamar \t\t:" + getStatusKamar().toString();
        }
        else
            {
            return "\nNama Hotel \t\t:" + getHotel().getNama()
                    + "\nTipe Kamar \t\t:" + getTipeKamar()
                    + "\nHarga \t\t:" + getDailyTariff()
                    + "\nStatus Kamar \t\t:" + getStatusKamar().toString()
                    + "Pelanggan \t\t:" + DatabasePesanan.getPesanan(this).getPelanggan().getNama();
        }
    }
}


