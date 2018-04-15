package jp.co.test.controller;

import jp.co.test.dto.LoginDto;
import jp.co.test.dto.response.LoginDtoRes;
import jp.co.test.dto.response.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/SetConfig")
public class SetConfigController extends AbstractAPIController {

    @RequestMapping(value = "/{DeviceID}", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResultDto setDVRParameter(@RequestBody LoginDto form, @PathVariable("DeviceID") String deviceID,
                                       @RequestParam(value="User" ,required = true) String user,
                                       @RequestParam(value="SessionId" ,required = true) Integer sessionId){

        log.info("deviceID={}", deviceID);
        checkSessionId(sessionId);

        log.info("UserName:{}", form.getUserName());
        log.info("Password:{}", form.getPassword());
        log.info("Version:{}", form.getVersion());
        log.info("AuthType:{}", form.getAuthType());
        ResultDto dto = new ResultDto();
        dto.setResult(true);
        dto.setReason("success");
        return dto;
    }
}
