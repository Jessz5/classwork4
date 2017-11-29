package pokemon;

public class Pokemon {
	int level;
	int hp;
	String name;
	boolean poisoned;
	
	public Pokemon(String name, int level) {
		hp = 100;
		poisoned = false;
	}
	
	public void iChooseYou() {
		System.out.print(name);
	}
	
	public int getHp() {
		return hp;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setHP(int newHP) {
		newHP = 100;
	}
	
	public void setPoisoned(boolean b) {
		b = poisoned;
	}
	
	public void lapse() {
		hp =- 15;
	}
	
	public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
	}
	
	public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
		 attack.attack(target);
		 System.out.println("The attack hit");
		 }else{
		 System.out.println("The attack missed");
		 }
	 }
	
	public void levelUp(Effect e) {
		this.level++;
		e.happens();
	}
	
}
