
/**
 * class Room
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
public class Room
{
    //variabel instance untuk class Room
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTarif;
    private StatusKamar status_kamar;
    private Pesanan pesan;

    /**
     * Constructor untuk class Room
     */
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable,
    Customer customer, double dailyTarif, StatusKamar status_kamar)
    {
        this.hotel=hotel;
        this.nomor_kamar=nomor_kamar;
        this.isAvailable=isAvailable;
        this.customer=customer;
        this.dailyTarif=dailyTarif;
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
     * metode untuk menetapkan id pelanggan
     * @param id
     */
    public void setID(int id)
    {
        this.id = id;
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
     * metode untuk menetapkan status kamar available
     * @param isAvailable
     */
    public void setStatusAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    
    /**
     * metode untuk menetapkan nilai customer
     * @param customer
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * metode untuk menetapkan nilai dailyTarif
     * @param dailyTarif
     */
    public void setDailyTarif(double dailyTarif)
    {
        this.dailyTarif = dailyTarif;
    }
    
    /**
     * metode untuk menetapkan status kamar
     * @param status_kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }
    
    /**
     * metode untuk menetapkan pesanan
     * @param pesan
     */
    public void setPesanan(Pesanan pesan)
    {
        this.pesan = pesan;
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
     * metode untuk mengambil nilai id
     * @return id
     */
    public int getID()
    {
        return id;
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
     * metode untuk mengambil nilai status available
     * @return isAvailable
     */
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    
    /**
     * metode untuk mengambil nilai customer
     * @return customer
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * metode untuk mengambil nilai daily tarif
     * @return dailyTarif
     */
    public double getDailyTarif()
    {
        return dailyTarif;
    }
    
    /**
     * metode untuk mengambil nilai status kamar
     * @return status_kamar
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    
    /**
     * metode untuk mengambil nilai pesanan
     * @return pesan
     */
    public Pesanan getPesanan()
    {
        return pesan;
    }
    
    /**
     * metode untuk mencetak data kamar
     */
    public void printData()
    {
        System.out.println("\nRoom");
        System.out.println("Nama Hotel\t: " + hotel.getNama());
        System.out.println("Nomor Kamar\t: " + nomor_kamar);
        System.out.println("Tersedia\t: " + isAvailable);
        System.out.println("Pelanggan\t: " + customer.getNama());
        System.out.println("Harga\t\t: " + dailyTarif);
        System.out.println("Status Kamar\t: " + status_kamar);
    }
}