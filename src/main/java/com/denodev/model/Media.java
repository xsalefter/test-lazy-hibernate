package com.denodev.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(
        strategy = InheritanceType.SINGLE_TABLE
)
@DiscriminatorColumn(name = "TYPE", length = 1, discriminatorType = DiscriminatorType.STRING)
public abstract class Media {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "LINK", length = 500, nullable = false)
    private String link;

    @Column(name = "AUTHOR", length = 45, nullable = false)
    private String author;

    @OneToOne(mappedBy = "media")
    private MediaAnalysis analysis;

    Media(){}

    public Media(String title, String link, String author) {
        this.title = title;
        this.link = link;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public MediaAnalysis getAnalysis() {
        return analysis;
    }

    public void setAnalysis(MediaAnalysis analysis) {
        this.analysis = analysis;
    }

}
