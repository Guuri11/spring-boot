package com.example.crashcourse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomPost {
    private Integer id;
    private String title;
    private String body;
    private ArrayList<String> tags;

    public RandomPost() {

    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "RandomPost{"+
        "id='" + id + "'" +
        ", title=" + title + "'" +
        ", tags=" + tags.toString() + "'" +
        ", body=" + body +
        "}";
    }
}
