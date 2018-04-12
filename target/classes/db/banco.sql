CREATE DATABASE `portalaluno` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `aluno` (
  `id_aluno` bigint(10) NOT NULL AUTO_INCREMENT,
  `nm_aluno` varchar(45) DEFAULT NULL,
  `cd_curso` varchar(45) DEFAULT NULL,
  `nu_matricula` int(11) DEFAULT NULL,
  `nu_semestre` int(11) DEFAULT NULL,
  `ds_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_aluno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `aluno` ADD CONSTRAINT `fk_aluno` FOREIGN KEY ( `cd_curso` ) REFERENCES `curso` ( `cd_curso` ) ;


CREATE TABLE `curso` (
  `id_curso` bigint(10) NOT NULL AUTO_INCREMENT,
  `cd_curso` varchar(45) DEFAULT NULL,
  `nm_curso` varchar(45) DEFAULT NULL,
  `nm_instituicao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_curso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

