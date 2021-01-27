use university_db;

CREATE TABLE EngineeringStudents(
    student_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Department VARCHAR(30),
    first_name VARCHAR(50),
    last_name VARCHAR(70),
    Pass_out_ear INT NOT NULL,
    University_rank INT NOT NULL,
    PRIMARY KEY(Student_ID)
);
