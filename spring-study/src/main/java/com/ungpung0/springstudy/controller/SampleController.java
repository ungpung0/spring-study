package com.ungpung0.springstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 별도의 화면 없이 데이터를 전송할 수 있다.
public class SampleController {
    @GetMapping("/hello") // 브라우저의 주소창에서 호출이 가능토록 지정한다.
    public String[] hello() {
        return new String[]{"Hello", "World"};
    }
}
