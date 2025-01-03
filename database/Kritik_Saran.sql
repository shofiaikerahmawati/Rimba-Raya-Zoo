-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 06, 2024 at 10:46 AM
-- Server version: 10.11.9-MariaDB-cll-lve-log
-- PHP Version: 8.3.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rimbaray_rimbarayazoo`
--

-- --------------------------------------------------------

--
-- Table structure for table `Kritik_Saran`
--

CREATE TABLE `Kritik_Saran` (
  `ID_kritik` int(11) NOT NULL,
  `nama_pengunjung` varchar(100) NOT NULL,
  `tanggal_input` timestamp NULL DEFAULT current_timestamp(),
  `isi_kritik` text DEFAULT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `Kritik_Saran`
--

INSERT INTO `Kritik_Saran` (`ID_kritik`, `nama_pengunjung`, `tanggal_input`, `isi_kritik`, `email`) VALUES
(1, 'Yanto', '2024-11-28 17:00:00', 'kebun binatang yang sangat terawat. Tingkatkan!!!!', 'yantobendol@gmail.com');

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
  MODIFY `ID_kritik` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
