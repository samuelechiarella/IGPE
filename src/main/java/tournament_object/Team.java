package tournament_object;

import javafx.scene.image.Image;

public class Team {
    public Image logo;
	public String nameTeam;
	public int teamSize;
	public String nameLeader;
	
	public Team() {
		
	}
	
	public Team(String nameTeam,int teamSize, String nameLeader)
	{
		this.nameTeam = nameTeam;
		this.teamSize = teamSize;
		this.nameLeader = nameLeader; 
	}
	public String getName() {
		return nameTeam;
	}
	public void setName(String name) {
		this.nameTeam = name;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getNameLeader() {
		return nameLeader;
	}
	public void setNameLeader(String nameLeader) {
		this.nameLeader = nameLeader;
	}

}
