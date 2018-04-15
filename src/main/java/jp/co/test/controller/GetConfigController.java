package jp.co.test.controller;

import jp.co.test.dto.response.DeviceDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/GetConfig")
public class GetConfigController extends AbstractAPIController {

    @RequestMapping(value = "/{DeviceID}", method = {RequestMethod.GET})
    public DeviceDto getDVRParameter(@PathVariable("DeviceID") String deviceID,
                                     @RequestParam(value="User" ,required = true) String user,
                                     @RequestParam(value="SessionId" ,required = true) Integer sessionId) {


        log.info("deviceID={}", deviceID);
        checkSessionId(sessionId);

        DeviceDto dto = new DeviceDto();
        dto.setMessage("this is OK.");
        dto.getThresholdInfo().setTest0Threshold("980");

        return dto;
    }
}
