package dev.hud.first.spring;


import dev.hud.first.spring.missoes.MissoesDTO;
import dev.hud.first.spring.missoes.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {


    MissoesService missoesService;


    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/TodasMissoes")
    public List<MissoesDTO> TodasMissoes() {
        return missoesService.listarTodasMissoes();
    }

    @GetMapping("/TodasMissoes/{id}")
    public MissoesDTO TodasMissoesPorId(@PathVariable Long id) {
        return missoesService.buscarPorId(id);
    }

    @PostMapping("/publicarMissao")
    public MissoesDTO save(@RequestBody MissoesDTO missoesDTO) {
        return missoesService.salvar(missoesDTO);
    }



}
