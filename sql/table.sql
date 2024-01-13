CREATE DATABASE ventevoiture;

\c ventevoiture;

CREATE TABLE Marque(
                       Id_Marque SERIAL,
                       nom VARCHAR(50) ,
                       PRIMARY KEY(Id_Marque)
);


insert into Marque(nom) values('Marque');
CREATE TABLE Typevoiture(
                            Id_Typevoiture SERIAL,
                            typevoiture VARCHAR(50) ,
                            PRIMARY KEY(Id_Typevoiture),
                            UNIQUE(typevoiture)
);

insert into Typevoiture(typevoiture) values('typevoiture');
CREATE TABLE Modele(
                       Id_Modele SERIAL,
                       modele VARCHAR(50) ,
                       Id_Typevoiture INTEGER NOT NULL,
                       Id_Marque INTEGER NOT NULL,
                       PRIMARY KEY(Id_Modele),
                       UNIQUE(modele),
                       FOREIGN KEY(Id_Typevoiture) REFERENCES Typevoiture(Id_Typevoiture),
                       FOREIGN KEY(Id_Marque) REFERENCES Marque(Id_Marque)
);

insert into Modele(modele,Id_Typevoiture,Id_Marque) values('modele',1,1);
CREATE TABLE Couleur(
                        Id_Couleur SERIAL,
                        nom VARCHAR(50) ,
                        PRIMARY KEY(Id_Couleur),
                        UNIQUE(nom)
);

insert into Couleur(nom) values('rouge');
CREATE TABLE Transmission(
                             Id_Transmission SERIAL,
                             transmission_ VARCHAR(50) ,
                             PRIMARY KEY(Id_Transmission),
                             UNIQUE(transmission_)
);

insert into Transmission(transmission_) values('transmission');
CREATE TABLE Carburant(
                          Id_Carburant SERIAL,
                          carburant VARCHAR(50) ,
                          PRIMARY KEY(Id_Carburant),
                          UNIQUE(carburant)
);

insert into Carburant(carburant) values('carburant');
CREATE TABLE Utilisateur(
                            Idutilisateur SERIAL,
                            prenom VARCHAR(50)  NOT NULL,
                            nom VARCHAR(50)  NOT NULL,
                            datenaissance DATE NOT NULL,
                            login VARCHAR(29) Not NULL ,
                            motdepasse VARCHAR  NOT NULL,
                            role VARCHAR(20) NOT NULL,
                            telephone VARCHAR(50) ,
                            PRIMARY KEY(Idutilisateur)
);


CREATE TABLE Volant(
                       Id_Volant SERIAL,
                       volant VARCHAR(50)  NOT NULL,
                       PRIMARY KEY(Id_Volant),
                       UNIQUE(volant)
);
insert into volant(volant) values('volant');

CREATE TABLE Photo(
                      Id_Photo SERIAL,
                      nomphoto VARCHAR(50)  NOT NULL,
                      PRIMARY KEY(Id_Photo)
);
insert into photo(nomphoto) values('photo');

CREATE TABLE Region(
                       Id_Region SERIAL,
                       region VARCHAR(50) ,
                       PRIMARY KEY(Id_Region)
);
insert into region(region) values ('region') ;

CREATE TABLE Commission(
                           Id_Commission SERIAL,
                           datecommission DATE,
                           pourcentage_ DOUBLE PRECISION,
                           PRIMARY KEY(Id_Commission)
);
insert into Commission(datecommission,pourcentage_) values ('2024-02-12',20.0) ;

CREATE TABLE Annonceutilisateur(
                                   Id_Annonceutilisateur SERIAL,
                                   matricule VARCHAR(50)  NOT NULL,
                                   dateannonce DATE,
                                   kilometrage DOUBLE PRECISION,
                                   annee INTEGER NOT NULL,
                                   moteur VARCHAR(50) NOT NULL,
                                   description TEXT,
                                   climatisation INTEGER,
                                   prix NUMERIC(15,2),
                                   Id_Region INTEGER NOT NULL,
                                   Id_Photo INTEGER NOT NULL,
                                   Id_Volant INTEGER NOT NULL,
                                   Id_Couleur INTEGER NOT NULL,
                                   Id_Carburant INTEGER NOT NULL,
                                   Id_Transmission INTEGER NOT NULL,
                                   Id_Modele INTEGER NOT NULL,
                                   Idutilisateur INTEGER NOT NULL,
                                   status INTEGER NOT NULL,
                                   PRIMARY KEY(Id_Annonceutilisateur),
                                   FOREIGN KEY(Id_Region) REFERENCES Region(Id_Region),
                                   FOREIGN KEY(Id_Photo) REFERENCES Photo(Id_Photo),
                                   FOREIGN KEY(Id_Volant) REFERENCES Volant(Id_Volant),
                                   FOREIGN KEY(Id_Couleur) REFERENCES Couleur(Id_Couleur),
                                   FOREIGN KEY(Id_Carburant) REFERENCES Carburant(Id_Carburant),
                                   FOREIGN KEY(Id_Transmission) REFERENCES Transmission(Id_Transmission),
                                   FOREIGN KEY(Id_Modele) REFERENCES Modele(Id_Modele),
                                   FOREIGN KEY(Idutilisateur) REFERENCES Utilisateur(Idutilisateur)
);

CREATE TABLE Annoncefavoris(
                               Id_Annoncefavoris SERIAL,
                               Id_Annonceutilisateur INTEGER NOT NULL,
                               Idutilisateur INTEGER NOT NULL,
                               PRIMARY KEY(Id_Annoncefavoris),
                               FOREIGN KEY(Id_Annonceutilisateur) REFERENCES Annonceutilisateur(Id_Annonceutilisateur),
                               FOREIGN KEY(Idutilisateur) REFERENCES Utilisateur(Idutilisateur)
);

