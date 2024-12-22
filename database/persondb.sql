-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2019 at 07:38 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `persondb`
--

-- --------------------------------------------------------

--
-- Table structure for table `coffees`
--

CREATE TABLE `coffees` (
  `COF_NAME` varchar(32) DEFAULT NULL,
  `SUP_ID` int(11) DEFAULT NULL,
  `PRICE` float DEFAULT NULL,
  `SALES` int(11) DEFAULT NULL,
  `TOTAL` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coffees`
--

INSERT INTO `coffees` (`COF_NAME`, `SUP_ID`, `PRICE`, `SALES`, `TOTAL`) VALUES
('Colombian', 101, 7.99, 0, 0),
('French_Roast', 49, 8.99, 0, 0),
('Espresso', 150, 9.99, 0, 0),
('Colombian_Decaf', 101, 8.99, 0, 0),
('French_Roast_Decaf', 49, 9.99, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `persons`
--

CREATE TABLE `persons` (
  `pname` varchar(20) NOT NULL,
  `age` int(3) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phoneNo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `persons`
--

INSERT INTO `persons` (`pname`, `age`, `address`, `phoneNo`) VALUES
('Khine Zar Ne Winn', 32, 'Hlaing', '09-11111111'),
('Hla Hla', 32, 'Hlaing', '09-22222222');

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE `suppliers` (
  `SUP_ID` int(11) DEFAULT NULL,
  `SUP_NAME` varchar(40) DEFAULT NULL,
  `STREET` varchar(40) DEFAULT NULL,
  `CITY` varchar(20) DEFAULT NULL,
  `STATE` char(2) DEFAULT NULL,
  `ZIP` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`SUP_ID`, `SUP_NAME`, `STREET`, `CITY`, `STATE`, `ZIP`) VALUES
(101, 'Acme, Inc.', '99 Market Street', 'Groundsville', 'CA', '95199'),
(49, 'Superior Coffee', '1 Party Place', 'Mendocino', 'CA', '95460'),
(150, 'The High Ground', '100 Coffee Lane', 'Meadows', 'CA', '93966');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
