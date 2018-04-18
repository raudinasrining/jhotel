
/**
 * class Customer
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
import java.util.*;
import java.text.*;

public class Customer
{
    //variabel instance untuk class Customer
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;

    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMM yyyy");
    /**
     * Constructor untuk objek class Customer
     * @param id,nama
     */
    public Customer(int id, String nama, int tanggal, int bulan, int tahun)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;        
        this.dob = new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
    }

    public Customer(String nama,Date dob)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = dob;
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
    
    public String getEmail()
    {
        return email;
    }
    
    public Date getDOB()
    {
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMMM yyyy");
        System.out.println("DOB = "+dateFormat.format(dob));
        return dob;
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

    public void setEmail(String email){
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            System.out.println("Email valid");
            this.email = email;
        }
        else {
            System.out.println("Email tidak valid");
        }
    }
    
    public void setDOB(Date dob)
    {
        System.out.printf("%1$s %2$td %2$tB %2$tY","DOB:",dob);
    }
    
    /**
     * metode ini untuk mencetak data customer
     */
    
    public String toString()
    {
        if(DatabasePesanan.getPesanan(Customer)){
       return "\nCustomer"+ "\nNama\t"+ nama + "\nid\t" +id +"\nE-mail"+email+"\nDate of birth"+ dob+ "\nBooking order is on process";
    }
    else {
       return "\nCustomer"+ "\nNama\t"+ nama + "\nid\t" +id +"\nE-mail"+email+"\nDate of birth"+ dob;
    }
}
}