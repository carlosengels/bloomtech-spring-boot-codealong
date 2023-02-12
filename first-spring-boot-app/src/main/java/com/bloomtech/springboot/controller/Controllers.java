package com.bloomtech.springboot.controller;

// This class will hold controllers for our server

import com.bloomtech.springboot.model.Data;
import org.springframework.web.bind.annotation.*;

// Data may be sent with an HTTP request:
// GET or DELETE request - data is in a URL query parameter(?name=value)

// POST or PUT request - the data is in the request body - @RequestBody
// HTTP request typically have JSON formatted data in the body
// Java uses objects, not JSON. Server automatically JSON to/from objects
// In Postman you must put any data for POST in the request body.

@RestController // Tells the server there are REST controller methods in this class.
public class Controllers {
    // Define a method to handle  HTTP GET requests for the root URL path ("/")
    @GetMapping(value="/") // The method that follows will handle the HTTP GET requests for "/"
    public String rootPathMethod() {
        System.out.println("Method for GET with path '/' was executed.");
        return "Root path method was called";
    }
    // Define a method to handle HTTP GEt request for the URL path "/startrek"
    //  with a query parameter of "character=value"
    // To access data in a a query parameter - use the @RequestParam annotation in the method parameter list
    // @RequestParam data-type-of-query-parameter
    @GetMapping(value="/startrek")
    public String beamMeUp(@RequestParam String value) {
        System.out.println("Controller method for GET with path '/startrek' was called");
        return "Scotty, beam me up! Paramter was called with value + " + value;
    }
    @GetMapping(value="/startrek/spock")
    public String spock() {
        System.out.println("Controller method for GET with path '/startrek' was called");
        return "Live long, and prosper.";
    }
    // @RequestBody allows access to data in the request body
    @PostMapping(value="/")
    public String wilberPost(@RequestBody Data dataForRequest) {
        System.out.println("Controller method for POST with path '/' was called");
        System.out.println("The data sent with the request was: " + dataForRequest.toString());
        return "Mr Ed was a talking horse on the TV 1960s";
    }
}
