package com.gdghackathon.dougwritescode.gdghackathonffnotify;

import org.json.JSONObject;
import java.lang.String;

public class WeatherGrabber {

    public String statestr = "";
    public String citystr = "";

    public WeatherGrabber() {
    }

    public WeatherGrabber(String state, String city) {
        this.statestr = state;
        this.citystr = city;
    }

    public JSONObject getWeatherJSON() {
        String apikey = "1c8b0deacc36a191";
        String jsonuri = "http://api.wunderground.com/api/" + apikey + "/conditions/q/" + statestr + "/" + citystr + ".json";
        JSONRetriever retriever = new JSONRetriever(jsonuri);
        return retriever.retrieve();
    }
}
