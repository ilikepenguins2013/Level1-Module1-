package _07_duck;

public class Penguin {
	int numberOfFishEaten;
	String favoriteActivity;
	
	Penguin(int fishEaten, String favActivity) {
		numberOfFishEaten = fishEaten;
		favoriteActivity = favActivity;
	}
	
	void play() {
		System.out.println("i am going to go " + favoriteActivity + ". cya");
	}
	
	void brag() {
		System.out.println("i have eaten " + numberOfFishEaten + " fish. that's more than you so yeah. hahahaha");
	}
}
