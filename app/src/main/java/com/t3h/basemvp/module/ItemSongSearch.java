package com.t3h.basemvp.module;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ducnd on 5/25/17.
 */

public class ItemSongSearch {
    @SerializedName("Id")
    private String id;

    @SerializedName(("Title"))
    private String title;

    @SerializedName("Artist")
    private String artist;

    @SerializedName("UrlJunDownload")
    private String urlJunDownload;

    @SerializedName("LyricsUrl")
    private String lyricsUrl;

    @SerializedName("UrlSource")
    private String UrlSource;

    @SerializedName("SiteId")
    private String siteId;

    @SerializedName("HostName")
    private String hostName;

    @SerializedName("Avatar")
    private String avatar;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getUrlJunDownload() {
        return urlJunDownload;
    }

    public String getLyricsUrl() {
        return lyricsUrl;
    }

    public String getUrlSource() {
        return UrlSource;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getHostName() {
        return hostName;
    }

    public String getAvatar() {
        return avatar;
    }
}
