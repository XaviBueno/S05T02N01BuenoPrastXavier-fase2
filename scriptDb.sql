CREATE DATABASE IF NOT EXISTS daus;
USE daus;
CREATE TABLE IF NOT EXISTS jugadors(
	jugador_id INT NOT NULL AUTO_INCREMENT,
    nom VARCHAR(24),
    PRIMARY KEY (jugador_id)
);

CREATE TABLE IF NOT EXISTS jugades (
	jugada_id INT NOT NULL AUTO_INCREMENT,
    jugador_id INT NOT NULL,
    resultat_dau1 INT NOT NULL,
    resultat_dau2 INT NOT NULL,
    PRIMARY KEY (jugada_id),
    FOREIGN KEY (jugador_id) REFERENCES jugadors(jugador_id)
    );

