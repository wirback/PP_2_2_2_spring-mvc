package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCar(Integer countCar) {
        return carDao.getCar(countCar);
    }
}
