package com.FlightReservationSystem;

public class Ticket {
    public String pnr;
    public String from;
    public String to;
    public Flight flite;
    public String departurDateTime;
    public String arrivalDateTime;
    public Passenger pasenger;
    public String seatNo;
    public float price;
    public boolean cancelled;

    public String checkStatus(){
        return "";
    }

    public int getFlightDuration(){
        return 0;
    }

    public void cancel(){

    }


}
