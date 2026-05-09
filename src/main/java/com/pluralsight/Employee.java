package com.pluralsight;

//This class stores employee payroll information
public class Employee {

    //Stores the employee ID
    private int employeeID;

    //Stores the employee name
    private String name;

    //Stores the employee department
    private String department;

    //Stores the employee hourly pay rate
    private double payRate;

    //Stores the total hours worked
    private int hoursWorked;

    //Stores the time the employee punched in
    private int punchInTime;

    //Constructor used to create an employee object
    public Employee (int employeeID, String name, String department, double payRate, int hoursWorked) {

        //Set employee ID
        this.employeeID = employeeID;

        //Set employee name
        this.name = name;

        //Set employee department
        this.department = department;

        //Set pay rate
        this.payRate = payRate;

        //Set hours worked
        this.hoursWorked = hoursWorked;
    }

    //Calculates the employee total pay
    public double getTotalPay() {

        //Calculate regular pay
        double regularPay = this.getRegularHours() * this.payRate;

        //Calculate overtime pay
        double overtimePay = this.getOvertimeHours() * this.payRate * 1.5;

        //Return total pay
        return regularPay + overtimePay;
    }
    //Calculates regular hours worked
    public int getRegularHours() {

        //if employee worked less than or equal to 40 hours
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        }

        //Otherwise regular hours stop at 40
        return 40;
    }
    //Calculates overtime hours
    public int getOvertimeHours() {

        //Overtime starts after 40 hours
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        }
        //Otherwise no overtime
        return 0;
    }
    //Employee punches in at a certain time
    public void punchIn(int time) {
        this.punchInTime = time;
    }

    //Employee punches out and hours are added
    public void punchOut(int time){

        //Calculate hours worked during shift
        int workedHours = time - this.punchInTime;

        //add worked hours to total hours
        this.hoursWorked += workedHours;
    }
    //Handles punching in or out
    public void punchTimeCard ( int time, String action){

        //Punch in
        if (action.equalsIgnoreCase("in")) {
            this.punchIn(time);
        }
        //Punch out
        if (action.equalsIgnoreCase("out")) {
            this.punchOut(time);
        }
    }
    //Allows employee to punch in and out together
    public void punchTimeCard ( int startTime, int endTime){

        //Punch in first
        this.punchIn(startTime);

        //Punch out second
        this.punchOut(endTime);
    }
}