package studio7;

public class HockerPlayer {
	
	private String name;
	private int jerseyNum;
	private String hand;
	private int goals;
	private int assists;
	private int points;
	private int numGames;
	
	public HockerPlayer(String name,int jerseyNum,String hand,
			int initGoals,int initAssists,int initNumGames) {
		this.name = name;
		this.jerseyNum = jerseyNum;
		this.hand = hand;
		this.goals = initGoals;
		this.assists = initAssists;
		this.points = goals + assists;
		this.numGames = initNumGames;
	}
	
	public HockerPlayer() {
		this.name = "";
		this.jerseyNum = 0;
		this.hand = "";
		this.goals = 0;
		this.assists = 0;
		this.points = goals + assists;
		this.numGames = 0;
	}
	
	public int getJerseyNum() {
		return jerseyNum;
	}
	
	public String getHand() {
		return hand;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGoals() {
		return goals;
	}
	
	public int getAssists() {
		return assists;
	}
	
	public int getPoints() {
		return points;
	}
	
	public int getNumGames() {
		return numGames;
	}
	
	public String toString() {
		return "name:" + name + " jerset number:" + jerseyNum + " hand:" + hand + 
				" goals:" + goals + " assists:" + assists + " points:" + points
				+ " number of games:" + numGames;
				}
	
	public void playGames(int goals, int assists) {
		this.goals += goals;
		this.assists += assists;
		this.points = this.goals + this.assists;
		this.numGames += 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HockerPlayer p = new HockerPlayer("Amy",10,"right",0,0,0);
		System.out.println(p);
		p.playGames(5,5);
		System.out.println(p);

	}

}
