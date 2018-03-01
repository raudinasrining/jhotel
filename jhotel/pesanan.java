
/**
 * Write a description of class pesanan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    double biaya = 0;
    Customer pelanggan = new Customer();
    String nama_pelanggan = null;
    String jenis_kamar = null;
    boolean isDiproses = false;
    boolean isSelesai = false;
    /**
     * Constructor for objects of class pesanan
     */
    public Pesanan()
    {
            
    }

    public double getBiaya()
    {
        return 0;
    }
    
    public Customer getPelanggan()
    {
        return null;
    }
    
    public boolean getStatusDiproses()
    {
        return false;
    }
    
    public boolean getStatusSelesai()
    {
        return false;
    }
    
    public double setBiaya(double biaya)
    {
        return 0;
    }
    
    public Customer setPelanggan(Customer baru)
    {
        return null;
    }
    
    public boolean setStatusDiproses(boolean diproses)
    {
        return false;
    }
    
    public boolean setStatusSelesai(boolean diproses)
    {
        return false;
    }
}