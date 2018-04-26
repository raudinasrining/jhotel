package jhotel;
/**
 * Class DatabaseCustomer
 *
 * @author Raudina Asrining Putri
 * @version 19-04-2018
 */
import java.util.ArrayList;
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;


    ///**
    //* Constructor for objects of class DatabaseCustomer
    //*/


    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }
    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }
    /** method untuk menambahk customer */
    //public static boolean addCustomer(Customer baru)

    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID())
                throw new PelangganSudahAdaException(baru);
            else if(cust.getEmail()==baru.getEmail())
                throw new PelangganSudahAdaException(baru);
        }

        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    public static Customer getCustomer(int id)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

    public static Customer getCustomerLogin(String email, String password){
        for (Customer cust : CUSTOMER_DATABASE) {
            if (cust.getEmail().equals(email)  && cust.getPassword().equals(password)) {
                return cust;
            }
        }
        return null;
    }

    /** method untuk menghapus customer */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) {
                        try{
                            DatabasePesanan.removePesanan(pesan);
                        }
                        catch(PesananTidakDitemukanException e){

                        }
                    }
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }

}



