
/**
 * Write a description of class Customer here.
 *
 * @author Raudina Asrining Putri
 * @version 01-03-2018
 */
public class Customer
{
    // mendeklarasikan semua instance variabel untuk class Customer
    protected int id;
    protected String nama;
    /**
     * Constructor for objects of class pesanan
     */
    public Customer()
    {
        
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi getID dengan tipe
     * data integer
     *
     * @return metode ini mengembalikan nilai untuk variabel
     * id
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi getNama dengan
     * tipe data string
     *
     * @return metode ini mengembalikan nilai untuk variabel
     * nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi setID 
     *
     * @param terdapat parameter id dengan tipe daya integer
     */
    public void setID(int id)
    {   //this diberikan karena nama variabel instance dan 
        //nama parameter sama-sama 'id'
        this.id = id;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi setNama
     *
     * @param terdapat parameter nama dengan tipe daya string
     */
    public void setNama(String nama)
    {//this diberikan karena nama variabel instance dan 
        //nama parameter sama-sama 'nama'
       this.nama = nama;
    }
    
    /**
     * metode ini untuk mengeksekusi fungsi printData
     * dimana variabel nama akan diprint
     * 
     */
    public void printData()
    {
        System.out.println(nama);
    }
}