-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 22, 2024 at 06:07 PM
-- Server version: 5.1.36
-- PHP Version: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gui_ecomm`
--

-- --------------------------------------------------------

--
-- Table structure for table `ecomm_user`
--

CREATE TABLE IF NOT EXISTS `ecomm_user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(30) DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(30) DEFAULT NULL,
  `gmail` varchar(100) DEFAULT NULL,
  `mobile` bigint(20) DEFAULT NULL,
  `regon` date NOT NULL,
  `status` enum('active','block') NOT NULL DEFAULT 'active',
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `gmail` (`gmail`),
  UNIQUE KEY `mobile` (`mobile`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1018 ;

--
-- Dumping data for table `ecomm_user`
--

INSERT INTO `ecomm_user` (`u_id`, `u_name`, `password`, `address`, `city`, `gmail`, `mobile`, `regon`, `status`) VALUES
(1001, 'MasonHill', '8e4db8214a5a4a9e8efa209712c574b6', '123 Main St, New York, NY 10001', 'New York', 'masonhill@gmail.com', 9876543220, '2024-10-23', 'active'),
(1002, 'AvaGreen', '9f23dce5600cfe5a89d0bfd7c4e31819', '456 Maple Ave, Los Angeles, CA 90001', 'Los Angeles', 'avagreen@gmail.com', 9876543221, '2023-12-30', 'active'),
(1003, 'LucasMoore', '86320f141a103132ececf3dd79f0d6e8', '789 Oak St, Chicago, IL 60601', 'Chicago', 'lucasmoore@gmail.com', 9876543222, '2024-10-15', 'active'),
(1004, 'MiaTaylor', '086142a5d751c9186db42a098fe299d8', '101 Pine Rd, Houston, TX 77001', 'Houston', 'miataylor@gmail.com', 9876543223, '2024-09-13', 'active'),
(1005, 'JamesAnderson', '6fe6c8d4cb072ca033f12cc9537fe106', '202 Cedar Ln, Phoenix, AZ 85001', 'Phoenix', 'jamesanderson@gmail.com', 9876543224, '2024-09-30', 'active'),
(1006, 'AmeliaThomas', '37b596e47a595027c55f7c09069da0c7', '303 Birch Blvd, Philadelphia, PA 19101', 'Philadelphia', 'ameliathomas@gmail.com', 9876543225, '2024-09-19', 'active'),
(1007, 'AlexanderLopez', '14476a1d3a812f4a3540e11199b69f5d', '404 Elm St, San Antonio, TX 78201', 'San Antonio', 'alexanderlopez@gmail.com', 9876543226, '2024-09-19', 'active'),
(1008, 'IsabellaKing', 'c61461114a5aa8d24c15883ed30bb7db', '505 Walnut Ave, San Diego, CA 92101', 'San Diego', 'isabellaking@gmail.com', 9876543227, '2024-11-01', 'active'),
(1009, 'BenjaminScott', 'bd51f9b7d0507ddb373d4dd1b2a906b1', '606 Chestnut St, Dallas, TX 75201', 'Dallas', 'benjaminscott@gmail.com', 9876543228, '2024-08-15', 'active'),
(1010, 'EmilyYoung', 'd1e929eb5e7c5fc1a92caf4e526fbe4f', '707 Spruce St, San Jose, CA 95101', 'San Jose', 'emilyyoung@gmail.com', 9876543229, '2024-10-17', 'active'),
(1011, 'Raju', '0de99dbac6f301dcadeb24ae57d976c7', '808 Palm Dr, Bengaluru, KA 560001', 'Bengaluru', 'raju@gmail.com', 8754632453, '2024-09-10', 'block'),
(1012, 'Sandeep S', 'ab7a2d5ae1eb7ed6c3559d4af42f75fa', '#909 Cypress St, Bengaluru, KA 560002', 'Bengaluru', 'sandeeps@gmail.com', 9756564787, '2024-11-22', 'active'),
(1013, 'Girish P', 'b00bf93e87496aee11dd4ea12d682d90', '2436 Nambeesan Glens, Albuquerque, Dadar and Nagar Haveli 529 641, India', 'Mumbai', 'girishp@gmail.com', 9435632456, '2024-11-04', 'block'),
(1014, 'Kishore D', '990e5de5b3bd718d33048335cff5220b', '1111 Willow Ave, Bengaluru, KA 560004', 'Bengaluru', 'kishored@gmail.com', 9875673428, '2024-10-15', 'active'),
(1015, 'Raja R', '1e42b178f35cebc961c5686b7729da96', 'S/109, Kabir Cplx, Makarpura Road, Makarpura Road', 'Gujarat', 'rajar@gmail.com', 7546324536, '2024-11-03', 'active'),
(1016, 'Vignesh B', 'de46e74c232cca867d60ad115fbbda77', 'A-4c, Anugraha, 19 Nungambakkam High Road.', 'Chennai', 'vigneshb@gmail.com', 7654876549, '2024-11-06', 'active'),
(1017, 'Harshan S', '8a5c64cfd4fd3496d4750524dbea32f6', '#34, 1st Floor 1st Main New Extn, Kalasipalyam', 'Bengaluru', 'harshans@gmail.com', 7658645356, '2024-11-21', 'active');
