package missoes;

import dev.hud.first.spring.NinjaModel;
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
	private String nome, dificuldade;

	@OneToMany(mappedBy = "missoes")
	private List<NinjaModel> ninjas;


}
