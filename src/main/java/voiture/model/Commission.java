package voiture.model;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name= "Commission")
public class Commission {

    @Id
    @Column(name = "Id_Commission")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Commission;

    @Column(name = "datecommission")
    public Date datecommision;

    @Column(name = "pourcentage_")
    public double pourcentage_;

    public int getId_Commission() {
        return Id_Commission;
    }

    public void setId_Commission(int id_Commission) {
        Id_Commission = id_Commission;
    }

    public Date getDatecommision() {
        return datecommision;
    }

    public void setDatecommision(Date datecommision) {
        this.datecommision = datecommision;
    }

    public double getPourcentage_() {
        return pourcentage_;
    }

    public void setPourcentage_(double pourcentage_) {
        this.pourcentage_ = pourcentage_;
    }
}
