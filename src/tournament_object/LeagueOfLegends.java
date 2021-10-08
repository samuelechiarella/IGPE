package tournament_object;

public class LeagueOfLegends extends Game {

	private static LeagueOfLegends instance = null;
	
	private LeagueOfLegends() {
		this.name = "League of Legends";
	}
	
	public static LeagueOfLegends getInstance() {
		if (instance == null)
			instance = new LeagueOfLegends();
		return instance;
	}
}
