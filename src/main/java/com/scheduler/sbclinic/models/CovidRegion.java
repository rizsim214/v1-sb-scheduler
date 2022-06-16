package com.scheduler.sbclinic.models;

import java.util.ArrayList;

public class CovidRegion {
    ArrayList<CovidRegions> data;
    private String last_update;

    public String getLast_update() {
        return last_update;
    }
    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
    public ArrayList<CovidRegions> getData() {
        return data;
    }
    public void setData(ArrayList<CovidRegions> data) {
        this.data = data;
    }
    
}

class CovidRegions {
    private String region;
    private int cases, recovered,deaths ; 

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public int getCases() {
        return cases;
    }
    public void setCases(int cases) {
        this.cases = cases;
    }
    public int getDeaths() {
        return deaths;
    }
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
    public int getRecovered() {
        return recovered;
    }
    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    
}
