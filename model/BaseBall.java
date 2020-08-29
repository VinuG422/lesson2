package model;

import java.util.Random;

public class BaseBall {
	
	// We need three one random generated and one for strike 
	// BallCount, and StrikeCount. 

	private int[] key  = new int[3]; // User enter three digits.
	private int[] guess = new int[3]; // when you enter the number the computer check 
	//generate number and you enter number match. 
	private int ballCount =0; // count the number 
	private int strikeCount =0;// if generated number and you enter number maches 
	// it wil be stickeCount.  

	public void BaseballGame(){
		generateKey(); // It produces three numbers. 
	}

	private void generateKey(){
		// This code will generate 3 numbers between 0 to 9. 
		 Random r = new Random(10);
		key[0] =r.nextInt(10);

		do{

			key[1] = r.nextInt();
		}while(key[1]==key[0]);

		do{
			key[2] = r.nextInt(10);
		} while(key[2]== key[0] || key[2]==key[1]);
		
	}
	public int[] getkey(){
		return key;
	}
		


	}



}