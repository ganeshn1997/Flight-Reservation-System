package com.FlightReservationSystem;

public class TouristTicket extends Ticket{
    public String hotelAddress;
    public String[] selectTouristLocation;

    TouristTicket(String pnr, String from, String to, Flight flite, String departurDateTime,
                  String arrivalDateTime, Passenger pasenger, String seatNo, float price, boolean cancelled) {
        super(pnr, from, to, flite, departurDateTime, arrivalDateTime, pasenger, seatNo, price, cancelled);

    }


    public String getHotelAddress(){
        return "";

    }

    public String getTouristLocations(){
        return "";

    }

    public void removeTouristLocation(String  location){

    }

    public void addTouristLocations(String location){

    }

}
