package com.gjy.controller.signature;

import com.gjy.model.Result;
import com.gjy.model.request.StudentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/gjy/java/signature")
public class SignatureController {

    /**
     * 如果通过鉴权就返回字符串 Hello world signature加上学生名字.
     */
    @GetMapping("/testSignature")
    public Result<String> testSignature(@RequestBody StudentRequest studentRequest){
        return Result.success("Hello world signature:" + studentRequest.getName());
    }


}