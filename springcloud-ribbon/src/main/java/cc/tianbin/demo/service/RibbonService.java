package cc.tianbin.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by nibnait on 2022/11/20
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String queryUserInfo(String userId) {
        return restTemplate.getForObject("http://SPRINGCLOUD-EUREKA-CLIENT/api/queryUserInfo?userId=" + userId, String.class);
    }

}
