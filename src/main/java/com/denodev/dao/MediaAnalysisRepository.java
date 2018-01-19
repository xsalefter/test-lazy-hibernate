package com.denodev.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.denodev.model.Media;
import com.denodev.model.MediaAnalysis;

public interface MediaAnalysisRepository extends JpaRepository<MediaAnalysis, Long> {

    @Query("SELECT a FROM MediaAnalysis a LEFT JOIN FETCH a.media WHERE a.media = ?1")
    Optional<MediaAnalysis> getByMedia(Media media);
}
