package com.mytaxi.android_demo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Abhishek Panwar on 7/14/2017.
 */

public class fetchData  {
    String data ="";
    String dataParsed = "";
    String singleParsed ="";
    String value;
    public Object doInBackground(String val) throws IOException, JSONException {

        URL url = new URL("https://randomuser.me/api/?seed=a1f30d446f820665");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        while (line != null) {
            line = bufferedReader.readLine();
            data = data + line;
        }

        JSONArray JA = new JSONArray(data);
       for (int i = 0; i < JA.length(); i++) {
           JSONObject JO = (JSONObject) JA.get(i);
           value = (String) JO.get(val);

       }
            System.out.println(String.valueOf(value));

        return value;
    }





}
