package in.rajesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rajesh.entity.CourseEntity;

public interface CourseRepoInterface extends  JpaRepository<CourseEntity, Integer>{
	
	

}
