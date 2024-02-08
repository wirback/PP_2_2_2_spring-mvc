package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    private static List<Car> carList;

    static {
        carList = new ArrayList<>();
        carList.add(new Car("model1", 1001));
        carList.add(new Car("model2", 1002));
        carList.add(new Car("model3", 1003));
        carList.add(new Car("model4", 1004));
        carList.add(new Car("model5", 1005));
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null || count >= 5) {
            model.addAllAttributes(carList).containsAttribute("result");
        } else {
            model.addAllAttributes(
                    carList.stream().limit(count).toList())
                    .containsAttribute("result");
        }

        return "cars";
    }
}
