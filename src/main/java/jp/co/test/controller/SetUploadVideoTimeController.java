package jp.co.test.controller;

import jp.co.test.dto.SetDeviceDto;
import jp.co.test.dto.SetUploadVideoTimeDto;
import jp.co.test.dto.response.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/SetUPloadVideoTime/100")
public class SetUploadVideoTimeController extends AbstractAPIController {

    @RequestMapping(value = "/100", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResultDto setDVRParameter(@RequestBody SetUploadVideoTimeDto form,
                                     @RequestParam(value = "User", required = true) String user,
                                     @RequestParam(value = "SessionId", required = true) Integer sessionId) {

        checkSessionId(sessionId);

        log.info("form={}", form);
        log.info("deviceID={}", form.getDeviceId());
        ResultDto dto = new ResultDto();
        dto.setResult(false);
        dto.setReason("success");
        dto.setErrorCode(new Long(0));
        dto.setDeviceId(form.getDeviceId());
        log.info("dto={}", dto);
        return dto;
    }
}
