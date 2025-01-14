package com.gjy.config.web;



import com.gjy.exception.BusinessException;
import com.gjy.model.Result;
import com.gjy.utils.DingTalkSendMsgUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.ServletRequest;
import java.nio.charset.Charset;
import java.util.Objects;


@Slf4j
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = BusinessException.class)
    public Result<?> exceptionHandler(BusinessException e) {
        log.debug("发生业务异常", e);
        return Result.error(e.getCode(), e.getMessage());
    }

//    @ExceptionHandler(value = Exception.class)
//    public Result<?> exceptionHandler(Exception e, ServletRequest request){
//        if (Objects.nonNull(request) && request instanceof ContentCachingRequestWrapper) {
//            ContentCachingRequestWrapper wrapper = (ContentCachingRequestWrapper) request;
//            log.info("未知异常 request ip: {}, url: {}, body: {}", wrapper.getRemoteAddr(),
//                    wrapper.getRequestURI(), StringUtils.toEncodedString(wrapper.getContentAsByteArray(),
//                            Charset.forName(wrapper.getCharacterEncoding())));
//        }
//        log.error("未知异常", e);
//        DingTalkSendMsgUtil.sendToDingTalk(e);
//        return Result.error("系统异常，请联系管理员");
//    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result<?> exceptionHandler(MethodArgumentNotValidException e) {
        log.debug("传入参数异常", e);
        return Result.error(500, e.getMessage());
    }
}
