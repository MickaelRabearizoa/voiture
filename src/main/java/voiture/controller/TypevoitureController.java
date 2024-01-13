package voiture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import voiture.model.Modele;
import voiture.model.Typevoiture;
import voiture.service.TypevoitureService;

@RestController
@RequestMapping("/typevoitures")
public class TypevoitureController {

    private final TypevoitureService typevoitureService;

    @Autowired
    public TypevoitureController(TypevoitureService typevoitureService) {
        this.typevoitureService = typevoitureService;
    }

    @PostMapping("/createtypevoiture")
    public Typevoiture createTypevoiture(@RequestBody Typevoiture typevoiture) {
        return typevoitureService.addTypevoiture(typevoiture);
    }

    @GetMapping()
    public Iterable<Typevoiture> getTypevoiture() { return typevoitureService.getAllTypevoiture(); }
}
