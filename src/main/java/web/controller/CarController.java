package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Optional;


@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Optional<Integer> count, ModelMap model) {

        model.addAttribute("carlist", carService.getCars(count.orElse(0)));

        return "cars";
    }
}
