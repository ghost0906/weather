package com.zhenchen.weather.db;

import org.litepal.crud.DataSupport;

/*****************************
 * Created by Raytine on 2018/6/3.
 * Description:
 *****************************/
public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
}
