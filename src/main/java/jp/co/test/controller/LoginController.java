package jp.co.test.controller;


import jp.co.test.dto.LoginDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/RecordDataAuthentication")
public class LoginController {

    @RequestMapping(value = "/100", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String login(@RequestBody LoginDto form){

        System.out.println("test login");

        return form.toString();
    }
}
