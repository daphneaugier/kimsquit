-- Query for announcements for a specific course, order by latest
SELECT announcement FROM announcement WHERE announcement.course_id = course.course_id ORDER BY DATETIME DESC;

-- Query the group name for a specific student
SELECT name FROM groups WHERE groups.groups_id = student.group_id;

-- Query for the grades in a specific course
SELECT grade FROM grade WHERE grade.course_id = course.course_id;

-- Query all course_id's for a specific student
SELECT course_id FROM course WHERE course.student_id = student.student_id;

-- Query teacher name, address for a specific course
SELECT first_name, last_name, address FROM teacher WHERE teacher.teacher_id = course_teacher.teacher_id;
