package voiture.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "annoncevalide")
public class AnnonceValide {

    @Id
    @Column(name="Id_annoncevalide")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id_annoncevalide;
    @Column(name="datevalidation")
    public Date datevalidation;

    @Column(name="Idutilisateur")
    public  Integer Id_Utilisateur;

    @Column(name="Id_Annonceutilisateur")
    public Integer Id_Annonceutilisateur;



    public Integer getId_annoncevalide() {
        return Id_annoncevalide;
    }

    public void setId_annoncevalide(Integer id_annoncevalide) {
        Id_annoncevalide = id_annoncevalide;
    }

    public Date getDatevalidation() {
        return datevalidation;
    }

    public void setDatevalidation(Date datevalidation) {
        this.datevalidation = datevalidation;
    }

    public Integer getId_Utilisateur() {
        return Id_Utilisateur;
    }

    public void setId_Utilisateur(Integer id_Utilisateur) {
        Id_Utilisateur = id_Utilisateur;
    }

    public Integer getId_Annonceutilisateur() {
        return Id_Annonceutilisateur;
    }

    public void setId_Annonceutilisateur(Integer id_Annonceutilisateur) {
        Id_Annonceutilisateur = id_Annonceutilisateur;
    }
}
