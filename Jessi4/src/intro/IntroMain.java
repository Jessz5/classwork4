package intro;//this is a package declaration

//this is a class header (class declaration)
public class IntroMain {

	public static final String[] DESCRIPTIONS = {"is a teacher",
			"is a student",
			"is imaginary"
	
	};
		//declaration of a local variable
		//notice the use of the word 'new'
		//new must be used to call a constructor
		CodingConventions conventionsInstance = new CodingConventions("text",8);
		
		//instance method call
		conventionsInstance.doStuff();
	}
	
}
