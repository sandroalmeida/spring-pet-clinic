package info.sandroalmeida.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sandro on 14/01/19
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }

}
