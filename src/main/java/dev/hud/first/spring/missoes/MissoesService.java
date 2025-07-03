package dev.hud.first.spring.missoes;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarTodasMissoes() {
        return missoesRepository.findAll();
    }

    public MissoesModel buscarPorId(Long id) {
        Optional<MissoesModel> missao = missoesRepository.findById(id);
        return missao.orElse(null);
    }


}
