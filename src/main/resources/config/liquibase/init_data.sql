INSERT INTO users (id, username, password, enabled) VALUES
('46452b5d-e562-4e3d-aa9f-beac8666b012', 'james_rooney', 'password', true);

INSERT INTO authorities (id, username, authority, user_id) VALUES
('6eb7a708-de11-4812-a5c9-7d9e08049814' , 'james', 'read', '46452b5d-e562-4e3d-aa9f-beac8666b012');

--INSERT INTO authorities (id, authority, user_id) VALUES
--('6eb7a708-de11-4812-a5c9-7d9e08049814', 'read', '46452b5d-e562-4e3d-aa9f-beac8666b012');