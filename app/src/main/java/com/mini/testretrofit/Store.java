package com.mini.testretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Store {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("intro")
    @Expose
    private String intro;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("info")
    @Expose
    private String info;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("homepage")
    @Expose
    private String homepage;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("mapLong")
    @Expose
    private Double mapLong;
    @SerializedName("mapLat")
    @Expose
    private Double mapLat;
    @SerializedName("storeImg")
    @Expose
    private String storeImg;
    @SerializedName("createDate")
    @Expose
    private String createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Double getMapLong() {
        return mapLong;
    }

    public void setMapLong(Double mapLong) {
        this.mapLong = mapLong;
    }

    public Double getMapLat() {
        return mapLat;
    }

    public void setMapLat(Double mapLat) {
        this.mapLat = mapLat;
    }

    public String getStoreImg() {
        return storeImg;
    }

    public void setStoreImg(String storeImg) {
        this.storeImg = storeImg;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
