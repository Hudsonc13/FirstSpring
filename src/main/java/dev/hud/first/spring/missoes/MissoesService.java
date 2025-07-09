package dev.hud.first.spring.missoes;



import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MissoesService {

    MissoesRepository missoesRepository;
    MissoesMapper missoesMapper;

    public MissoesService(MissoesRepository missoesRepository, MissoesMapper missoesMapper) {
        this.missoesRepository = missoesRepository;
        this.missoesMapper = missoesMapper;
    }

    public List<MissoesDTO> listarTodasMissoes() {

        List<MissoesModel> missoesModels = missoesRepository.findAll();
        return missoesModels.stream()
                .map(missoesMapper::map)
                .collect(Collectors.toList());
    }

    public MissoesDTO buscarPorId(Long id) {
        MissoesModel missoesModel = missoesRepository.findById(id).orElse(null);
        return missoesMapper.map(missoesModel);
    }


    public MissoesDTO salvar(MissoesDTO missoesDTO) {
        MissoesModel missao = missoesMapper.map(missoesDTO);
        missoesRepository.save(missao);
        return missoesMapper.map(missao);
    }


}
