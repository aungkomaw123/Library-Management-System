-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Sep 28, 2021 at 03:25 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `bookID` int(20) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(100) NOT NULL,
  `publisher` varchar(100) NOT NULL,
  `price` varchar(20) NOT NULL,
  `publish_year` varchar(10) NOT NULL,
  `edition` varchar(10) NOT NULL,
  PRIMARY KEY (`bookID`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bookID`, `book_name`, `publisher`, `price`, `publish_year`, `edition`) VALUES
(1, 'Java Programing ', 'Deepak', '200MMK', '2018', '1'),
(2, 'C# Basic Programming Book', 'David', '18000MMK', '2017', '2'),
(3, 'Python Programming', 'Deepak', '10000MMK', '2020', '1'),
(4, 'Helping Book', 'Dr Ready', '200MMK', '2012', '2'),
(5, 'Web Development', 'Dr RamMuriti', '1000MMK', '2019', '1'),
(6, 'Database Design and Development', 'Person Organization', '1000MMK', '2019', '2'),
(7, '.Net Programming Book', 'Dr. Soolean', '2000 MMK', '2018', '2'),
(8, 'Arduino Development Book', 'Thomas', '1500MMK', '2020', '3'),
(9, 'Java Script', 'Dr Abdual Kalam ', '2000MMK', '2020', '3');

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

DROP TABLE IF EXISTS `issue`;
CREATE TABLE IF NOT EXISTS `issue` (
  `bookID` int(10) NOT NULL,
  `StudentID` int(10) NOT NULL,
  `issuedDate` varchar(20) NOT NULL,
  `returnDate` varchar(20) NOT NULL,
  `returnBook` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`bookID`, `StudentID`, `issuedDate`, `returnDate`, `returnBook`) VALUES
(1, 1, '22-09-2021', '22-09-2021', 'No'),
(5, 5, '21-09-2021', '23-09-2021', 'Yes'),
(3, 2, '29-09-2021', '30-09-2021', 'No'),
(4, 4, '20-09-2021', '22-09-2021', 'Yes'),
(2, 2, '28-08-2021', '29-08-2021', 'No'),
(1, 1, '28-08-2021', '29-08-2021', 'Yes'),
(6, 6, '24-09-2021', '25-09-2021', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

DROP TABLE IF EXISTS `request`;
CREATE TABLE IF NOT EXISTS `request` (
  `request_bookID` int(11) NOT NULL AUTO_INCREMENT,
  `StudentID` int(10) NOT NULL,
  `book_name` varchar(100) NOT NULL,
  `book_publisher` varchar(20) NOT NULL,
  `book_publish_year` varchar(20) NOT NULL,
  `Edition` varchar(20) NOT NULL,
  PRIMARY KEY (`request_bookID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `request`
--

INSERT INTO `request` (`request_bookID`, `StudentID`, `book_name`, `book_publisher`, `book_publish_year`, `Edition`) VALUES
(1, 1, 'JavaScript', 'David Flanagan', '2020', '3'),
(2, 2, 'Python Programming', 'Jack', '2020', '2'),
(3, 2, 'Web Development', 'Stebin', '2019', '1'),
(4, 5, 'PHP programming book', 'Dr David Ready', '2021', '1');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `StudentID` int(10) NOT NULL AUTO_INCREMENT,
  `Student_username` varchar(100) NOT NULL,
  `Student_email` varchar(100) NOT NULL,
  `Student_password` varchar(20) NOT NULL,
  `Student_gender` varchar(10) NOT NULL,
  `Student_BatchNo` varchar(10) NOT NULL,
  `Student_RollNo` varchar(10) NOT NULL,
  `Student_Course` varchar(20) NOT NULL,
  `Student_Branch` varchar(20) NOT NULL,
  `Student_ContentNo` varchar(20) NOT NULL,
  `Student_FatherName` varchar(100) NOT NULL,
  PRIMARY KEY (`StudentID`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`StudentID`, `Student_username`, `Student_email`, `Student_password`, `Student_gender`, `Student_BatchNo`, `Student_RollNo`, `Student_Course`, `Student_Branch`, `Student_ContentNo`, `Student_FatherName`) VALUES
(1, 'Nay Myo Aung', 'naymyoaung@gmail.com', 'asd123!@#', 'Male', 'B-46', '10', 'HND', 'Programming', '09428116369', 'U Raja Ram'),
(2, 'Aung Ko Maw', 'aungkomaw.123@gmail.com', 'aungkomaw', 'Male', 'B-46', '3', 'HND', 'Programming', '09422833308', 'Aung Aung'),
(3, 'Aung Aung', 'aungaung@gmail.com', 'asd123', 'Male', 'B-46', '4', 'HND', 'Programming', '09424212087', 'U Zaw Zaw'),
(4, 'Aung Htoo Paing', 'aunghtoopaing123@gmail.com', '123asdASD!@#', 'Male', 'B-46', '12', 'HND', 'Programming', '09798559838', 'U Htun Naing'),
(5, 'Zaw Paing', 'zawpaing@gmail.com', '123asdASD!@#', 'Male', 'B-46', '3', 'HND', 'Programming', '09968548717', 'U Naing Naing'),
(6, 'Zaw Zaw Aung', 'zawzawaung123@gmail.com', '123asdASD!@#', 'Male', 'B-45', '2', 'BSC', 'Programming', '0998787871', 'U Thein Htun Aung');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
