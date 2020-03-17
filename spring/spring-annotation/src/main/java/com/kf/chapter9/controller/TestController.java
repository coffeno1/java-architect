package com.kf.chapter9.controller;

import com.kf.chapter9.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @Autowired
    TestService testService;

}
