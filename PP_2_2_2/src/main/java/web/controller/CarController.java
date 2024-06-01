package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.List;

@Controller
//@RequestMapping("/cars")
public class CarController {

    @GetMapping("/cars")
    public String index(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
        CarServiceImpl carServiceImpl = new CarServiceImpl();
        model.addAttribute("cars", carServiceImpl.cars(count));
        return "cars";
    }
}
