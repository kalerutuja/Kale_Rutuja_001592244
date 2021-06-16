/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author rutuja
 */
public class Patient {
    
    public String patientName;
    public String patientID;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    private Date patientntime = new Date();

    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    } 
    
    public static Patient newPatient(){ //Method to create a new Vital Sign object
        Patient ptn = new Patient();
        return ptn;
    }
    
    public Boolean isPatientnormal(VitalsSign vs){
        
    }
    
}
