package voiture.auth;


import java.sql.Date;

public class RegisterRequest {

  private String prenom;
  private String nom;
  private Date datenaissance;

  private String telephone;

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Date getDatenaissance() {
    return datenaissance;
  }

  public void setDatenaissance(Date datenaissance) {
    this.datenaissance = datenaissance;
  }



  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  private String login;
  private String motDePasse;

  private String role;

  public String getRole(){return  role;}

  public void setRole(String role){this.role = role;}

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getMotDePasse() {
    return motDePasse;
  }

  public void setMotDePasse(String motDePasse) {
    this.motDePasse = motDePasse;
  }
}
