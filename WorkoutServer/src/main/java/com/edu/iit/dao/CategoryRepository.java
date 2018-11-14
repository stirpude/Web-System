package com.edu.iit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.iit.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
