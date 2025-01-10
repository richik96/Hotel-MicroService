package org.ecomerce.ratingservicejan25.services;

import lombok.RequiredArgsConstructor;
import org.ecomerce.ratingservicejan25.models.Rating;
import org.ecomerce.ratingservicejan25.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService{
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        Rating newRating = Rating.builder()
                .rating(rating.getRating())
                .hotelId(rating.getHotelId())
                .userId(rating.getUserId())
                .feedback(rating.getFeedback())
                .build();
        return ratingRepository.save(newRating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String id) {
        return ratingRepository.findByUserId(id);
    }

    @Override
    public List<Rating> getRatingByHotelId(String id) {
        return ratingRepository.findByHotelId(id);
    }
}
