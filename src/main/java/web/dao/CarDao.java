package web.dao;

import web.model.Car;

import java.util.List;
import java.util.OptionalInt;

public interface CarDao {
    List<Car> getCars(Integer count);
}
