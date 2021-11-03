package tournament_object;

import java.util.List;

public class Tournament {
	
public List<Team> team;
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
	public void addTeamOnTournament(String n,int size, String cpt)
	{
		team.add(new Team(n,size,cpt));
	}
	public void stampaPartecipanti()
	{
		System.out.println(team);
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
