package jp.co.test.controller;

import jp.co.test.dto.LoginDto;
import jp.co.test.dto.response.LoginDtoRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/SetConfig")
public class SetConfigController {

    @RequestMapping(value = "/{DeviceID}", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public LoginDtoRes setDVRParameter(@RequestBody LoginDto form, @PathVariable("DeviceID") String deviceID){

        log.info("deviceID={}", deviceID);

        log.info("UserName:{}", form.getUserName());
        log.info("Password:{}", form.getPassword());
        log.info("Version:{}", form.getVersion());
        log.info("AuthType:{}", form.getAuthType());
        LoginDtoRes dto = new LoginDtoRes();

        return dto;
    }
}
