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
	@Column(name = "id")
	private long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "idade")
	private int idade;

	@Column(name = "rank")
	private String rank;

	@ManyToOne
	@JoinColumn(name = "missoes_id")
	private MissoesModel missoes;

	
}
