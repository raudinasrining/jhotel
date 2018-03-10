
/**
 * class Lokasi
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
public class Lokasi
{
    //variabel instance untuk class Lokasi
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Constructor untuk objek pada class Lokasi
     * 
     * @param x_coord,y_coord,deskripsiLokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * metode ini untuk menetapkan nilai x_coord
     *
     * @param x_coord
     */
    public void setX(float x_coord)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
        this.x_coord = x_coord;
    }
    
    /**
     * metode ini untuk menetapkan nilai y_coord
     *
     * @param y_coord
     */
    public void setY(float y_coord)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
        this.y_coord = y_coord;
    }
    
    /**
     * metode ini untuk menetapkan nilai deskripsi
     *
     * @param deskripsi
     */
    public void setDeskripsi(String deskripsi)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
        this.deskripsiLokasi = deskripsi;
    }
    
    /**
     * metode ini untuk mengambil nilai x_coord
     *
     * @return x_coord
     */
    public float getX()
    {
        return x_coord;
    }
    
    /**
     * metode ini untuk mengambil nilai y_coord
     *
     * @return y_coord
     */
    public float getY()
    {
        return y_coord;
    }
    
    /**
     * metode ini untuk mengambil nilai deskripsi
     *
     * @return deskripsiLokasi
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    
    /**
     * metode ini untuk mencetak data lokasi
     */
    public void printData()
    {
        System.out.println("\nLokasi");
        System.out.println("Koordinat X\t: " + x_coord);
        System.out.println("Koordinat Y\t: " + y_coord);
        System.out.println("Deskripsi\t: " + deskripsiLokasi);
    }
}