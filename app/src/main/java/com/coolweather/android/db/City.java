package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    int id;
    String cituName;
    int cityCode;
    int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCituName() {
        return cituName;
    }

    public void setCituName(String cituName) {
        this.cituName = cituName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
