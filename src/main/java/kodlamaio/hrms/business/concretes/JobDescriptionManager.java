package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobDescriptionService;
import kodlamaio.hrms.dataAccess.abstracts.JobDescriptionDao;
import kodlamaio.hrms.entities.concretes.JobDescription;

@Service
public class JobDescriptionManager implements JobDescriptionService{
	
	private JobDescriptionDao jobDescriptionDao;
	
	@Autowired
	public JobDescriptionManager(JobDescriptionDao jobDescriptionDao) {
		super();
		this.jobDescriptionDao = jobDescriptionDao;
	}

	@Override
	public List<JobDescription> getAll() {
		return this.jobDescriptionDao.findAll();
	}

}
