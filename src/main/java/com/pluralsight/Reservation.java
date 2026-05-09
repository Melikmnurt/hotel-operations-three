package com.pluralsight;

//This class stores information about a hotel reservation
public class Reservation {

    //Stores the room type
    private String roomType;

    //Stores the number of nights for the stay
    private int numberOfNights;

    //keeps track of whether the reservation is during a weekend
    private boolean weekend;

    //constructor used to create a reservation object
    public Reservation(String roomType, int numberOfNights, boolean weekend){

        //set the room type
        this.roomType = roomType;

        //set the number of nights
        this.numberOfNights = numberOfNights;

        //set weekend status
        this.weekend = weekend;
    }
    //returns the room type
    public String getRoomType() {
        return roomType;
    }
    //changes the room Type
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    //returns the number of nights
    public int getNumberOfNights(){
        return this.numberOfNights;
    }
    //Changes the number of nights
    public void setNumberOfNights (int numberOfNights){
        this.numberOfNights = numberOfNights;
    }
    //returns true if the reservation is on a weekend
    public boolean isWeekend(){
        return this.weekend;
    }
    //Calculates the room price based on room type
    public double getPrice(){

        //king rooms cost more
        if (this.roomType.equalsIgnoreCase("King")){
            return 139.00;
        }
        //double rooms cost less
        return 124.00;
    }
    //Calculates the full reservation total
    public double getReservationTotal(){

        //Calculate the starting total
        double total = this.numberOfNights * this.getPrice();

        //Increase total by 10% for weekends
        if (this.isWeekend()){
            total = total + (total * 0.10);
        }
        return total;
    }
}
