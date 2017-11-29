package pokemon;

public class MainBattle {

	 public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Squirtle is preparing to attack with water blast");
		 squirtle.attack(bulbasaur, new Attack() {
		 
		 public void attack(Pokemon target) {
		 int hp = target.getHp();
		 target.setHP(hp/2);
		 }
		 });
		 System.out.println("Bulbasaur is preparing to attack with poison.");
		 bulbasaur.attack(squirtle, new Attack() {
		 
		 public void attack(Pokemon target) {
		 target.setPoisoned(true);
		 }
		 });
		 squirtle.lapse();
		 bulbasaur.lapse();
		 printScore(squirtle, bulbasaur);
		 System.out.println("Squirtle is attacking again");
		 squirtle.attack(bulbasaur, new Attack() {
			 
			 public void attack(Pokemon target) {
				int oldHP = target.getHp();
				target.setHP(oldHP -1);
			 }
		 });
		 printScore(squirtle, bulbasaur);
		 squirtle.levelUp(new Effect() {
			 
			 public void happen() {
				 squirtle
			 }

			@Override
			public void happens() {
				// TODO Auto-generated method stub
				
			}
		 });
		 }

	private static void printScore(Pokemon squirtle, Pokemon bulbasaur) {
		// TODO Auto-generated method stub
		
	}
}
