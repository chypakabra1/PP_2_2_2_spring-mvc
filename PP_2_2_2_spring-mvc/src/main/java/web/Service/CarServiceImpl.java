package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl {
    public static int CARS;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS, "Mazda", 1999));
        cars.add(new Car(++CARS, "Lada",2005));
        cars.add(new Car(++CARS, "Porsche", 2010));
        cars.add(new Car(++CARS, "Rover", 2015));
    }
    public List<Car> index() {
        return cars;
    }

    public Car show(int id) {
        return cars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }

    /*@Override
    public List<Car> index(int carServiceImpl) {
        return cars;
    }*/
}
