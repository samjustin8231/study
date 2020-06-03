package com.example.designpattern.cteator.builder.buildperson;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:48
 */
public class BuilderMain {
    public static void main(String[] argv) {
        Person person = new Person.Builder().name("StephenHe").age(20).sex(true).build();
        System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.isSex());
    }
}
