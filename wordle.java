/**
 * @(#)wordle.java
 *
 * Name:Brayden Johnstone
 * Period:7th
 *
 */

public class wordle {

	//You must use grid, secret, and row
	//You may create other instance variables        
	private char[][]  grid;
	private String secret;
	private int row;
	private  int guesses;
	
	public wordle() {
		grid = [12][5];
		secret = "purge";
		row = 12;
        guesses = 6;
		//initialize the instance variables
	}
	
	//tryWord() should receive a String word as a parameter, which is the player's guess
	//This method should:
		//convert this string to a chars and put it in the grid
		//check one letter a time to see if that letter is in the correct position or if the letter is in the word
		//changes the grid appropriately
	public void tryWord(String word)
	{
        char[] Player = new char[word.length()];
        for (int i = 0; i < word.length(); i++)
            Player[i] = word.ToCharArray(i);
            Player = grid.clone(Player);
            for(int i = 0; i< word.length(); i++)
                if(Player[i] = secret.indexOf(i) )
                    System.out.println("@");
                if()

        System.out.println(Arrays.toString(Player));

	}
	
	//Return true if the player has succesfully guessed the word
	public boolean isComplete()
	{
        if(tryWord =
		return false;
	}
	
	//Return true if the player is out of guesses
	public boolean outOfGuesses(int guesses)
	{
        for(int i = 0;i< 6;i++)

        return false;
	}
	
	//Return the number of guess left
	public int guessesLeft(int guesses)
	{
        for(int i = 0;i< 6;i++)
            guesses --;

        return guesses;
	}
	
	//Return the secret word, but only if the game is complete or the player ran out of guesses
	//This method is complete and you do not need to do any changes.
	public String getSecret()
	{
		if(isComplete() || outOfGuesses())
			return secret;
		else
			return "You can't have the word yet";
	}
	
	//Return a string version of the 2D array with appropriate spacing and new lines
	public String toString()
	{
		String temp="";
		
		return temp;
	}
}