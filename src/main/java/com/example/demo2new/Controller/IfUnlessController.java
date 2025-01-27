package com.example.demo2new.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2new.domain.Car;

@Controller
@RequestMapping("/if-unless")
public class IfUnlessController {

    @RequestMapping("")
    public String index(Model model){
        Car car = new Car();
        car.setSpeed(100);

        model.addAttribute("car", car);

        return "if-unless";
    }
}
