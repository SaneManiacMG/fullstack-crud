package com.bezkoder.simplefullstack.Repository;

import com.bezkoder.simplefullstack.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TutorialRepository extends JpaRepository <Tutorial, Long> {

    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
