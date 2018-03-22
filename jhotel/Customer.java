
/**
 * class Customer
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */

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
        GregorianCalendar gc = new GregorianCalendar(tahun,bulan,tanggal);
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
        this.dob=dob;
    }
    
    /**
     * metode ini untuk mencetak data customer
     */
}