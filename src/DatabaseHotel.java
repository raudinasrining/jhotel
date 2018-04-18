
/**
 * Write a description of class DatabaseHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;

    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

    public static boolean addHotel(Hotel baru) {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID() == baru.getID()) return false;
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }

    public static Hotel getHotel(int ID){
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if (hotel.getID() == ID) return hotel;
        }
        return null;
    }

    public static boolean removeHotel(int ID) {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if (hotel.getID() == ID) {
                for (Room kamar :
                        DatabaseRoom.getRoomsFromHotel(hotel)) {
                    DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        return false;
    }
}
