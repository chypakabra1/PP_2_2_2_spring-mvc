package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl {
    public static int CARS;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS, "Mazda", 1999, "Red"));
        cars.add(new Car(++CARS, "Lada",2005, "Blue"));
        cars.add(new Car(++CARS, "Porsche", 2010, "Black"));
        cars.add(new Car(++CARS, "Rover", 2015, "White"));
        cars.add(new Car(++CARS, "BMW", 2000, "Gray"));
    }
    public List<Car> index() {
        return cars;
    }

    /*public static List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }*/

    /*public Car show(int id) {
        return cars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }*/
}
