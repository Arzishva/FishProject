package data;

import com.example.fishrest.CreatedAt;
import com.example.fishrest.Id;
import com.example.fishrest.UpdatedAt;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;
@Generated("jsonschema2pojo")
public class DataModel {
    @SerializedName("_id")
    @Expose
    private Id id;
    @SerializedName("name")
    @Expose
    private String supername;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("created_at")
    @Expose
    private CreatedAt createdAt;
    @SerializedName("updated_at")
    @Expose
    private UpdatedAt updatedAt;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
    public String getName() {
        return supername;
    }
    public void setName(String name) {
        this.supername = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CreatedAt getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(CreatedAt createdAt) {
        this.createdAt = createdAt;
    }

    public UpdatedAt getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(UpdatedAt updatedAt) {
        this.updatedAt = updatedAt;
    }
}