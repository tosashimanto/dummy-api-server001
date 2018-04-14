package jp.co.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/GetDeviceList")
public class GetDeviceListController {

    @RequestMapping("/100")
    public String getDeviceList(@RequestParam(value="name") String name) {


        System.out.println("test GetDeviceList");

        return "Yoshimasa MATSUMOTO OK!¥n";
    }
}
