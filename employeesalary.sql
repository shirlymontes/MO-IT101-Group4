-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2024 at 08:08 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employeesalary1`
--

-- --------------------------------------------------------

--
-- Table structure for table `employeesalary`
--

CREATE TABLE `employeesalary` (
  `employeeNumber` int(25) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `basicSalary` varchar(100) NOT NULL,
  `riceSubsidy` varchar(100) NOT NULL,
  `phoneAllowance` varchar(100) NOT NULL,
  `clothingAllowance` varchar(100) NOT NULL,
  `grossSemiRate` varchar(100) NOT NULL,
  `hourlyRate` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employeesalary`
--

INSERT INTO `employeesalary` (`employeeNumber`, `lastName`, `firstName`, `basicSalary`, `riceSubsidy`, `phoneAllowance`, `clothingAllowance`, `grossSemiRate`, `hourlyRate`) VALUES
(10001, 'Garcia', 'Manuel III', '90,000', '1,500', '2,000', '1,000', '45,000', '535.71'),
(10002, 'Lim', 'Antonio', '60,000', '1,500', '2,000', '1,000', '30,000', '357.14'),
(10003, 'Aquino', 'Bianca Sofia', '60,000', '1,500', '2,000', '1,000', '30,000', '357.14'),
(10004, 'Reyes', 'Isabella', '60,000', '1,500', '2,000', '1,000', '30,000', '357.14'),
(10005, 'Hernandez', 'Eduard', '52,670', '1,500', '1,000', '1,000', '26,335', '313.51'),
(10006, 'Villanueva', 'Andrea Mae', '52,670', '1,500', '1,000', '1,000', '26,335', '313.51'),
(10007, 'San Jose', 'Brad ', '42,975', '1,500', '800', '800', '21,488', '255.80'),
(10008, 'Romualdez', 'Alice', '22,500', '1,500', '500', '500', '11,250', '133.93'),
(10009, 'Atienza', 'Rosie ', '22,500', '1,500', '500', '500', '11,250', '133.93'),
(10010, 'Alvaro', 'Roderick', '52,670', '1,500', '1,000', '1,000', '26,335', '313.51'),
(10011, 'Salcedo', 'Anthony', '50,825', '1,500', '1,000', '1,000', '25,413', '302.53'),
(10012, 'Lopez', 'Josie ', '38,475', '1,500', '800', '800', '19,238', '229.02'),
(10013, 'Farala', 'Martha', '24,000', '1,500', '500', '500', '12,000', '142.86'),
(10014, 'Martinez', 'Leila', '24,000', '1,500', '500', '500', '12,000', '142.86'),
(10015, 'Romualdez', 'Fredrick ', '53,500', '1,500', '1,000', '1,000', '26,750', '318.45'),
(10016, 'Mata', 'Christian', '42,975', '1,500', '800', '800', '21,488', '255.80'),
(10017, 'De Leon', 'Selena ', '41,850', '1,500', '800', '800', '20,925', '249.11'),
(10018, 'San Jose', 'Allison ', '22,500', '1,500', '500', '500', '11,250', '133.93'),
(10019, 'Rosario', 'Cydney ', '22,500', '1,500', '500', '500', '11,250', '133.93'),
(10020, 'Bautista', 'Mark ', '23,250', '1,500', '500', '500', '11,625', '138.39'),
(10021, 'Lazaro', 'Darlene ', '23,250', '1,500', '500', '500', '11,625', '138.39'),
(10022, 'Delos Santos', 'Kolby ', '24,000', '1,500', '500', '500', '12,000', '142.86'),
(10023, 'Santos', 'Vella ', '22,500', '1,500', '500', '500', '11,250', '133.93'),
(10024, 'Del Rosario', 'Tomas', '22,500', '1,500', '500', '500', '11,250', '133.93'),
(10025, 'Tolentino', 'Jacklyn ', '24,000', '1,500', '500', '500', '12,000', '142.86'),
(10026, 'Gutierrez', 'Percival ', '24,750', '1,500', '500', '500', '12,375', '147.32'),
(10027, 'Manalaysay', 'Garfield ', '24,750', '1,500', '500', '500', '12,375', '147.32'),
(10028, 'Villegas', 'Lizeth ', '24,000', '1,500', '500', '500', '12,000', '142.86'),
(10029, 'Ramos', 'Carol ', '22,500', '1,500', '500', '500', '11,250', '133.93'),
(10030, 'Maceda', 'Emelia ', '22,500', '1,500', '500', '500', '11,250', '133.93'),
(10031, 'Aguilar', 'Delia ', '22,500', '1,500', '500', '500', '11,250', '133.93'),
(10032, 'Castro', 'John Rafael', '52,670', '1,500', '1,000', '1,000', '26,335', '313.51'),
(10033, 'Martinez', 'Carlos Ian', '52,670', '1,500', '1,000', '1,000', '26,335', '313.51'),
(10034, 'Santos', 'Beatriz', '52,670', '1,500', '1,000', '1,000', '26,335', '313.51');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employeesalary`
--
ALTER TABLE `employeesalary`
  ADD PRIMARY KEY (`employeeNumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employeesalary`
--
ALTER TABLE `employeesalary`
  MODIFY `employeeNumber` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10035;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
