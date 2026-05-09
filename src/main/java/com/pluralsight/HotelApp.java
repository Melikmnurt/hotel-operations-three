package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        //Create different room objects
        Room room1 = new Room(2, 129.99, false, false);

        Room room2 = new Room(1, 89.99, true, false);

        Room room3 = new Room(2, 149.99, false, true);

        //display room 1 information
        System.out.println("Room 1");

        System.out.println("Beds: " + room1.getNumberofBeds());

        System.out.println("Price: $" + room1.getPrice());

        System.out.println("Occupied: " + room1.isOccupied());

        System.out.println("Dirty: " + room1.isDirty());

        System.out.println("Availability: " + room1.isAvailable());

        System.out.println();

        //Display room 2 information
        System.out.println("Room 2");

        System.out.println("Beds: " + room2.getNumberofBeds());

        System.out.println("Price: $" + room2.getPrice());

        System.out.println("Occupied: " + room2.isOccupied());

        System.out.println("Dirty: " + room2.isDirty());

        System.out.println("Availability: " + room2.isAvailable());

        System.out.println();

        //Create a reservation object
        Reservation reservation1 = new Reservation("King", 3, true);

        //Display reservation information
        System.out.println("Reservation Information");

        System.out.println("Room Type: " + reservation1.getRoomType());

        System.out.println("Number of Nights: " + reservation1.getNumberOfNights());

        System.out.println("Weekend Stay: " + reservation1.isWeekend());

        System.out.println("Price per Night: $" + reservation1.getPrice());

        System.out.println("Reservation Total: $" + reservation1.getReservationTotal());

        System.out.println();

        //Create an employee object
        Employee employee1 = new Employee(101, "Mike", "Front Desk", 20.00, 45);

        //Display Employee Information
        System.out.println("Employee Information");

        System.out.println("Total Pay: $" + employee1.getTotalPay());

        System.out.println("Regular Hours: " + employee1.getRegularHours());

        System.out.println("Overtime Hours: " + employee1.getOvertimeHours());

        System.out.println();

        //test punch in and out
        employee1.punchIn(8);

        employee1.punchOut(12);

        //Display updated information
        System.out.println("Updated Employee Information");

        System.out.println("Total Pay: $" + employee1.getTotalPay());

        System.out.println("Regular Hours: " + employee1.getRegularHours());

        System.out.println("Overtime Hours: " + employee1.getOvertimeHours());

        //test room methods
        room1.checkIn();

        System.out.println("After Check In");

        System.out.println("Occupied: " + room1.isOccupied());

        System.out.println("Dirty: " + room1.isDirty());

        System.out.println("Available: " + room1.isAvailable());

        System.out.println();

        //Clean the room
        room1.cleanRoom();

        System.out.println("After Check Out");

        System.out.println("Occupied: " + room1.isOccupied());

        System.out.println("Dirty: " + room1.isDirty());

        System.out.println("Available: " + room1.isAvailable());

        System.out.println();

        //Check out the room
        room1.checkOut();

        System.out.println("After Cleaning Room");

        System.out.println("Occupied: " + room1.isOccupied());

        System.out.println("Dirty: " + room1.isDirty());

        System.out.println("Available: " + room1.isAvailable());

        System.out.println();

        //Create a hotel object
        Hotel hotel = new Hotel("Ocean View", 5, 20);

        //Display starting room availability
        System.out.println("Hotel Availability");

        System.out.println("Available Suites: " + hotel.getAvailableSuites());

        System.out.println("Available Basic Rooms: " + hotel.getAvailableRooms());

        System.out.println();

        //Attempt to book suites
        boolean bookedSuite = hotel.bookRoom(2, true);

        System.out.println("Suite Booking Successful: " + bookedSuite);

        //Attempt to book basic rooms
        boolean bookedRoom = hotel.bookRoom(3, false);

        System.out.println("Basic Room Booking Successful: " + bookedRoom);

        System.out.println();

        //Display updated room availability
        System.out.println("Updated Hotel Availability");

        System.out.println("Available Suites: " + hotel.getAvailableSuites());

        System.out.println("Available Basic Rooms: " + hotel.getAvailableRooms());
    }
}
