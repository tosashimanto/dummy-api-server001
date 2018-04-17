package jp.co.test.controller;


import jp.co.test.dto.LoginDto;
import jp.co.test.dto.response.LoginDtoRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/RecordDataAuthentication")
@Slf4j
public class LoginController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/100", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public LoginDtoRes login(@RequestBody LoginDto form){

        log.info("Login UserName:{}", form.getUserName());
        log.info("Login Password:{}", form.getPassword());
        log.info("Login Version:{}", form.getVersion());
        log.info("Login AuthType:{}", form.getAuthType());
        LoginDtoRes dto = new LoginDtoRes();
        dto.setSessionId(counter.incrementAndGet());
        dto.setUserName(form.getUserName());
        dto.setReason("success");
        dto.setResult(true);
        dto.setUserType(new Long(0));
        return dto;
    }
}
