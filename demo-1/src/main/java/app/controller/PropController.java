package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wxmimperio on 2017/5/7.
 */
@RestController
public class PropController {

    @RequestMapping("/prop")
    public String index() {
        return "This is a prop.";
    }
}
