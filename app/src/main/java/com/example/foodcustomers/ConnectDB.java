package com.example.foodcustomers;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectDB {
    private String JSON_URL;
    HttpURLConnection urlConnection;

    public ConnectDB(String JSON_URL) throws IOException {
        urlConnection = (HttpURLConnection) ( new URL(JSON_URL)).openConnection();
        urlConnection.setDoInput(true);
        urlConnection.setDoOutput(true);
    }
    public String GetInfo() throws IOException {
        String s=null;
        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            s = in.toString();
        }
        finally {
                urlConnection.disconnect();
         }
        return s;
    }

}
