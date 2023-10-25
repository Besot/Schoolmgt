package org.schoolmanagement.school.serviceImpli;

import org.junit.jupiter.api.Test;
import org.schoolmanagement.school.entities.Staff;
import org.schoolmanagement.school.entities.Student;

import static org.junit.jupiter.api.Assertions.*;

class ServiceImplementationTest {
    @Test
    public void giveAdmission(){

        StaffServiceImplementation admit = new StaffServiceImplementation();
    }

    @Test
    public void expelStudent() {
        Student student1 = new Student();
        student1.setTimesSuspended(4);

        if (student1.getTimesSuspended() >= 3) {
            System.out.println("You have been EXPELLED!");
        } else {
            System.out.println("You will be expelled at the 3rd suspension");

assertTrue(student1.getTimesSuspended()>=3, "You have been EXPELLED!");

        }


    }
}