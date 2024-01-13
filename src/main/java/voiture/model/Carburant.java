package voiture.model;


import jakarta.persistence.*;

@Entity
@Table(name= "Carburant")
public class Carburant {

    @Id
    @Column(name = "Id_Carburant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Carburant;

    @Column(name = "carburant")
    public String carburant;

    public int getId_Carburant() {
        return Id_Carburant;
    }

    public void setId_Carburant(int id_Carburant) {
        Id_Carburant = id_Carburant;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }
}
