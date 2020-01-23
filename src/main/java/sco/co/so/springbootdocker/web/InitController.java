package sco.co.so.springbootdocker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @GetMapping(value="init")
    public String init() {
        return "System Up!.  <br>Running on Architecture [" + System.getProperty("os.arch") + "], OS [" + System.getProperty("os.name") + ", version" + System.getProperty("os.version") + "]";
    }
}
