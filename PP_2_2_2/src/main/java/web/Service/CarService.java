package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public interface CarService {
    /*public static List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }*/
    //List<Car> getCars(int count);

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
