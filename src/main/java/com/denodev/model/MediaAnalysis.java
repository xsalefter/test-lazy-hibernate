package com.denodev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.ForeignKey;

@Entity
public class MediaAnalysis {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "SUCCESS", nullable = false)
    private Boolean success;

    @OneToOne
    @JoinColumn(
            name = "MED_ID",
            nullable = false,
            foreignKey = @ForeignKey(name="MEA_MED_FK")
    )
    private Media media;

    @Column(name = "CONTENT", nullable = false)
    private String content;

    MediaAnalysis() { }

    public MediaAnalysis(Media media, Boolean success, String content) {
        this.media = media;
        this.success = success;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
