package pokemon;

public class Pokemon {

	int level;
	int hp;
	String name;
	boolean poisoned;

	public Pokemon(String name, int level) {
		this.level=level;
		this.name=name;
		this.hp=100;
		this.poisoned=false;
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
	
	public void iChooseYou() {
		System.out.println(name);
		System.out.println(name);
	}

	public int getHp() {
		return hp;
	}

	public String getName() {
		return name;
	}

	public void setHp(int newHp) {
		this.hp=newHp;
	}

	public void setPoisoned(boolean b) {
		this.poisoned=b;
	}

	public void lapse() {
		if(poisoned)
			hp-=15;
	}

}