package voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import voiture.model.Carburant;

public interface CarburantRepository extends JpaRepository<Carburant, Long>  {
}
