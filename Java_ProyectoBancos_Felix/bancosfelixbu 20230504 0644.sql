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
-- Create schema bancosfelix
--

CREATE DATABASE IF NOT EXISTS bancosfelix;
USE bancosfelix;

--
-- Definition of table `bitacora`
--

DROP TABLE IF EXISTS `bitacora`;
CREATE TABLE `bitacora` (
  `NumMov` int(10) unsigned NOT NULL auto_increment,
  `FechaMov` date NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Cambio` varchar(45) NOT NULL,
  PRIMARY KEY  (`NumMov`),
  KEY `UsernameC` (`Username`),
  CONSTRAINT `UsernameC` FOREIGN KEY (`Username`) REFERENCES `users` (`Username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bitacora`
--

/*!40000 ALTER TABLE `bitacora` DISABLE KEYS */;
INSERT INTO `bitacora` (`NumMov`,`FechaMov`,`Username`,`Cambio`) VALUES 
 (1,'2023-05-17','root','El usuario root inició sesión.'),
 (2,'2023-05-17','root','El usuario root cerró sesión.'),
 (3,'2023-05-17','root','El usuario root inició sesión.');
/*!40000 ALTER TABLE `bitacora` ENABLE KEYS */;


--
-- Definition of table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `ID` int(10) unsigned NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Tel` varchar(45) NOT NULL,
  `Dir` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `FechaReg` date NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clientes`
--

/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`ID`,`Name`,`Tel`,`Dir`,`Email`,`FechaReg`) VALUES 
 (1,'Félix Barboza Soto','8430-2928','San José, Moravia','felixsoto148@gmail.com','2023-05-01'),
 (2,'Brendan Ramirez Campos','4891-5284','La León XIII','brendancampos0309@gmail.com','2023-04-30'),
 (3,'Johanna Georgina Soto Rodríguez','8529-1208','San José, Moravia','ginielibre38@gmail.com','2023-05-07'),
 (4,'David Rivera Valladares','8529-9467','Los Sitios','typhoid1@gmail.com','2023-05-04'),
 (185,'Sebastián Andrés Sandí Vega','4929-8947','Montes de Oca','sepsicillorico@gmail.com','2023-05-04');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;


--
-- Definition of table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
CREATE TABLE `cuentas` (
  `Numero` int(10) unsigned NOT NULL auto_increment,
  `FechaAp` date NOT NULL,
  `TCuenta` varchar(45) NOT NULL,
  `TMoneda` varchar(45) NOT NULL,
  `Saldo` varchar(45) NOT NULL,
  `ID` int(10) unsigned NOT NULL,
  `MontoAp` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL,
  PRIMARY KEY  (`Numero`),
  KEY `ID` (`ID`),
  CONSTRAINT `ID` FOREIGN KEY (`ID`) REFERENCES `clientes` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cuentas`
--

/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
INSERT INTO `cuentas` (`Numero`,`FechaAp`,`TCuenta`,`TMoneda`,`Saldo`,`ID`,`MontoAp`,`Estado`) VALUES 
 (4,'2023-05-01','Corriente','Dólares','350',1,'300','Activa'),
 (6,'2023-05-04','Ahorro','Dólares','130',2,'130','Inactiva'),
 (7,'2023-05-04','Corriente','Dólares','250',1,'250','Inactiva'),
 (9,'2023-05-07','Corriente','Colones','1000000',3,'1000000','Activa');
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;


--
-- Definition of table `funciones`
--

DROP TABLE IF EXISTS `funciones`;
CREATE TABLE `funciones` (
  `CodeFun` varchar(20) NOT NULL,
  `NameFun` varchar(45) NOT NULL,
  PRIMARY KEY  (`CodeFun`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `funciones`
--

/*!40000 ALTER TABLE `funciones` DISABLE KEYS */;
INSERT INTO `funciones` (`CodeFun`,`NameFun`) VALUES 
 ('01','Registrar Clientes'),
 ('02','Consultar Clientes'),
 ('03','Actualizar Clientes'),
 ('04','Registrar Cuentas'),
 ('05','Consultar Cuentas'),
 ('06','Activación de Cuentas'),
 ('07','Eliminar Cuentas'),
 ('08','Registrar Transacción'),
 ('09','Anular Transacción'),
 ('10','Consultar Transacción'),
 ('11','Registrar Niveles'),
 ('12','Registrar Funciones'),
 ('13','Registrar Permisos'),
 ('14','Registrar Usuarios'),
 ('15','Consultar Usuarios'),
 ('16','Modificar Usuarios'),
 ('17','Activar Usuarios'),
 ('18','Reportes Clientes'),
 ('19','Reportes Cuentas'),
 ('20','Reportes Transacciones'),
 ('21','Reportes Usuarios'),
 ('22','Reportes Bitácora');
/*!40000 ALTER TABLE `funciones` ENABLE KEYS */;


--
-- Definition of table `funporniv`
--

DROP TABLE IF EXISTS `funporniv`;
CREATE TABLE `funporniv` (
  `CodNivCodFun` varchar(20) NOT NULL,
  `CodNiv` varchar(45) NOT NULL,
  `CodFun` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL,
  PRIMARY KEY  (`CodNivCodFun`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `funporniv`
--

/*!40000 ALTER TABLE `funporniv` DISABLE KEYS */;
INSERT INTO `funporniv` (`CodNivCodFun`,`CodNiv`,`CodFun`,`Estado`) VALUES 
 ('0001','00','01','Permitido');
/*!40000 ALTER TABLE `funporniv` ENABLE KEYS */;


--
-- Definition of table `moves`
--

DROP TABLE IF EXISTS `moves`;
CREATE TABLE `moves` (
  `NumeroC` int(10) unsigned NOT NULL,
  `FechaMov` date NOT NULL,
  `TipoMov` varchar(45) NOT NULL,
  `MontoMov` varchar(45) NOT NULL,
  `NombreResp` varchar(45) NOT NULL,
  `Detalle` varchar(45) NOT NULL,
  `NumeroMov` int(10) unsigned NOT NULL auto_increment,
  PRIMARY KEY  (`NumeroMov`),
  KEY `NumC` (`NumeroC`),
  CONSTRAINT `NumC` FOREIGN KEY (`NumeroC`) REFERENCES `cuentas` (`Numero`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `moves`
--

/*!40000 ALTER TABLE `moves` DISABLE KEYS */;
INSERT INTO `moves` (`NumeroC`,`FechaMov`,`TipoMov`,`MontoMov`,`NombreResp`,`Detalle`,`NumeroMov`) VALUES 
 (9,'2023-05-07','Depósito','250000','Félix Barboza Soto','Regalo',11),
 (9,'2023-05-07','Retiro','250000','Johanna Georgina Soto Rodríguez','Máquina de Coser',12),
 (4,'2023-05-13','Depósito','50','Félix Barboza Soto','Regalito',14);
/*!40000 ALTER TABLE `moves` ENABLE KEYS */;


--
-- Definition of table `niveles`
--

DROP TABLE IF EXISTS `niveles`;
CREATE TABLE `niveles` (
  `CodeNiv` varchar(20) NOT NULL,
  `NameNiv` varchar(45) NOT NULL,
  PRIMARY KEY  (`CodeNiv`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `niveles`
--

/*!40000 ALTER TABLE `niveles` DISABLE KEYS */;
INSERT INTO `niveles` (`CodeNiv`,`NameNiv`) VALUES 
 ('00','Administrador');
/*!40000 ALTER TABLE `niveles` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `Username` varchar(16) NOT NULL,
  `Password` varchar(16) NOT NULL,
  `CodeNiv` varchar(20) NOT NULL,
  `ID` int(10) unsigned NOT NULL,
  `Estado` varchar(45) NOT NULL,
  `Fullname` varchar(45) NOT NULL,
  PRIMARY KEY  (`Username`),
  KEY `CodiNiv` (`CodeNiv`),
  CONSTRAINT `FK_CodNiv` FOREIGN KEY (`CodeNiv`) REFERENCES `niveles` (`CodeNiv`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`Username`,`Password`,`CodeNiv`,`ID`,`Estado`,`Fullname`) VALUES 
 ('Felix','Squash14','00',14,'Inactivo','Félix Rodrigo Barboza Soto'),
 ('root','root','00',1,'Activo','Mario Ásdrubal Gómez Moraga');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
