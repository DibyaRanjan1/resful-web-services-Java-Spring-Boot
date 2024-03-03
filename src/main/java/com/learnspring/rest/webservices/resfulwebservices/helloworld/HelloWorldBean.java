package com.learnspring.rest.webservices.resfulwebservices.helloworld;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return "HellWorldBean [message= "+message + "]";
    }
}
