-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2024 at 12:52 AM
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
-- Database: `genshinimpact`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `id_akun` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`id_akun`, `email`, `password`, `role`) VALUES
(1, 'admin@gmail.com', '123admin', 'admin'),
(2, 'dustin@gmail.com', '123DUSTIN', 'user'),
(3, 'sdawd', '1231232', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `karakter`
--

CREATE TABLE `karakter` (
  `idKarakter` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `region` varchar(255) NOT NULL,
  `vision` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `weapon` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `karakter`
--

INSERT INTO `karakter` (`idKarakter`, `nama`, `region`, `vision`, `gender`, `weapon`) VALUES
(1, 'Diluc', 'Mondstadt', 'Pyro', 'Laki-laki', 'Claymore'),
(2, 'Jean', 'Mondstadt', 'Anemo', 'Perempuan', 'Sword'),
(3, 'Keqing', 'Liyue', 'Electro', 'Perempuan', 'Sword');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`id_akun`);

--
-- Indexes for table `karakter`
--
ALTER TABLE `karakter`
  ADD PRIMARY KEY (`idKarakter`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akun`
--
ALTER TABLE `akun`
  MODIFY `id_akun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `karakter`
--
ALTER TABLE `karakter`
  MODIFY `idKarakter` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
