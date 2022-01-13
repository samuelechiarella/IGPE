package tournament_object;


import java.util.List;

import javafx.scene.image.Image;


public class Team {
	
	public List <Team> team;
    public Image logo;
	public String nameTeam;
	public String descrizione;
	public String nameLeader;
	
	
	public Team(Image logo, String nameTeam,String descrizione, String nameLeader)
	{
		this.logo = logo;
		this.nameTeam = nameTeam;
		this.descrizione = descrizione;
		this.nameLeader = nameLeader; 
		team.add(this);
	}
	public Image getLogo() {
		return logo;
	}
	public void setName(Image logo) {
		this.logo = logo;
	}
	public String getName() {
		return nameTeam;
	}
	public void setName(String name) {
		this.nameTeam = name;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setTeamSize(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getNameLeader() {
		return nameLeader;
	}
	public void setNameLeader(String nameLeader) {
		this.nameLeader = nameLeader;
	}
	@Override
	public String toString() {
		return "Team [logo=" + logo + ", nameTeam=" + nameTeam + ", descrizione=" + descrizione + ", nameLeader="
				+ nameLeader + "]";
	}
 

}
