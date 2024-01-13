package voiture.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voiture.model.Marque;
import voiture.model.Transmission;
import voiture.repository.TransmissionRepository;

import java.util.List;

@Service
public class TransmissionService {

    private final TransmissionRepository transmissionRepository;

    @Autowired
    public TransmissionService(TransmissionRepository transmissionRepository) { this.transmissionRepository = transmissionRepository; }

    public Transmission createTransmission(Transmission transmission) {
        return transmissionRepository.save(transmission);
    }

    public List<Transmission> getAllTransmission() { return transmissionRepository.findAll(); }
}
