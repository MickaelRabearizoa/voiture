package voiture.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import voiture.model.AnnonceValide;
import voiture.service.AnnonceValideService;



@RestController
@RequestMapping("/annonceValide")
public class AnnonceValideController {
    public final AnnonceValideService annonceValideService;

    public AnnonceValideController(AnnonceValideService annonceValideService) {
        this.annonceValideService = annonceValideService;
    }

    @PutMapping("/addAnnonceValide")
    @PreAuthorize("hasRole('ADMIN')")
    public AnnonceValide addAnnonceValide(@RequestBody  AnnonceValide annonceValide){
        return annonceValideService.addAnnonceValide(annonceValide);
    }

}
