use university_db;
DROP TABLE IF EXISTS EngineeringStudents;

CREATE TABLE EngineeringStudents(
    student_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Department VARCHAR(30),
    first_name VARCHAR(50),
    last_name VARCHAR(70),
    Pass_out_year INT NOT NULL,
    University_rank INT NOT NULL,
    PRIMARY KEY(Student_ID)
);

INSERT INTO EngineeringStudents VALUES(101, 'CSE','Jai','Kiran',2019,1200);
INSERT INTO EngineeringStudents VALUES(102, 'ESE','Kay','Hiran',2016,1100);
INSERT INTO EngineeringStudents VALUES(103, 'CSE','Lay','McNeal',2016,900);
INSERT INTO EngineeringStudents VALUES(104, 'CIVIL','May','Kapoor',2015,600);
INSERT INTO EngineeringStudents VALUES(105, 'MECH','Grau','Khan',2019,2000);