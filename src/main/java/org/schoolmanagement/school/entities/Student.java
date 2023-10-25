package org.schoolmanagement.school.entities;

import org.schoolmanagement.school.entities.enumz.CurrentClass;




public class Student extends User {
    private String studentIdNo;
    private CurrentClass currentClass;
    private String dateEnrolled;
    private int timesSuspended;






    public int getTimesSuspended() {
        return timesSuspended;
    }

    public void setTimesSuspended(int timesSuspended) {
        this.timesSuspended = timesSuspended;
    }

    public String getStudentIdNo() {
        return studentIdNo;
    }

    public void setStudentIdNo(String studentIdNo) {
        this.studentIdNo = studentIdNo;
    }

    public CurrentClass getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(CurrentClass currentClass) {
        this.currentClass = currentClass;
    }

    public String getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

}
