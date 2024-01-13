package voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import voiture.model.Commission;

public interface CommissionRepository extends JpaRepository<Commission, Long>  {
}
