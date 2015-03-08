package za.co.reverside.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.reverside.recruitment.resource.Resource;

import java.util.List;

public interface ResourceRepository extends JpaRepository<Resource, Long>{

    public List<Resource> findByDescription(String description);


}
