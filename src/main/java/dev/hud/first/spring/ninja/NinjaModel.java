package dev.hud.first.spring.ninja;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import dev.hud.first.spring.missoes.MissoesModel;

@Entity //transforma uma classe em uma entidade do banco de dados
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome, email;
	private int idade;

	@ManyToOne
	@JoinColumn(name = "missoes_id")
	private MissoesModel missoes;

	
}
