package com.techmaster.lab1.controller;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.techmaster.lab1.model.Book;
import com.techmaster.lab1.model.bmi;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    String hello() {
        return "Hello World, Spring Boot!";
    }

    @GetMapping("/random")
    @ResponseBody
    public String random() {
        int len = 8; // Độ dài của String random
        byte[] array = new byte[len];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        return ("Random string: " + generatedString).toString();
    }

    @GetMapping("/randomarray")
    @ResponseBody
    public String randomarray() {
        List<String> myList = Arrays.asList("Kiến tha lâu đầy tổ", "Có công mài sắt, có ngày nên kim",
                "Không thầy đố mày làm nên", "Học thầy không tày học bạn");
        Random r = new Random();

        int randomitem = r.nextInt(myList.size());
        String randomElement = myList.get(randomitem);
        return randomElement.toString();
    }

    @GetMapping("/bmi/{a}/{b}")
    @ResponseBody
    public float add(@PathVariable("a") float aa, @PathVariable("b") float bb) {
        float chiso = aa / (bb * bb);
        return chiso;
    }
}
