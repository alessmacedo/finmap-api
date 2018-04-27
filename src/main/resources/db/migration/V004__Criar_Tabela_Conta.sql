CREATE TABLE IF NOT EXISTS conta(
    id INT(6) AUTO_INCREMENT,
    descricao VARCHAR(20) NOT NULL,
    valorTotal DECIMAL(10,2) NOT NULL,
    dataEmissao DATE NOT NULL,
    parcelas INT(2) NOT NULL,
    usuario_id INT(6) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
); ENGINE=InnoDB DEFAULT CHARSET=utf8;