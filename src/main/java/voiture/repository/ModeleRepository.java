package voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import voiture.model.Modele;

public interface ModeleRepository extends JpaRepository<Modele, Long>  {
}
