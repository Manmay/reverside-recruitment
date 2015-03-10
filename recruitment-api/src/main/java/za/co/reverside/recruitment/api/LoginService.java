package za.co.reverside.recruitment.api;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.reverside.recruitment.repository.UserRepository;
import za.co.reverside.recruitment.resource.User;

@RestController
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    private String status = "status:";

    @RequestMapping(value = "api/login/{username}/{password}", produces = "application/json")
    @ResponseBody
    public String login(@PathVariable String username, @PathVariable String password) {

        User user = userRepository.findByUserNameAndPassword(username, password);

        if (user == null || user.getEnabled().toString().equals("false")) {
            return "{"+status + String.valueOf(Response.SC_NOT_FOUND) + "}";

        } else if (user != null) {
            return "{"+ status + String.valueOf(Response.SC_OK) + "}";
        } else {
            return "{"+ status + String.valueOf(Response.SC_INTERNAL_SERVER_ERROR) + "}";
        }


    }
}
