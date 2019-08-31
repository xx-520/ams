package com.qfedu.ams.common;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/29
 * Time: 19:39
 */
@ControllerAdvice
public class GlobalExceptionResolver {
    @ExceptionHandler(AuthorizationException.class)
    public String authorizationException(AuthorizationException ex){
        return "noPermision";
    }
}
