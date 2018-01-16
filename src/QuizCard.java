package Chap14;

/**
 * 2013.04.10
 * Michel
 */
public class QuizCard {
	private String question;
	private String answer;
	
	public QuizCard(String q, String a){
		question = q;
		answer = a;
	}
	 
	public String getQuestion(){
		return question;
	}
	
	public String getAnswer(){
		return answer;
	}
}
