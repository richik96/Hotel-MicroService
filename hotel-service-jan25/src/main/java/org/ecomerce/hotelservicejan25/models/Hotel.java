package org.ecomerce.hotelservicejan25.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "hotels")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Hotel {

    @Id
    private String id;
    private String name;
    private String location;
    private String about;
}
