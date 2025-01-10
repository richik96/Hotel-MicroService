package org.ecomerce.hotelservicejan25.services;

import org.ecomerce.hotelservicejan25.exceptions.HotelNotFoundException;
import org.ecomerce.hotelservicejan25.models.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    //create
    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAllHotels();

    //get single
    Hotel getSingle(String id) throws HotelNotFoundException;
}
