package cn.wufan.juice.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangbin on 2017/7/22.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @RequestMapping("index")
    public String index() {
        return "user/index";
    }
}
