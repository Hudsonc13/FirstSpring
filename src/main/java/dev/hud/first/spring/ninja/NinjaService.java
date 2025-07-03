package dev.hud.first.spring.ninja;

import dev.hud.first.spring.missoes.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    public NinjaModel buscarPorId(Long id){
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel ninjaModel){
        return ninjaRepository.save(ninjaModel);
    }

    public void deletarNinja(Long id){
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        ninjaModel.ifPresent(ninja -> ninjaRepository.delete(ninja));
    }

}
