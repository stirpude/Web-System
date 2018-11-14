package com.edu.iit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.iit.model.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}
