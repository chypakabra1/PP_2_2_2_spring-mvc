package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public interface CarService {
    //List<Car> getCars(int carServiceImpl);

    //List<Car> index(int id);
//    public static int CARS;
//    private List<Car> cars;
//
//    {
//        cars = new ArrayList<>();
//
//        cars.add(new Car(++CARS, "1"));
//        cars.add(new Car(++CARS, "2"));
//        cars.add(new Car(++CARS, "3"));
//        cars.add(new Car(++CARS, "4"));
//    }
//    public List<Car> index() {
//        return cars;
//    }
//
//    public Car show(int id) {
//        return cars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
//    }
}
