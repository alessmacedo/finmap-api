CREATE TABLE IF NOT EXISTS parcelas(
    id INT(6) AUTO_INCREMENT,
    vencimento DATE NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    status VARCHAR(20) NOT NULL,
    conta_id INT(6) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (conta_id) REFERENCES conta(id)
); ENGINE=InnoDB DEFAULT CHARSET=utf8;