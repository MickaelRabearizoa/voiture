package voiture.model;

import jakarta.persistence.*;

@Entity
@Table(name= "Marque")
public class Marque {

    @Id
    @Column(name = "Id_Marque")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Marque;

    @Column(name = "nom")
    public String nom;

    public int getId_Marque() {
        return Id_Marque;
    }

    public void setId_Marque(int id_Marque) {
        Id_Marque = id_Marque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
