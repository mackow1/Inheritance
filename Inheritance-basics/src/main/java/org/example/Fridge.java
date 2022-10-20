package org.example;

public class Fridge extends AGDWarehouse {

    private String model;
    private String color;
    private int price;
    private boolean isNew;

    private boolean isWorking;

    private int stock;

    public Fridge(String model, String color, int price, boolean isNew, boolean isWorking, int stock) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.isNew = isNew;
        this.isWorking = isWorking;
        this.stock = stock;
    }

    public Fridge() {

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int quantity) {
        this.stock = stock;
    }

    @Override
    public void checkMachine() {
        System.out.println("Fridge connected...");
        System.out.println("Checking the fridge...");
    }

    @Override
    public void takeMachineFromPlace(int row, int column, int[][] rackArray) {
        System.out.println("Taking the Fridge from " + rackArray[row][column]);
        rackArray[row][column] = 0;
    }

    @Override
    public void putMachineIntoPlace(int row, int column, int[][] rackArray) {
        System.out.println("Putting the Fridge to " + rackArray[row][column]);
        rackArray[row][column] += 1;
    }

    public void repairFridge() {
        this.isWorking = true;
    }

    public void repairFridge(String partName, int quantity) {
        this.isWorking = true;
    }

}
