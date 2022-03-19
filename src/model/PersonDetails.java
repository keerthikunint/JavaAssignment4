/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package model;

import java.util.Date;

/**
 *
 * @author keerthikeerthi
 */
public class PersonDetails extends HouseDetails {
    private String person_name;
    private int age;
    private PatientDetails patient;
    private Date dob;   
    private String email;    
    private String phoneNo;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    
    
    public String getPersonName() {
        return person_name;
    }
    
    public void setPersonName(String personName) {
        this.person_name = personName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public PatientDetails getPatient() {
        return patient;
    }
    
    public void setPatient(PatientDetails patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString()
    {
        return this.person_name;
    }
}
