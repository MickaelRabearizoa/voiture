package voiture.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "V_AnnonceUtilisateur")
public class V_AnnonceUtilisateur {

    @Id
    @Column(name="Id_Annonceutilisateur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id_Annonceutilisateur;

    @Column(name="Idutilisateur")
    public  Integer Id_Utilisateur;

    @Column(name="matricule")
    public String matricule;
    @Column(name="dateannonce")

    public Date dateannonce;
    @Column(name="kilometrage")

    public Double kilometrage;
    @Column(name="annee")
    public Integer annee;
    @Column(name="moteur")
    public String moteur;
    @Column(name="description")
    public String description;
    @Column(name="climatisation")
    public Integer climatisation;
    @Column(name="prix")
    public Double prix ;

    @Column(name="status")
    public Integer status;
    @Column(name="nom_region")
    public String nom_region ;
    @Column(name="nom_photo")
    public String nom_photo;
    @Column(name="nom_volant")
    public String nom_volant ;
    @Column(name="nom_couleur")
    public String nom_couleur;
    @Column(name="nom_carburant")
    public String nom_carburant;
    @Column(name="nom_transmission")
    public String nom_transmission;
    @Column(name="nom_modele")
    public String nom_modele;
    @Column(name="nom_utilisateur")
    public String nom_utilisateur;
    @Column(name="prenom_utilisateur")
    public String prenom_utilisateur;


    public Integer getId_Annonceutilisateur() {
        return Id_Annonceutilisateur;
    }

    public void setId_Annonceutilisateur(Integer id_Annonceutilisateur) {
        Id_Annonceutilisateur = id_Annonceutilisateur;
    }

    public Integer getId_Utilisateur() {
        return Id_Utilisateur;
    }

    public void setId_Utilisateur(Integer id_Utilisateur) {
        Id_Utilisateur = id_Utilisateur;
    }
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getDateannonce() {
        return dateannonce;
    }

    public void setDateannonce(Date dateannonce) {
        this.dateannonce = dateannonce;
    }

    public Double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
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

    public Integer getClimatisation() {
        return climatisation;
    }

    public void setClimatisation(Integer climatisation) {
        this.climatisation = climatisation;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getStatus() { return status; }

    public void setStatus(Integer status) { this.status = status; }

    public String getNom_region() {
        return nom_region;
    }

    public void setNom_region(String nom_region) {
        this.nom_region = nom_region;
    }

    public String getNom_photo() {
        return nom_photo;
    }

    public void setNom_photo(String nom_photo) {
        this.nom_photo = nom_photo;
    }

    public String getNom_volant() {
        return nom_volant;
    }

    public void setNom_volant(String nom_volant) {
        this.nom_volant = nom_volant;
    }

    public String getNom_couleur() {
        return nom_couleur;
    }

    public void setNom_couleur(String nom_couleur) {
        this.nom_couleur = nom_couleur;
    }

    public String getNom_carburant() {
        return nom_carburant;
    }

    public void setNom_carburant(String nom_carburant) {
        this.nom_carburant = nom_carburant;
    }

    public String getNom_transmission() {
        return nom_transmission;
    }

    public void setNom_transmission(String nom_transmission) {
        this.nom_transmission = nom_transmission;
    }

    public String getNom_modele() {
        return nom_modele;
    }

    public void setNom_modele(String nom_modele) {
        this.nom_modele = nom_modele;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getPrenom_utilisateur() {
        return prenom_utilisateur;
    }

    public void setPrenom_utilisateur(String prenom_utilisateur) {
        this.prenom_utilisateur = prenom_utilisateur;
    }

}
