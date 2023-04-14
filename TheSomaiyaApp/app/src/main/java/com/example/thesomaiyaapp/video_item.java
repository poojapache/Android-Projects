package com.example.thesomaiyaapp;

/**
 * Created by Pooja on 12-03-2017.
 */

public class video_item {
    private String title;
    private long child_id;
    private String id;


    public String getId(long child_id) {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }
    public long getChildid(){
       return child_id;
    }

    public void setChild_id(long child_id) {
        this.child_id = child_id;
    }
}
