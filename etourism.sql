-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2015 at 05:43 PM
-- Server version: 10.0.17-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `etourism`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `userType` int(11) NOT NULL DEFAULT '2',
  `email` varchar(20) DEFAULT NULL,
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `address` text,
  `zipCode` int(5) DEFAULT NULL,
  `city` text,
  `state` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `userType`, `email`, `firstName`, `lastName`, `gender`, `address`, `zipCode`, `city`, `state`) VALUES
(1, 'a', 'a', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, 'f', 'e', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 'ed', '3', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, 'a', 'a', 2, 'a', 'a', NULL, 1, 'a', NULL, 'a', 'JB'),
(5, 'a', '8', 2, 'a', 'a', NULL, 1, 'a', 1, 'a', 'JB'),
(6, 'ff', '4', 2, 'bv', 'l', NULL, 0, 'd', 4, 'ff', 'JB'),
(7, 'ff', '8', 2, 'bv', 'l', NULL, 0, 'd', 4, 'ff', 'JB'),
(8, 't', '4', 2, 'gf', 'l', 'k', 1, 'f', 65, 'gf', 'JB');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
