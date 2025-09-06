package me.maradabhargavnaidu.mbn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MbnApplication {
	@GetMapping("/")
	public String Hello() {
		return "Hello GRADLE-GROOVY MBN";
	}

	public static void main(String[] args) {
		SpringApplication.run(MbnApplication.class, args);
	}

}
