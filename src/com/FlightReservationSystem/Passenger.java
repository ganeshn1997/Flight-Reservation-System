package com.FlightReservationSystem;

class Passenger {
    public int id;
    public Address address;
    public Contact contact;

    private static int idCounter=0;

    public static int getIdCounter() {
        return idCounter++;
    }




    Passenger(int idcounter,Address address,Contact contact){
        this.id=idcounter;
        this.address=address;
        this.contact=contact;
    }

    public void getContact(){

    }

    public void getAddress(){

    }

    //contact nested class

    private static class Contact {
        public String name;
        public String phone;
        public String email;

        Contact(String name,String phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;

        }

        public String getContectDetails(){
            return "" ;
        }


        public void updateContectDetails(String Contact){

        }

    }
  
    
    // address class is nested

    private static class Address {
        //attributes of class Address
        public String street;
        public String city;
        public String state;

        // constructor implementation
        public Address(String street , String city,String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }

        // methods implementation
        public String getAddressDetails(){
            return "";
        }

        public void updateAddressDetails(String addressDetails){

        }
    }



    public void getPassengerCount(int idCounter){

    }
}
