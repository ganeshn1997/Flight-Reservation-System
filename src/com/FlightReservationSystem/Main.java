package com.FlightReservationSystem;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Flight obj=new Flight("12345","kingairline",80,50);
    System.out.println(obj.getBookedSeats());

    RegularTicket ticate1=new RegularTicket("AP22345");

    TouristTicket ticate2=new TouristTicket("AB22876");


    ticate1.printTicketDetails("AP22345");
    ticate2.printTicketDetails("AB22876");
    }
}
