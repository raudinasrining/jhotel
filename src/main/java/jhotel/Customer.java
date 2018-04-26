package jhotel;
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
    private String password;

    SimpleDateFormat dobformat = new SimpleDateFormat("dd MM yyyy");
    /**
     * Constructor untuk objek class Customer
     *
     */
    public Customer(String nama, int tanggal, int bulan, int tahun, String email, String password)
    {//this digunakan karena nama variabel instance sama dengan
        //nama variabel parameter
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.email=email;
        this.dob = new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
        this.password=password;
    }

    public Customer(String nama,Date dob, String email, String password)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = dob;
        this.email=email;
        this.password=password;
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
       // SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMMM yyyy");
       // System.out.println("DOB = "+dateFormat.format(dob));
        return dob;
    }

    public String getPassword()
    {
        return password;
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
        this.dob=dob;
    }

    public void setPassword( String password)
    {
        this.password=password;
    }

    /**
     * metode ini untuk mencetak data customer
     */

    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this ) != null){
            return "\nCustomer\n"
                    + "ID\t: " +getID()
                    + "\nNama\t: "+getNama()
                    +"\nE-mail\t: "+getEmail()
                    +"\nDate of birth\t: "+ dobformat.format(getDOB()) + "\nBooking order is on process";
        }
        return "\nCustomer\n"
                + "Customer ID\t: " +getID()
                + "\nNama\t: "+ getNama()
                +"\nE-mail\t: "+ getEmail()
                +"\nDate of birth\t: "+ dobformat.format(getDOB());

    }
}