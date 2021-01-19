package com.FlightReservationSystem;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
    private int bookedSeats;

    Flight(String flightNumber,String airline,int capacity,int bookedSeats){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.bookedSeats=bookedSeats;

    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }



    public String  getFlightDetails(){
    return "";
    }

    public boolean checkAvailability(){
     return ;
    }

    public void incrementBookingCounter(){

    }



}
