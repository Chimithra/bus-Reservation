package com.company.BusReservation;

public class Bus {
    private int busNo;
    private boolean Ac;
    private int capacity;
    Bus(int busNo, boolean ac ,int capacity ){
        this.busNo = busNo;
        this.Ac = ac;
        this.capacity = capacity;
    }
    public void setBusNo(int busNo){
        this.busNo = busNo;
    }
    public int getBusNo(){
        return busNo;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setAc(boolean ac){
        this.Ac = ac;
    }
    public boolean getAc(){
        return Ac;
    }
    public void displayInfo(){
        System.out.println("Bus No : "+this.busNo);
        System.out.println("Ac : "+this.Ac);
        System.out.println("Bus Capacity : "+this.capacity);
    }
}