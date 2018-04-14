package jp.co.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/GetConfig")
public class GetConfigController {

    @RequestMapping(value = "/{DeviceID}", method = {RequestMethod.GET})
    public String getDVRParameter(@RequestParam(value="UserName") String userName) {


        System.out.println("test GetDeviceList");

        return "Yoshimasa MATSUMOTO OK!¥n";
    }
}
