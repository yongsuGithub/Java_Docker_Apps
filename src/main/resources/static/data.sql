




create database employee_db;
use employee_db;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";
CREATE TABLE IF NOT EXISTS `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `task` varchar(255) NOT NULL,
  `provide` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;



INSERT INTO `employee` (`id`, `name`, `task`, `provide`, `status`) VALUES
(1, 'tom1', 'UI Implement', 'sagar', 'Pending'),
(2, 'tom22', 'UI Implement', 'sagar', 'Pending'),
(3, 'tom33', 'UI Implement', 'sagar', 'Pending'),
(4, 'tom44', 'UI Implement', 'sagar', 'Pending'),
(5, 'tom55', 'UI Implement', 'sagar', 'Pending'),
(6, 'tom66', 'UI Implement', 'sagar', 'Pending'),
(7, 'tom77', 'UI Implement', 'sagar', 'Pending'),
(8, 'tom88', 'UI Implement', 'sagar', 'Pending'),
(9, 'tom99', 'UI Implement', 'sagar', 'Pending');
