package org.schoolmanagement.school.entities;

import java.time.LocalDate;

public class Applicant extends User {
    private String applicationDate;


    //getters and setters
    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }
}
