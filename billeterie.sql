
    DROP TABLE IF EXISTS Paiement;
    DROP TABLE IF EXISTS Billet;
    DROP TABLE IF EXISTS Client;
    DROP TABLE IF EXISTS Evenement;

    CREATE TABLE Evenement (
    id_evenement INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(200) NOT NULL,
    date_event DATE NOT NULL,
    heure TIME,
    lieu VARCHAR(200),
    capacite INT DEFAULT 0,
    prix_base DECIMAL(8,2) DEFAULT 0.00,
    description TEXT,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
    ) ENGINE=InnoDB;

    CREATE TABLE Client (
    id_client INT AUTO_INCREMENT PRIMARY KEY,
    prenom VARCHAR(100) NOT NULL,
    nom VARCHAR(100) NOT NULL,
    email VARCHAR(150),
    telephone VARCHAR(30),
    ville VARCHAR(100),
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    UNIQUE KEY uk_client_email (email)
    ) ENGINE=InnoDB;

    CREATE TABLE Billet (
    id_billet INT AUTO_INCREMENT PRIMARY KEY,
    code_unique VARCHAR(100) NOT NULL,
    fk_client INT,
    fk_evenement INT,
    date_achat DATETIME DEFAULT CURRENT_TIMESTAMP,
    prix_paye DECIMAL(8,2) DEFAULT 0.00,
    statut VARCHAR(50) DEFAULT 'vendu',
    CONSTRAINT fk_billet_client FOREIGN KEY (fk_client) REFERENCES Client(id_client) ON DELETE SET NULL ON UPDATE CASCADE,
    CONSTRAINT fk_billet_evenement FOREIGN KEY (fk_evenement) REFERENCES Evenement(id_evenement) ON DELETE CASCADE ON UPDATE CASCADE,
    UNIQUE KEY uk_billet_code (code_unique),
    INDEX idx_billet_evenement (fk_evenement),
    INDEX idx_billet_client (fk_client)
    ) ENGINE=InnoDB;

    CREATE TABLE Paiement (
    id_paiement INT AUTO_INCREMENT PRIMARY KEY,
    fk_billet INT,
    montant DECIMAL(8,2) NOT NULL,
    mode_paiement VARCHAR(50),
    date_paiement DATETIME DEFAULT CURRENT_TIMESTAMP,
    reference VARCHAR(200),
    CONSTRAINT fk_paiement_billet FOREIGN KEY (fk_billet) REFERENCES Billet(id_billet) ON DELETE CASCADE ON UPDATE CASCADE
    ) ENGINE=InnoDB;

    
