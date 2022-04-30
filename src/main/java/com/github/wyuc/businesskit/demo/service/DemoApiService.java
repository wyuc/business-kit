package com.github.wyuc.businesskit.demo.service;

import cn.hutool.core.lang.Dict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoApiService {

    @GetMapping("/demo")
    public Map<String, String> demo(String user) {
        Map<String, String> result = new HashMap<>(16);
        result.put("message", "Hello, World!");
        return result;
    }
}
