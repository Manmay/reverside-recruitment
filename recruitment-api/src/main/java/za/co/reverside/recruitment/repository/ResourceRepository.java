package za.co.reverside.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.reverside.recruitment.resource.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long>{

}
