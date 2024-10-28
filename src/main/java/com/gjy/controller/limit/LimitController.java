package com.gjy.controller.limit;

import com.gjy.core.annotation.Limiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/zhc/java/limiter")
public class LimitController {

    @GetMapping("/guavaLimiter")
    @Limiter(limitNum = 5,name = "LimitController")
    public String generateException(){
        String retStr = "接口正常执行";
        System.out.println(retStr);
        return retStr;
    }
}
