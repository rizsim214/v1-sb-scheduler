package com.scheduler.sbclinic.models;

public class Covid {
    private Data data;
    private String last_update;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public String getLast_update() {
        return last_update;
    }
    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}

class Data {

    private int total, deaths, recoveries,active_cases;
    private String fatality_rate, recovery_rate;
    
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getRecoveries() {
        return recoveries;
    }
    public void setRecoveries(int recoveries) {
        this.recoveries = recoveries;
    }
    public int getDeaths() {
        return deaths;
    }
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
    public int getActive_cases() {
        return active_cases;
    }
    public void setActive_cases(int active_cases) {
        this.active_cases = active_cases;
    }
    public String getFatality_rate() {
        return fatality_rate;
    }
    public void setFatality_rate(String fatality_rate) {
        this.fatality_rate = fatality_rate;
    }
    public String getRecovery_rate() {
        return recovery_rate;
    }
    public void setRecovery_rate(String recovery_rate) {
        this.recovery_rate = recovery_rate;
    }
  
    
    
}