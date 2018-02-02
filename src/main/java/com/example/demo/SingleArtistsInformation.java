package com.example.demo;

public class SingleArtistsInformation {

    private Integer id;
    private String name;
    private String url;
    private String image_url;
    private String thumb_url;
    private String facebook_page_url;
    private String mbid;
    private int tracker_count;
    private int upcoming_event_count;


    public SingleArtistsInformation() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public String getFacebook_page_url() {
        return facebook_page_url;
    }

    public void setFacebook_page_url(String facebook_page_url) {
        this.facebook_page_url = facebook_page_url;
    }

    public String getMbid() {
        return mbid;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    public int getTracker_count() {
        return tracker_count;
    }

    public void setTracker_count(int tracker_count) {
        this.tracker_count = tracker_count;
    }

    public int getUpcoming_event_count() {
        return upcoming_event_count;
    }

    public void setUpcoming_event_count(int upcoming_event_count) {
        this.upcoming_event_count = upcoming_event_count;
    }

    @Override
    public String toString() {
        return "SingleArtistsInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", image_url='" + image_url + '\'' +
                ", thumb_url='" + thumb_url + '\'' +
                ", facebook_page_url='" + facebook_page_url + '\'' +
                ", mbid='" + mbid + '\'' +
                ", tracker_count=" + tracker_count +
                ", upcoming_event_count=" + upcoming_event_count +
                '}';
    }
}
