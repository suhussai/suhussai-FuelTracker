package com.example.suhussai.as1;

import java.util.Date;

/**
 * Created by suhussai on 25/01/16.
 */
public class FuelUsageEntry extends Entry {
    private String station, fuelGrade;
    private float odometerReading, fuelAmount, fuelUnitCost, fuelCost;

    @Override
    public int getMessageID() {
        return messageID;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getFuelGrade() {
        return fuelGrade;
    }

    public void setFuelGrade(String fuelGrade) {
        this.fuelGrade = fuelGrade;
    }

    public float getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(float odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(float fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public float getFuelUnitCost() {
        return fuelUnitCost;
    }

    public void setFuelUnitCost(float fuelUnitCost) {
        this.fuelUnitCost = fuelUnitCost;
    }

    public float getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(float fuelCost) {
        this.fuelCost = fuelCost;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return "Date: "+ date.toString() + " \n" +
                "Station: "+ station + " \n" +
                "Odometer Reading: "+ Float.toString(odometerReading) + " \n" +
                "Fuel Grade: "+ fuelGrade + " \n" +
                "Fuel Amount: "+ Float.toString(fuelAmount) + " \n" +
                "Fuel Unit Cost: "+ Float.toString(fuelUnitCost) + " \n" +
                "Fuel Cost: "+ Float.toString(fuelCost) + " \n";
    }

}