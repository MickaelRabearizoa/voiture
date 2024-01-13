package voiture.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name= "Annonceutilisateur")
public class Annonceutilisateur {

    @Id
    @Column(name = "Id_Annonceutilisateur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id_Annonceutilisateur;
    @Column(name = "matricule")
    public  String matricule;
    @Column(name = "dateannonce")
    public Date dateannonce;
    @Column(name = "kilometrage")
    public Double kilometrage;
    @Column(name = "annee")
    public int annee;
    @Column(name = "moteur")
    public String moteur ;
    @Column(name = "description")
    public String description;
    @Column(name = "climatisation")
    public int climatisation;
    @Column(name = "prix")
    public double prix ;
    @Column(name = "Id_Region")
    public int Id_Region;
    @Column(name = "Id_Photo")
    public int Id_Photo;
    @Column(name = "Id_Volant")
    public int Id_Volant;
    @Column(name = "Id_Couleur")
    public int Id_Couleur;
    @Column(name = "Id_Carburant")
    public int Id_Carburant;
    @Column(name = "Id_Transmission")
    public int Id_Transmission;
    @Column(name = "Id_Modele")
    public int Id_Modele;
    @Column(name = "Idutilisateur")
    public int Idutilisateur;
    @Column(name = "status")
    public int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId_Annonceutilisateur() {
        return Id_Annonceutilisateur;
    }

    public void setId_Annonceutilisateur(int id_Annonceutilisateur) {
        Id_Annonceutilisateur = id_Annonceutilisateur;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Double getKilometrage() {
        return kilometrage;
    }

    public Date getDateannonce() {
        return dateannonce;
    }

    public void setDateannonce(Date dateannonce) {
        this.dateannonce = dateannonce;
    }

    public void setKilometrage(Double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getMoteur() {
        return moteur;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getClimatisation() {
        return climatisation;
    }

    public void setClimatisation(int climatisation) {
        this.climatisation = climatisation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getId_Region() {
        return Id_Region;
    }

    public void setId_Region(int id_Region) {
        Id_Region = id_Region;
    }

    public int getId_Photo() {
        return Id_Photo;
    }

    public void setId_Photo(int id_Photo) {
        Id_Photo = id_Photo;
    }

    public int getId_Volant() {
        return Id_Volant;
    }

    public void setId_Volant(int id_Volant) {
        Id_Volant = id_Volant;
    }

    public int getId_Couleur() {
        return Id_Couleur;
    }

    public void setId_Couleur(int id_Couleur) {
        Id_Couleur = id_Couleur;
    }

    public int getId_Carburant() {
        return Id_Carburant;
    }

    public void setId_Carburant(int id_Carburant) {
        Id_Carburant = id_Carburant;
    }

    public int getId_Transmission() {
        return Id_Transmission;
    }

    public void setId_Transmission(int id_Transmission) {
        Id_Transmission = id_Transmission;
    }

    public int getId_Modele() {
        return Id_Modele;
    }

    public void setId_Modele(int id_Modele) {
        Id_Modele = id_Modele;
    }

    public int getIdutilisateur() {
        return Idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        Idutilisateur = idutilisateur;
    }
}
