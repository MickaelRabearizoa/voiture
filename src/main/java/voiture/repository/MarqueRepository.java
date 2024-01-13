package voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import voiture.model.Marque;

public interface MarqueRepository extends JpaRepository<Marque, Long> {
}
