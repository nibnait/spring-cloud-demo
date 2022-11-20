package cc.tianbin.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by nibnait on 2022/11/20
 */
@FeignClient(value = "springcloud-eureka-client")
public interface FeignService {

    @RequestMapping(value = "/api/queryUserInfo", method = RequestMethod.GET)
    String queryUserInfo(@RequestParam String userId);

}
