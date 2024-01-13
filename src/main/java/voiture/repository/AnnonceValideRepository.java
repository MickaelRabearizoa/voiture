package voiture.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import voiture.model.AnnonceValide;


public interface AnnonceValideRepository extends JpaRepository<AnnonceValide, Integer> {


}
