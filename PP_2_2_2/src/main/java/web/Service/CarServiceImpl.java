package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    public static int CARS;
    @Override
            public List<Car> cars(Integer count) {
        List<Car> cars = new ArrayList<>();
        {

            cars.add(new Car(++CARS, "Mazda", 1999, "Red"));
            cars.add(new Car(++CARS, "Lada", 2005, "Blue"));
            cars.add(new Car(++CARS, "Porsche", 2010, "Black"));
            cars.add(new Car(++CARS, "Rover", 2015, "White"));
            cars.add(new Car(++CARS, "BMW", 2000, "Gray"));
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
