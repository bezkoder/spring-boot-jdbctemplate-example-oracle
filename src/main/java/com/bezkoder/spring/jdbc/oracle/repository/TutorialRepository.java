package com.bezkoder.spring.jdbc.oracle.repository;

import java.util.List;

import com.bezkoder.spring.jdbc.oracle.model.Tutorial;

public interface TutorialRepository {
  int save(Tutorial book);

  int update(Tutorial book);

  Tutorial findById(Long id);

  int deleteById(Long id);

  List<Tutorial> findAll();

  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);

  int deleteAll();
}
