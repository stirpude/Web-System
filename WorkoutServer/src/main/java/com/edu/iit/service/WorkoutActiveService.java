package com.edu.iit.service;

import java.util.List;

import com.edu.iit.model.WorkoutActive;

public interface WorkoutActiveService {
	
	public WorkoutActive startWorkout(WorkoutActive work);
	
	public WorkoutActive endWorkout(WorkoutActive work);
	
	public List<WorkoutActive> getAllWorkoutActive();
	
	public void deleteWorkoutActive(Long workoutId);
	

}
