package com.iit.edu.service;

import java.util.List;

import com.iit.edu.model.WorkoutActive;

public interface WorkoutActiveService {
	
	public WorkoutActive startWorkout(WorkoutActive work);
	
	public WorkoutActive endWorkout(WorkoutActive work);
	
	public List<WorkoutActive> getAllWorkoutActive();
	
	public void deleteWorkoutActive(Long workoutId);
	

}
