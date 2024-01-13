package voiture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voiture.model.Annonceutilisateur;
import voiture.repository.AnnonceutilisateurRepository;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Service
public class AnnonceutilisateurService {
    private final AnnonceutilisateurRepository annonceutilisateurRepository;

    @Autowired
    public AnnonceutilisateurService(AnnonceutilisateurRepository annonceutilisateurRepository) {
        this.annonceutilisateurRepository = annonceutilisateurRepository;
    }
    public voiture.model.Annonceutilisateur AddAnnonceutilisateur(voiture.model.Annonceutilisateur annonceutilisateur){
        return annonceutilisateurRepository.save(annonceutilisateur);
    }

    public void updateStatusAnnonce(Integer Id_Annonceutilisateur){
        annonceutilisateurRepository.updateStatusAnnonce(Id_Annonceutilisateur);
    }
}
