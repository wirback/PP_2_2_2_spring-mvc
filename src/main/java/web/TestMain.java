package web;

import web.dao.CarDao;
import web.dao.CarDaoImpl;

public class TestMain {
    public static void main(String[] args) {
        CarDao carDao = new CarDaoImpl();

        System.out.println("\nTest 1 - (param = -1):\n" + carDao.getCar(-1));
        System.out.println("\nTest 2 - (param = 0):\n" + carDao.getCar(0));
        System.out.println("\nTest 3 - (param = 2):\n" + carDao.getCar(2));
        System.out.println("\nTest 4 - (param = 3):\n" + carDao.getCar(3));
        System.out.println("\nTest 5 - (param = 5):\n" + carDao.getCar(5));
        System.out.println("\nTest 6 - (param = 25):\n" + carDao.getCar(25));
    }
}
