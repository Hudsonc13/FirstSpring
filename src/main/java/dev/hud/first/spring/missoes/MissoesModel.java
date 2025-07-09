package dev.hud.first.spring.missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hud.first.spring.ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true, name = "nome")
	private String nome;

	@Column(name = "dificuldade")
	private String dificuldade;

	@OneToMany(mappedBy = "missoes")
	@JsonIgnore
	private List<NinjaModel> ninjas;


}
