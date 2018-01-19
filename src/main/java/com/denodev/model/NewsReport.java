package com.denodev.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("N")
public class NewsReport extends Media {

    @Column(name = "BODY", nullable = false)
    private String body;

    NewsReport(){}

    public NewsReport(String title, String link, String author, String body) {
        super(title, link, author);
        this.body= body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
