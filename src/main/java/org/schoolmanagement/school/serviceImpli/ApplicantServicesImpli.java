package org.schoolmanagement.school.serviceImpli;

import org.schoolmanagement.school.entities.Applicant;
import org.schoolmanagement.school.entities.enumz.Gender;
import org.schoolmanagement.school.services.ApplicantServices;

import java.util.ArrayList;

public class ApplicantServicesImpli implements ApplicantServices {
    @Override
    public void admitStudent(Applicant applicant) {
        //Setting applicants information
        applicant.setName("Adeshola Ayantoye");
        applicant.setAge(13);
        applicant.setGender(Gender.Female);
        applicant.setAddress("Imperial Oak Estate Lekki");
        applicant.setApplicationDate("23/10/2023");
        applicant.setScore(35);

        //An Arraylist of the inputted applicant info
        ArrayList<String> app = new ArrayList<>();
        app.add("Name: "+applicant.getName());
        app.add("Age: "+applicant.getAge());
        app.add("Gender: "+applicant.getGender());
        app.add("Address: "+applicant.getAddress());
        app.add("Application Date: "+applicant.getApplicationDate());
        app.add("Score: "+applicant.getScore());

        // for each loop to loop through the arraylist of applicant info
        for (String admit : app){
            System.out.println(admit);
        }
        // A Ternary operator to determine admission status based on minimum cut off mark of 60
        boolean admissionTerm = applicant.getScore()>= 60;
        String admissionStatus = admissionTerm? applicant.getScore()+" You have been offered ADMISSION": "You didn't meet the CUT-OFF MARK!";

        System.out.println(admissionStatus);






    }
}
