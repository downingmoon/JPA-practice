package com.downing.jpa.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @GetMapping("/main")
    public Map<String, Object> main() {
        Map<String, Object> result = new HashMap<>();
        result.put("KEY", "VALUE");
        return result;
    }
}
