package com.playtika.hw1.employees;

import com.playtika.hw1.Positions;

import java.math.BigDecimal;

public class Tester extends Employee {
    public Tester(String lastName, String firstName,Positions position, BigDecimal salary) {
        super(lastName, firstName, position, salary);
    }

    @Override
    public void working(String jiraNumber) {
        System.out.println("I will test " + jiraNumber);
    }
}
