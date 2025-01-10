package org.ecomerce.ratingservicejan25.services;

import org.ecomerce.ratingservicejan25.models.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {
    //create
    Rating create(Rating rating);
    //get all
    List<Rating> getAllRatings();
    //get all by user id
    List<Rating> getRatingByUserId(String id);
    //get all by hotel id
    List<Rating> getRatingByHotelId(String id);
}
