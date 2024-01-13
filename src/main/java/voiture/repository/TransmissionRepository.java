package voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import voiture.model.Marque;
import voiture.model.Transmission;

public interface TransmissionRepository extends JpaRepository<Transmission, Long> {
}
