
/**
 * class Hotel
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
public class Hotel
{
    //variabel instance untuk class Lokasi
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor untuk objek dari class Hotel
     * @param nama,lokasi,bintang
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang; 
    }

    /**
     * metode mengambil nilai bintang hotel
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }
    
    /**
     * metode mengambil nilai nama
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * metode mengambil nilai lokasi
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
    /**
     * metode menetapkan nilai nama
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * metode menetapkan nilai lokasi
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * metode menetapkan nilai bintang
     * @param bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    
    /**
     * metode ini untuk mencetak data hotel
     */
    public String toString()
    {
        return "Nama Hotel\t:" + nama + "\nLokasi\t\t:" + lokasi.getDeskripsi() + "\nBintang\t\t:"+bintang;
    }
}
