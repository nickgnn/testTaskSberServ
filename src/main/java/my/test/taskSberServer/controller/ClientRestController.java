package my.test.taskSberServer.controller;

import my.test.taskSberServer.dto.MessageDto;
import my.test.taskSberServer.service.SendCurNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/getMessages")
public class ClientRestController {
    private SendCurNameService sendCurNameService;

    @Autowired
    public ClientRestController(SendCurNameService sendCurNameService) {
        this.sendCurNameService = sendCurNameService;
    }

    @PostMapping(value = "/messageXml")
    public void getMessage(@RequestBody MessageDto messageDto) {
        System.out.println(messageDto);

        sendCurName((String) messageDto.getCurrency().get(0));
    }

    public String sendCurName(String curName) {
        return sendCurNameService.sendCurName(curName);
    }
}
