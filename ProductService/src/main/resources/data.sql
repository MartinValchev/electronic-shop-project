CREATE SCHEMA IF NOT EXISTS product_schema;
SET SCHEMA product_schema;
CREATE TABLE product (
id BIGINT,
name varchar(255),
description varchar(255),
price DOUBLE);
INSERT INTO product (id, name, price, description) VALUES (1, 'iphone 4', 80.50, 'old iphone model');
INSERT INTO product (id, name, price, description) VALUES (2, 'Dyson vacuum cleaner', 480.00, 'expensive cleaner');
INSERT INTO product (id, name, price, description) VALUES (3, 'Edifier speakers', 350.00, 'low/mid Edifier speakers');
INSERT INTO product (id, name, price, description) VALUES (4, 'teddy bear toy', 24.00, 'bear toy');
