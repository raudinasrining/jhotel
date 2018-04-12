
/**
 * class Customer
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.regex.*;
public class Customer
{
    //variabel instance untuk class Customer
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    /**
     * Constructor untuk objek class Customer
     * @param id,nama
     */
    public Customer(int id, String nama, int tanggal, int bulan, int tahun)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
        this.id = id;
        this.nama = nama;        
        dob = new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
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
    
    public void setEmail(String email)
    {
        String REGEX = "[^.][^\\s]+\\b@\\b[^-][^\\s]+"; 
        Pattern p = Pattern.compile(REGEX); 
        Matcher m = p.matcher(email); 
        System.out.println("Email " +email+ "\n" + m.matches()); 

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