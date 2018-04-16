package jp.co.test.controller;

import jp.co.test.dto.response.DeviceDtoRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/GetConfig")
public class GetConfigController extends AbstractAPIController {

    @RequestMapping(value = "/{DeviceID}", method = {RequestMethod.GET})
    public DeviceDtoRes getDVRParameter(@PathVariable("DeviceID") String deviceID,
                                        @RequestParam(value="User" ,required = true) String user,
                                        @RequestParam(value="SessionId" ,required = true) Integer sessionId) {


        log.info("deviceID={}", deviceID);
        checkSessionId(sessionId);

        DeviceDtoRes dto = new DeviceDtoRes();
        dto.getSystem().getSensor().getThreshold().setAcceleration(99);
        dto.getSystem().getSensor().getThreshold().setDeceleration(98);
        dto.getSystem().getSensor().getThreshold().setTurning(97);
        dto.getSystem().getSensor().getThreshold().setImpact(96);
        return dto;
    }
}
