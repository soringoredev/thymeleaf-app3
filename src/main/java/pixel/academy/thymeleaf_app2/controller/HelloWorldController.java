package pixel.academy.thymeleaf_app2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // metoda pt afsarea formularului HTML initial

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }
}
