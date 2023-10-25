package org.schoolmanagement;

import org.schoolmanagement.school.entities.Applicant;
import org.schoolmanagement.school.entities.Staff;
import org.schoolmanagement.school.entities.Student;
import org.schoolmanagement.school.serviceImpli.ApplicantServicesImpli;
import org.schoolmanagement.school.serviceImpli.StaffServiceImplementation;
import org.schoolmanagement.school.serviceImpli.StudentServicesImpli;

public class Main {
    public static void main(String[] args) {
        StaffServiceImplementation teach1 = new StaffServiceImplementation();
        Staff staff1 =new Staff();
        teach1.teachCourse(staff1);

        System.out.println();

        ApplicantServicesImpli ad = new ApplicantServicesImpli();
        Applicant a = new Applicant();
        ad.admitStudent(a);

        System.out.println();

        System.out.println();
        StudentServicesImpli exp = new StudentServicesImpli();
        Student ss = new Student();
        exp.expelStudent(ss );
        System.out.println();

        exp.promote(ss);

    }
}