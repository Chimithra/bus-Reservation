package com.company.BusReservation;
import java.util.ArrayList;
import java.util.Scanner;

public class BusReser {
    public static void main(String[] args) {
        ArrayList<Bus>buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        buses.add(new Bus(1,true,2, "Chennai", "Trichy"));
        buses.add(new Bus(2,false,35,"Trichy", "Chennai"));
        buses.add(new Bus(3,true,40,"Chennai","Madurai"));
        for(Bus Detail : buses){
            Detail.displayInfo();
        }
        int ResOption = 0;
        while(ResOption != 2){
            System.out.println("Book your Ticket here : press 1 for booking or 2 for exit");
            ResOption =
                    in.nextInt();
            if(ResOption == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking Confirmed ");
                    System.out.println("Enter 1 to know your Booking details or 2 to exit : ");
                        int n = in.nextInt();
                        if(n == 1){
                            booking.display();
                        }
                        else{
                            System.out.println("Thank you for Booking");
                        }
                }
                else{
                    System.out.println("Bus filled : Try another bus");
                }
            }
        }
    }
}
