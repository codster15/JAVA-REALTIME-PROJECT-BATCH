package in.deepak.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String login() {

        return "login";
    }


    @GetMapping("/register")
    public String register() {

        return "register";
    }

    @GetMapping("/forget")
    public String forget() {
        return "forgetAccount";
    }

    @GetMapping("/unlock")
    public String unlock() {
        return "unlock";
    }

}
