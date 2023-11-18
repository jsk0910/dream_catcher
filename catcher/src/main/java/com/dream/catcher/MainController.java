
@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
