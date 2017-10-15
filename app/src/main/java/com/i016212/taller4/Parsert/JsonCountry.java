package com.i016212.taller4.Parsert;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jhonny on 15/10/2017.
 */

public class JsonCountry {
    public static List<JsonCountry> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<JsonCountry> countryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            JsonCountry country = new JsonCountry();
            country.setid(item.getString("id"));
            country.setname(item.getString("name"));
            country.setusersname(item.getString("usersname"));
            country.setodders(item.getString("odders"));
            country.setAlcompany(item.getString("company"));
            countryList.add(country);
        }
        return countryList;
    }



