package voiture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voiture.model.AnnonceValide;
import voiture.model.Utilisateur;
import voiture.repository.AnnonceValideRepository;

@Service
public class AnnonceValideService {

    public final AnnonceValideRepository annonceValideRepository;

    @Autowired
    public AnnonceValideService(AnnonceValideRepository annonceValideRepository) {
        this.annonceValideRepository = annonceValideRepository;
    }
    public AnnonceValide addAnnonceValide(AnnonceValide annonceValide) {
        return annonceValideRepository.save(annonceValide);
    }
}
