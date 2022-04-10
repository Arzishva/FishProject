package com.example.fishrest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CreatedAt {

    @SerializedName("$date")
    @Expose
    private long $date;

    public long get$date() {
        return $date;
    }

    public void set$date(long $date) {
        this.$date = $date;
    }

}