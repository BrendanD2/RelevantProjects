import java.text.DecimalFormat;
import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		// Creating a scanner.
		Scanner in = new Scanner(System.in);
		// Asking the user for the team name in two words for the city and name.
		System.out.println("Enter the Team Name(City and Name): ");
		String name = in.next();
		name += " " + in.next();
		//Asking for the size of the teams roster.
		System.out.println("How big is the roster? ");
		int size = in.nextInt();
		size++;
		
		// Creating a new roster with the size and setting the name of it based on the information given by the user.
		Roster team1 = new Roster(size);
		team1.setName(name);
		// Asking for the players name, position, and stat totals. Loops through based on how big the roster is.
		for (int y = 1; y < size; y++) {
			Scanner input = new Scanner(System.in);
			Player newPlayer = new Player();
			System.out.println("Enter the players Last name: ");
			String plName = input.next();
			newPlayer.setName(plName);
			
			System.out.println("Enter the players position: ");
			String position = input.next();
			newPlayer.setPosition(position);
			
			System.out.println("Enter total points: ");
			double points = input.nextDouble();
			newPlayer.setPoints(points);
			
			System.out.println("Enter total rebounds: ");
			double rebounds = input.nextDouble();
			newPlayer.setRebounds(rebounds);
			
			System.out.println("Enter total assists: ");
			double assists = input.nextDouble();
			newPlayer.setAssists(assists);
			
			System.out.println("Enter total steals: ");
			double steals = input.nextDouble();
			newPlayer.setSteals(steals);
			
			System.out.println("Enter total blocks: ");
			double blocks = input.nextDouble();
			newPlayer.setBlocks(blocks);
			
			System.out.println("Enter total games: ");
			double games = input.nextDouble();
			newPlayer.setGames(games);
			
			System.out.println("Enter total turnovers: ");
			double turnovers = input.nextDouble();
			newPlayer.setTurns(turnovers);
			// Adding this new player to the roster.
			team1.AddPlayer(newPlayer, y);
			System.out.println();
			
			
		}
		
		
		System.out.println();
		// Asking for the team wins and losses. And asking for the teams total points scored and allowed.
		Scanner input2 = new Scanner(System.in);
		System.out.println("How many wins do the " + team1.getName() + " have? ");
		double wins = input2.nextDouble();
		team1.setWins(wins);
		System.out.println("How many loses does the " + team1.getName() + " have? " );
		double losses = input2.nextDouble();
		team1.setLosses(losses);
		team1.setTotalPlayers(15);
		System.out.println("How many total points do the " + team1.getName() + " have? ");
		double totalpoints = input2.nextDouble();
		team1.setTotalPts(totalpoints);
		System.out.println("How many total points have the " + team1.getName() + " allowed? ");
		double Pallowed = input2.nextDouble();
		team1.setPtsAllowed(Pallowed);
		System.out.println();
		
		// Doing the same code above for a new team so that the user can compare both teams when hes done.
		Scanner in3 = new Scanner(System.in);
		System.out.println("Enter the Team Name (City and Name): ");
		String name2 = in3.next();
		name2 += " " + in3.next();
		
		System.out.println("How big is the roster? ");
		int size2 = in3.nextInt();
		size2++;
		
		Roster team2 = new Roster(size2);
		team2.setName(name2);
		for (int y = 1; y < size2; y++) {
			Scanner input = new Scanner(System.in);
			Player newPlayer = new Player();
			System.out.println("Enter the players name: ");
			String plName = input.next();
			newPlayer.setName(plName);
			
			System.out.println("Enter the players position: ");
			String position = input.next();
			newPlayer.setPosition(position);
			
			System.out.println("Enter total points: ");
			double points = input.nextDouble();
			newPlayer.setPoints(points);
			
			System.out.println("Enter total rebounds: ");
			double rebounds = input.nextDouble();
			newPlayer.setRebounds(rebounds);
			
			System.out.println("Enter total assists: ");
			double assists = input.nextDouble();
			newPlayer.setAssists(assists);
			
			System.out.println("Enter total steals: ");
			double steals = input.nextDouble();
			newPlayer.setSteals(steals);
			
			System.out.println("Enter total blocks: ");
			double blocks = input.nextDouble();
			newPlayer.setBlocks(blocks);
			
			System.out.println("Enter total games: ");
			double games = input.nextDouble();
			newPlayer.setGames(games);
			
			System.out.println("Enter total turnovers: ");
			double turnovers = input.nextDouble();
			newPlayer.setTurns(turnovers);
			
			team2.AddPlayer(newPlayer, y);
			System.out.println();
			
		}
		
		
		System.out.println();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("How many wins do the " + team2.getName() + " have? ");
		double wins2 = input3.nextDouble();
		team2.setWins(wins2);
		System.out.println("How many loses does the " + team2.getName() + " have? " );
		double losses2 = input3.nextDouble();
		team2.setLosses(losses2);
		team2.setTotalPlayers(15);
		System.out.println("How many total points do the " + team2.getName() + " have? ");
		double tp = input3.nextDouble();
		team2.setTotalPts(tp);
		System.out.println("How many total points have the " + team2.getName() + " allowed? ");
		double PA = input3.nextDouble();
		team2.setPtsAllowed(PA);
		System.out.println();
		
		// Comparing the team stats (wins, losses, points scored and allowed).
		team1.compareTeams(team2);
		System.out.println();
		// Comparing the rosters (individual per game stats).
		team1.compareRosters(team2);
		System.out.println();
		System.out.println();
		
		// Creating two new players with self added information and then comparing them.
		Player Lebron = new Player("Lebron James", "SF");
		Lebron.setPoints(1544);
		Lebron.setAssists(636);
		Lebron.setRebounds(473);
		Lebron.setBlocks(30);
		Lebron.setSteals(74);
		Lebron.setGames(60);
		Lebron.setTurns(239);
		
		Player Doncic = new Player("Luka Doncic", "SG"); 
		Doncic.setPoints(1549);
		Doncic.setAssists(470);
		Doncic.setRebounds(502);
		Doncic.setSteals(59);
		Doncic.setBlocks(10);
		Doncic.setGames(54);
		Doncic.setTurns(227);
		
		// Compares the new players by printing their stats side-by-side.
		Lebron.comparePlayer(Doncic);
		}
	}
	


