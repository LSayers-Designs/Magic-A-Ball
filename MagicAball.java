//Magic "8" Ball app

import javax.swing.JOptionPane;

public class MagicAball 
{
	public static void main (String[]args)
	{
		//variables 
		String[] answers = {"Bird Up!", "Words, words, words, PUNCHLINE!!", "You didn't get the job at the fruit loops factory", "Ranch!!", "Legalize Everything.", "311 was an inside job.", "Aaaaaaaaaaaagggghhhhhhh!!!!!!!!!!!!!", "Hey, give it up for Hannibal Burges everybody!", "Battlefield Earth should have been a Tyler Perry movie", "Time to deliver a pizza ball!"};
		String question;
		final String CANCEL = "Nevermind I want to walk into the future ignorant of what is to come";
		
		do
		{
			//input phase
			question=JOptionPane.showInputDialog(null, "Time for Random Acts of Questions!  \n\nYou got questions?  Cracked A-Ball has your answers! \n\nInput your burning inquires below or type 'Nevermind I want to walk into the future ignorant of what is to come' to end the madness");
			
			int matchIndex = matchIndex=(int)(Math.random()*answers.length);
			
			if(question.equalsIgnoreCase("" ) )
				JOptionPane.showMessageDialog(null, "Do you really have nothing to ask the universe?");	
				
			else if(!question.equalsIgnoreCase(CANCEL) )
			{
				//math.random string array for cracked answer to question		
				JOptionPane.showMessageDialog(null, "Magic A-Ball says: " + answers[matchIndex] );
			}
		}
		while(!question.equalsIgnoreCase(CANCEL));
		JOptionPane.showMessageDialog(null, "Watch the Eric Andre Show Season 5 on Adult Swim!");	
	}
}