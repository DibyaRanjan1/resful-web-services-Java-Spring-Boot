package com.learnspring.rest.webservices.resfulwebservices.versioning;

public class PersonV2 {

    @Override
    public String toString() {
        return "PersonV2{" +
                "firstname='" + firstname + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    private String firstname;
    private String secondName;
    public PersonV2(String firstName, String secondName) {
        this.firstname = firstName;
        this.secondName = secondName;
    }
}
