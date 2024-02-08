package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        System.out.println(count);
        if (count == null) {
            count = 0;
        }
        model.addAttribute("carlist", carService.getCars(count));

        return "cars";
    }
}
