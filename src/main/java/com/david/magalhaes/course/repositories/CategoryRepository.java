package com.david.magalhaes.course.repositories;

import com.david.magalhaes.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}