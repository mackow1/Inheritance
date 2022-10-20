package org.example;

public class Personel extends AGDWarehouse {

    private String firstName;
    private String lastName;
    private String position;
    private int salary;
    private boolean hasValidMedicalChecks;
    private int experience;


    private int warehousePersonel;
    private int accountingPersonel;
    private int managingPersonel;
    private int drivingPersonel;


    public Personel(String firstName, String lastName, String position, int salary, boolean hasValidMedicalChecks, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.hasValidMedicalChecks = hasValidMedicalChecks;
        this.experience = experience;
    }

    public Personel(int warehousePersonel, int accountingPersonel, int managingPersonel, int drivingPersonel) {
        this.warehousePersonel = warehousePersonel;
        this.accountingPersonel = accountingPersonel;
        this.managingPersonel = managingPersonel;
        this.drivingPersonel = drivingPersonel;
    }

    public Personel() {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary(int salary) {
        return this.salary;
    }

    public  void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isHasValidMedicalChecks() {
        return this.hasValidMedicalChecks;
    }

    public void setHasValidMedicalChecks(boolean hasValidMedicalChecks) {
        this.hasValidMedicalChecks = hasValidMedicalChecks;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getWarehousePersonel() {
        return this.warehousePersonel;
    }

    public void setWarehousePersonel(int warehousePersonel){
        this.warehousePersonel = warehousePersonel;
    }

    public int getAccountingPersonel() {
        return this.accountingPersonel;
    }

    public void setAccountingPersonel(int accountingPersonel) {
        this.accountingPersonel = accountingPersonel;
    }

    public int getManagingPersonel() {
        return this.managingPersonel;
    }

    public void setManagingPersonel(int managingPersonel) {
        this.managingPersonel = managingPersonel;
    }

    public int getDrivingPersonel() {
        return this.drivingPersonel;
    }

    public void setDrivingPersonel(int drivingPersonel) {
        this.drivingPersonel = drivingPersonel;
    }

    public void fireWorker() {
        System.out.println("You are fired, erase from the system...");
        this.firstName = "";
        this.lastName = "";
        this.position = "";
        this.salary = 0;
        this.hasValidMedicalChecks = false;
    }

    public void giveRaise(int amount) {
        System.out.println("Well done, you get a salary rise!");
    }
}
