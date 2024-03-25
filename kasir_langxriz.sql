-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 25, 2024 at 02:36 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir_rizlang`
--

-- --------------------------------------------------------

--
-- Table structure for table `detailpenjualan`
--

CREATE TABLE `detailpenjualan` (
  `DetailID` varchar(15) NOT NULL,
  `ProdukID` varchar(15) NOT NULL,
  `Harga` int(11) NOT NULL,
  `JumlahProduk` int(11) NOT NULL,
  `Subtotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detailpenjualan`
--

INSERT INTO `detailpenjualan` (`DetailID`, `ProdukID`, `Harga`, `JumlahProduk`, `Subtotal`) VALUES
('DIDP006', '6956953588086', 2000, 2, 4000),
('DIDP007', '571940041', 79000, 1, 79000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `LoginID` int(11) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `HakAkses` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`LoginID`, `Username`, `Password`, `HakAkses`) VALUES
(2, 'Rizlang', 'Rizlang', 'Admin'),
(172, 'Rizlang', 'Rizlang', 'Petugas'),
(177, 'Rizkan', '123456789', 'Admin'),
(271, 'Gilang', 'Gilang271', 'Petugas');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `PelangganID` varchar(11) NOT NULL,
  `NamaPelanggan` varchar(256) NOT NULL,
  `Alamat` text NOT NULL,
  `NomorTelepon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`PelangganID`, `NamaPelanggan`, `Alamat`, `NomorTelepon`) VALUES
('1', 'Gilang', 'Babakan New', '088222614213');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `PenjualanID` varchar(15) NOT NULL,
  `DetailID` varchar(15) NOT NULL,
  `TanggalPenjualan` date NOT NULL,
  `JamPenjualan` time NOT NULL,
  `TotalHarga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`PenjualanID`, `DetailID`, `TanggalPenjualan`, `JamPenjualan`, `TotalHarga`) VALUES
('IDP001', 'DIDP001', '2024-02-22', '14:55:51', 79000),
('IDP002', 'DIDP002', '2024-02-22', '15:05:11', 237000),
('IDP003', 'DIDP003', '2024-02-22', '15:05:49', 316000),
('IDP004', 'DIDP004', '2024-02-22', '15:52:50', 237000),
('IDP005', 'DIDP005', '2024-02-22', '16:18:24', 79000),
('IDP006', 'DIDP006', '2024-03-20', '09:57:08', 4000),
('IDP007', 'DIDP007', '2024-03-21', '08:52:05', 79000);

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `ProdukID` varchar(15) NOT NULL,
  `NamaProduk` varchar(255) NOT NULL,
  `Harga` int(11) NOT NULL,
  `Stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`ProdukID`, `NamaProduk`, `Harga`, `Stok`) VALUES
('571940041', 'buku novel', 79000, 13),
('6956953588086', 'pulpen', 2000, 58),
('8993988690047', 'penghapus', 500, 54),
('8996001600269', 'minuman', 3500, 100),
('8998685274002', 'Permen', 2000, 50);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  ADD PRIMARY KEY (`DetailID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`LoginID`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`PelangganID`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`PenjualanID`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`ProdukID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
