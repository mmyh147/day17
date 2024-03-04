package com.example.newserverproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class welcomeController {


    @GetMapping(path = "/name")
    public String getName(){
        return "Mohammed";
    }

    @GetMapping(path = "/age")
    public String getAge(){
        return "26";
    }

    @GetMapping(path = "/check/status")
    public String checkStatus(){
        return "everything is OK";
    }

    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }



    @GetMapping("/names")
    public List<String> getNames() {
        return Arrays.asList("Mohammed", "Ali", "abdullah", "sara", "Sami");
    }
}
