package com.devbarboza.realmexample.model;

public class SalesOrder {

    private String id;

    private String customer;

    private String line;

    public SalesOrder() {
    }

    public SalesOrder(String id, String customer, String line) {
        this.id = id;
        this.customer = customer;
        this.line = line;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
