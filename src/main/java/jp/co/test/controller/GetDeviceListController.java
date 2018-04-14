package jp.co.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GetDeviceList")
public class GetDeviceListController {

    @RequestMapping("/100")
    public String getDeviceList(@RequestParam(value="name", defaultValue="World") String name) {


        System.out.println("test GetDeviceList");

        return "Yoshimasa MATSUMOTO OK!¥n";
    }
}
