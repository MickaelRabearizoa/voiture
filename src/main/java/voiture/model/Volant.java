package voiture.model;


import jakarta.persistence.*;

@Entity
@Table(name= "Volant")
public class Volant {

    @Id
    @Column(name = "Id_Volant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Volant;

    @Column(name = "volant")
    public String volant;

    public int getId_Volant() {
        return Id_Volant;
    }

    public void setId_Volant(int id_Volant) {
        Id_Volant = id_Volant;
    }

    public String getVolant() {
        return volant;
    }

    public void setVolant(String volant) {
        this.volant = volant;
    }
}
