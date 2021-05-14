package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobDescription;

public interface JobDescriptionDao extends JpaRepository<JobDescription,Integer>{

}
