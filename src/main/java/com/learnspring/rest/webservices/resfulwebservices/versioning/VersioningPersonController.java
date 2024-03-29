package com.learnspring.rest.webservices.resfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getFistVersionOfPerson(){
        return new PersonV1("Dibya Ranjan");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2("Dibya", "Ranjan");
    }

    @GetMapping(path="/person",params = "version=1")
    public PersonV1 getFistVersionOfPersonRequestParameter(){
        return new PersonV1("Dibya Ranjan");
    }

    @GetMapping(path="/person",params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParameter(){
        return new PersonV2("Dibya", "Ranjan");
    }

    @GetMapping(path="/person/header",headers = "x-api-version=1")
    public PersonV1 getFistVersionOfPersonRequestHeader(){
        return new PersonV1("Dibya Ranjan");
    }

    @GetMapping(path="/person/header",params = "x-api-version=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader(){
        return new PersonV2("Dibya", "Ranjan");
    }

    @GetMapping(path="/person/accept",produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFistVersionOfPersonAcceptHeader(){
        return new PersonV1("Dibya Ranjan");
    }

    @GetMapping(path="/person/accept",produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonAcceptHeader(){
        return new PersonV2("Dibya", "Ranjan");
    }
}
