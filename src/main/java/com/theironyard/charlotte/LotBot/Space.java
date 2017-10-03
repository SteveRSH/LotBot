package com.theironyard.charlotte.LotBot;

public class Space {
    private Transaction transaction; //type of car large, compact

    @Override
    public String toString() {
        return "Space{" +
                "transaction=" + transaction +
                '}';
    }

    public Space(Transaction transaction) {
        this.transaction = transaction;
    }

    public Space() {
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
