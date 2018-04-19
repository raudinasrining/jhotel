
/**
 * class JHotel
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

/**
 * main program JHotel
 *
 * @author Raudina Asrining Putri
 * @version 19-04-2018
 */
public class JHotel
{
    /**
     *  method main utama dari program ini
     *
     *
     */
    public static void main (String[] args)
    {
        try {
            DatabaseCustomer.addCustomer(new Customer("rau", 1, 04, 1997, "raurau@yahoo.com"));
            DatabaseCustomer.addCustomer(new Customer("dina", 2, 05, 1997, "dinadina@yahoo.com.com"));
            DatabaseCustomer.addCustomer(new Customer("asrining", 3, 06, 1997, "asrining@yahoo.com"));
            DatabaseCustomer.addCustomer(new Customer("putri", 4, 07, 1997, "putriputri@yahoo.com"));
        }
        catch(PelangganSudahAdaException e){
            System.out.println("EXCEPTION PELANGGAN SUDAH ADA");
            System.out.println(e.getPesan());
        }

        try {
            Lokasi a = new Lokasi(10, 20, "depok");
            DatabaseHotel.addHotel(new Hotel("margo1", new Lokasi(1, 2, "depok1"), 5));
            DatabaseHotel.addHotel(new Hotel("margo2", new Lokasi(3, 4, "depok2"), 4));
            DatabaseHotel.addHotel(new Hotel("margo3", new Lokasi(5, 6, "depok3"), 3));
            DatabaseHotel.addHotel(new Hotel("margo4", new Lokasi(7, 8, "depok4"), 2));
        } catch(HotelSudahAdaException e){
            System.out.println("EXCEPTION HOTEL SUDAH ADA");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A1"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "A2"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "A3"));
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(4), "A4"));

        } catch(RoomSudahAdaException e){
            System.out.println("EXCEPTION ROOM SUDAH ADA");
            System.out.println(e.getPesan());
        }

        try {
            DatabasePesanan.addPesanan(new Pesanan(2, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(3, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(1, DatabaseCustomer.getCustomer(4)));
            DatabasePesanan.addPesanan(new Pesanan(4, DatabaseCustomer.getCustomer(3)));
        } catch(PesananSudahAdaException e){
            System.out.println("EXCEPTION PESANAN SUDAH ADA");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseCustomer.removeCustomer(80);
        } catch(PelangganTidakDitemukanException e){
            System.out.println("EXCEPTION PELANGGAN TIDAK DITEMUKAN");
            System.out.println(e.getPesan());
        }
        Customer cust4 = new Customer("wini",20,04,1996,"tiniwinibiti@yahoo.com");
        Pesanan pesan = new Pesanan(2, cust4);
        try{
            DatabasePesanan.removePesanan(pesan);
        } catch(PesananTidakDitemukanException e){
            System.out.println("\nEXCEPTION PESANAN TIDAK DITEMUKAN");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseHotel.removeHotel(90);
        } catch(HotelTidakDitemukanException e){
            System.out.println("\nEXCEPTION HOTEL TIDAK DITEMUKAN");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(5),"100");
        } catch(RoomTidakDitemukanException e){
            System.out.println("\nEXCEPTION ROOM TIDAK DITEMUKAN");
            System.out.println(e.getPesan());
        }

        System.out.println("\nHASIL");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());

    }
}

