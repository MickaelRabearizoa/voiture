package voiture.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voiture.model.Carburant;
import voiture.model.Marque;
import voiture.service.CarburantService;

@RestController
@RequestMapping("/carburant")
public class CarburantController {

    private final CarburantService carburantService;

    @Autowired
    public CarburantController(CarburantService carburantService) { this.carburantService = carburantService; }

    @PostMapping("/createcarburant")
    public Carburant createCarburant(@RequestBody Carburant carburant) {
        return carburantService.createCarburant(carburant);
    }

    @GetMapping()
    public Iterable<Carburant> getCarburant() { return carburantService.getAllCarburants(); }
}
