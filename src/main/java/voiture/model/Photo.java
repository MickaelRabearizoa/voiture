package voiture.model;


import jakarta.persistence.*;

@Entity
@Table(name= "Photo")
public class Photo {

    @Id
    @Column(name = "Id_Photo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Photo;

    @Column(name = "nomphoto")
    public String nomphoto;

    public int getId_Photo() {
        return Id_Photo;
    }

    public void setId_Photo(int id_Photo) {
        Id_Photo = id_Photo;
    }

    public String getNomphoto() {
        return nomphoto;
    }

    public void setNomphoto(String nomphoto) {
        this.nomphoto = nomphoto;
    }
}
