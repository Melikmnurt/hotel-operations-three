package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//This class tests the Room class methods
public class RoomTest {

     //Tests that checking into a room makes the room occupied and dirty
    @Test

    public void checkIn_shouldOccupyAndDirtyRoom() {

        //Create a clean and available room
        Room room = new Room(2, 1299.99, false, false);

        //Check in to the room
        room.checkIn();

        //Verify the room is now occupied
        assertTrue(room.isOccupied());

        //Verify the room is now dirty
        assertTrue(room.isDirty());
    }
     //Test
}
