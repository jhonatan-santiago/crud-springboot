Create database db_srpingboot_backend;

CREATE TABLE IF NOT EXISTS `db_srpingboot_backend`.`empleado` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `apellido` VARCHAR(255) NULL DEFAULT NULL,
  `direccion` VARCHAR(255) NULL DEFAULT NULL,
  `nombre` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = MyISAM
AUTO_INCREMENT = 62
DEFAULT CHARACTER SET = utf8mb4