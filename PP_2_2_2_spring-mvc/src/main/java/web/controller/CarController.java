package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImpl carServiceImpl;

    @Autowired
    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String index(ModelMap model) {
        model.addAttribute("cars",carServiceImpl.index());
        //List<String> messages = new ArrayList<>();
        //messages.add("Hello!1");
        //messages.add("I'm Spring MVC application");
        //messages.add("5.2.0 version by sep'19 ");
        //model.addAttribute("messages", messages);
        return "cars/index";
        //return null;
    }
}
