INSERT INTO course (course_name) VALUES ('Mathematics');
INSERT INTO course (course_name) VALUES ('Physics');
INSERT INTO course (course_name) VALUES ('Biology');
INSERT INTO course (course_name) VALUES ('History');
INSERT INTO course (course_name) VALUES ('Computer Science');

INSERT INTO student (student_name, student_email, student_phone) VALUES ('John Doe', 'john.doe@example.com', '+123456789');
INSERT INTO student (student_name, student_email, student_phone) VALUES ('Jane Smith', 'jane.smith@example.com', '+987654321');
INSERT INTO student (student_name, student_email, student_phone) VALUES ('Alice Johnson', 'alice.johnson@example.com', '+111222333');
INSERT INTO student (student_name, student_email, student_phone) VALUES ('Bob Brown', 'bob.brown@example.com', '+444555666');
INSERT INTO student (student_name, student_email, student_phone) VALUES ('Emily Davis', 'emily.davis@example.com', '+777888999');

-- Asociar el estudiante con ID 1 al curso con ID 1
INSERT INTO student_course (student_id, course_id) VALUES (1, 1);

-- Asociar el estudiante con ID 2 al curso con ID 1
INSERT INTO student_course (student_id, course_id) VALUES (2, 1);

-- Asociar el estudiante con ID 2 al curso con ID 2
INSERT INTO student_course (student_id, course_id) VALUES (2, 2);

-- Asociar el estudiante con ID 3 al curso con ID 3
INSERT INTO student_course (student_id, course_id) VALUES (3, 3);

-- Asociar el estudiante con ID 4 al curso con ID 1
INSERT INTO student_course (student_id, course_id) VALUES (4, 1);

-- Asociar el estudiante con ID 4 al curso con ID 2
INSERT INTO student_course (student_id, course_id) VALUES (4, 2);

-- Asociar el estudiante con ID 4 al curso con ID 3
INSERT INTO student_course (student_id, course_id) VALUES (4, 3);

-- Asociar el estudiante con ID 5 al curso con ID 4
INSERT INTO student_course (student_id, course_id) VALUES (5, 4);
