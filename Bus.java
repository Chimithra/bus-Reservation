package com.company.BusReservation;

public class Bus {
    private int busNo;
    private boolean Ac;
    private int seatCapacity;
    private String startsWith;
    private String endsWith;
    Bus(int busNo, boolean ac ,int capacity, String startsWith , String endsWith){
        this.busNo = busNo;
        this.Ac = ac;
        this.seatCapacity = capacity;
        this.startsWith = startsWith;
        this.endsWith = endsWith;
    }
    public void setBusNo(int busNo){
        this.busNo = busNo;
    }
    public int getBusNo(){
        return busNo;
    }
    public void setCapacity(int capacity){
        this.seatCapacity = capacity;
    }
    public int getCapacity(){
        return seatCapacity;
    }
    public void setAc(boolean ac){
        this.Ac = ac;
    }
    public boolean getAc(){
        return Ac;
    }
    public void setStartsWith(String startsWith){
        this.startsWith = startsWith;
    }

    public String getStartsWith() {
        return startsWith;
    }

    public void setEndsWith(String endsWith) {
        this.endsWith = endsWith;
    }

    public String getEndsWith() {
        return endsWith;
    }

    public void displayInfo(){
        System.out.println("Bus No        : "+this.busNo);
        System.out.println("Ac            : "+this.Ac);
        System.out.println("Seat Capacity : "+this.seatCapacity);
        System.out.println("StartsWith    : "+this.startsWith);
        System.out.println("EndsWith      : "+this.endsWith);
    }
}
