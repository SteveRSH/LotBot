package com.theironyard.charlotte.LotBot;

public abstract class Vehicle {
    protected String licensePlate;

    public Vehicle() {
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
