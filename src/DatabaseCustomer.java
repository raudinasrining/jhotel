
/**
 * class DataCustomer
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */

import java.util.ArrayList;
public class DatabaseCustomer
{
    //variabel instance untuk class DataCustomer
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;}
    
    /** metode addCustomer
     * @param
     * @return
     */
    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer baru)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID()) return false;
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }
    public static Customer getCustomer(int id){
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

    
    /**
     * metode removeCustomer
     * @param id
     */
    public static boolean removeCustomer(int id)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) DatabasePesanan.removePesanan(pesan);
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        return false;
    }
    


}