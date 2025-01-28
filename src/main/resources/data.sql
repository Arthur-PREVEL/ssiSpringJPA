-- Initialisation des tables
INSERT INTO Personne(matricule, nom, prenom, poste) VALUES
    (1, 'Arthur', 'ELKA', 'Programmeur JAVA'),
    (2 , 'Inès', 'PREVE', 'Chef de projet'),
    (3, 'Capucine', 'SEDDA', 'Responsable logistique'),
    (4, 'Walid', 'GONDOU', 'Developpeur Backend');
ALTER TABLE Personne ALTER COLUMN matricule RESTART WITH 5;

INSERT INTO Projet(code, nom, debut, fin) VALUES
  (1, 'Refonte Design', '2025-01-03', null),
  (2,'Deplacement du bureau n°5', '2024-09-26', '2024-09-29'),
  (3, 'Amenagements Handicap salle n°13', '2024-04-13', '2024-05-05'),
  (4,'Developpement fonctionnalité barre de recherche', '2023-04-06', '2023-06-05');
ALTER TABLE Projet ALTER COLUMN code RESTART WITH 5;


INSERT INTO Participation(id, role, pourcentage, personne_matricule,projet_code) VALUES
    (1, 'Programmeur JAVA', 40,1,1),
    (2, 'Chef de projet', 40,2,1),
    (3,'Developpeur Backend', 20, 4,1),
    (4,'Responsable logistique', 100, 3, 2 );


ALTER TABLE Participation ALTER COLUMN id RESTART WITH 5;

