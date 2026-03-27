CREATE DATABASE uttarakhand_db;

USE uttarakhand_db;

-- Places Table
CREATE TABLE places (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    description TEXT
);

INSERT INTO places (name, description) VALUES
('Rishikesh', 'Yoga Capital & Adventure Hub'),
('Nainital', 'Lake city surrounded by hills'),
('Mussoorie', 'Queen of Hills'),
('Kedarnath', 'Spiritual destination');

-- Contact Table
CREATE TABLE contact (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    message TEXT
);