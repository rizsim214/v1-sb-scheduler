package com.scheduler.sbclinic.external_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import com.scheduler.sbclinic.models.NewsResponse;

public class News extends ActionSupport{
    private NewsResponse newsResponse;
    String API_KEY = "801b3314101e43e3af296a4b660013bb";

    public String execute() throws Exception {
        String format = "yyyy-mm-dd";
        Calendar calendar  = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat(format);
        String currentDate = df.format(calendar.getTime());

        try {
            URL url = new URL("https://newsapi.org/v2/everything?q=tesla&from=" + currentDate + "&sortBy=publishedAt&apiKey=" + API_KEY);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if(conn.getResponseCode() != 200){
                throw new RuntimeException("FAILED : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader( new InputStreamReader(conn.getInputStream()));
            String output;

            while((output = br.readLine()) != null) {
                ObjectMapper mapper = new ObjectMapper();
                setNewsResponse(mapper.readValue(output, NewsResponse.class));
            }
            System.out.println(getNewsResponse().getArticles());
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

}
