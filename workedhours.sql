-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2024 at 08:07 AM
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
-- Database: `workedhours`
--

-- --------------------------------------------------------

--
-- Table structure for table `workedhours`
--

CREATE TABLE `workedhours` (
  `employeeNumber` int(25) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `hourlyPay` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `workedhours`
--

INSERT INTO `workedhours` (`employeeNumber`, `lastName`, `firstName`, `hourlyPay`) VALUES
(10001, 'Garcia', 'Manuel III', '535.71'),
(10002, 'Lim', 'Antonio', '357.14'),
(10003, 'Aquino', 'Bianca Sofia', '357.14'),
(10004, 'Reyes', 'Isabella', '357.14'),
(10005, 'Hernandez', 'Eduard', '313.51'),
(10006, 'Villanueva', 'Andrea Mae', '313.51'),
(10007, 'San Jose', 'Brad ', '255.80'),
(10008, 'Romualdez', 'Alice', '133.93'),
(10009, 'Atienza', 'Rosie ', '133.93'),
(10010, 'Alvaro', 'Roderick', '313.51'),
(10011, 'Salcedo', 'Anthony', '302.53'),
(10012, 'Lopez', 'Josie ', '229.02'),
(10013, 'Farala', 'Martha', '142.86'),
(10014, 'Martinez', 'Leila', '142.86'),
(10015, 'Romualdez', 'Fredrick ', '318.45'),
(10016, 'Mata', 'Christian', '255.80'),
(10017, 'De Leon', 'Selena ', '249.11'),
(10018, 'San Jose', 'Allison ', '133.93'),
(10019, 'Rosario', 'Cydney ', '133.93'),
(10020, 'Bautista', 'Mark ', '138.39'),
(10021, 'Lazaro', 'Darlene ', '138.39'),
(10022, 'Delos Santos', 'Kolby ', '142.86'),
(10023, 'Santos', 'Vella ', '133.93'),
(10024, 'Del Rosario', 'Tomas', '133.93'),
(10025, 'Tolentino', 'Jacklyn ', '142.86'),
(10026, 'Gutierrez', 'Percival ', '147.32'),
(10027, 'Manalaysay', 'Garfield ', '147.32'),
(10028, 'Villegas', 'Lizeth ', '142.86'),
(10029, 'Ramos', 'Carol ', '133.93'),
(10030, 'Maceda', 'Emelia ', '133.93'),
(10031, 'Aguilar', 'Delia ', '133.93'),
(10032, 'Castro', 'John Rafael', '313.51'),
(10033, 'Martinez', 'Carlos Ian', '313.51'),
(10034, 'Santos', 'Beatriz', '313.51');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `workedhours`
--
ALTER TABLE `workedhours`
  ADD PRIMARY KEY (`employeeNumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `workedhours`
--
ALTER TABLE `workedhours`
  MODIFY `employeeNumber` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10035;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
