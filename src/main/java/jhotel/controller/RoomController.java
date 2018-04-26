package jhotel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class RoomController {

    @RequestMapping(value="/vacantrooms", method = RequestMethod.GET)
    public ArrayList<Room> vacantRooms(){
        ArrayList<Room> dbRoom = DatabaseRoom.getVacantRooms();
        return dbRoom;
    }

    @RequestMapping(value="/room/{id_hotel}/{nomor_kamar}", method = RequestMethod.GET)
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String nomor_kamar){
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
        return room;
    }
}