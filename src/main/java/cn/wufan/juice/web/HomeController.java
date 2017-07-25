package cn.wufan.juice.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangbin on 2017/7/21.
 */
@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String getHomePage() {
        System.out.println("**********************************");
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        System.out.println("====login ========");
        return "login";
    }

}
