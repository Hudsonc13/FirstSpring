package dev.hud.first.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
	
	@GetMapping("/boasvindas")
	public String mensagem() {
		return "primeira mensagem nessa rota";
	}
	
	@GetMapping("/num")
	public int msg() {
		return 4010;
	}
	
	
	
}
