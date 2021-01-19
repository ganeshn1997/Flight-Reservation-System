package com.FlightReservationSystem;

public class TouristTicket extends Ticket{
    public String hotelAddress;
    public String[] selectTouristLocation;
    TouristTicket(String pnr){
        super(pnr);
    }
    TouristTicket( String from, String to, Flight flite, String departurDateTime,
                  String arrivalDateTime, Passenger pasenger, String seatNo, float price, boolean cancelled) {
        super( from, to, flite, departurDateTime, arrivalDateTime, pasenger, seatNo, price, cancelled);

    }

    // abstract method calling
    public void printTicketDetails( String pnr){
        System.out.println("PNR number for tourist Ticket is :"+super.pnr);
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
