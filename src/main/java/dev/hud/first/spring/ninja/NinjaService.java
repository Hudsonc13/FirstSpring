package dev.hud.first.spring.ninja;

import dev.hud.first.spring.missoes.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;


    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos

    public List<NinjaModel> listarTodos(){
        return ninjaRepository.findAll();
    }

}
