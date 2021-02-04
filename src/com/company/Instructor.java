package com.company;

public class Instructor extends Employee {

    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
        setSalary(hours * 199);
    }

    // Do I need this?
    public Instructor(String name, String cpr, int hours){
        super();
        setSalary(hours * 199);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }
}
