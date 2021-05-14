package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobDescriptionService;
import kodlamaio.hrms.entities.concretes.JobDescription;

@RestController
@RequestMapping("/api/jobdescriptions")
public class JobDescriptionsController {
	
	private JobDescriptionService jobDescriptionService;
	
	@Autowired
	public JobDescriptionsController(JobDescriptionService jobDescriptionService) {
		super();
		this.jobDescriptionService = jobDescriptionService;
	}

	@GetMapping("/getall")
	public List<JobDescription> getAll(){
		return this.jobDescriptionService.getAll();
	}
}
