package in.rajesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rajesh.entity.StudentRegistration;

public interface StudentRepoInterface extends JpaRepository<StudentRegistration, Integer>{

}
