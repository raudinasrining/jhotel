
/**
 * class JHotel
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */
public class JHotel
{
    /**
     * Constructor untuk class JHotel
     */
    public JHotel()
    {
        
    }
    
    /**
     * metode utama
     * 
     * @param args[]
     * 
     */
    public static void main(String args[])
    {
        System.out.println("Welcome to JHotel");
        Lokasi lokasi1 = new Lokasi(20,20,"Depok");
        Customer pelanggan1 = new Customer(123, "Raudina");
        Hotel hotel1 = new Hotel("Hotel", lokasi1, 5);
        Pesanan pesanan1 = new Pesanan(100000, pelanggan1);
        Room room1 =  new Room(hotel1,"24",true,pelanggan1,1000,StatusKamar.Booked);
        
        pesanan1.setTipeKamar(TipeKamar.Single);
        
        lokasi1.printData();
        pelanggan1.printData();
        hotel1.printData();
        
        System.out.println("=============Method 1=============");
        Administrasi.pesananDitugaskan(pesanan1, room1);
        room1.printData();
        pesanan1.printData();
        
        System.out.println("=============Method 2=============");
        Administrasi.pesananDibatalkan(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("=============Method 3=============");
        Administrasi.pesananDibatalkan(pesanan1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("=============Method 4=============");
        Administrasi.pesananSelesai(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("=============Method 5=============");
        Administrasi.pesananSelesai(pesanan1);
        room1.printData();
        pesanan1.printData();

    }
}
