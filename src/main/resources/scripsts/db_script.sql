CREATE DATABASE  IF NOT EXISTS `space_agency`;
USE `space_agency`;

--
-- Table structure for table `mission`
--

DROP TABLE IF EXISTS `mission`;

CREATE TABLE `mission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `imagery_type` varchar(45) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `finish_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `mission`
--

INSERT INTO `mission` VALUES
	(1,'Mission to Mars','Panchromatic','2019-04-23', '2019-09-01'),
    (2,'Mission to the Moon','Multispectral','2019-03-01', '2019-03-15'),
    (3,'Mission to Pluton','Hyperspectral','2019-04-25', '2021-06-12'),
    (4,'Mission to the Sun','Panchromatic','2019-03-20', '2019-07-01');

