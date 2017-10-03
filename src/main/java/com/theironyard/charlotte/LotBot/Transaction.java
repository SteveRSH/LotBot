package com.theironyard.charlotte.LotBot;

import java.time.LocalDateTime;


public class Transaction {
    private Car car;
    private LocalDateTime checkedInDate;
    private LocalDateTime checkedOutDate;
    private Double price;

    public Transaction(Car car, LocalDateTime checkedInDate) {
        this.car = car;
        this.checkedInDate = checkedInDate;
    }

    public Transaction() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDateTime getCheckedInDate() {
        return checkedInDate;
    }

    public void setCheckedInDate(LocalDateTime checkedInDate) {
        this.checkedInDate = checkedInDate;
    }

    public LocalDateTime getCheckedOutDate() {
        return checkedOutDate;
    }

    public void setCheckedOutDate(LocalDateTime checkedOutDate) {
        this.checkedOutDate = checkedOutDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
