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
    
    private String pName;
    private int pID;
    private int AgeGroup;
    private String docName;
    private String pharmacy;
    
    VitalSignHistory vitalSignHistory = new VitalSignHistory();

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }
    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public int getAgeGroup() {
        return AgeGroup;
    }

    public void setAgeGroup(int AgeGroup) {
        this.AgeGroup = AgeGroup;
    }
    
    
    @Override
    public String toString()    {
        return getpName();
    }
}

    
    



