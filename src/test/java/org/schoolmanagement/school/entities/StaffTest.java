package org.schoolmanagement.school.entities;

import org.junit.jupiter.api.Test;
import org.schoolmanagement.school.entities.enumz.CurrentClass;
import org.schoolmanagement.school.entities.enumz.Gender;
import org.schoolmanagement.school.entities.enumz.Role;

import java.math.BigDecimal;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void staffDetail() {
        Staff s = new Staff();
        s.setStaffId("3432");
        s.setRole(Role.Teacher);
        s.setName("Uzo");
        s.setQualification("B.Edu");
        s.setAge(34);
        s.setGender(Gender.Female);
        s.setSalary(BigDecimal.valueOf(300000));
        Student stu = new Student();

        stu.setCurrentClass(CurrentClass.SS_1);
        assertEquals(CurrentClass.SS_1, stu.getCurrentClass()
        );

        assertEquals("3432", s.getStaffId());
        assertEquals(Role.Teacher, s.getRole());
        assertEquals("Uzo", s.getName());
        assertEquals("B.Edu", s.getQualification());
        assertEquals(Gender.Female, s.getGender());
        assertEquals(34, s.getAge());
        assertEquals(BigDecimal.valueOf(300000), s.getSalary());


    }
}