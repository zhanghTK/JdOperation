CREATE TABLE `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO User.person (address, age, name) VALUES ('GZ', 32, '张一');
INSERT INTO User.person (address, age, name) VALUES ('GZ', 32, '张二');
INSERT INTO User.person (address, age, name) VALUES ('GZ', 32, '张三');
INSERT INTO User.person (address, age, name) VALUES ('GZ', 32, '张四');
INSERT INTO User.person (address, age, name) VALUES ('GZ', 32, '张五');