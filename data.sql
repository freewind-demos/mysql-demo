DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(40) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `books` WRITE;

INSERT INTO `books` (`id`, `title`, `description`)
VALUES
	(1,'Java编程思想','学习Java的一本好书'),
	(2,'JavaScript语言精粹','学习javaScript的一本好书');

UNLOCK TABLES;
