package com.example.android.whatevertrash;

import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

public class source implements Serializable {
    String title;
    String description;
    double latitude;
    double longitude;
    boolean alreadyhere;
    float[] distance = {999999, 0, 0};
    public source(String title, String description, double latitude, double longitude, boolean alreadyhere) {
        this.title = title;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.alreadyhere = alreadyhere;
    }
}


