package jp.co.test.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/Test")
public class Test001Controller {

    @RequestMapping({ "/hello", "/hello/{deviceType}/{deviceSn}" })
    public String hello(
            @PathVariable(name = "deviceType", required = false) Optional<String> deviceType,
            @PathVariable(name = "deviceSn", required = false) Optional<String> deviceSn) {


        return "OK";
    }
}
