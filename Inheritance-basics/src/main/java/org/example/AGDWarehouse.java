package org.example;

public class AGDWarehouse {

    protected int numOfPalleteRacks;
    protected int numOfRackStoreges;
    protected int lengthOfRack;
    protected int floorPlacePerOnePallete;
    protected int numOfGates;
    protected int numOfForklifts;

    public AGDWarehouse(int numOfPalleteRacks, int numOfRackStoreges, int lengthOfRack, int floorPlacePerOnePallete) {
        this.numOfPalleteRacks = numOfPalleteRacks;
        this.numOfRackStoreges = numOfRackStoreges;
        this.lengthOfRack = lengthOfRack;
        this.floorPlacePerOnePallete = floorPlacePerOnePallete;
    }

    public AGDWarehouse(int numOfGates, int numOfForklifts) {
        this.numOfGates = numOfGates;
        this.numOfForklifts = numOfForklifts;
    }

    public AGDWarehouse() {

    }

    public int getNumOfPalleteRacks() {
        return this.numOfPalleteRacks;
    }

    public void setNumOfPalleteRacks(int numOfPalleteRacks) {
        this.numOfPalleteRacks = numOfPalleteRacks;
    }

    public int getNumOfRackStoreges() {
        return this.numOfRackStoreges;
    }

    public void setNumOfRackStoreges(int numOfRackStoreges) {
        this.numOfRackStoreges = numOfRackStoreges;
    }

    public int getLengthOfRack() {
        return lengthOfRack;
    }

    public void setLengthOfRack(int lengthOfRack) {
        this.lengthOfRack = lengthOfRack;
    }

    public int getFloorPlacePerOnePallete() {
        return floorPlacePerOnePallete;
    }

    public void setFloorPlacePerOnePallete(int floorPlacePerOnePallete) {
        this.floorPlacePerOnePallete = floorPlacePerOnePallete;
    }

    public int getNumOfGates() {
        return numOfGates;
    }

    public void setNumOfGates(int numOfGates) {
        this.numOfGates = numOfGates;
    }

    public int getNumOfForklifts() {
        return numOfForklifts;
    }

    public void setNumOfForklifts(int numOfForklifts) {
        this.numOfForklifts = numOfForklifts;
    }

    public void takeMachineFromPlace(int row, int column, int[][] rackArray) {
        rackArray[row][column] = 0;
    }

    public void putMachineIntoPlace(int row, int column, int[][] rackArray) {
        rackArray[row][column] += 1;
    }

    public void loadTheTruck(int gateNumber) {
        System.out.println("Loading the truck at the gate number " + gateNumber);
    }

    public void unloadingTheTruck(int gateNumber) {
        System.out.println("Unloading the truck at the gate number" + gateNumber);
    }

    public void checkMachine() {
        System.out.println("Machine connected...");
        System.out.println("checking the machine...");
    }

    public void orderNew(int quantity) {
        System.out.println("Ordering the...");
    }

}
