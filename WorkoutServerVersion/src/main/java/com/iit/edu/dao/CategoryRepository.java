package com.iit.edu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iit.edu.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
