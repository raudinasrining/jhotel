
/**
 * Write a description of class pesanan here.
 *
 * @author Raudina Asrining Putri
 * @version 01-03-2018
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private Customer pelanggan; 
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    /**
     * Constructor for objects of class pesanan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
         this.biaya = biaya;
         this.pelanggan = pelanggan;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi biaya dengan nilai
     * yang bertipe data double
     *
     * @return metode getBiaya akan mengembalikan nilai pada 
     * biaya
     */
    public double getBiaya()
    {
        return biaya;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi customer
     *
     * @return metode getPelanggan akan mengembalikan nilai
     * pada variabel pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi getStatusDiproses
     *
     * @return metode ini akan mengembalikan nilai pada 
     * variabel isDiproses
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi getStatusSelesai
     *
     * @return metode ini akan mengembalikan nilai pada 
     * variabel isDiproses
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi setBiaya
     *
     * @param metode ini menggunakan parameter biaya dengan 
     * tipe data double
     */
    public void setBiaya(double biaya)
    { //disini digunakan this karena variabel dan parameter menggunakan
      //nama yang sama yaitu biaya
        this.biaya = biaya; 
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi setPelanggan
     *
     * @return metode ini mengembalikan nilai untuk variabel
     * pelanggan
     */
    public Customer setPelanggan(Customer baru)
    {
        return pelanggan;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi setStatusDiproses
     *
     * @return metode ini mengembalikan nilai untuk variabel
     * isDiproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi setStatusSelesai
     *
     * @return metode ini mengembalikan nilai untuk variabel
     * isSelesai
     */
    public boolean setStatusSelesai(boolean diproses)
    {
        return isSelesai;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi printData
     * dimana variabel biaya akan diprint
     * 
     */
    public void printData()
    {
        System.out.println(biaya);
    }
}