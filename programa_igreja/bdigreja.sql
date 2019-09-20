-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 20-Set-2019 às 03:16
-- Versão do servidor: 5.7.26
-- versão do PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdigreja`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbemprestados`
--

DROP TABLE IF EXISTS `tbemprestados`;
CREATE TABLE IF NOT EXISTS `tbemprestados` (
  `idEmp` int(8) NOT NULL AUTO_INCREMENT,
  `idEmpEmpre` int(8) NOT NULL,
  `idEmpObj` int(8) NOT NULL,
  PRIMARY KEY (`idEmp`),
  KEY `idEmpEmpre` (`idEmpEmpre`),
  KEY `idEmpObj` (`idEmpObj`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbemprestimo`
--

DROP TABLE IF EXISTS `tbemprestimo`;
CREATE TABLE IF NOT EXISTS `tbemprestimo` (
  `idEmpre` int(8) NOT NULL AUTO_INCREMENT,
  `dataRetiEmpre` datetime DEFAULT NULL,
  `dataDevoEmpre` datetime DEFAULT NULL,
  `idEmpreUsu` int(8) DEFAULT NULL,
  PRIMARY KEY (`idEmpre`),
  KEY `idEmpreUsu` (`idEmpreUsu`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbigreja`
--

DROP TABLE IF EXISTS `tbigreja`;
CREATE TABLE IF NOT EXISTS `tbigreja` (
  `idIgre` int(8) NOT NULL AUTO_INCREMENT,
  `nomeIgre` varchar(50) DEFAULT NULL,
  `telefoneIgre` varchar(15) DEFAULT NULL,
  `ruaIgre` varchar(50) DEFAULT NULL,
  `numeroIgre` int(8) DEFAULT NULL,
  `bairroIgre` varchar(50) DEFAULT NULL,
  `cidadeIgre` varchar(50) DEFAULT NULL,
  `cepIgre` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`idIgre`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbigreja`
--

INSERT INTO `tbigreja` (`idIgre`, `nomeIgre`, `telefoneIgre`, `ruaIgre`, `numeroIgre`, `bairroIgre`, `cidadeIgre`, `cepIgre`) VALUES
(1, 'teste', 'teste', 'teste', 1, 'teste', 'teste', 'teste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbobjetos`
--

DROP TABLE IF EXISTS `tbobjetos`;
CREATE TABLE IF NOT EXISTS `tbobjetos` (
  `idObj` int(8) NOT NULL AUTO_INCREMENT,
  `nomeObj` varchar(50) DEFAULT NULL,
  `descricaoObj` varchar(50) DEFAULT NULL,
  `idObjIgre` int(8) DEFAULT NULL,
  `statusObj` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idObj`),
  KEY `idObjIgre` (`idObjIgre`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

DROP TABLE IF EXISTS `tbusuario`;
CREATE TABLE IF NOT EXISTS `tbusuario` (
  `idUsu` int(8) NOT NULL AUTO_INCREMENT,
  `nomeUsu` varchar(50) DEFAULT NULL,
  `loginUsu` varchar(50) DEFAULT NULL,
  `senhaUsu` varchar(50) DEFAULT NULL,
  `idIgreUsu` int(8) DEFAULT NULL,
  PRIMARY KEY (`idUsu`),
  KEY `idIgreUsu` (`idIgreUsu`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbusuario`
--

INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `loginUsu`, `senhaUsu`, `idIgreUsu`) VALUES
(1, 'William Colla', 'william', '1234', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
