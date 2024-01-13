package voiture.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voiture.model.Carburant;
import voiture.repository.CarburantRepository;

import java.util.List;

@Service
public class CarburantService {

    private final CarburantRepository carburantRepository;

    @Autowired
    public CarburantService(CarburantRepository carburantRepository) { this.carburantRepository = carburantRepository; }

    public Carburant createCarburant(Carburant carburant) { return carburantRepository.save(carburant); }

    public List<Carburant> getAllCarburants() { return carburantRepository.findAll(); }
}
