package dev.hud.first.spring.ninja;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NinjaService {

    final private NinjaRepository ninjaRepository;
    final private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }


    //Listar todos

    public List<NinjaDTO> listarTodos(){

        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjaMapper.map(ninjas);
    }

    public NinjaDTO buscarPorId(Long id){
        NinjaModel ninja = ninjaRepository.findById(id).orElse(null);
        return ninjaMapper.map(ninja);

    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO); //transforma DTO em model
        ninja = ninjaRepository.save(ninja); //salva o model no repositorio
        return ninjaMapper.map(ninja); // retorna o DTO

    }

    public boolean deletarNinja(Long id){
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        if(ninjaModel.isPresent()){
            ninjaRepository.delete(ninjaModel.get());
            return true;
        }
        else{
            return false;
        }
    }

    public NinjaDTO atualizarNinja(long id, NinjaDTO novoninja){
        NinjaModel ninja = ninjaMapper.map(novoninja);
        if(ninjaRepository.existsById(id)){
            novoninja.setId(id);
            ninjaRepository.save(ninja);
            return ninjaMapper.map(ninja);
        }
        return null;
    }




}
