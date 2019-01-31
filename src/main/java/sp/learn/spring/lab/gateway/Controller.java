package sp.learn.spring.lab.gateway;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(path = "/")
    public String get() {
        return "randomclient";
    }
}
