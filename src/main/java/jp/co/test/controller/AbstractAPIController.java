package jp.co.test.controller;

import jp.co.test.dto.response.ResultDto;
import jp.co.test.exeception.AuthException;
import jp.co.test.exeception.BADRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


public class AbstractAPIController {

    /**
     * HTTP status code=401とJSONを返す.
     *
     * @return
     */
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({AuthException.class})
    @ResponseBody
    public ResultDto handleError() {
        ResultDto dto = new ResultDto();
        dto.setResult(false);
        dto.setReason("fail");
        return dto;
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler({BADRequestException.class})
    @ResponseBody
    public ResultDto handleError2() {
        ResultDto dto = new ResultDto();
        dto.setResult(false);
        dto.setReason("fail");
        return dto;
    }


    public void checkSessionId(Integer sessionId) {
        if (sessionId == null || sessionId == 0) {
            throw new AuthException();
        }
    }

    public void doBADRequest(Integer sessionId) {
        throw new BADRequestException();
    }
}
