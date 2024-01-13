package voiture.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import voiture.model.Marque;
import voiture.model.Modele;
import voiture.service.ModeleService;

@RestController
@RequestMapping("/modele")
public class ModeleController {

    private final ModeleService modeleService;

    @Autowired
    public ModeleController(ModeleService modeleService) {
        this.modeleService = modeleService;
    }

    @PostMapping("/createmodele")
    public Modele createModele(@RequestBody Modele modele) {
        return modeleService.addModele(modele);
    }

    @GetMapping()
    public Iterable<Modele> getModele() { return modeleService.getAllModele(); }
}
