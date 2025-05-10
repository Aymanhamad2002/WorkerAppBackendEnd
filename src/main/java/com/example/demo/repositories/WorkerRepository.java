package com.example.demo.repositories;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Worker;

public interface WorkerRepository extends CrudRepository<Worker, Integer> {
	
	@Modifying
	@Query("UPDATE worker SET shift = :shift WHERE id = :id")
	public void updateWorkerShiftById(int id , String shift);

}
