package com.example.designpattern.structure.composite.department;

/**
 * @author sunyajun
 * @date 2020/4/15 11:08 AM
 */
public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
