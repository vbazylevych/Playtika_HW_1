package com.playtika.hw1.employees;

import com.playtika.hw1.Positions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class ProjectManager extends Employee {

    public ProjectManager(String lastName, String firstName, BigDecimal salary) {
        super(lastName, firstName, Positions.PM, salary);}

        public void working(){
            System.out.println("HRs, hire a lot of Devs and several QAs");
        }
   public void createTeam(ArrayList<Employee> employers, String idea) {

        System.out.println("They will do that - " + idea + ":");
        for (Employee employee : employers) {
            System.out.println(employee.getLastName());
        }
    }

    public String giveTask(Employee employee) {
        String jiraNumber = new Random().toString().replace("java.util.Random@", "");
        return jiraNumber;
        }


}

