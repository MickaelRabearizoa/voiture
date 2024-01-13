package voiture.model;

import jakarta.persistence.*;

@Entity
@Table(name= "Region")
public class Region {

    @Id
    @Column(name = "Id_Region")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Region;

    @Column(name = "region")
    public String region;

    public int getId_Region() {
        return Id_Region;
    }

    public void setId_Region(int id_Region) {
        Id_Region = id_Region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
