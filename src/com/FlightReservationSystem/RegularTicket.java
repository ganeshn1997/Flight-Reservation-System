package com.FlightReservationSystem;

public class RegularTicket extends Ticket {
    public String specialServices;
    public String  getSpecialServices;
    RegularTicket(String pnr){
        super(pnr);
    }
    RegularTicket(String from,String to,Flight flite,String departurDateTime,String arrivalDateTime,
                  Passenger pasenger,String seatNo,float price,boolean cancelled,String specialServices,String  getSpecialServices){
       super(from,to,flite,departurDateTime,arrivalDateTime,pasenger,seatNo,price, cancelled);
        this.specialServices=specialServices;
        this.getSpecialServices=getSpecialServices;


    }


    public void updateSpecialServices(String specialServices){

    }


    public void printTicketDetails( String pnr){
        System.out.println("PNR number for tourist Ticket is :"+ super.pnr);
    }


}
