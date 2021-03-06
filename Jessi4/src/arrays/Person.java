package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"Chr","M","L","Gr","Ph","B","Th"};
	public static final String[] FIRST_MIDDLE = {"isti","icha","era","eta","ala","ina","ara"};
	public static final String[] FIRST_END = {"","na","n","r","tian","s","rs","mp","les"};
	
	public static final String[] LAST_START = {"Tr","Br","L","Gr","Sh","B","Th"};
	public static final String[] LAST_MIDDLE = {"om","o","an","ola","et","e","is"};
	public static final String[] LAST_END = {"","son","ers","rian","ston","ck","sk","i","a"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	private Hobby hobby;
	private Person[] friends;
	private String nickname;
	
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		friends = new Person[3];
		this.nickname = createNickname(firstName);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		nickname = createNickname(firstName);
	}
	
	/** 
	 * chooses friends from People based on who is of the same class
	 * as this instance and who has the same hobbies
	 * @param people
	 */
	public void mingle(Person[] people) {
		System.out.println("I am in the class "+getClass()+ "." );
		for(Person p: people) {
			if(p != this) {
				p = betterFriend(p, friends[0]);
				
				addFriendToFirstPlace(p);
			}
		}
	}
	
	private Person betterFriend(Person p, Person q) {
		//having a friend is better than no friends at all 
		if(p == null) {
			return q;
		}
		if(q == null) {
			return p;
		}
		if(p.getClass() == this.getClass() && q.getClass() == this.getClass()) {
			if(p.hobby == this.hobby) {
				return p;
			}
			if(q.hobby == this.hobby) {
				return q;
			}
		}
		//if none these are true, just take p
		return p;
	}
	public void printFriends() {
		System.out.println("My name is "+firstName+lastName+" and these are my friends:");
		for(Person f: friends) {
			if(f != null) {
				System.out.println(f);
			}
		}
	}
	
	/**
	 * Moves all Person in friends back one index and puts p at index 0
	 */
	public void addFriendToFirstPlace(Person p) {
		//this for loop goes backwards...
		for(int i = friends.length-1; i > 0; i--) {
			//..and moves each friend back a position
			friends[i] = friends[i-1];
		}
	}
	
	//JAVA IS PASS_BY_VALUE
	//meaning the parameters of a method are just values,
	//so if you change those values, the original object is not affected
	// In this case, 'name' will not be changed, IN FACT NOTHING can change
	//this.firstName via name
	public static String createNickname(String name){
		String nickname = "";
		int secondVowelPsn = secondVowel(name);
		
		nickname = name.substring(0,secondVowelPsn);
		return nickname;
	}
	
	public static int secondVowel(String word){
		boolean foundVowel = false;
		word = word.toLowerCase();
		int index = word.length();
		for(int i = 0; i < word.length(); i++){
			if(word.substring(i, i+1).equals("a") || 
					word.substring(i, i+1).equals("e") ||
					word.substring(i, i+1).equals("i") ||
					word.substring(i, i+1).equals("o") ||
					word.substring(i, i+1).equals("u")) {
			}
			if(!foundVowel) {
				foundVowel = true;
			}else {
				return i;
			}
		}
		return index;
	}
	
	public String toString() {
		return "My name is "+firstName+" "+lastName+". Call me "+nickname+" and I live in "+home+". I like to "+hobby;
	}
}
