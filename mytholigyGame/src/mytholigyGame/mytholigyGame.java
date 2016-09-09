package mytholigyGame;

import java.util.Scanner;

public class mytholigyGame
	{
		static String input;
		static Scanner userInput = new Scanner(System.in);
		static int [][][] board=new int [3][4][5];

		public static void main(String[] args)
			{
				//wannaPlay();
				display();

			}
		public static void wannaPlay()
			{
				System.out.println("Hello! what is your name?");
				String name= userInput.nextLine();
				System.out.println("hello " + name);
				System.out.println("Would you like to play an awesome mytholigy game? please for yes please type (!) for no please type (2)");
				int yesOrNo= userInput.nextInt();
				if (yesOrNo == 1)
					{
						System.out.println("Awesome!");					
					}
				else 
					{
						System.exit(0);					
					}
			}
		public static void display()
			{
			for(int z=0; z<board.length; z++)
				{
					for (int row=0; row<board[0].length; row++)
						{
							for(int col=0; col<board[0][0].length; col++)
								{
								board[z][row][col]=1;							
								}
						}
				}
			board[0][1][2]=0;
			for(int z=0; z<board.length; z++)
				{
					for (int row=0; row<board[0].length; row++)
						{
							for(int col=0; col<board[0][0].length; col++)
								{
								System.out.print(board[z][row][col]);
															
								}
							System.out.println();
						}
					System.out.println();
				}
			
			}

	}
