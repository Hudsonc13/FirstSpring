package dev.hud.first.spring.ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

	final private NinjaService ninjaService;


	public NinjaController(NinjaService ninjaService) {
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
	public List<NinjaDTO> listarTodos() {
		return ninjaService.listarTodos();
	}

	@GetMapping("/listarTodos/{id}")
	public NinjaDTO listarTodosPorId(@PathVariable Long id) {
		return ninjaService.buscarPorId(id);
	}

	//Edita (Cria) informações
	// @PostMapping

	@PostMapping("/criarNinja")
	public NinjaDTO create(@RequestBody NinjaDTO ninja) {
		return ninjaService.criarNinja(ninja);
	}

	//Atualiza
	// @PutMapping
	@PutMapping("/edit/{id}")
	public NinjaDTO edit(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
		return ninjaService.atualizarNinja(id, ninja);
	}

	//Remove
	// @DeleteMapping
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) throws Exception {
		if (!ninjaService.deletarNinja(id)) {
			throw new Exception();

		}

	}


	
}
