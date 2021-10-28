package tournament_object;

public class Tournament {
	
public String nameTournament;
public int sizeTournament;
public String categoria;

	public Tournament(String nameTournament, int sizeTournament,String categoria) {
		
		nameTournament = this.nameTournament;
		sizeTournament = this.sizeTournament;
		categoria = this.categoria;
	}

	public String getNameTournament() {
		return nameTournament;
	}

	public void setNameTournament(String nameTournament) {
		this.nameTournament = nameTournament;
	}

	public int getSizeTournament() {
		return sizeTournament;
	}

	public void setSizeTournament(int sizeTournament) {
		this.sizeTournament = sizeTournament;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
