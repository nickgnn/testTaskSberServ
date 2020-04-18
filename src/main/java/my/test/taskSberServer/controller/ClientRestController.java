package my.test.taskSberServer.controller;

import my.test.taskSberServer.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/getMessages")
public class ClientRestController {

    @PostMapping(value = "/messageXML")
    public void getMessage(@RequestBody Message message) {
        System.out.println(message);
    }
}
