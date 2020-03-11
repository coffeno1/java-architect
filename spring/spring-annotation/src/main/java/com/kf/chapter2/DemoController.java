package com.kf.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    @Autowired
    DemoService service;
}
