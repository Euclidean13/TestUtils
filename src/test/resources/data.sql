DROP TABLE IF EXISTS generic_entity;

CREATE TABLE generic_entity (
  id INT AUTO_INCREMENT PRIMARY KEY,
  valor VARCHAR(250)
);

INSERT INTO generic_entity (valor) VALUES
  ('hola'), ('que');