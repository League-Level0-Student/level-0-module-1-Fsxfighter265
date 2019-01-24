package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		int CurrentRiddle = 0;
		int CurrentAwnsers = 0;
		String [] Riddles = {"You walk 1 mile South, West, then North \n" + 
							"and end up in the same Position. Where are you?", "What time of day is spelled the same forwards and backwards\n" + 
							"?", "What begins but has no end and is the ending of all that begins?", "I am heavy forwards and not backwards. What am I?"}; 
		String [] Awnsers = {"North Pole", "Noon", "Death", "Ton"};
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Data;
		// 4 . If they got the answer right, pop up "correct!" and increase the score by one
		for (int i = 0; i < 4; i++){
			Data = JOptionPane.showInputDialog(Riddles[CurrentRiddle]);
			if (Data.equals(Awnsers[CurrentAwnsers])){
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
				CurrentRiddle++;
				CurrentAwnsers++;
			// 5. Otherwise, say "wrong" and tell them the answer
			}else {
				JOptionPane.showMessageDialog(null, "Incorrect!");
				
			}
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		if (score == 4){
		JOptionPane.showMessageDialog(null, "Your Score is: " + score);
		}
	}
}

