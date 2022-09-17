package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    @Autowired
    @Override
    public List<Car> getCar(Integer countCar) {
        return null;
    }
}
