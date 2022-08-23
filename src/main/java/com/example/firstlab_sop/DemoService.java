package com.example.firstlab_sop;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoService {
    @RequestMapping(value = "helloworld", method = RequestMethod.GET)
    public String helloworld(){
        return "Hello World";
    }
    @RequestMapping(value = "hello/{name}+{surname}", method = RequestMethod.GET)
    public String helloworld(@PathVariable("name") String n,
                             @PathVariable("surname") String sname){
        return "Hello" + n + " " + sname;
    }
    @RequestMapping(value = "add/{num1}/{num2}", method = RequestMethod.GET)
    public Double add(@PathVariable("num1") Double num1,
                      @PathVariable("num2") Double num2){
        return num1 + num2;
    }
    @RequestMapping(value = "minus/{num1}/{num2}", method = RequestMethod.GET)
    public Double minus(@PathVariable("num1") Double num1,
                        @PathVariable("num2") Double num2){
        return  num1 - num2;
    }
    @RequestMapping(value = "multiply", method = RequestMethod.GET)
    public Double multiply(@RequestParam("num1") Double num1,
                           @RequestParam("num2") Double num2){
        return num1*num2;
    }
    @RequestMapping(value = "divide", method = RequestMethod.GET)
    public Double divide(@RequestParam("num1") Double num1,
                         @RequestParam("num2") Double num2) {
        return num1 / num2;
    }
}
