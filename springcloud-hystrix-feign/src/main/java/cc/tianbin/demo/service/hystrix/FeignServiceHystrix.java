package cc.tianbin.demo.service.hystrix;

import cc.tianbin.demo.service.FeignService;
import io.github.nibnait.common.utils.DataUtils;
import org.springframework.stereotype.Component;

/**
 * Created by nibnait on 2022/11/20
 */
@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String queryUserInfo(String userId) {
        return DataUtils.format("queryUserInfo by userId：{}  err！from feign hystrix", userId);
    }
}
