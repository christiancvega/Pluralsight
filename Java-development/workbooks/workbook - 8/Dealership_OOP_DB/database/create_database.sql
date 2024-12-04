DROP DATABASE IF EXISTS dealership;
CREATE DATABASE IF NOT EXISTS dealership;
USE dealership;

CREATE TABLE `dealership` (
    `dealership_id` INTEGER NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL,
    `address` VARCHAR(50),
    `phone` VARCHAR(12),
    CONSTRAINT `pk_dealership` PRIMARY KEY (`dealership_id`)
);

CREATE TABLE `vehicle` (
    `vehicle_id` INTEGER NOT NULL,
    `make` VARCHAR(255) NOT NULL,
    `model` VARCHAR(255),
    `color` VARCHAR(255),
    `sold` BOOLEAN,
    `dealership_id` INTEGER,
    CONSTRAINT `pk_vehicle_id` PRIMARY KEY (`vehicle_id`),
    FOREIGN KEY (`dealership_id`) REFERENCES `dealership`(`dealership_id`)
);