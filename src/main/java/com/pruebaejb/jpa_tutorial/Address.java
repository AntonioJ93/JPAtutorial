/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaejb.jpa_tutorial;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author pryet
 */
@Embeddable
public class Address implements Serializable {

    private int e_pincode;
    private String e_city;
    private String e_state;

    public Address() {
    }

    public Address(int e_pincode, String e_city, String e_state) {
        this.e_pincode = e_pincode;
        this.e_city = e_city;
        this.e_state = e_state;
    }

    public int getE_pincode() {
        return e_pincode;
    }

    public void setE_pincode(int e_pincode) {
        this.e_pincode = e_pincode;
    }

    public String getE_city() {
        return e_city;
    }

    public void setE_city(String e_city) {
        this.e_city = e_city;
    }

    public String getE_state() {
        return e_state;
    }

    public void setE_state(String e_state) {
        this.e_state = e_state;
    }

    @Override
    public String toString() {
        return "\nAddress{" + "e_pincode=" + e_pincode + ", e_city=" + e_city + ", e_state=" + e_state + '}';
    }
    
    

}
