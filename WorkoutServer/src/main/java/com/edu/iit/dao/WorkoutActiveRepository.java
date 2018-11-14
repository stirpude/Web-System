package com.edu.iit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.edu.iit.model.WorkoutActive;
import com.edu.iit.model.WorkoutActivePK;

@Repository
public interface WorkoutActiveRepository extends JpaRepository<WorkoutActive, WorkoutActivePK>{

	@Query(value="SELECT * FROM workout_active w where w.workout_id = :id",nativeQuery=true) 
    List<WorkoutActive> findRecordsByWorkoutId(@Param("id") Long id);
}
