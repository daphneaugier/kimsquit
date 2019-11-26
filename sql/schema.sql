CREATE TABLE  IF NOT EXISTS `course` (
  `course_id` varchar(6) NOT NULL,
  `course_name` varchar(30) NOT NULL,
  `course_description` varchar(255),
  PRIMARY KEY (`course_id`)
);

CREATE TABLE IF NOT EXISTS `groups` (
  `group_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`group_id`),
  FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`)
);

CREATE TABLE IF NOT EXISTS `teacher` (
  `teacher_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `address` varchar(255),
  PRIMARY KEY (`teacher_id`)
);

CREATE TABLE IF NOT EXISTS `student` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `address` varchar(255),
  `group_id` int NOT NULL,
  PRIMARY KEY (`student_id`),
  FOREIGN KEY (`group_id`) REFERENCES `groups` (`group_id`)
);

CREATE TABLE IF NOT EXISTS `course_teacher` (
  `course_id` varchar(6) NOT NULL,
  `teacher_id` int NOT NULL,
  `group_id` int NOT NULL,
  FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`),
  FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`teacher_id`),
  FOREIGN KEY (`group_id`) REFERENCES `groups` (`group_id`)
);

CREATE TABLE IF NOT EXISTS `grade` (
  `course_id` varchar(6) NOT NULL,
  `student_id` int NOT NULL,
  `grade` int,
  FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`),
  FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
);

CREATE TABLE IF NOT EXISTS `announcement` (
  `announcement_id` int NOT NULL AUTO_INCREMENT,
  `course_id` varchar(6) NOT NULL,
  `announcement` varchar(500),
  `date` DATETIME,
  PRIMARY KEY (`announcement_id`),
  FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`)
);