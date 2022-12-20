package com.example.helloworld.Controller;


import com.example.helloworld.Model.Hero;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHello {

    @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
    public Hero getHero() {

        return new Hero("JNK", 20, false);
    }
}
