package com.FlightReservationSystem;

import java.sql.SQLOutput;

public abstract class Ticket {
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

    Ticket(String pnr){
        this.pnr=pnr;
    }

    Ticket(String from,String to,Flight flite,String departurDateTime,String arrivalDateTime,
           Passenger pasenger,String seatNo,float price,boolean cancelled){

        this.from=from;
        this.to=to;
        this.flite=flite;
        this.departurDateTime=departurDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.pasenger=pasenger;
        this.seatNo=seatNo;
        this.price=price;
        this.cancelled=cancelled;
    }

    public String checkStatus(){
        return "";
    }

    public int getFlightDuration(){
        return 0;
    }

    public void cancel(){

    }

    public abstract void printTicketDetails( String pnr);

}
