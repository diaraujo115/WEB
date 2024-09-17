Drop database `Login`;
Use `Login`;
CREATE SCHEMA IF NOT EXISTS `Login` DEFAULT CHARACTER SET utf8; 
CREATE TABLE IF NOT EXISTS `Login`.`tb_login` (
`id` INT NOT NULL AUTO_INCREMENT,
`nome` VARCHAR(50) NOT NULL,
`email` VARCHAR(50) NOT NULL,
`senha` VARCHAR(8) NOT NULL,
PRIMARY KEY (`id`))
ENGINE = InnoDB;
select * from tb_login;