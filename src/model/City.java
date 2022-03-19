/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author keerthikeerthi
 */
public class City {
    
    private String city_Name;
    
    private String Country;
    
    private String state;

    public String getCityName() {
        return city_Name;
    }

    public void setCityName(String cityName) {
        this.city_Name = cityName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }        
    
}
