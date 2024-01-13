package voiture.model;


import jakarta.persistence.*;

@Entity
@Table(name= "Transmission")
public class Transmission {

    @Id
    @Column(name = "Id_Transmission")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Transmission;

    @Column(name = "transmission_")
    public String transmission_;

    public int getId_Transmission() {
        return Id_Transmission;
    }

    public void setId_Transmission(int id_Transmission) {
        Id_Transmission = id_Transmission;
    }

    public String getTransmission_() {
        return transmission_;
    }

    public void setTransmission_(String transmission_) {
        this.transmission_ = transmission_;
    }
}
