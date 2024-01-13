package voiture.controller;

import org.apache.catalina.util.ResourceSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import voiture.model.Marque;
import voiture.service.MarqueService;
import voiture.tools.Util;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/marques")
public class MarqueController {

    private final MarqueService marqueService;

    @Autowired
    public MarqueController(MarqueService marqueService) { this.marqueService = marqueService; }

    @PostMapping("/createmarque")
    public Marque create(@RequestBody Marque marque) {
        return marqueService.createMarque(marque);
    }

    @GetMapping()
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Map<String, Object>> getMarque() {
        Map<String,Object> response = Util.getDefaultResponse();
        response.put("data",marqueService.getAllMarque());
        response.replace("error","tena misy erreur");
        return new ResponseEntity<Map<String, Object>>(
                response,
                HttpStatusCode.valueOf(400)
        );
    }
}
