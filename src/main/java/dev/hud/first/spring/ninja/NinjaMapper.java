package dev.hud.first.spring.ninja;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = new NinjaModel();

        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());
        ninjaModel.setRank(ninjaDTO.getRank());

        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {
        NinjaDTO ninjaDTO = new NinjaDTO();

        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());
        ninjaDTO.setRank(ninjaModel.getRank());

        return ninjaDTO;
    }

    public List<NinjaDTO> map(List<NinjaModel> ninjaModel) {
        List<NinjaDTO> ninjaDTOList = new ArrayList<>();

        for (NinjaModel ninjaModel1 : ninjaModel) {
            NinjaDTO ninjaDTO = new NinjaDTO();

            ninjaDTO.setId(ninjaModel1.getId());
            ninjaDTO.setNome(ninjaModel1.getNome());
            ninjaDTO.setIdade(ninjaModel1.getIdade());
            ninjaDTO.setEmail(ninjaModel1.getEmail());
            ninjaDTO.setMissoes(ninjaModel1.getMissoes());
            ninjaDTO.setRank(ninjaModel1.getRank());

            ninjaDTOList.add(ninjaDTO);
        }


        return ninjaDTOList;
    }


}
