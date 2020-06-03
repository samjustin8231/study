package com.example.designpattern.structure.composite.department;

/**
 * @author sunyajun
 * @date 2020/4/15 11:07 AM
 */
public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}
