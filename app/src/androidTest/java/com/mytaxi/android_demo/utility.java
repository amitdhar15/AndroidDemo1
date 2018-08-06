package com.mytaxi.android_demo;

import com.google.gson.stream.JsonReader;

import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReaderFactory;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;

import javax.json.JsonValue;


public class utility {

    public static final String JSON_FILE="C:\\Users\\Amit\\Desktop\\downloadjson";


    public static void waitFor(int seconds) {
        seconds = seconds < 0 ? 0 : seconds;
        while (--seconds >= 0) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void ReadJson(String str) throws IOException {
        System.out.println("Welcome To Json");

        InputStream fis = new FileInputStream("C://Users//Amit//Desktop//download.json");


        javax.json.JsonReader jsonReader = Json.createReader(fis);
        JsonObject jsonObject = jsonReader.readObject();

        //we can close IO resource and JsonReader now
        jsonReader.close();
        fis.close();

        String username = jsonObject.getString(str);
        System.out.println(username);

       }




}
