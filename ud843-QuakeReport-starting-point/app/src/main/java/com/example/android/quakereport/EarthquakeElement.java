package com.example.android.quakereport;

import android.support.v4.content.ContextCompat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by visla on 12/10/2017.
 */

public class EarthquakeElement {

    private double mMagnitude;
    private String mPlace;
    private long mTime;
    private String mUrl;


    public EarthquakeElement(double magnitude, String place, long time, String url) {
        mMagnitude = magnitude;
        mPlace = place;
        mTime = time;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getPlace() {
        String retVal;
        if(mPlace.contains(" of ")) {
            String parts[] = mPlace.split(" of ");
            retVal = parts[1];
        }
        else
            retVal = mPlace;

        return retVal;
    }

    public String getDistanceFromPlace() {
        String retVal;
        if(mPlace.contains(" of ")) {
            String parts[] = mPlace.split(" of ");
            retVal = parts[0] + " of";
        }
        else
            retVal = "Near";
        return retVal;
    }

    public void setPlace(String mPlace) {
        this.mPlace = mPlace;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long mTime) {
        this.mTime = mTime;
    }

    public String getDateFormatedAsString() {
        Date timeDate = new Date(mTime);
        SimpleDateFormat dateDateFormat = new SimpleDateFormat("MM DD, yyyy");
        return dateDateFormat.format(timeDate);
    }

    public String getTimeFormatedAsString() {
        Date timeDate = new Date(mTime);
        SimpleDateFormat timeDateFormat = new SimpleDateFormat("HH : mm");
        return timeDateFormat.format(timeDate);
    }

    public String getUrl(){
        return mUrl;
    }
}
