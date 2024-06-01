package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

//@Component
public interface CarService {
    List<Car> cars(Integer count);
}
