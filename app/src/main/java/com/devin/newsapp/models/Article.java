package com.devin.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Source;

class Article {

    @SerializedName("source")
    @Expose
    private Source source;

    @SerializedName("author")
    @Expose
    private String author;

    @SerializedName("title")
    @Expose
    private Source title;

    @SerializedName("description")
    @Expose
    private Source description;

    @SerializedName("url")
    @Expose
    private Source url;

    @SerializedName("urlToImage")
    @Expose
    private Source urlToImage;

    @SerializedName("publishedAt")
    @Expose
    private Source publishedAt;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Source getTitle() {
        return title;
    }

    public void setTitle(Source title) {
        this.title = title;
    }

    public Source getDescription() {
        return description;
    }

    public void setDescription(Source description) {
        this.description = description;
    }

    public Source getUrl() {
        return url;
    }

    public void setUrl(Source url) {
        this.url = url;
    }

    public Source getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(Source urlToImage) {
        this.urlToImage = urlToImage;
    }

    public Source getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Source publishedAt) {
        this.publishedAt = publishedAt;
    }
}
