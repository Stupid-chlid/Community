package life.majiang.community.Controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangxianwei
 * @create 2019--11--13--21:36
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public  String hello(String name, Model model){
        model.addAttribute("name",name);
    return ("hello");
    }
}
