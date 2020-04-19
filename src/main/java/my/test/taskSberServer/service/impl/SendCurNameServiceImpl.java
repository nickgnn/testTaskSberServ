package my.test.taskSberServer.service.impl;

import my.test.taskSberServer.service.SendCurNameService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SendCurNameServiceImpl implements SendCurNameService {
    private RestTemplate restTemplate;

    @Value("${clientPath}")
    private String clientPath;

    public SendCurNameServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public String sendCurName(String curName) {
        String URL = clientPath + "/clientApi/client/curname";
        return restTemplate.postForObject(URL, curName, String.class);
    }
}
