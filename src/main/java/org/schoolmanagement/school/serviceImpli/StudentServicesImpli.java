package org.schoolmanagement.school.serviceImpli;

import org.schoolmanagement.school.entities.Student;
import org.schoolmanagement.school.entities.enumz.CurrentClass;
import org.schoolmanagement.school.services.StudentServices;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentServicesImpli implements StudentServices {
    @Override
    public void promote(Student student) {
        //setting student info
        Student stud = new Student();
        stud.setName("Bukey Casey");
        stud.setAge(14);
        stud.setStudentIdNo("AB_1002");
        stud.setCurrentClass(CurrentClass.JSS_3);
        stud.setDateEnrolled("12/10/2021");
        stud.setScore(76);

        ArrayList<String> studentBio = new ArrayList();
        studentBio.add("Name: "+stud.getName());
        studentBio.add("Age: "+stud.getAge());
        studentBio.add("Student Id No: "+stud.getStudentIdNo());
        studentBio.add("Class: "+stud.getCurrentClass());
        studentBio.add("Date Admitted: "+stud.getDateEnrolled());
        studentBio.add("Exam Score: "+stud.getScore());

        Iterator loopThrough = studentBio.iterator();
        while (loopThrough.hasNext()){
            System.out.println(loopThrough.next());
        }





        boolean con = stud.getScore() >=60;
        String promo = con? "Congratulations, you have been PROMOTED!":"Due to poor performance, you will have to REPEAT";
        System.out.println(promo);
    }



    @Override
    public void expelStudent(Student student) {
        //setting student info
        Student student1 = new Student();
        student1.setName("Bukey Casey");
        student1.setAge(14);
        student1.setStudentIdNo("Jss3_AB");
        student1.setCurrentClass(CurrentClass.JSS_3);
        student1.setDateEnrolled("12/10/2021");
        student1.setTimesSuspended(4);

        // if statement to determine student expulsion status based on the No. of time suspended
        if (student1.getTimesSuspended()>= 3){
            System.out.println(student1.getName()+" ID No: "+student1.getStudentIdNo()+ ", You have been EXPELLED! Due to suspension more than "+student1.getTimesSuspended()+" times.");
        }else {
            System.out.println("You will be expelled at the 3rd suspension");

        }

    }
}
