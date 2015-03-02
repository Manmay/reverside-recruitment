package za.co.reverside.recruitment.api;

import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ExampleService {

    @RequestMapping(value = "time", method = GET, produces = "text/plain")
    public String getTime(){
        return new Date().toString();
    }

}
