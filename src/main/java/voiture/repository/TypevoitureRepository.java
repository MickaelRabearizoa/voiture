package voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import voiture.model.Typevoiture;

public interface TypevoitureRepository extends JpaRepository<Typevoiture, Long> {
}
