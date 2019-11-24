CREATE TABLE `course` (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `course_name` varchar(30) NOT NULL,
  `course_description` varchar(255),
  PRIMARY KEY (`course_id`)
);

CREATE TABLE `student` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `address` varchar(255),
  `group_id` int NOT NULL,
  PRIMARY KEY (`student_id`),
  FOREIGN KEY (`group_id`) REFERENCES `groups` (`group_id`)
);

CREATE TABLE `teacher` (
  `teacher_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `address` varchar(255),
  PRIMARY KEY (`teacher_id`)
);

CREATE TABLE `groups` (
  `group_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`group_id`)
);

CREATE TABLE `course_teacher` (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `teacher_id` int NOT NULL,
  `group_id` int NOT NULL,
  FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`),
  FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`teacher_id`),
  FOREIGN KEY (`group_id`) REFERENCES `groups` (`group_id`), 
);

CREATE TABLE `grade` (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `grade` int,
  FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`),
  FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
);