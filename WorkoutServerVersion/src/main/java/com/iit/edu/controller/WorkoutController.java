package com.iit.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iit.edu.model.Workout;
import com.iit.edu.model.WorkoutActive;
import com.iit.edu.service.WorkoutActiveService;
import com.iit.edu.service.WorkoutService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/workout")
public class WorkoutController {
	
	@Autowired
	private WorkoutService workoutService;
	
	@Autowired
	private WorkoutActiveService workoutActiveService;
	
	@RequestMapping(value = "/getAllWorkouts", method = RequestMethod.GET)
	public List<Workout> getAllWorkouts() {
		List<Workout> workouts = workoutService.getAllWorkouts();
		return workouts;
	}
	
	@RequestMapping(value = "/addWorkout", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Workout addWorkout(@RequestBody Workout work) {
		Workout wo = workoutService.addWorkout(work);
		return wo;
	}
	
	@RequestMapping(value ="/getWorkoutById/{workoutId}", method = RequestMethod.GET) 
	public Workout findWorkout(@PathVariable("workoutId") int id) {
		System.out.println("ID : "+id+workoutService.findWorkoutById(id).isPresent());
		if(workoutService.findWorkoutById(id).isPresent()) {
			return workoutService.findWorkoutById(id).get();
		}
		return null;
	}
	
	@RequestMapping(value = "/deleteWorkout", method = RequestMethod.POST)
	public void deleteWorkout(@RequestBody Workout work) {
		workoutActiveService.deleteWorkoutActive(work.getWorkoutId());
		workoutService.deleteWorkout(work);
	}
	
	@RequestMapping(value = "/startWorkout", method = RequestMethod.POST)
	public WorkoutActive startWorkout(@RequestBody WorkoutActive work) {
		return workoutActiveService.startWorkout(work);
		
	}
	
	@RequestMapping(value = "/endWorkout", method = RequestMethod.POST)
	public WorkoutActive endWorkout(@RequestBody WorkoutActive work) {
		return workoutActiveService.endWorkout(work);
		
	}
	
	@RequestMapping(value = "/getAllWorkoutActive", method = RequestMethod.GET)
	public List<WorkoutActive> getAllWorkoutActive() {
		List<WorkoutActive> listOfActiveWorkouts = workoutActiveService.getAllWorkoutActive();
		if(listOfActiveWorkouts != null && !listOfActiveWorkouts.isEmpty()) {
			return listOfActiveWorkouts;
		}
		return null;
	}
}
