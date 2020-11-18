CREATE DATABASE userinfo DEFAULT CHARACTER SET utf8;
use userinfo;
CREATE TABLE `student` (
  `id` int(64) NOT NULL  AUTO_INCREMENT,
  `name` varchar(255) default NULL,
  `sex` varchar(255) default NULL,
  `grade_id` int(64) default NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
