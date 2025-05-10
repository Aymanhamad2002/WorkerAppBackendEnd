package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Worker;
import com.example.demo.repositories.WorkerRepository;
import com.example.demo.services.WorkerService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * 
 */
@RestController
public class WorkersController {

    
	private final WorkerService workerService;
	
		


	public WorkersController(WorkerService workerService, WorkerRepository workerRepository) {
		super();
		this.workerService = workerService;
		
	}
	
	
	@GetMapping("/test")
	public String  test(){
		return "hello world";
	}
	
	@GetMapping("/workers")
	public List<Worker> getAllWorkers(){
		return workerService.getAllWorkers();
	}
	
	@DeleteMapping("/workers/{id}")
	public void deleteWorkerById(@PathVariable int  id){
		workerService.deleteWorkerById(id);

	}
	@PutMapping("workers/{id}")
	public Worker updateShiftById(@PathVariable int id, @RequestBody Worker entity) {
		
		
		return workerService.updatWorkerById(id, entity) ;
	}
	
	@PostMapping("/workers")
	public Worker addNewWorker(@RequestBody  Worker worker) {
		return workerService.addNewWorker(worker);
		
	}

}