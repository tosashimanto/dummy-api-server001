package jp.co.test.controller;

import jp.co.test.dto.SetDeviceDto;
import jp.co.test.dto.response.DeviceDtoRes;
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
    public ResultDto setDVRParameter(@RequestBody SetDeviceDto form, @PathVariable("DeviceID") String deviceID,
                                     @RequestParam(value="User" ,required = true) String user,
                                     @RequestParam(value="SessionId" ,required = true) Integer sessionId){

        log.info("deviceID={}", deviceID);
        checkSessionId(sessionId);


        log.info("form={}", form);

        ResultDto dto = new ResultDto();
        dto.setResult(false);
        dto.setReason("success");
        dto.setErrorCode(new Long(0));
        dto.setDeviceId(Long.parseLong(deviceID));
        log.info("dto={}", dto);
        return dto;
    }
}
