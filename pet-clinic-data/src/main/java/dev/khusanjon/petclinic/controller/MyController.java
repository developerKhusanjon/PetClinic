package dev.khusanjon.petclinic.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    String getGreeting(){
        System.out.println("Hello world");

        return "Hi crowd";
    }
}
