package app.controller;

import app.execption.ExceptionBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wxmimperio on 2017/5/13.
 */
@RestController
public class ExceptionController {

    @RequestMapping("/exception")
    public String json() throws ExceptionBase {
        throw new ExceptionBase("发生错误2");
    }

    @RequestMapping("/hello")
    public String hello() throws Exception {
        return "hello";
    }
}
