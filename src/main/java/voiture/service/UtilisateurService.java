package voiture.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voiture.model.Utilisateur;
import voiture.repository.UtilisateurRepository;


@Service
public class UtilisateurService {

  @Autowired
  private UtilisateurRepository utilisateurRepository;

  public Optional<Utilisateur> findByNameAndPassword(Utilisateur utilisateur) {
    System.out.println("tafididtra");

    Optional<Utilisateur> user = utilisateurRepository.findByLoginAndMotdepasse(
      utilisateur.getLogin(),
      utilisateur.getMotdepasse()
    );
    System.out.println(user);
    if (user.isPresent()) {
      System.out.println(user.get());
    }
    return user;
  }
}
