package com.scheduler.sbclinic.external_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import com.scheduler.sbclinic.models.Covid;
import com.scheduler.sbclinic.models.CovidRegion;

public class CovidCases extends ActionSupport{
    
    private Covid covidCases;
    private CovidRegion covidRegion;

    public String execute() throws Exception {
        try {
            URL url = new URL("https://covid19-api-philippines.herokuapp.com/api/summary");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            if(conn.getResponseCode() != 200){
                throw new RuntimeException("FAILED TO CONNECT: HTTP ERROR CODE - " + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader( new InputStreamReader(conn.getInputStream()));
            String output;
            while((output = br.readLine()) != null){
                ObjectMapper mapper = new ObjectMapper();
                setCovidCases(mapper.readValue(output, Covid.class));
            }
            conn.disconnect();

            URL url2 = new URL("https://covid19-api-philippines.herokuapp.com/api/top-regions");
            HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
            conn2.setRequestMethod("GET");
            if(conn2.getResponseCode() != 200){
                throw new RuntimeException("FAILED TO CONNECT: HTTP ERROR CODE - " + conn2.getResponseCode());
            }
            BufferedReader br2 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
            String output2;
            while((output2 = br2.readLine()) != null){
                ObjectMapper mapper2 = new ObjectMapper();
                setCovidRegion(mapper2.readValue(output2, CovidRegion.class));
            }
            
            conn2.disconnect();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public Covid getCovidCases() {
        return covidCases;
    }

    public void setCovidCases(Covid covidCases) {
        this.covidCases = covidCases;
    }

    public CovidRegion getCovidRegion() {
        return covidRegion;
    }

    public void setCovidRegion(CovidRegion covidRegion) {
        this.covidRegion = covidRegion;
    }

    
}
