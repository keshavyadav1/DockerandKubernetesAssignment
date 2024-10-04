package Docker.Assignment.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
@GetMapping
public String check() {
	return "Hello! Welcome to Spring boot REST API";
}
}
