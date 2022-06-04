package com.company.BusReservation;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Booking {
    String passengerName;
    int busNo;
    Date date;
    String from;
    String to;
    Booking(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        passengerName = in.nextLine();
        System.out.println("Enter the Bus No : ");
        busNo = in.nextInt();
        System.out.println("Enter the Date (dd/MM/yyyy): ");
        String Date = in.next();
        SimpleDateFormat data = new SimpleDateFormat();
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(Date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Where startsWith : ");
        from = in.next();
        System.out.println("Where endsWith : ");
        to = in.next();
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus>buses){
        int capacity = 0;
        for(Bus b : buses){
            if(b.getBusNo() == busNo){
                capacity = b.getCapacity();
            }
        }
        int booked = 0;
        for(Booking a : bookings){
            if(a.busNo== busNo && a.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
    void display(){
        System.out.println("Passenger Name : "+ passengerName);
        System.out.println("Bus No         : "+ busNo);
        System.out.println("Date           : "+ date);
        System.out.println("From           : "+ from);
        System.out.println("To             : "+ to);
    }
}

