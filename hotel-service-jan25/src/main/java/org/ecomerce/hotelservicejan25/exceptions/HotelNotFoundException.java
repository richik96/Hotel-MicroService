package org.ecomerce.hotelservicejan25.exceptions;

public class HotelNotFoundException extends Exception{
    public HotelNotFoundException(String s) {
        super(s);
    }
    public HotelNotFoundException() {
        super("Hotel cannot be found in DB");
    }
}
