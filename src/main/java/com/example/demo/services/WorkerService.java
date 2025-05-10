package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exceptions.UserNotFoundException;
import com.example.demo.model.Worker;
import com.example.demo.repositories.WorkerRepository;

@Service
public class WorkerService {
	private final WorkerRepository workerRepository;

	public WorkerService(WorkerRepository workerRepository) {
		super();
		this.workerRepository = workerRepository;
	}
	
	public List<Worker> getAllWorkers(){
		return (List<Worker>) this.workerRepository.findAll();
		
	}
	public void deleteWorkerById(Integer id ) {
		if(workerRepository.findById(id).isPresent()) {
			this.workerRepository.deleteById(id);
			
		}else {
			throw new UserNotFoundException(id);
		}
		 
	}
	
	public Worker updatWorkerById(int id , Worker w) {
		if(workerRepository.findById(id).isPresent()) {
			this.workerRepository.updateWorkerShiftById(id,w.getShift());
			return workerRepository.findById(id)
		            .orElseThrow(() -> new UserNotFoundException(id));
			
			
		}else {
			throw new UserNotFoundException(id);
		}
		

		
	}

	public Worker addNewWorker(Worker worker) {
		return workerRepository.save(worker);
		// TODO Auto-generated method stub
		
	}

}
