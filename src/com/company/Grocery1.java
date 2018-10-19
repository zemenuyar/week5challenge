package com.company;

public class Grocery1 {

    private String name;
    private double price;
    private int quantity;
    private double cost;
    private boolean taxable;

    public Grocery1(String name, double price, int quantity, double cost, boolean taxable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.cost = cost;
        this.taxable = taxable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }
}

