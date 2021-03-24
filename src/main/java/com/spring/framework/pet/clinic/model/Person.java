package com.spring.framework.pet.clinic.model;

public class Person {

    private Long id;
    private String firstName;
    private String lastName;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
