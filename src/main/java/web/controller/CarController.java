package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String index(Model model, HttpServletRequest request) {
        String id = request.getParameter("id");
        int counter = id == null ? 5 : Math.max(Integer.parseInt(id), 0);
        model.addAttribute("cars", carService.returnTheNumberOfCarsByCounter(counter));
        return "/carPages/index";
    }
}
