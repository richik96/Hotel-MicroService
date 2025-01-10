package org.ecomerce.ratingservicejan25.controllers;

import lombok.RequiredArgsConstructor;
import org.ecomerce.ratingservicejan25.models.Rating;
import org.ecomerce.ratingservicejan25.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
@RequiredArgsConstructor
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/add")
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ratingService.create(rating));
    }

    @GetMapping()
    public ResponseEntity<List<Rating>> getAllRatings() {
        return ResponseEntity.status(HttpStatus.MULTI_STATUS)
                .body(ratingService.getAllRatings());
    }

    @GetMapping("/hotels/{id}")
    public ResponseEntity<List<Rating>> getAllRatingByHotelId(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.MULTI_STATUS)
                .body(ratingService.getRatingByHotelId(id));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Rating>> getAllRatingByUserId(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.MULTI_STATUS)
                .body(ratingService.getRatingByUserId(id));
    }
}
