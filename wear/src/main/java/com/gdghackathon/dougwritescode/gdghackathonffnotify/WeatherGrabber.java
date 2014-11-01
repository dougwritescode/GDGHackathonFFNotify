package com.gdghackathon.dougwritescode.gdghackathonffnotify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.String;

public class WeatherGrabber {

    private String apikey = "1c8b0deacc36a191";
    private String statestr = "";
    private String citystr = "";

    public void WeatherGrabber(String state, String city) {
        this.statestr = state;
        this.citystr = city;
    }

    public JSONObject getWeatherJSON() throws JSONException {
        StringBuilder builder = new StringBuilder();
        HttpClient client = new DefaultHttpClient();
        HttpGet Tempjson = new HttpGet("http://api.wunderground.com/api/" + apikey + "/conditions/q/" + statestr + "/" + citystr + ".json");
        try {
            HttpResponse response = client.execute(Tempjson);
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();
            if (statusCode == 200) {
                HttpEntity entity = response.getEntity();
                InputStream content = entity.getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(content));
                String line;
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new JSONObject(builder.toString());
        } catch (JSONException jse) {
            // wat
        }
        return null;
    }
}
