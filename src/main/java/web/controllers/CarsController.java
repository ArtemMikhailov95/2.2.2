package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servers.CarServer;

@Controller
@RequestMapping()
public class CarsController {

    private final CarServer carServer;

    public CarsController(CarServer carServer) {
        this.carServer = carServer;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("count", carServer.getCar(count));
        return "/cars";
    }
}
