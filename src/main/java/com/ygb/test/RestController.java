package com.ygb.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangguobiao on 2017/7/23.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Value("${lucky-word}") String luckyWord;

    @RequestMapping("/lucky")
    public String showLuckyWord() {
        return "This is the lucky word from server: \t" + luckyWord;
    }

}
