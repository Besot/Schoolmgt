package org.schoolmanagement.school.services;

import org.schoolmanagement.school.entities.Student;

public interface StudentServices {
    void promote (Student student);

    void expelStudent(Student student);
}
