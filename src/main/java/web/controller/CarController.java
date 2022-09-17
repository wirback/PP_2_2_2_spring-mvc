package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Optional;

@Controller
public class CarController {

    @Autowired
    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Optional<Integer> countCar, Model model) {

        model.addAttribute("carlist", carService.getCar(countCar.orElse(0)));

        return "/cars";
    }
}
