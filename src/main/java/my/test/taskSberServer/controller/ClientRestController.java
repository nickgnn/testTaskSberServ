package my.test.taskSberServer.controller;

import my.test.taskSberServer.dto.MessageDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/getMessages")
public class ClientRestController {

    @PostMapping(value = "/messageXml")
    public void getMessage(@RequestBody MessageDto messageDto) {
        System.out.println(messageDto);
    }
}
