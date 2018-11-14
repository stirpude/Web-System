package com.iit.edu.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.iit.dao.WorkoutRepository;
import com.edu.iit.model.Workout;
import com.edu.iit.service.WorkoutService;

@Service("workoutService")
@Transactional
public class WorkoutServiceImpl implements WorkoutService{
	
	@Autowired
	private WorkoutRepository workoutRepository;

	@Override
	public List<Workout> getAllWorkouts() {
		List<Workout> workoutList = new ArrayList<Workout>();
		workoutList = workoutRepository.findAll();
		/*if(!(workoutList != null && workoutList.size() <= 0)) {
			for(Workout work : workoutList) {
				System.out.println(work.getWorkoutId() + " "+ work.getWorkoutTitle());
			}
		} else {
			System.out.println("No Workout Data");
		}*/
		return workoutList;
	}

	@Override
	public Workout addWorkout(Workout work) {
		return workoutRepository.save(work);
	}

	@Override
	public void deleteWorkout(Workout work) {
		workoutRepository.delete(work);
		
	}

	@Override
	public Optional<Workout> findWorkoutById(long id) {
		return workoutRepository.findById(id);
	}

}
