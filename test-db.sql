CREATE DATABASE IF NOT EXISTS `test-db`
CHARACTER SET utf8mb4 
COLLATE utf8mb4_general_ci;
drop database `test-db`;

use `test-db`;

show create database  `test-db`;
CREATE TABLE `Restaurant` (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20) NOT NULL
);

CREATE TABLE `Menu` (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    FOREIGN KEY(restaurant_id) REFERENCES Restaurant(id) ON DELETE CASCADE,
    restaurant_id BIGINT,
    name VARCHAR(10) NOT NULL,
    price DOUBLE NOT NULL,
    description TEXT NOT NULL
);
