package voiture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voiture.model.Marque;
import voiture.repository.MarqueRepository;

import java.util.List;

@Service
public class MarqueService {

    private final MarqueRepository marqueRepository;

    @Autowired
    public MarqueService(MarqueRepository marqueRepository) {
        this.marqueRepository = marqueRepository;
    }

    public Marque createMarque(Marque marque) {
        return marqueRepository.save(marque);
    }

    public List<Marque> getAllMarque() { return marqueRepository.findAll(); }
}
