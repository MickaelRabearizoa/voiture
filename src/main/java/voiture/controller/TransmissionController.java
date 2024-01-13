package voiture.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import voiture.model.Modele;
import voiture.model.Transmission;
import voiture.service.TransmissionService;
import voiture.tools.Util;

import java.util.Map;

@RestController
@RequestMapping("/transmission")
public class TransmissionController {

    private final TransmissionService transmissionService;

    @Autowired
    public TransmissionController(TransmissionService transmissionService) { this.transmissionService = transmissionService; }

    @PostMapping("/createtransmission")
    public Transmission createTransmission(@RequestBody Transmission transmission) {
        return transmissionService.createTransmission(transmission);
    }

    @GetMapping()
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Map<String, Object>> getTransmission() {
        Map<String,Object> response = Util.getDefaultResponse();
        response.put("data",transmissionService.getAllTransmission());
        return new ResponseEntity<Map<String, Object>>(
                response,
                HttpStatusCode.valueOf(400)
        );
    }
}
