package sandeep.yadav.springboot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }

    @GetMapping("/style")
    public String style(Model model) {
        model.addAttribute("message", "Hello World!");
        return "addCSSJSDemo";
    }


    @GetMapping("/bootstrap")
    public String bootstrap(Model model) {
        model.addAttribute("message", "Hello World!");
        return "add-bootstrap";
    }
}
