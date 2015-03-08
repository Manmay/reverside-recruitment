package za.co.reverside.recruitment.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import static org.springframework.test.util.ReflectionTestUtils.*;
import za.co.reverside.recruitment.repository.ResourceRepository;
import za.co.reverside.recruitment.resource.Resource;


@RunWith(MockitoJUnitRunner.class)
public class ResourceServiceTest {

    @Mock
    ResourceRepository mResourceRepository;

    ResourceService resourceService;

    @Before
    public void setUp(){
        resourceService = new ResourceService();
        setField(resourceService, "resourceRepository", mResourceRepository);
    }

    @Test
    public void testResource(){
        Resource mResource = mock(Resource.class);
        when(mResourceRepository.findOne(1L)).thenReturn(mResource);

        Resource result = resourceService.getResource(1L);

        assertEquals(mResource, result);
    }

}