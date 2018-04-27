CREATE TABLE IF NOT EXISTS lancamento(
    id INT(6) AUTO_INCREMENT,
    data DATE NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    tipo VARCHAR(20) NOT NULL,
    tag VARCHAR(20) NOT NULL,
    usuario_id INT(6) NOT NULL,
    meta_id INT(6),
    PRIMARY KEY (id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (meta_id) REFERENCES meta(id)
); ENGINE=InnoDB DEFAULT CHARSET=utf8;