package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{
	
	//  only use whenever we are overriding functionality but we are extending functionality through JPA
	//Exercise save(Exercise exercise);
}
