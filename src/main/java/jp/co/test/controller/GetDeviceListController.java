package jp.co.test.controller;

import jp.co.test.dto.response.ResultDto;
import jp.co.test.exeception.AuthException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/GetDeviceList")
public class GetDeviceListController extends AbstractAPIController {

    @RequestMapping(value="/100", method = {RequestMethod.GET})
    // @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public ResultDto getDeviceList(@RequestParam(value="User" ,required = true) String user,
                                @RequestParam(value="SessionId" ,required = true) Integer sessionId) {


        //Optional<String> hogeOpt = Optional.ofNullable(getHoge());
        //Optional<Integer> lengthOpt = sessionId.map(hoge -> hoge.length());

        // user.ifPresent(userName -> log.info("User={}", userName));

        log.info("User={}", user);
        log.info("SessionId={}", sessionId);
        checkSessionId(sessionId);

        Integer _sessionId = Optional.ofNullable(sessionId).orElse(-1);
        checkSessionId(sessionId);

        ResultDto dto = new ResultDto();
        dto.setResult(true);
        dto.setReason("success");
        return dto;
    }


}
