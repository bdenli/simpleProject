package simplePackage;

import java.util.Random;

public class MagicBall {

	public static String[] getStringSet(){

		String[] strSet = {"Maybe...", "Definitely!", "Ask Again!", "Don't count on it", "Absolutely", "Of course!", "Nope!","Yup!" };

		return strSet;
	}


	public static String selectAnswer(){

		Random randomGenerator = new Random();
		int random = randomGenerator.nextInt(getStringSet().length);

		return getStringSet()[random];
	}

	public static void main(String[] args) {

		System.out.println(selectAnswer());

	}

}
