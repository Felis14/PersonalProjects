-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.89-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema base_contactos
--

CREATE DATABASE IF NOT EXISTS base_contactos;
USE base_contactos;

--
-- Definition of table `tabla_bitacora`
--

DROP TABLE IF EXISTS `tabla_bitacora`;
CREATE TABLE `tabla_bitacora` (
  `NumMov` int(10) unsigned NOT NULL auto_increment,
  `FechaMov` varchar(45) NOT NULL,
  `User` varchar(45) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  PRIMARY KEY  (`NumMov`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tabla_bitacora`
--

/*!40000 ALTER TABLE `tabla_bitacora` DISABLE KEYS */;
INSERT INTO `tabla_bitacora` (`NumMov`,`FechaMov`,`User`,`Descripcion`) VALUES 
 (7,'19/3/2023','Felix14','Modificación del usuario JosephWiz'),
 (8,'21/3/2023','Felix14','Registro de Contacto N°121 - Brendan Ramirez Campos');
/*!40000 ALTER TABLE `tabla_bitacora` ENABLE KEYS */;


--
-- Definition of table `tabla_contactos`
--

DROP TABLE IF EXISTS `tabla_contactos`;
CREATE TABLE `tabla_contactos` (
  `ID` int(10) unsigned NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Dir` varchar(45) NOT NULL,
  `Reg_Date` varchar(45) NOT NULL,
  `Birthday` varchar(45) NOT NULL,
  `Cat` varchar(45) NOT NULL,
  `Tel_Casa` varchar(45) NOT NULL,
  `Tel_Mov` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabla_contactos`
--

/*!40000 ALTER TABLE `tabla_contactos` DISABLE KEYS */;
INSERT INTO `tabla_contactos` (`ID`,`Name`,`Dir`,`Reg_Date`,`Birthday`,`Cat`,`Tel_Casa`,`Tel_Mov`,`Email`) VALUES 
 (1,'Sebastián Andrés Sandí Vega','San José','23/2/2023','18/5/2005','Trabajo','1111-2222','2222-1111','sebasandi@gmail.com'),
 (2,'Samuel Andrey Lombardi Vega','Alajuela','16/3/2023','18/5/2003','Personal','9849-7842','8430-2945','sandbardv@gmail.com'),
 (111,'Johanna Georgina Soto Rodríguez','Cartago','19/3/2023','26/3/1967','Confidencial','2435-1246','8529-1208','ginielibre@gmail.com'),
 (121,'Brendan Ramirez Campos','Limón','21/3/2023','3/2/2005','Trabajo','2481-5246','8429-6135','brendan0309@gmail.com'),
 (123,'Caleb Barboza Soto','Alajuela','19/3/2023','19/5/2000','Compañero','4815-2619','8740-9804','calebbsoto@gmail.com'),
 (248,'Isaac Arce Espinoza','Guanacaste','19/3/2023','18/4/2004','Compañero','1212-8947','2487-5148','isaacarcepin@gmail.com');
/*!40000 ALTER TABLE `tabla_contactos` ENABLE KEYS */;


--
-- Definition of table `tabla_usuarios`
--

DROP TABLE IF EXISTS `tabla_usuarios`;
CREATE TABLE `tabla_usuarios` (
  `ID` varchar(15) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Reg_Date` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `User_Lvl` varchar(45) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY  (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabla_usuarios`
--

/*!40000 ALTER TABLE `tabla_usuarios` DISABLE KEYS */;
INSERT INTO `tabla_usuarios` (`ID`,`Name`,`Reg_Date`,`Email`,`User_Lvl`,`Username`,`Password`) VALUES 
 ('1-1248-2194','David Rivera Valladares','2/3/2023','daviksillo@gmail.com','Final','davik','nalparidillo'),
 ('1-1942-0927','Félix Barboza Soto','23/2/2023','felixsoto148@gmail.com','Administrador','Felix14','Ñoclitas'),
 ('1-1922-0824','Katherin Fernández Sanabria','27/2/2023','ikatief@gmail.com','Administrador','iKatief','rafitarico'),
 ('5-0264-0081','Mario Asdrubal Gomez Moraga','6/11/1970','mario.gomez.moraga@mep.go.cr','Administrador','root','root'),
 ('1-1935-0529','Sebastian sandi vega','27/2/2023','sebillas2@gmail.com','Operacional','sebitas','quieroquequillo');
/*!40000 ALTER TABLE `tabla_usuarios` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
