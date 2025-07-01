package dev.hud.first.spring;

import dev.hud.first.spring.ninja.NinjaModel;
import dev.hud.first.spring.ninja.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

	private NinjaService ninjaService;

	private NinjaController(NinjaService ninjaService) {
		this.ninjaService = ninjaService;
	}


	@GetMapping("/boasvindas")
	public String mensagem() {
		return "primeira mensagem nessa rota";
	}
	
	@GetMapping("/num")
	public int msg() {
		return 4010;
	}


	//retorna informações
	// @GetMapping

	@GetMapping("/listarTodos")
	public List<NinjaModel> listarTodos() {
		return ninjaService.listarTodos();
	}

	//Edita informações
	// @PostMapping

	@PostMapping("/createuser")
	public String create() {
		return "Cria usuario (Em breve)";
	}

	//Atualiza
	// @PutMapping
	@PutMapping("/edit")
	public String edit() {
		return "Edita informações (Em breve)";
	}

	//Remove
	// @DeleteMapping
	@DeleteMapping("/delete")
	public String delete() {
		return "Deleta usuario (Em breve)";
	}
	
	
	
}
