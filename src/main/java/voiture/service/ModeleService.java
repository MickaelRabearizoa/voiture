package voiture.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voiture.model.Modele;
import voiture.repository.ModeleRepository;

import java.util.List;

@Service
public class ModeleService {

    private final ModeleRepository modeleRepository;

    @Autowired
    public ModeleService(ModeleRepository modeleRepository) {
        this.modeleRepository = modeleRepository;
    }

    public Modele addModele(Modele modele) {
        return modeleRepository.save(modele);
    }

    public List<Modele> getAllModele() {
        return modeleRepository.findAll();
    }
}
