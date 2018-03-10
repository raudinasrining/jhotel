
/**
 * class Pesanan
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
public class Pesanan
{
    //variabel instance untuk class Pesanan
    private double biaya;
    private Customer pelanggan; 
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    /**
     * Constructor untuk objek dari class pesanan
     * @param biaya,pelanggan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
         this.biaya = biaya; 
         this.pelanggan = pelanggan;
         nama_pelanggan=pelanggan.getNama();
    }
    
    /**
     * metode ini untuk mengembalikan nilai biaya
     *
     * @return biaya
     */
    public double getBiaya()
    {
        return biaya;
    }
    
    /**
     * metode ini mengembalikan nilai pelanggan
     *
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    /**
     * metode ini untuk mengembalikan nilai isDiproses
     *
     * @return isDiproses
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
     * metode ini untuk mengembalikan nilai nama_pelanggan
     *
     * @return nama_pelanggan
     */
    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }
    
    /**
     * metode ini untuk mengembalikan nilai tipe_kamar
     *
     * @return tipe_kamar
     */
    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
    }
    
    /**
     * metode ini untuk mengembalikan nilai isSelesai
     *
     * @return isSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    /**
     * metode ini untuk menetapkan nilai biaya
     *
     * @param biaya 
     */
    public void setBiaya(double biaya)
    { //this digunakan karena nama variabel instance sama dengan
      //nama variabel parameter
        this.biaya = biaya; 
    }
    
    /**
     * metode ini untuk menetapkan nilai pelanggan
     *
     * @param pelanggan
     */
    public void setPelanggan(Customer pelanggan)
    {//this digunakan karena nama variabel instance sama dengan
      //nama variabel parameter
        this.pelanggan=pelanggan;
    }
    
    /**
     * metode ini untuk menetapkan nilai nama_pelanggan
     *
     * @param nama_pelanggan
     */
    public void setNamaPelanggan(String nama_pelanggan)
    {//this digunakan karena nama variabel instance sama dengan
      //nama variabel parameter
        this.nama_pelanggan=nama_pelanggan;
    }
    
    /**
     * metode ini untuk menetapkan nilai kamar
     *
     * @param kamar
     */
    public void setRoom(Room kamar)
    {//this digunakan karena nama variabel instance sama dengan
      //nama variabel parameter
        this.kamar=kamar;
    }
    
    /**
     * metode ini untuk menetapkan nilai tipe_kamar
     *
     * @param tipe_kamar
     */
    public void setTipeKamar(TipeKamar tipe_kamar)
    {//this digunakan karena nama variabel instance sama dengan
      //nama variabel parameter
        this.tipe_kamar=tipe_kamar;
    }
    
    /**
     * metode ini untuk menetapkan nilai diproses
     *
     * @param diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * metode ini untuk menetapkan nilai diproses
     *
     * @param selesai
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai=selesai;
    }
    
    /**
     * metode untuk mengembalikan nilai pada kamar
     * @return kamar
     */
    public Room getRoom()
    {
        return kamar;
    }
    
    /**
     * metode ini untuk mencetak data pesanan
     */
    public void printData()
    {
        System.out.println("\nPesanan");
        System.out.println("Nama Pelanggan\t: " + nama_pelanggan);
        System.out.println("Tipe Kamar\t: " + tipe_kamar);
        System.out.println("Status layanan diproses: " + isDiproses);
        System.out.println("Status layanan selesai: " + isSelesai);
    }
}