package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    //Test that punching in and out correctly adds worked hours
    @Test

    public void punchOut_shouldCalculateHoursWorkedCorrectly(){

        //Create an employee with 0 starting hours
        Employee employee = new Employee (101,
                "Mike",
                "Front Desk",
                20.00,
                0);

        //Employee works from 8 to 12
        employee.punchIn(8);

        employee.punchOut(12);

        //Verify 4 regular hours were added
        assertEquals(4, employee.getRegularHours());
    }
    //
}
