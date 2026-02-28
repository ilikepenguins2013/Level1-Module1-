package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	void quack () {
		System.out.println("i have " + numberOfFriends + " friends. quack");
	}
	
	void waddle() {
		System.out.println("my favorite food is " + favoriteFood + ". bye. waddle waddle (you never see the duck again in ur life)");
	}
}
