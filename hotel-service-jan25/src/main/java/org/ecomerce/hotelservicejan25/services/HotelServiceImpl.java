package org.ecomerce.hotelservicejan25.services;

import lombok.RequiredArgsConstructor;
import org.ecomerce.hotelservicejan25.exceptions.HotelNotFoundException;
import org.ecomerce.hotelservicejan25.models.Hotel;
import org.ecomerce.hotelservicejan25.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        Hotel newHotel = Hotel.builder()
                .id(UUID.randomUUID().toString())
                .name(hotel.getName())
                .location(hotel.getLocation())
                .about(hotel.getAbout())
                .build();
        return hotelRepository.save(newHotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getSingle(String id) throws HotelNotFoundException {
        return hotelRepository.findById(id).orElseThrow(HotelNotFoundException::new);
    }
}
