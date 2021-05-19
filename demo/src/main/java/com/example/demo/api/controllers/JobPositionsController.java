package com.example.demo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.concretes.jobposition;
import com.example.demo.business.abstracts.JobPositionService;

@RestController
@RequestMapping("/api/job_positions")
public class JobPositionsController {
  private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<jobposition> getAll(){
		return this.jobPositionService.getAll();
	}
}
