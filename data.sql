-- Données générées automatiquement avec Faker
USE billeterie;


DELETE FROM billet;
DELETE FROM evenement;
DELETE FROM client;

-- Clients 
INSERT INTO client (nom, prenom, email) VALUES 
('Moulin', 'Isabelle', 'isabelle.moulin1@example.org'),
('Ruiz', 'Auguste', 'auguste.ruiz2@example.com'),
('Masse', 'Célina', 'celina.masse3@example.net'),
('Perez', 'Juliette', 'juliette.perez4@example.com'),
('Guyot', 'Auguste', 'auguste.guyot5@example.net'),
('Ruiz', 'Honoré', 'honore.ruiz6@example.com'),
('Garnier', 'Zacharie', 'zacharie.garnier7@example.org'),
('Leconte', 'Jeanne', 'jeanne.leconte8@example.com'),
('Duhamel', 'Hugues', 'hugues.duhamel9@example.org'),
('Samson', 'Michelle', 'michelle.samson10@example.com'),
('Lefebvre', 'Alex', 'alex.lefebvre11@example.org'),
('Carpentier', 'Sophie', 'sophie.carpentier12@example.com'),
('Perrier', 'Pierre', 'pierre.perrier13@example.net'),
('Lévêque', 'Maurice', 'maurice.leveque14@example.com'),
('Jacquot', 'Augustin', 'augustin.jacquot15@example.com'),
('Boucher', 'Marthe', 'marthe.boucher16@example.com'),
('Blanc', 'Anne', 'anne.blanc17@example.net'),
('Hardy', 'Philippe', 'philippe.hardy18@example.org'),
('Courtois', 'Marguerite', 'marguerite.courtois19@example.org'),
('Guichard', 'Robert', 'robert.guichard20@example.com'),
('Leconte', 'Paul', 'paul.leconte21@example.net'),
('Da Costa', 'Maggie', 'maggie.dacosta22@example.com'),
('Durand', 'Corinne', 'corinne.durand23@example.com'),
('Tessier', 'Gilles', 'gilles.tessier24@example.org'),
('Normand', 'René', 'rene.normand25@example.net'),
('Legrand', 'Alfred', 'alfred.legrand26@example.net'),
('Étienne', 'Jeanne', 'jeanne.etienne27@example.com'),
('Prévost', 'Chantal', 'chantal.prevost28@example.net'),
('Vaillant', 'Zacharie', 'zacharie.vaillant29@example.com'),
('Millet', 'Célina', 'celina.millet30@example.org'),
('Lesage', 'Claudine', 'claudine.lesage31@example.net'),
('Rémy', 'Adélaïde', 'adelaide.remy32@example.net'),
('Andre', 'Corinne', 'corinne.andre33@example.org'),
('Giraud', 'Daniel', 'daniel.giraud34@example.net'),
('Martel', 'Bernard', 'bernard.martel35@example.com'),
('Blanc', 'Anne', 'anne.blanc36@example.com'),
('Berger', 'Stéphane', 'stephane.berger37@example.org'),
('Langlois', 'Danielle', 'danielle.langlois38@example.com'),
('Thierry', 'Guy', 'guy.thierry39@example.net'),
('Goncalves', 'Denis', 'denis.goncalves40@example.com'),
('Maillet', 'Arnaude', 'arnaude.maillet41@example.org'),
('Lopez', 'Noémi', 'noemi.lopez42@example.org'),
('Diaz', 'Jean', 'jean.diaz43@example.org'),
('Merle', 'Françoise', 'francoise.merle44@example.net'),
('Lévy', 'Michelle', 'michelle.levy45@example.com'),
('Laporte', 'Étienne', 'etienne.laporte46@example.net'),
('Gimenez', 'Adèle', 'adele.gimenez47@example.com'),
('Hamel', 'Théophile', 'theophile.hamel48@example.com'),
('Rey', 'Brigitte', 'brigitte.rey49@example.net'),
('Pelletier', 'Laetitia', 'laetitia.pelletier50@example.org');

-- Événements
INSERT INTO evenement (nom, date_evenement, lieu, prix) VALUES 
('L assurance d avancer à la pointe', '2026-01-02', 'Lesage-sur-Marchand', 35.88),
('La possibilité d atteindre vos buts à l état pur', '2025-11-12', 'Sainte Alexandre', 65.60),
('Le confort de rouler à la pointe', '2025-12-12', 'De Sousa-sur-Verdier', 65.31),
('Le pouvoir de louer plus rapidement', '2025-12-16', 'Weiss-sur-Fouquet', 23.77),
('L assurance de rouler autrement', '2026-01-09', 'LesageVille', 111.32),
('La liberté d innover naturellement', '2025-12-04', 'Lemoineboeuf', 116.31),
('Le plaisir de rouler naturellement', '2025-11-06', 'Sainte Martin', 30.40),
('L assurance d innover en toute tranquilité', '2026-01-18', 'Saint Alfred', 112.62),
('La possibilité d évoluer de manière sûre', '2025-11-06', 'Henry', 27.27),
('La possibilité d évoluer autrement', '2025-12-05', 'Royer-sur-Pinto', 55.81);

-- Billets 
INSERT INTO billet (id_client, id_evenement, date_achat) VALUES 
(44, 4, '2025-09-13'),
(42, 9, '2025-08-20'),
(18, 9, '2025-10-01'),
(38, 1, '2025-10-04'),
(42, 8, '2025-08-25'),
(30, 1, '2025-09-19'),
(11, 1, '2025-08-15'),
(2, 5, '2025-10-05'),
(39, 3, '2025-08-20'),
(40, 10, '2025-09-11');

