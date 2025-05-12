package missoes;

import dev.hud.first.spring.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class MissoesModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome, dificuldade;

	@OneToMany(mappedBy = "missoes")
	private List<NinjaModel> ninjas;

	public MissoesModel() {
	}

	public MissoesModel(String nome, String dificuldade, int limiteninjas) {
		this.nome = nome;
		this.dificuldade = dificuldade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
}
