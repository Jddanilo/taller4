package com.i016212.taller4.Parsert;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jhonny on 15/10/2017.
 */
    public class JsonCountryDetail {

        public static List<com.i016212.taller4.Parsert.JsonCountryDetail> getData(String content) throws JSONException {
            JSONArray jsonArray = new JSONArray(content);
            List<com.i016212.taller4.Parsert.JsonCountryDetail> countryDetailList = new ArrayList<>();
            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject item = jsonArray.getJSONObject(i);

                JSONArray languages = item.getJSONArray("id");
                JSONObject languagesItem = languages.getJSONObject(0);

                com.i016212.taller4.Parsert.JsonCountryDetail countryDetail = new com.i016212.taller4.Parsert.JsonCountryDetail();
                countryDetail.setSusersname(item.getString("usersname"));
                countryDetail.setTitle(languagesItem.getString("title"));
                countryDetail.setBody(item.getInt("body"));

                countryDetailList.add(countryDetail);
            }
            return countryDetailList;
        }

    private void setTitle(String title) {
    }

    private void setSusersname(String usersname) {
    }

}

