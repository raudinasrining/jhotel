package jhotel.controller;

import jhotel.DatabaseHotel;
import jhotel.Hotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class HotelController {
    @RequestMapping(value="/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelList()
    {
        ArrayList<Hotel> hotels = DatabaseHotel.getHotelDatabase();
        return hotels;
    }

    @RequestMapping(value = "/getHotel/{id_hotel}", method = RequestMethod.GET)
    public Hotel getHotel(@PathVariable int id_hotel)
    {
        Hotel hotel1 = DatabaseHotel.getHotel(id_hotel);
        return hotel1;
    }
}
