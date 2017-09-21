package com.playtika.hw1.employees;

import com.playtika.hw1.Positions;

import javax.swing.text.Position;
import java.math.BigDecimal;

public class DevOps extends Employee{
    public DevOps(String lastName, String firstName, BigDecimal salary) {
        super(lastName, firstName, Positions.DevOps, salary);
    }

    @Override
    public void working(String jiraNumber) {
        System.out.println(jiraNumber + "was deployed to PROD");
    }
}