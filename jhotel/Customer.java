
/**
 * class Customer
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
public class Customer
{
    //variabel instance untuk class Customer
    protected int id;
    protected String nama;
    /**
     * Constructor untuk objek class Customer
     * @param id,nama
     */
    public Customer(int id, String nama)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
        this.id = id;
        this.nama = nama;
    }
    
    /**
     * metode ini untuk mengembalikan nilai id
     *
     * @return id
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * metode ini untuk mengembalikan nilai nama
     *
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * metode ini untuk menetapkan nilai id
     *
     * @param id
     */
    public void setID(int id)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
        this.id = id;
    }
    
    /**
     * metode ini untuk menetapkan nilai nama
     *
     * @param nama
     */
    public void setNama(String nama)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
       this.nama = nama;
    }
    
    /**
     * metode ini untuk mencetak data customer
     */
    public void printData()
    {
        System.out.println("\nCustomer");
        System.out.println("ID\t\t: " + id);
        System.out.println("Nama\t\t: " + nama);
    }
}