package org.ecomerce.ratingservicejan25.repository;

import org.ecomerce.ratingservicejan25.models.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String> {

    List<Rating> findByUserId(String id);
    List<Rating> findByHotelId(String id);
}
