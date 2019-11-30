-- Query for announcements for a specific course, order by latest
SELECT * FROM announcement a WHERE a.course_id = ? ORDER BY a.date DESC;

-- Query the group name for a specific student
SELECT g.name FROM kimsquit.groups g WHERE g.group_id = ?;

-- Query for the grades in a specific course
SELECT grade FROM grade WHERE grade.course_id = ?;

-- Query all course_id's for a specific student
SELECT course_id 
FROM course c
NATURAL JOIN course_teacher
NATURAL JOIN student 
WHERE student_id = ?;

-- Query teacher name, address for a specific course
SELECT first_name, last_name, address
FROM teacher
NATURAL JOIN course_teacher
WHERE course_id = ?;
