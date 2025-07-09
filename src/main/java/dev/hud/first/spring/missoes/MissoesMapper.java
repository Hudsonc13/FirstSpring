package dev.hud.first.spring.missoes;


import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {

    public MissoesModel map(MissoesDTO DTO){
        MissoesModel model = new MissoesModel();

        model.setId(DTO.getId());
        model.setDificuldade(DTO.getDificuldade());
        model.setNome(DTO.getNome());
        model.setNinjas(DTO.getNinjas());

        return model;
    }

    public MissoesDTO map(MissoesModel model){
        MissoesDTO dto = new MissoesDTO();

        dto.setId(model.getId());
        dto.setDificuldade(model.getDificuldade());
        dto.setNome(model.getNome());
        dto.setNinjas(model.getNinjas());

        return dto;
    }




}
