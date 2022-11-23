package org.example.people;

abstract class Employee extends Person {

    private int salary;
    private Contract typeOfContract;
    private boolean onHolidays;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Contract getTypeOfContract() {
        return this.typeOfContract;
    }

    public void setTypeOfContract(Contract typeOfContract) {
        this.typeOfContract = typeOfContract;
    }

    public boolean isOnHolidays() {
        return this.onHolidays;
    }

    public void setOnHolidays(boolean onHolidays) {
        this.onHolidays = onHolidays;
    }
}
