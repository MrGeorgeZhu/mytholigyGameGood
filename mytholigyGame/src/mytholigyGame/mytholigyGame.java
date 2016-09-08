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
			for(int row=0; row<board.length; row++)
				{
					for (int col=0; col<board[0].length; col++)
						{
							for(int z=0; z<board[0][0].length; z++)
								{
								board[row][col][z]=0;
															
								}
						}
				}
			board[1][2][3];
			for(int row=0; row<board.length; row++)
				{
					for (int col=0; col<board[0].length; col++)
						{
							for(int z=0; z<board[0][0].length; z++)
								{
								System.out.print(board[row][col][z]);
															
								}
							System.out.println();
						}
					System.out.println();
				}
			}

	}
