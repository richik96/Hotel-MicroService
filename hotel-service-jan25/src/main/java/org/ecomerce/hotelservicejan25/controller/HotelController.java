package org.ecomerce.hotelservicejan25.controller;

import lombok.RequiredArgsConstructor;
import org.ecomerce.hotelservicejan25.exceptions.HotelNotFoundException;
import org.ecomerce.hotelservicejan25.models.Hotel;
import org.ecomerce.hotelservicejan25.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create
    @PostMapping("/add")
    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(hotelService.create(hotel));
    }

    @GetMapping()
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.status(HttpStatus.MULTI_STATUS)
                .body(hotelService.getAllHotels());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getSingle(@PathVariable String id) throws HotelNotFoundException {
        return ResponseEntity.status(HttpStatus.OK)
                .body(hotelService.getSingle(id));
    }
}
