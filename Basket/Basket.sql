create database basket;
create table equipe(
    id serial primary key,
    nom VARCHAR(50)
);
create table joueur (
    id serial primary key,
    poste varchar(50),
    nom varchar(50),
    idequipe int,
    FOREIGN KEY (idequipe) REFERENCES equipe(id)
    
);
create table match (
    id serial primary key,
    idequipe1 int,
    idequipe2 int,
    score1 int,
    score2 int,
    Date DATE,
    FOREIGN KEY (idequipe1) REFERENCES equipe(id),
     FOREIGN KEY (idequipe2) REFERENCES equipe(id)
);
create table liste_action(
    id serial primary key,
    nom VARCHAR(50)
);
insert into liste_action values(DEFAULT,'match joue');
insert into liste_action values(DEFAULT,'panier');
insert into liste_action values(DEFAULT,'3points');
insert into liste_action values(DEFAULT,'passe decisif');
insert into liste_action values(DEFAULT,'rebond');
insert into liste_action values(DEFAULT,'interception');
insert into liste_action values(DEFAULT,'contre');
insert into liste_action values(DEFAULT,'minute');
create table action(
    id serial primary key,
    idmatch int,
    idjoueur int,
    idaction int,
    FOREIGN KEY (idmatch) REFERENCES match(id),
    FOREIGN KEY (idjoueur) REFERENCES joueur(id),
    FOREIGN KEY (idaction) REFERENCES liste_action(id)
);
insert into equipe VALUES(DEFAULT,'Rockets');
insert into equipe VALUES(DEFAULT,'Nets');
insert into MATCH VALUES(DEFAULT,55,56,135,126,'2023-11-21');
insert into action VALUES(DEFAULT,1,2,3);
insert into Joueur VALUES(DEFAULT,'meneur','Trae Young',55);
insert into Joueur VALUES(DEFAULT,'Aillier Fort','John Collins',55);
