/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rutuja
 */
public class VitalSign {
    public double respRate;
    public double heartRate;
    public double bloodPressure;
    public double wgtKg;
    public double wgtLbs; 
    public String ageGroup;
    public boolean status;
    public float age;
    public int ID;
    public String fullname;
    int idTemp = 1000;
    private Date time = new Date();

    public double getRespRate() {
        return respRate;
    }

    public void setRespRate(double respRate) {
        this.respRate = respRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWgtKg() {
        return wgtKg;
    }

    public void setWgtKg(double wgtKg) {
        this.wgtKg = wgtKg;
    }

    public double getWgtLbs() {
        return wgtLbs;
    }

    public void setWgtLbs(double wgtLbs) {
        this.wgtLbs = wgtLbs;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    public static VitalSign newVitalSign(){ //Method to create a new Vital Sign object
        VitalSign vs = new VitalSign();
        return vs;
    }
    
    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
    
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
        if (status == false){
                System.out.println("\nPatient is abnormal!");
            }
            else {
                System.out.println("\nPatient is normal!");
            }
    }
    
    public static void getDetails(VitalSign vs){ //Method called to set the User Input values to the variables in Vital Signs.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age : ");
        vs.setAge(scan.nextFloat());
        System.out.println("Enter respiratory rate : ");
        vs.setRespRate(scan.nextDouble());
        System.out.println("Enter heart rate : ");
        vs.setHeartRate(scan.nextDouble());
        System.out.println("Enter systolic blood pressure : ");
        vs.setBloodPressure(scan.nextDouble());
        System.out.println("Enter weight in kilo : ");
        vs.setWgtKg(scan.nextDouble());
        vs.setWgtLbs(vs.wgtKg * 2.20462);
        vs.setID(gen());
    }
    
    public void getAgeGroup(VitalSign vs){ //Checks the age value enterred by user and assigns the corresponding age group defined in the table
        if (vs.age == 0.1){
            vs.setAgeGroup("Newborn");
        }
        else if (vs.age > 0.1 && vs.age <= 1){
            vs.setAgeGroup("Infant");
        }
        else if (vs.age > 1 && vs.age <= 3){
            vs.setAgeGroup("Toddler");
        }
        else if (vs.age > 3 && vs.age <= 5){
            vs.setAgeGroup("Preschooler");
        }
        else if (vs.age > 5 && vs.age <= 12){
            vs.setAgeGroup("School Age");
        }
        else if (vs.age > 12){
            vs.setAgeGroup("Adolescent");
        }
    }
    
    @Override
    public String toString(){ //Set the format of the Time variable that records the time of the patient visit
        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy - hh:mm:ss");
        return dt.format(time);
    }
    
    
}
