package com.denodev.dao;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.denodev.Application;
import com.denodev.model.Media;
import com.denodev.model.MediaAnalysis;
import com.denodev.model.NewsReport;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class MediaAnalysisRepositoryTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private MediaAnalysisRepository mediaAnalysisRepository;

    @Before
    public void before() {
        Media media1 = new NewsReport("News Report 1", "https://example.com/newsreports/1", "author 1", "This is body 1");
        Media media2 = new NewsReport("News Report 2", "https://example.com/newsreports/2", "author 2", "This is body 2");
        entityManager.persist(media1);
        entityManager.persist(media2);

        MediaAnalysis ma1 = new MediaAnalysis(media1, true, "This is success content for media1");
        MediaAnalysis ma2 = new MediaAnalysis(media2, true, "This is failed content for media2");
        entityManager.persist(ma1);
        entityManager.persist(ma2);
    }

    @Test
    public void test() {
        Media criteria = this.entityManager
            .createQuery("from Media where title = 'News Report 1'", Media.class)
            .getSingleResult();

        System.out.println("---------- WATCH GENERATED QUERY HERE ----------");

        Optional<MediaAnalysis> mediaAnalysis = this.mediaAnalysisRepository.getByMedia(criteria);
        assertTrue(mediaAnalysis.get() != null);
        
        System.out.println("---------- END OF GENERATED QUERY HERE ----------");
    }
}
