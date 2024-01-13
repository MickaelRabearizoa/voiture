package voiture.model;


import jakarta.persistence.*;

@Entity
@Table(name= "Couleur")
public class Couleur {

    @Id
    @Column(name = "Id_Couleur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Couleur;

    @Column(name = "nom")
    public String nom;

    public int getId_Couleur() {
        return Id_Couleur;
    }

    public void setId_Couleur(int id_Couleur) {
        Id_Couleur = id_Couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
