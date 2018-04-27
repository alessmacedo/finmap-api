CREATE TABLE IF NOT EXISTS meta(
    id INT(6) AUTO_INCREMENT,
    titulo VARCHAR(20) NOT NULL,
    descricao VARCHAR(20) NOT NULL,
    dataInicio DATE NOT NULL,
    dataFim DATE NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    usuario_id INT(6) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
); ENGINE=InnoDB DEFAULT CHARSET=utf8;