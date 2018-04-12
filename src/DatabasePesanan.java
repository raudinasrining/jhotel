
/**
 * class DatabasePesanan
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */

import java.util.ArrayList;
public class DatabasePesanan
{
    // mendeklarasikan instance variable untuk class DatabasePesanan
    private static ArrayList<Pesanan> PESANAN_DATABASE;
    private static int LAST_PESANAN_ID=0;
    /**
     * Constructor for objects of class pesanan
     */
    public DatabasePesanan()
    {
        PESANAN_DATABASE = new ArrayList<Pesanan>();
    }
    

    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }

    public static boolean addPesanan(Pesanan baru)
    {
        return false;
    }
    
    /**
     * metode removePesanan
     * @param pesan
     * @return
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        for(Pesanan pesan==pesan){
            if(pesan.getRoom()!=null){
                pesan.setStatusAktif(false);
                PESANAN_DATABASE.remove(pesan);
                return true;
            }
            else if(pesan.getRoom()==null){
                if(pesan.getStatusAktif()==true){
                    pesan.setStatusAktif(false);
                    PESANAN_DATABASE.remove(pesan);
                    return true;
                }
            }
    }
    }
    
    /**
     * metode untuk mengambil nilai pesanan
     * @param
     */
    public static Pesanan getPesanan(int ID)
    {
        for(Pesanan pesan : PESANAN_DATABASE){
            if(pesan.getID()==ID){
                return pesan;
            }
        }
        return null;
    }

    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan pesan : PESANAN_DATABASE){
            if (pesan.getRoom()==kamar){
                return pesan;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesan : PESANAN_DATABASE){
            if(pesan.getPelanggan()==pelanggan){
                if(pesan.getStatusAktif()==true){
                    return pesan;
                }
            }
            return null;
        }
    }

}