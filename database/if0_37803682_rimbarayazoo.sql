-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: sql201.infinityfree.com
-- Generation Time: Nov 29, 2024 at 03:16 AM
-- Server version: 10.6.19-MariaDB
-- PHP Version: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `if0_37803682_rimbarayazoo`
--

-- --------------------------------------------------------

--
-- Table structure for table `Kritik_Saran`
--

CREATE TABLE `Kritik_Saran` (
  `ID_kritik` int(11) NOT NULL,
  `nama_pengunjung` varchar(100) NOT NULL,
  `tanggal_input` date DEFAULT NULL,
  `isi_kritik` text DEFAULT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `Kritik_Saran`
--

INSERT INTO `Kritik_Saran` (`ID_kritik`, `nama_pengunjung`, `tanggal_input`, `isi_kritik`, `email`) VALUES
(1, 'Yanto', '2024-11-29', 'kebun binatang yang sangat terawat. Tingkatkan!!!!', 'yantobendol@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Kritik_Saran`
--
ALTER TABLE `Kritik_Saran`
  ADD PRIMARY KEY (`ID_kritik`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Kritik_Saran`
--
ALTER TABLE `Kritik_Saran`
  MODIFY `ID_kritik` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