class Team{
	// Creating a team class with variables that fit team descriptions. 
	String name;
	double wins;
	double losses;
	double players;
	double totalpoints;
	double pointsallowed;
	Team(){
		// no-arg constructor
	}
	Team(String newName, double newWins, double newLosses, double totalPlayers, double newtotalPoints,
			double newpointsAllowed){
		// Constructor
		this.name = newName;
		this.wins = newWins;
		this.losses = newLosses;
		this.players = totalPlayers;
		this.totalpoints = newtotalPoints;
		this.pointsallowed = newpointsAllowed;
	}
	// Getters and setters for each variable so that the user can change them any time.
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public double getWins() {
		return wins;
	}
	public void setWins(double w) {
		this.wins = w;
	}
	public double getLosses() {
		return losses;
	}
	public void setLosses(double l) {
		this.losses = l;
	}
	// Finding the win percentage based on wins and losses.
	public String getWinpct() {
		DecimalFormat df = new DecimalFormat("#.###");
		double wl = wins / (wins + losses);
		return df.format(wl);
	}
	// More getters and setters.
	public double getTotalPlayers() {
		return players;
	}
	public void setTotalPlayers(double tp) {
		this.players = tp;
	}
	public double getTtlPts() {
		return totalpoints;
	}
	public void setTotalPts(double tpt) {
		this.totalpoints = tpt;
	}
	public double getPtsAllowed() {
		return pointsallowed;
	}
	public void setPtsAllowed(double pa) {
		this.pointsallowed = pa;
	}
	// Getting points scored per games based on the total points and games played(wins + losses).
	public String getPtsPG() {
		DecimalFormat df = new DecimalFormat("###.###");
		double totalpg = totalpoints / (wins + losses);
		return df.format(totalpg);
		
	}
	// Getting the points allowed per game.
	public String getPtsAPG() {
		DecimalFormat df = new DecimalFormat("###.###");
		double allowedpg = pointsallowed / (wins + losses);
		return df.format(allowedpg);
	}
	
