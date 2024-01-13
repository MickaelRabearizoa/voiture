package voiture.model;

import jakarta.persistence.*;

@Entity
@Table(name= "Modele")
public class Modele {

    @Id
    @Column(name = "Id_Modele")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Modele;

    @Column(name = "modele")
    public String modele;

    @Column(name = "Id_Typevoiture")

    public int Id_Typevoiture;

    @Column(name = "Id_Marque")

    public int Id_marque;

    public int getId_Modele() {
        return Id_Modele;
    }

    public void setId_Modele(int id_Modele) {
        Id_Modele = id_Modele;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getId_Typevoiture() {
        return Id_Typevoiture;
    }

    public void setId_Typevoiture(int id_Typevoiture) {
        Id_Typevoiture = id_Typevoiture;
    }

    public int getId_marque() {
        return Id_marque;
    }

    public void setId_marque(int id_marque) {
        Id_marque = id_marque;
    }
}
