package za.co.reverside.recruitment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import za.co.reverside.recruitment.repository.ResourceRepository;
import za.co.reverside.recruitment.resource.Resource;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    @RequestMapping(value = "api/resource", method = GET, produces = "application/json")
    public List<Resource> getAllResources(){
        return resourceRepository.findAll();
    }

    @Transactional
    @RequestMapping(value = "api/resource", method = POST, consumes = "application/json")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createResource(@RequestBody Resource resource){
        resourceRepository.save(resource);
    }

    @RequestMapping(value = "api/resource/{resourceId}", method = GET, produces = "application/json")
    public Resource getResource(@PathVariable("resourceId") Long resourceId){
        return resourceRepository.findOne(resourceId);
    }

    @Transactional
    @RequestMapping(value = "api/resource/{resourceId}", method = PUT, consumes = "application/json")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void updateResource(@PathVariable("resourceId") Long resourceId, @RequestBody Resource resource){
        Resource aResource = resourceRepository.findOne(resourceId);
        aResource.setName(resource.getName());
        aResource.setDescription(resource.getDescription());
        resourceRepository.save(aResource);
    }

    @Transactional
    @RequestMapping(value = "api/resource/{resourceId}", method = DELETE)
    @ResponseStatus(value = HttpStatus.MOVED_PERMANENTLY)
    public void deleteResource(@PathVariable("resourceId") Long resourceId){
        resourceRepository.delete(resourceId);
    }

}
