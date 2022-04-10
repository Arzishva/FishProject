package com.example.fishrest;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class UpdatedAt {

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
