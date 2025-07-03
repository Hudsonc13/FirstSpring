package dev.hud.first.spring;


import dev.hud.first.spring.missoes.MissoesModel;
import dev.hud.first.spring.missoes.MissoesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {


    MissoesService missoesService;


    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/TodasMissoes")
    public List<MissoesModel> TodasMissoes() {
        return missoesService.listarTodasMissoes();
    }

    @GetMapping("/TodasMissoes/{id}")
    public MissoesModel TodasMissoesPorId(@PathVariable Long id) {
        return missoesService.buscarPorId(id);
    }



}
