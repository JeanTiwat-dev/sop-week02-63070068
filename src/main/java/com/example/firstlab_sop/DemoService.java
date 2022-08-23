package com.example.firstlab_sop;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloworld(){
        return "Hello World";
    }
    @RequestMapping(value = "/hello/{name}+{surname}"), method = RequestMethod.GET)
    public String helloworld(@PathVariable("name") String n,
                             @PathVariable("surname") String sname){
        return "Hello" + n + " " + sname;
    }
}
