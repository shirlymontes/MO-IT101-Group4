-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2024 at 08:06 AM
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
-- Database: `employeeinfo`
--

-- --------------------------------------------------------

--
-- Table structure for table `employeedata`
--

CREATE TABLE `employeedata` (
  `enumber` int(25) NOT NULL,
  `ename` varchar(255) NOT NULL,
  `position` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `phone` varchar(25) NOT NULL,
  `bday` varchar(25) NOT NULL,
  `address` varchar(255) NOT NULL,
  `supervisor` varchar(100) NOT NULL,
  `sss` varchar(25) NOT NULL,
  `philhealth` varchar(25) NOT NULL,
  `pagibig` varchar(25) NOT NULL,
  `tin` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employeedata`
--

INSERT INTO `employeedata` (`enumber`, `ename`, `position`, `status`, `phone`, `bday`, `address`, `supervisor`, `sss`, `philhealth`, `pagibig`, `tin`) VALUES
(10001, 'Garcia, Manuel III', 'Chief Executive Officer', 'Regular', '966-860-270', '10/11/1983', 'Valero Carpark Building Valero Street 1227, Makati City', 'N/A', '44-4506057-3', '820126853951', '691295330870', '442-605-657-000'),
(10002, 'Lim, Antonio', 'Chief Operating Officer', 'Regular', '06/19/1988', '171-867-411', 'San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite', 'Garcia, Manuel III', '52-2061274-9', '331735646338', '663904995411', '683-102-776-000'),
(10003, 'Aquino, Bianca Sofia', 'Chief Finance Officer', 'Regular', '966-889-370', '08/04/1989', 'Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City', 'Garcia, Manuel III', '30-8870406-2', '177451189665', '171519773969', '971-711-280-000'),
(10004, 'Reyes, Isabella', 'Chief Marketing Officer', 'Regular', '786-868-477', '06/16/1994', '460 Solanda Street Intramuros 1000, Manila', 'Garcia, Manuel III', '40-2511815-0', '341911411254', '416946776041', '876-809-437-000'),
(10005, 'Hernandez, Eduard', 'IT Operations and Systems', 'Regular', '09/23/1989', '088-861-012', 'National Highway, Gingoog,  Misamis Occidental', 'Lim, Antonio', '50-5577638-1', '957436191812', '952347222457', '031-702-374-000'),
(10006, 'Villanueva, Andrea Mae', 'HR Manager', 'Regular', '918-621-603', '02/14/1988', '17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ', 'Lim, Antonio', '49-1632020-8', '382189453145', '441093369646', '317-674-022-000'),
(10007, 'San Jose, Brad ', 'HR Team Leader', 'Regular', '797-009-261', '03/15/1996', '99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi', 'Villanueva, Andrea Mae', '40-2400714-1', '239192926939', '210850209964', '672-474-690-000'),
(10008, 'Romualdez, Alice', 'HR Rank and File', 'Regular', '983-606-799', '05/14/1992', '12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte ', 'San, Jose Brad', '55-4476527-2', '545652640232', '211385556888', '888-572-294-000'),
(10009, 'Atienza, Rosie ', 'HR Rank and File', 'Regular', '266-036-427', '09/24/1948', '90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte', 'San, Jose Brad', '41-0644692-3', '708988234853', '260107732354', '604-997-793-000'),
(10010, 'Alvaro, Roderick', 'Accounting Head', 'Regular', '053-381-386', '03/30/1988', '#284 T. Morato corner, Scout Rallos Street, Quezon City', 'Aquino, Bianca Sofia ', '64-7605054-4', '578114853194', '799254095212', '525-420-419-000'),
(10011, 'Salcedo, Anthony', 'Payroll Manager', 'Regular', '070-766-300', '09/14/1993', '93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate', 'Alvaro, Roderick', '26-9647608-3', '126445315651', '218002473454', '210-805-911-000'),
(10012, 'Lopez, Josie ', 'Payroll Team Leader', 'Regular', '478-355-427', '01/14/1987', '49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro', 'Salcedo, Anthony', '44-8563448-3', '431709011012', '113071293354', '218-489-737-000'),
(10013, 'Farala, Martha', 'Payroll Rank and File', 'Regular', '329-034-366', '01/11/1942', '42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte ', 'Salcedo, Anthony', '45-5656375-0', '233693897247', '631130283546', '210-835-851-000'),
(10014, 'Martinez, Leila', 'Payroll Rank and File', 'Regular', '877-110-749', '07/11/1970', '37/46 Kulas Roads, Maragondon 0962 Quirino ', 'Salcedo, Anthony', '27-2090996-4', '515741057496', '101205445886', '275-792-513-000'),
(10015, 'Romualdez, Fredrick ', 'Account Manager', 'Regular', '023-079-009', '03/10/1985', '22A/52 Lubowitz Meadows, Pililla 4895 Zambales', 'Lim, Antonio', '26-8768374-1', '308366860059', '223057707853', '598-065-761-000'),
(10016, 'Mata, Christian', 'Account Team Leader', 'Regular', '783-776-744', '10/21/1987', '90 O\'Keefe Spur Apt. 379, Catigbian 2772 Sulu ', 'Romualdez, Fredrick ', '49-2959312-6', '824187961962', '631052853464', '103-100-522-000'),
(10017, 'De Leon, Selena ', 'Account Team Leader', 'Regular', '975-432-139', '02/20/1975', '89A Armstrong Trace, Compostela 7874 Maguindanao', 'Romualdez, Fredrick ', '27-2090208-8', '587272469938', '719007608464', '482-259-498-000'),
(10018, 'San Jose, Allison ', 'Account Rank and File', 'Regular', '179-075-129', '06/24/1986', '08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union', 'Mata, Christian', '45-3251383-0', '745148459521', '114901859343', '121-203-336-000'),
(10019, 'Rosario, Cydney ', 'Regular', 'Account Rank and File', '868-819-912', '10/06/1996', '93A/21 Berge Points, Tapaz 2180 Quezon', 'Mata, Christian', '49-1629900-2', '579253435499', '265104358643', '122-244-511-000'),
(10020, 'Bautista, Mark ', 'Account Rank and File', 'Regular', '683-725-348', '02/12/1991', '65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino', 'Mata, Christian', '49-1647342-5', '399665157135', '260054585575', '273-970-941-000'),
(10021, 'Lazaro, Darlene ', 'Account Rank and File', 'Probationary', '740-721-558', '11/25/1985', '47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino', 'Mata, Christian', '45-5617168-2', '606386917510', '104907708845', '354-650-951-000'),
(10022, 'Delos Santos, Kolby ', 'Account Rank and File', 'Probationary', '739-443-033', '02/26/1980', '06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur', 'Mata, Christian', '52-0109570-6', '357451271274', '113017988667', '187-500-345-000'),
(10023, 'Santos, Vella ', 'Account Rank and File', 'Probationary', '955-879-269', '12/31/1983', '99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur', 'Mata, Christian', '52-9883524-3', '548670482885', '360028104576', '101-558-994-000'),
(10024, 'Del Rosario, Tomas', 'Account Rank and File', 'Probationary', '882-550-989', '12/18/1978', '80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque', 'Mata, Christian', '45-5866331-6', '953901539995', '913108649964', '560-735-732-000'),
(10025, 'Tolentino, Jacklyn ', 'Account Rank and File', 'Probationary', '675-757-366', '05/19/1984', '96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao', 'De Leon, Selena', '47-1692793-0', '753800654114', '210546661243', '841-177-857-000'),
(10026, 'Gutierrez, Percival ', 'Account Rank and File', 'Probationary', '512-899-876', '12/18/1970', '58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur', 'De Leon, Selena', '40-9504657-8', '797639382265', '210897095686', '502-995-671-000'),
(10027, 'Manalaysay, Garfield ', 'Account Rank and File', 'Probationary', '948-628-136', '08/28/1986', '60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur', 'De Leon, Selena', '45-3298166-4', '810909286264', '211274476563', '336-676-445-000'),
(10028, 'Villegas, Lizeth ', 'Account Rank and File', 'Probationary', '332-372-215', '12/12/1981', '66/77 Mann Views, Luisiana 1263 Dinagat Islands', 'De Leon, Selena', '40-2400719-4', '934389652994', '210-395-397-000', '122238077997'),
(10029, 'Ramos, Carol ', 'Account Rank and File', 'Probationary', '250-700-389', '08/20/1978', '72/70 Stamm Spurs, Bustos 4550 Iloilo', 'De Leon, Selena', '60-1152206-4', '351830469744', '395-032-717-000', '212141893454'),
(10030, 'Maceda, Emelia ', 'Account Rank and File', 'Probationary', '973-358-041', '04/14/1973', '50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija', 'De Leon, Selena', '54-1331005-0', '465087894112', '215-973-013-000', '515012579765'),
(10031, 'Aguilar, Delia', 'Account Rank and File', 'Probationary', '529-705-439', '01/27/1989', '95 Cremin Junction, Surallah 2809 Cotabato', 'De Leon, Selena', '52-1859253-1', '136451303068', '599-312-588-000', '110018813465'),
(10032, 'Castro, John Rafael', 'Sales & Marketing', 'Regular', '332-424-955 ', '02/09/1992', 'Hi-way, Yati, Liloan Cebu', 'Reyes, Isabella', '26-7145133-4', '601644902402', '404-768-309-000', '697764069311'),
(10033, 'Martinez, Carlos Ian', 'Supply Chain and Logistics', 'Regular', '078-854-208', '11/16/1990', 'Bulala, Camalaniugan', 'Reyes, Isabella', '11-5062972-7', '380685387212', '993372963726', '256-436-296-000'),
(10034, 'Santos, Beatriz', 'Customer Service and Relations', 'Regular', '526-639-511', '08/07/1990', 'Agapita Building, Metro Manila', 'Reyes, Isabella', '20-2987501-5', '918460050077', '874042259378', '911-529-713-000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employeedata`
--
ALTER TABLE `employeedata`
  ADD PRIMARY KEY (`enumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employeedata`
--
ALTER TABLE `employeedata`
  MODIFY `enumber` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10032163;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
