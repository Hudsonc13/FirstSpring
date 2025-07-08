package dev.hud.first.spring.ninja;

import dev.hud.first.spring.missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO  {

    private long id;
    private String nome, email;
    private int idade;
    private MissoesModel missoes;
    private String rank;

}
