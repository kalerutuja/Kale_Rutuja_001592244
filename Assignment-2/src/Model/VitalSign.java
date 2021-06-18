/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rutuja
 */
public class VitalSign {
    private float respRate;
    private float heartRate;
    private float bp;
    private String time;
    
    Date date = new Date();

    public float getRespRate() {
        return respRate;
    }

    public void setRespRate(float respRate) {
        this.respRate = respRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getBp() {
        return bp;
    }

    public void setBp(float bp) {
        this.bp = bp;
    }
    
    public Date getTime() {
        return new java.sql.Timestamp(date.getTime());
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public String toString()    {
        return String.valueOf(getTime());
    }
}
