package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.TestService;
import com.example.demo.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/{one}")
    public JsonResult ttt(@PathVariable("one") String one) {
        JsonResult jsonResult = new JsonResult(1);
        User user = new User();
        user.setUserName(one);
        user = testService.setUser(user);
        jsonResult.setContent(user);
        return jsonResult;
    }
}
