package jhotel;

/**
 * Write a description of class DatabaseHotel here.
 *
 * @author Raudina Asrining Putri
 * @version 19-04-2018
 */
import java.util.ArrayList;
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;




    /**
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException{
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID() == baru.getID() || (hotel.getLokasi().equals(baru.getLokasi()) && hotel.getNama().compareTo(baru.getNama())==0)){
                throw new HotelSudahAdaException(hotel);
            }
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }

    public static boolean removeHotel(int id) throws HotelTidakDitemukanException {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID()==id){
                for (Room kamar :
                        DatabaseRoom.getRoomsFromHotel(hotel)) {
                    try{
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    }
                    catch(RoomTidakDitemukanException e){
                        e.getPesan();
                    }
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        throw new HotelTidakDitemukanException(id);
    }
    public static Hotel getHotel(int id)
    {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID()==id)
                return hotel;

        }
        return null;
    }


}