/* Tokony tsy misy Id_Utilisateur ato */
CREATE TABLE annoncevalide(
                              Id_annoncevalide SERIAL,
                              datevalidation DATE NOT NULL,
                              Idutilisateur INTEGER NOT NULL,
                              Id_Annonceutilisateur INTEGER NOT NULL,
                              PRIMARY KEY(Id_annoncevalide),
                              FOREIGN KEY(Idutilisateur) REFERENCES Utilisateur(Idutilisateur),
                              FOREIGN KEY(Id_Annonceutilisateur) REFERENCES Annonceutilisateur(Id_Annonceutilisateur)
);

CREATE TABLE Historiqueachat(
                                Id_Historiqueachat SERIAL,
                                dateachat DATE,
                                prixachat DOUBLE PRECISION,
                                Id_Utilisateur INTEGER NOT NULL,
                                Id_Annonceutilisateur INTEGER NOT NULL,
                                PRIMARY KEY(Id_Historiqueachat),
                                FOREIGN KEY(Id_Utilisateur) REFERENCES Utilisateur(Idutilisateur),
                                FOREIGN KEY(Id_Annonceutilisateur) REFERENCES Annonceutilisateur(Id_Annonceutilisateur)
);



CREATE VIEW V_AnnonceUtilisateur AS
SELECT
    au.Id_Annonceutilisateur,
    au.matricule,
    au.dateannonce,
    au.kilometrage,
    au.annee,
    au.moteur,
    au.description,
    au.climatisation,
    au.prix,
    au.status,
    r.Id_Region as id_region,
    r.region AS nom_region,
    p.Id_Photo as id_photo,
    p.nomphoto AS nom_photo,
    v.Id_Volant as id_volant,
    v.volant AS nom_volant,
    c.Id_Couleur as id_couleur,
    c.nom AS nom_couleur,
    carb.Id_Carburant as id_carburant,
    carb.carburant AS nom_carburant,
    t.Id_Transmission as id_transmission,
    t.transmission_ AS nom_transmission,
    m.Id_Modele as id_modele,
    m.modele AS nom_modele,
    u.Idutilisateur AS Idutilisateur,
    u.prenom AS prenom_utilisateur,
    u.nom AS nom_utilisateur
FROM
    Annonceutilisateur au
        JOIN Region r ON au.Id_Region = r.Id_Region
        JOIN Photo p ON au.Id_Photo = p.Id_Photo
        JOIN Volant v ON au.Id_Volant = v.Id_Volant
        JOIN Couleur c ON au.Id_Couleur = c.Id_Couleur
        JOIN Carburant carb ON au.Id_Carburant = carb.Id_Carburant
        JOIN Transmission t ON au.Id_Transmission = t.Id_Transmission
        JOIN Modele m ON au.Id_Modele = m.Id_Modele
        JOIN Utilisateur u ON au.Idutilisateur = u.Idutilisateur;


CREATE VIEW V_AnnonceNonValide AS
SELECT
    au.Id_Annonceutilisateur,
    au.matricule,
    au.dateannonce,
    au.kilometrage,
    au.annee,
    au.moteur,
    au.description,
    au.climatisation,
    au.prix,
    r.region AS nom_region,
    p.nomphoto AS nom_photo,
    v.volant AS nom_volant,
    c.nom AS nom_couleur,
    carb.carburant AS nom_carburant,
    t.transmission_ AS nom_transmission,
    m.modele AS nom_modele,
    u.Idutilisateur AS Idutilisateur,
    u.prenom AS prenom_utilisateur,
    u.nom AS nom_utilisateur
FROM
    Annonceutilisateur au
        JOIN Region r ON au.Id_Region = r.Id_Region
        JOIN Photo p ON au.Id_Photo = p.Id_Photo
        JOIN Volant v ON au.Id_Volant = v.Id_Volant
        JOIN Couleur c ON au.Id_Couleur = c.Id_Couleur
        JOIN Carburant carb ON au.Id_Carburant = carb.Id_Carburant
        JOIN Transmission t ON au.Id_Transmission = t.Id_Transmission
        JOIN Modele m ON au.Id_Modele = m.Id_Modele
        JOIN Utilisateur u ON au.Idutilisateur = u.Idutilisateur;



create view v_annonce_valide as
    select
        au.Id_Annonceutilisateur,
        au.matricule,
        au.dateannonce,
        au.kilometrage,
        au.annee,
        au.moteur,
        au.description,
        au.climatisation,
        au.prix,
        av.Id_annoncevalide,
        av.datevalidation ,
        r.region AS nom_region,
        p.nomphoto AS nom_photo,
        v.volant AS nom_volant,
        c.nom AS nom_couleur,
        carb.carburant AS nom_carburant,
        t.transmission_ AS nom_transmission,
        m.modele AS nom_modele,
        u.Idutilisateur AS Idutilisateur,
        u.prenom AS prenom_utilisateur,
        u.nom AS nom_utilisateur
 from annoncevalide av
    join Annonceutilisateur au on au.Id_Annonceutilisateur = av.Id_Annonceutilisateur
    JOIN Region r ON au.Id_Region = r.Id_Region
    JOIN Photo p ON au.Id_Photo = p.Id_Photo
    JOIN Volant v ON au.Id_Volant = v.Id_Volant
    JOIN Couleur c ON au.Id_Couleur = c.Id_Couleur
    JOIN Carburant carb ON au.Id_Carburant = carb.Id_Carburant
    JOIN Transmission t ON au.Id_Transmission = t.Id_Transmission
    JOIN Modele m ON au.Id_Modele = m.Id_Modele
    JOIN Utilisateur u ON au.Idutilisateur = u.Idutilisateur;


