package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class CarDaoImpl implements CarDao{
    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("model1", 1001));
        carList.add(new Car("model2", 1002));
        carList.add(new Car("model3", 1003));
        carList.add(new Car("model4", 1004));
        carList.add(new Car("model5", 1005));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).toList();
    }
}
