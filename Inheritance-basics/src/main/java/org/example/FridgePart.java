package org.example;

public class FridgePart extends Fridge {

    private String name;
    private String serialNumber;
    private int price;
    private int stock;

    public FridgePart(String name, String serialNumber, int price, int stock) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return this.name;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public void setStock(int quantity) {
        this.stock = quantity;
    }

}