	public void printTeam() {
		// Printing the teams name, wins, losses, win percentage, roster size, and points scored and allowed per game.
		System.out.println("Name: " + this.getName());
		System.out.println(" Wins: " + this.getWins());
		System.out.println(" Losses: " + this.getLosses());
		System.out.println(" Win/Loss percentage: " + this.getWinpct());
		System.out.println(" Roster: " + this.getTotalPlayers() + " players");
		System.out.println(" Total Points PG: " + this.getPtsPG() + " points per game ");
		System.out.println(" Points Allowed PG: " + this.getPtsAPG() + " points allowed per game ");
	}
	// Comparing teams method by printing out the two teams side by side.
	public void compareTeams(Team team2) {
		this.printTeam();
		System.out.println();
		team2.printTeam();
	}
}
class Stats{
	// Stats class that has total points, rebounds, assists, steals, blocks, games, and turnovers. 
	double points;
	double rebounds;
	double assists;
	double steals;
	double blocks;
	double games;
	double turnovers;
	Stats(){
		// no-arg constructor
	}
	Stats(double totalPts, double totalRebs, double totalAst, double totalStl, double totalBlks, double gamesPlayed, double totalTurns){
		// Constructor
		this.points = totalPts;
		this.rebounds = totalRebs;
		this.assists = totalAst;
		this.steals = totalStl;
		this.blocks = totalBlks;
		this.games = gamesPlayed;
		this.turnovers = totalTurns;
	}
	// Getters and setters for each variable.
	public double getPoints() {
		return points;
	}
	public void setPoints(double p) {
		this.points = p;
	}
	public double getAssists() {
		return assists;
	}
	public void setAssists(double a) {
		this.assists = a;
	}
	public double getRebounds() {
		return rebounds;
	}
	public void setRebounds(double r) {
		this.rebounds = r;
	}
	public double getSteals() {
		return steals;
	}
	public void setSteals(double s) {
		this.steals = s;
	}
	public double getBlocks() {
		return blocks;
	}
	public void setBlocks(double b) {
		this.blocks = b;
	}
	public double getGames() {
		return games;
	}
	public void setGames(double g) {
		this.games = g;
	}
	public double getTurnovers() {
		return this.turnovers;
	}
	public void setTurns(double t) {
		this.turnovers = t;
	}
	// Getting per game stats for each variable based on the total divided by games. 
	public double getPPG() {
		return points / games;
	}
	public double getRPG() {
		return rebounds / games;
	}
	public double getAPG() {
		return assists / games; 
	}
	public double getSPG() {
		return steals / games;
	}
	public double getBPG() {
		return blocks / games;
	}
	public double getTOPG() {
		return turnovers / games;
	}
}
class Player extends Stats{
	// Player class that extends stats. Variables are name and position. 
	String name;
	String position;
	Player(){
		// no-arg constructor
	}
	Player(String newName, String newPosition){
		// constructor with arguments.
		super.points = points;
		super.assists = assists;
		super.rebounds = rebounds;
		super.blocks = blocks;
		super.steals = steals;
		super.games = games;
		this.name = newName;
		this.position = newPosition;
	}
	// Getters and setters for the name and position.
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String p) {
		this.position = p;
	}
	// Printing a players name and position.
	public void printPlayer() {
		System.out.println("Name: " + this.getName() + "  Position: " + this.getPosition());
	}
	public void printPlayerStats() {
		// Printing a players name, position, and per game stat for every category.
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("Name: " + this.getName() + " Position: " + this.getPosition() + " PPG: " + df.format(this.getPPG()) + " RPG: " + df.format(this.getRPG()) + 
				" APG: " + df.format(this.getAPG()) + " SPG: " + df.format(this.getSPG()) + " BPG: " + df.format(this.getBPG())); 
	}
	public String ArrayStats(int y) {
		// Putting the name, position, and per game stats into a String array. returning the given spot in the array.
		DecimalFormat df = new DecimalFormat("###.##");
		String[] stats = new String[9];
		stats[0] = this.getName();
		stats[1] = this.getPosition();
		stats[2] = df.format(this.getPPG());
		stats[3] = df.format(this.getRPG());
		stats[4] = df.format(this.getAPG());
		stats[5] = df.format(this.getSPG());
		stats[6] = df.format(this.getBPG());
		stats[7] = df.format(this.getTOPG());
		stats[8] = df.format(this.getGames());
		return stats[y];
	}
	// Comparing player method by printing both players stats side-by-side.
	public void comparePlayer(Player p) {
		this.printPlayerStats();
		p.printPlayerStats();
	}
	
}
class Roster extends Team{
	// Roster class that extends Team. integer roster size variable and a String matrix for the roster.
	int rosterSize = 0;
	String[][] roster = new String[rosterSize][9];
	
	Roster(){
		// No-arg constructor that put in the labels.
		String[] labels = new String[] {"Name", "Position", "PPG", "RPG", "APG", "SPG", "BPG", "TOPG", "Games"};{
			for (int i = 0; i < 9; i++) {
				roster[0][i] = labels[i];
			}
			}
	}
	Roster(int newRosterSize){
		// Constructor that makes the matrix the size of the given roster size and adds in the labels.
		this.rosterSize = newRosterSize;
		this.roster = new String[newRosterSize][9];
		String[] labels = new String[] {"Name", "Position", "PPG", "RPG", "APG", "SPG", "BPG", "TOPG", "Games"};{
			for (int i = 0; i < 9; i++) {
				roster[0][i] = labels[i] + " | ";
			}
			}
	}
	// Adding a player method into the spot on the matrix. 
	public void AddPlayer(Player newPlayer, int spot) {
		int j = spot;
		while (j == spot){
			// Uses the ArrayStats method to get all of the needed stats.
			for (int i = 0; i < 9; i++) {
				roster[j][i] = newPlayer.ArrayStats(i) + " | ";
			}
			j++;
		}
	}
	// Prints out the entire roster of a team.
	public void printRoster() {
		System.out.println(this.getName());
		for (int i = 0; i < this.rosterSize; i++) {
			for (int y = 0; y < 9; y++) {
				System.out.print(roster[i][y] + " ");
			}
			System.out.println();
		}
	}
	// Comparing roster method that prints two rosters side-by-side.
	public void compareRosters(Roster team2) {
		this.printRoster();
		System.out.println();
		team2.printRoster();
	}
}
	
