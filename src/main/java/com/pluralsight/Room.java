package com.pluralsight;

public class Room {                                     //This class represents a hotel room
    private int numberofBeds;                          //Stores how many beds are in the room
    private double price;                             //Stores the nightly price of the room
    private boolean occupied;                        //keeps track of whether the room is occupied
    private boolean dirty;                          //keeps track whether the room is dirty or not

    //Constructor used to create a new room object
    public Room(int numberofBeds, double price, boolean occupied, boolean dirty){

        //set the number of beds
        this.numberofBeds = numberofBeds;

        //set the room price
        this.price = price;

        //set occupied status
        this.occupied = occupied;

        //set dirty status
        this.dirty = dirty;
    }
    //returns the number of beds in the room
    public int getNumberofBeds(){
        return this.numberofBeds;
    }
    //returns the price of the room
    public double getPrice(){
        return this.price;
    }
    //returns true if the room is occupied
    public boolean isOccupied(){
        return this.occupied;
    }
    //returns true if the room is dirty
    public boolean isDirty(){
        return this.dirty;
    }
    //Calculates whether the room is available
    public boolean isAvailable(){
        //room is available only if it is not occupied
        //and not dirty
        return !this.occupied && !this.dirty;
    }
    //Checks a guest into the room
    public void checkIn (){

        //only allow check in room is available
        if (this.isAvailable()) {

            //room is now occupied
            this.occupied = true;

            //room becomes dirty after use
            this.dirty = true;

        }else{
            // room is not available
            System.out.println("Room is not available");
        }
    }
    //Checks a guest out of the room
    public void checkOut(){
        // room is no longer occupied
        this.occupied = false;
    }
    //Cleans the room
    public void cleanRoom(){
        //room is now clean
        this.dirty = false;
    }
}
