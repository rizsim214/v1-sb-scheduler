package com.scheduler.sbclinic.external_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import com.scheduler.sbclinic.models.NewsResponse;

public class News extends ActionSupport{
    private int error;
    private NewsResponse newsResponse;
    private String API_KEY = "801b3314101e43e3af296a4b660013bb";
    private String searchQuery;
    private List<String> languages;
    private List<String> sortByList;
    private String languageQuery = "en";
    private String sortQuery;

    public News() {
        languages = new ArrayList<String>();
        languages.add("en");
        languages.add("de");
        languages.add("es");

        sortByList = new ArrayList<String>();
        sortByList.add("popularity");
        sortByList.add("relevance");
        sortByList.add("publishedAt");

    }
    
    public String execute() throws Exception {
        String format = "yyyy-MM-dd";
        Calendar calendar  = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat(format);
        String currentDate = df.format(calendar.getTime());
        try {
            URL url = new URL("https://newsapi.org/v2/everything?q="+ getSearchQuery() + "&searchIn=title,description" + "&language="+ getLanguageQuery() +"&from=" + currentDate + "&sortBy=" + getSortQuery() +"&apiKey=" + getAPI_KEY());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            if(conn.getResponseCode() != 200){
                setError(conn.getResponseCode());
                throw new RuntimeException("FAILED : HTTP error code : " + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader( new InputStreamReader(conn.getInputStream()));
            String output;
            while((output = br.readLine()) != null) {
                ObjectMapper mapper = new ObjectMapper();
                setNewsResponse(mapper.readValue(output, NewsResponse.class));
            }
            
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public NewsResponse getNewsResponse() {
        return newsResponse;
    }

    public void setNewsResponse(NewsResponse newsResponse) {
        this.newsResponse = newsResponse;
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }


    public String getLanguageQuery() {
        return languageQuery;
    }

    public void setLanguageQuery(String languageQuery) {
        this.languageQuery = languageQuery;
    }

    public String getAPI_KEY() {
        return API_KEY;
    }
    public int getError() {
        return error;
    }
    public void setError(int i) {
        this.error = i;
    }
    public List<String> getSortByList() {
        return sortByList;
    }
    public void setSortByList(List<String> sortByList) {
        this.sortByList = sortByList;
    }
    public String getSortQuery() {
        return sortQuery;
    }
    public void setSortQuery(String sortQuery) {
        this.sortQuery = sortQuery;
    }
    
}
