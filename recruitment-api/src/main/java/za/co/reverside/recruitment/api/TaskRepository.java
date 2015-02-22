package za.co.reverside.recruitment.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import za.co.reverside.recruitment.resource.Task;

@RepositoryRestResource(collectionResourceRel="task", path = "task")
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {

}
