package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> findAll() {
    List<Category> categories = categoryRepository.findAll();

    return categories;
  }

  public Category findById(Long id) {
    Optional<Category> category = categoryRepository.findById(id);

    return category.get();
  }
}
