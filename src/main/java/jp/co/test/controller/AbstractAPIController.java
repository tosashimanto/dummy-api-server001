package jp.co.test.controller;

import jp.co.test.dto.response.ResultDto;
import jp.co.test.exeception.AuthException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



public class AbstractAPIController {

    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({ AuthException.class })
    @ResponseBody
    public ResultDto handleError() {
        ResultDto dto = new ResultDto();
        dto.setResult(false);
        dto.setReason("fail");
        return dto;
    }


    public void checkSessionId(Integer sessionId) {
        if(sessionId == null || sessionId== 0) {
            throw new AuthException();
        }
    }
}
