package com.pluralsight;

//This class represents a hotel
public class Hotel {

    //Stores the hotel name
    private String name;

    //Stores the total number of suites
    private int numberOfSuites;

    //Stores the total number of basic rooms
    private int numberOfRooms;

    //Stores how many suites are booked
    private int bookedSuites;

    //Stores how many basic rooms are booked
    private int bookedBasicRooms;

    //Constructor used to create a hotel object
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {

        //Set hotel name
        this.name = name;

        //Set total suites
        this.numberOfSuites = numberOfSuites;

        //Set total rooms
        this.numberOfRooms = numberOfRooms;

        //Default booked suites to 0
        this.bookedSuites = 0;

        //Default booked basic rooms to 0
        this.bookedBasicRooms = 0;
    }

    //Constructor used to create a hotel object with booked rooms
    public Hotel(String name,
                 int numberOfSuites,
                 int numberOfRooms,
                 int bookedSuites,
                 int bookedBasicRooms) {

        //Set hotel name
        this.name = name;

        //Set total suites
        this.numberOfSuites = numberOfSuites;

        //Set total rooms
        this.numberOfRooms = numberOfRooms;

        //Set booked suites
        this.bookedSuites = bookedSuites;

        //Set booked basic rooms
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //Returns the number of available suites
    public int getAvailableSuites() {

        //Calculate available suites
        return this.numberOfSuites - this.bookedSuites;
    }

    //Returns the number of available basic rooms
    public int getAvailableRooms() {

        //Calculate available rooms
        return this.numberOfRooms - this.bookedBasicRooms;
    }

    //Books one or more rooms if available
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {

        //If booking a suite
        if (isSuite) {

            //Check if enough suites are available
            if (numberOfRooms <= this.getAvailableSuites()) {

                //Increase booked suites
                this.bookedSuites += numberOfRooms;

                //Booking Successful
                return true;
            }
        }
            //If booking a basic room
            else {
                //Check if enough basic rooms are available
                if (numberOfRooms <= this.getAvailableRooms()) {

                    //Increase booked basic rooms
                    this.bookedBasicRooms += numberOfRooms;

                    //Booking Successful
                    return true;
                }
            }
            //Booking Failed
            return false;
        }
    }
