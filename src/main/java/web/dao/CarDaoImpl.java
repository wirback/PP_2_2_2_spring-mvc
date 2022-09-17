package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    @Autowired
    private static List<Car> listCar;

    {
        listCar = new ArrayList<>();

        listCar.add(new Car("VAZ", 2101, "White"));
        listCar.add(new Car("GAZ", 3110, "Gray"));
        listCar.add(new Car("UAZ", 3151, "Green"));
        listCar.add(new Car("ZAZ", 966, "Red"));
        listCar.add(new Car("Kamaz", 6520, "Orange"));
    }

    @Override
    public List<Car> getCar(Integer count) {
        if (count == 0) return listCar;

        return listCar.stream().limit(count).toList();
    }
}
