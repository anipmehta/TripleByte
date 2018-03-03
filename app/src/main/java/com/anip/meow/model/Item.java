package com.anip.meow.model;

/**
 * Created by anip on 03/03/18.
 */
//title, time, image and a description
import com.google.gson.annotations.SerializedName;
public class Item {
    @SerializedName("title")
    private String title;
    @SerializedName("image_url")
    private String image;
    @SerializedName("description")
    private String description;
    @SerializedName("timestamp")
    private String time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
