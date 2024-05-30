package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/greet")
	public String greet() {
		String str=null;
		str.length();
		return "Hello world";
	}
	
} 