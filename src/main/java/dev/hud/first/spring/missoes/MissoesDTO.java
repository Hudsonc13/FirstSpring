package dev.hud.first.spring.missoes;

import dev.hud.first.spring.ninja.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesDTO {

    private int id;
    private String nome;
    private String dificuldade;
    private List<NinjaModel> ninjas;

}
