package org.schoolmanagement.school.entities;

import org.schoolmanagement.school.entities.enumz.Gender;
import org.schoolmanagement.school.entities.enumz.Role;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;
    // A class for staff details with enums to identify each role
    // e.g Principal, Teacher, non-academic staff
public class Staff extends User {
    private  String staffId;
    private Role role;
    private String qualification;
    private BigDecimal salary;

    //A method to store staff information
    public  void staffDetail() {

                this.setName("Olamide Besot");
                this.setRole(Role.Teacher);
                this.setStaffId("32443TE");
                this.setGender(Gender.Male);
                this.setPhoneNo(234_830_229_749L);
                this.setNextOfKin("Adewale Nelson");
                this.setQualification("B.Edu");
                this.setCourseName("Mathematics");

        //An Arraylist of staff information
                ArrayList<String> details = new ArrayList();
                details.add("Name: "+getName());
                details.add("StaffIdNo: "+getStaffId());
                details.add("Role: "+getRole());
                details.add("Gender: "+getGender());
                details.add("Qualification: "+getQualification());




        // A for each loop to loop through the stored staff information
                for ( String d : details){
                    System.out.println(d);
                }
        System.out.println();

         // A Ternary  operator to  determine what the staff does based on the inputted role enum
                boolean condition = Objects.equals(role, Role.Teacher);
                boolean condition2 = Objects.equals(role, Role.Principal);
                String teach = condition ? getName() + " teaches "+getCourseName(): (condition2 ? getName() + " is the Principal" : getName() + " is a Non-academic STAFF");
                System.out.println(teach);

        }
        // Generated getters and setters to access the private fields in the staff class  when needed in other classes
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Staff{" +getQualification()+
                "staffId='" + staffId + '\'' +
                ", role=" + role +
                ", qualification='" + qualification + '\'' +
                ", salary=" + salary +
                '}';
    }
}
