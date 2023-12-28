package in.rajesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rajesh.entity.TimingsEntity;

public interface TimingRepoInterface extends JpaRepository<TimingsEntity, Integer> {

}
