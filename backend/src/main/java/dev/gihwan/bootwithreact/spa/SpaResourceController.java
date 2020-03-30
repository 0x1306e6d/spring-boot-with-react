package dev.gihwan.bootwithreact.spa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpaResourceController {

    @GetMapping("/")
    public String getSpaResource() {
        return "index.html";
    }
}
