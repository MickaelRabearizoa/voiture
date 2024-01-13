package voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import voiture.model.Annonceutilisateur;


public interface AnnonceutilisateurRepository extends JpaRepository<Annonceutilisateur, Integer> {

    @Query(value = "update Annonceutilisateur set status=1  where Id_Annonceutilisateur=?1", nativeQuery = true)
    void updateStatusAnnonce(Integer Id_Annonceutilisateur);

}
