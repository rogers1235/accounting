package com.sda.cristi;

public class CompanyEmployees {
    private int id;
    private double salary;
    private String name;
    private String phoneNumber;
    private String address;
    private String heldFunction;


    public CompanyEmployees() {
super();
    }

    public CompanyEmployees(String heldFunction) {
        this.heldFunction = heldFunction;
    }

    public String getHeldFunction() {
        return heldFunction;
    }

    public void setHeldFunction(String heldFunction) {
        this.heldFunction = heldFunction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




    @Override
    public String toString() {
        return "CompanyEmployees{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", heldFunction='" + heldFunction + '\'' +
                '}';
    }
}

