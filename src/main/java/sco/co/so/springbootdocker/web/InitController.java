package sco.co.so.springbootdocker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @GetMapping(value="init")
    public String init() {
        return "System Up.  \n Running on " + System.getProperty("os.arch") + "[" + System.getProperty("os.name") + "]" + System.getProperty("os.version");
    }
}
