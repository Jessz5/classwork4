package chatbotProject;

public class Chatbot {
	
	private String userName;
	private Topic jessi;
	private boolean chatting;
	
	public Chatbot() {
		jessi = new ChatbotJessi();
		userName = "unknown user";
		chatting = true;
	}
	
	public void startTalking() {
		ChatbotMain.print("Welcome to our chatbot! What is your name?");
		userName = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("What do you want to talk about?");
			String response = ChatbotMain.getInput();
			if(jessi.isTriggered(response)) {
				chatting = false;
				jessi.startChatting();
			}else {
				ChatbotMain.print("I'm sorry. I don't understand.");
			}
		}
	}
}
