CREATE DATABASE pelicula;
use pelicula;
CREATE TABLE `peliculas` (  
`id` int(12) NOT NULL AUTO_INCREMENT,  
`peli` varchar(60) NOT NULL,  
PRIMARY KEY (`id`)) 
ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
INSERT INTO `peliculas` VALUES (1,'Seven'),(2,'Bastardos sin gloria'),(3,'Django'),(4,'El renacido'),(5,'Joker');
CREATE TABLE `datos` (  
`id` int(12) NOT NULL AUTO_INCREMENT,  
`nombre` varchar(50) NOT NULL,  
`costo` varchar(50) NOT NULL, 
`fecha` varchar(50) NOT NULL, 
`sala` varchar(10) NOT NULL,  
`capacidad` varchar(80) DEFAULT NULL,  
`peliculas_id` int(15) NOT NULL,  
PRIMARY KEY (`id`,`peliculas_id`),  
KEY `fk_datos_peliculas_idx` (`peliculas_id`),  
CONSTRAINT `fk_datos_peliculas` FOREIGN KEY (`peliculas_id`) REFERENCES `peliculas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;
INSERT INTO `datos` VALUES (1,'Carlos','5000','12 de marzo','Sala-A','80 personas',1);
INSERT INTO `datos` VALUES (2,'Martha','6000','13 de marzo','Sala-C','50 personas',3);
INSERT INTO `datos` VALUES (3,'Juan','3000','14 de marzo','Sala-B','30 personas',2);