package org.ecomerce.hotelservicejan25.repository;

import org.ecomerce.hotelservicejan25.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {
}
