package voiture.model;

import jakarta.persistence.*;

@Entity
@Table(name= "Typevoiture")
public class Typevoiture {

    @Id
    @Column(name = "Id_Typevoiture")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Typevoiture;

    @Column(name = "typevoiture")
    public String typevoiture;

    public int getId_Typevoiture() {
        return Id_Typevoiture;
    }

    public void setId_Typevoiture(int id_Typevoiture) {
        Id_Typevoiture = id_Typevoiture;
    }

    public String getTypevoiture() {
        return typevoiture;
    }

    public void setTypevoiture(String typevoiture) {
        this.typevoiture = typevoiture;
    }
}
