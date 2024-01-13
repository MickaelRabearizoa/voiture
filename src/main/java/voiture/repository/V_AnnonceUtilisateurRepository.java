package voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import voiture.model.V_AnnonceUtilisateur;

import java.util.List;

@Repository
public interface V_AnnonceUtilisateurRepository extends JpaRepository<V_AnnonceUtilisateur,Integer> {
    @Query(value = "select * from V_AnnonceUtilisateur where idutilisateur=?1 and status=0", nativeQuery = true)
    List<voiture.model.V_AnnonceUtilisateur> getAnnonceNonValide(Integer idutilisateur);
    @Query(value = "select * from V_AnnonceUtilisateur where idutilisateur=?1 and status=1", nativeQuery = true)
    List<voiture.model.V_AnnonceUtilisateur> getAnnonceValide(Integer idutilisateur);
    @Query(value = "select * from V_AnnonceUtilisateur where idutilisateur=?1 and status=2", nativeQuery = true)
    List<voiture.model.V_AnnonceUtilisateur> getAnnonceValideVendu(Integer idutilisateur);

    @Query(value = "select * from V_AnnonceUtilisateur where status=0", nativeQuery = true)
    List<V_AnnonceUtilisateur> getAnnonceAValide();

    @Query(value = "select * from V_AnnonceUtilisateur where Id_Annonceutilisateur=?1", nativeQuery = true)
    List<V_AnnonceUtilisateur> getAnnonceDetail(Integer Id_Annonceutilisateur);


}
