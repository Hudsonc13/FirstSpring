package dev.hud.first.spring.missoes;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarTodasMissoes() {
        return missoesRepository.findAll();
    }


}
