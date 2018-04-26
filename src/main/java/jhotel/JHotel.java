package jhotel;
/**
 * Write a description of class JHotel here.
 *
 * @author Raudina Asrining Putri
 * @version 19-04-2018
 */
import java.util.GregorianCalendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JHotel
{
    public void JHotel()
    {

    }

    /**
     * method main
     */

    public static void main(String[] args)
    {
        SpringApplication.run(JHotel.class, args);
        try {
            DatabaseHotel.addHotel(new Hotel("Hilton", new Lokasi(4, 3, "Jati Padang"),4));
            DatabaseHotel.addHotel(new Hotel("Aston", new Lokasi(2, 2, "Cilandak"),5));
        } catch(HotelSudahAdaException e){
            System.out.println("---Exception Hotel Sudah Ada---");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"666"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "999"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(2),"333"));

        } catch(RoomSudahAdaException e){
            System.out.println("---Exception Room Sudah Ada---");
            System.out.println(e.getPesan());
        }
    }
}
