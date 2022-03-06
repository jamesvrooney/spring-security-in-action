INSERT INTO users (id, username, password, algorithm, enabled) VALUES
('46452b5d-e562-4e3d-aa9f-beac8666b012', 'james', '$2a$12$LB4iJxW6SCeGwyu3rl5ChODU2Rpi8JJdaLw3xtbU3s1493RCOVqFC', 'BCRYPT', true);

--INSERT INTO authorities (id, username, authority, user_id) VALUES
--('6eb7a708-de11-4812-a5c9-7d9e08049814' , 'james', 'read', '46452b5d-e562-4e3d-aa9f-beac8666b012');

INSERT INTO authority (id, authority, user_id) VALUES
('6eb7a708-de11-4812-a5c9-7d9e08049814', 'read', '46452b5d-e562-4e3d-aa9f-beac8666b012');


INSERT INTO product (id, name, currency, price) VALUES
('3d7c6a54-63b4-447e-9ce2-ea14811cb68c', 'Book', 'GBP', 8.99),
('6916ebee-355d-4aed-946a-4de1a5fcc989', 'Mug', 'USD', 8.99);
