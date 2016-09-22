package mytholigyGame;


import java.util.ArrayList;
import java.util.Scanner;

public class mytholigyGame
	{
		static String input;
		static Scanner userInput = new Scanner(System.in);
		static String [][][] board=new String [3][4][5];
		static Athena a = new Athena ("Greek", 400, "Aegis", "god");
		static Achilles Ach = new Achilles ("Greek", 300, "dipped int the river sticks", "Hero");
		static Hydra h = new Hydra ("Greek", 250, "Multi attack", "monster");

		public static void main(String[] args)
			{
				//wannaPlay();
				displayBoard();
				startGame();
				game();
			}
		public static void wannaPlay()
			{
				System.out.println("Hello! what is your name?");
				String name= userInput.nextLine();
				System.out.println("hello " + name);
				System.out.println("Would you like to play an awesome mytholigy game? please for yes please type (1) for no please type (2)");
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
		public static void displayBoard()
			{
						for (int row=0; row<board[0].length; row++)
							{
								for(int col=0; col<board[0][0].length; col++)
									{
									board[0][row][col]="       ";							
									}
							}
						for (int row=0; row<board[0].length; row++)
							{
								for(int col=0; col<board[0][0].length; col++)
									{
									board[1][row][col]="   ";							
									}
							}
						for (int row=0; row<board[0].length; row++)
							{
								for(int col=0; col<board[0][0].length; col++)
									{
									board[2][row][col]="     ";							
									}
							}
			}
		public static void Board()
		{
				//cards = 7 char
				//enemies = 3 char
				//your characters = 5 char
				System.out.println("      1         2         3         4         5");
				System.out.println(" ---------------------------------------------------");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" | "+board[0][0][0]+" | "+board[0][0][1]+" | "+board[0][0][2]+" | "+board[0][0][3]+" | "+board[0][0][4]+" |");
				System.out.println("A|   "+board[1][0][0]+"   |   "+board[1][0][1]+"   |   "+board[1][0][2]+"   |   "+board[1][0][3]+"   |   "+board[1][0][4]+"   |");
				System.out.println(" |  "+board[2][0][0]+"  |  "+board[2][0][1]+"  |  "+board[2][0][2]+"  |  "+board[2][0][3]+"  |  "+board[2][0][4]+"  |");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" ---------------------------------------------------");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" | "+board[0][1][0]+" | "+board[0][1][1]+" | "+board[0][1][2]+" | "+board[0][1][3]+" | "+board[0][1][4]+" |");
				System.out.println("B|   "+board[1][1][0]+"   |   "+board[1][1][1]+"   |   "+board[1][1][2]+"   |   "+board[1][1][3]+"   |   "+board[1][1][4]+"   |");
				System.out.println(" |  "+board[2][1][0]+"  |  "+board[2][1][1]+"  |  "+board[2][1][2]+"  |  "+board[2][1][3]+"  |  "+board[2][1][4]+"  |");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" ---------------------------------------------------");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" | "+board[0][2][0]+" | "+board[0][2][1]+" | "+board[0][2][2]+" | "+board[0][2][3]+" | "+board[0][2][4]+" |");
				System.out.println("C|   "+board[1][2][0]+"   |   "+board[1][2][1]+"   |   "+board[1][2][2]+"   |   "+board[1][2][3]+"   |   "+board[1][2][4]+"   |");
				System.out.println(" |  "+board[2][2][0]+"  |  "+board[2][2][1]+"  |  "+board[2][2][2]+"  |  "+board[2][2][3]+"  |  "+board[2][2][4]+"  |");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" ---------------------------------------------------");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" | "+board[0][3][0]+" | "+board[0][3][1]+" | "+board[0][3][2]+" | "+board[0][3][3]+" | "+board[0][3][4]+" |");
				System.out.println("D|   "+board[1][3][0]+"   |   "+board[1][3][1]+"   |   "+board[1][3][2]+"   |   "+board[1][3][3]+"   |   "+board[1][3][4]+"   |");
				System.out.println(" |  "+board[2][3][0]+"  |  "+board[2][3][1]+"  |  "+board[2][3][2]+"  |  "+board[2][3][3]+"  |  "+board[2][3][4]+"  |");
				System.out.println(" |         |         |         |         |         |");
				System.out.println(" ---------------------------------------------------");
			}
		public static void rules()
			{
				//i will add rules here later
			}
		public static void startGame()
			{
				System.out.println("in order to start the game you first must know the game");
				System.out.println("do you know how to play (1) yes (2) no");
				int r= userInput.nextInt();
				if (r==1)
					{
						System.out.println("sweet");
					}
				else 
					{
						rules();
					}
				System.out.println("who would you rather be greek or Roman");
				System.out.println("type (1) for Greek");
				//play greek for now
				int nat= userInput.nextInt();
				if(nat==2)
					{
//						System.out.println("For the Senate and people of Rome!");
//						System.out.println("your 'characters' are Mars, Herculies, Cyclops");
//						c.setNation(c.getNation() + "Rome");
//						c.setMonster1(c.getMonster1() + "Mars");
//						c.setMonster2(c.getMonster2() + "Herculies");
//						c.setMonster3(c.getMonster3() + "Cyclops");	
//						ArrayList<gateCards> gateCards = new ArrayList<gateCards>();
//						gateCards.add(new gateCards("(1) Field of Battle", 100, 250));
//						gateCards.add(new gateCards("(2) Rome", 200, 0));
//						gateCards.add(new gateCards("(3) the Island of Scicely", 100, 100));
//						for (gateCards gc : gateCards)
//							{
//								System.out.println(gc.getName() + ": It adds " + gc.getPowerUp() + "power to all greeks and it subtracts " + gc.getPowerDown() + " power from all Romans.");
//							}
//						ArrayList<abilityCards> abilityCards = new ArrayList<abilityCards>();
//						abilityCards.add(new abilityCards("(1) legion", 500, 0));
//						abilityCards.add(new abilityCards("(2) dipped in the river sticks", 350, 0));
//						abilityCards.add(new abilityCards("(3) multi attack", 0, 300));
//						for (abilityCards ac : abilityCards)
//							{
//								System.out.println(ac.getName() + ": It adds " + ac.getPowerUp() + " power to all greeks and it subtracts " + ac.getPowerDown() + " power from all Romans.");
//							}
					}
				else
					{
						System.out.println("for Sparta! and the Greeks!");
						System.out.println("your 'characters' are Athena, Achilles, Hydra");
						System.out.println("with each character you get two cards. One set of cards are your gate cards");
						System.out.println("the other are your ability card");
						System.out.println("these are your gate cards ");
						ArrayList<gateCards> gateCards = new ArrayList<gateCards>();
						gateCards.add(new gateCards("(1) Athens", 300, 0));
						gateCards.add(new gateCards("(2) troy", 50, 200));
						gateCards.add(new gateCards("(3) Tartorus", 0, 300));
						for (gateCards gc : gateCards)
							{
								System.out.println(gc.getName() + ": It adds " + gc.getPowerUp() + " power to all greeks and it subtracts " + gc.getPowerDown() + " power from all Romans.");
							}
						System.out.println("each character get an ability card that you may use. these are your ability cards!");
						ArrayList<abilityCards> abilityCards = new ArrayList<abilityCards>();
						abilityCards.add(new abilityCards("(1) aegis", 500, 0));
						abilityCards.add(new abilityCards("(2) dipped in the river sticks", 350, 0));
						abilityCards.add(new abilityCards("(3) multi attack", 0, 300));
						for (abilityCards ac : abilityCards)
							{
								System.out.println(ac.getName() + ": It adds " + ac.getPowerUp() + " power to all greeks and it subtracts " + ac.getPowerDown() + " power from all Romans.");
							}
						board[0][1][2]="Athens ";	
						board[1][1][2]="Mrs";
						board[2][1][2]="Hydra";
						Board();
					}
				
				
			}
		public static void game()
			{
				System.out.println("all right lets start the game");
				boolean turn = true;
				while(turn)
					{
						System.out.println("do you want to place a card (1) yes (2) no");
						int nat= userInput.nextInt();
						if (nat==1)
							{
								System.out.println("which card would you like to place");
								ArrayList<gateCards> gateCards = new ArrayList<gateCards>();
								gateCards.add(new gateCards("(1) Athens", 300, 0));
								gateCards.add(new gateCards("(2) troy", 50, 200));
								gateCards.add(new gateCards("(3) Tartorus", 0, 300));
								for (gateCards gc : gateCards)
									{
										System.out.println(gc.getName() + ": It adds " + gc.getPowerUp() + " power to all greeks and it subtracts " + gc.getPowerDown() + " power from all Romans.");
									}
								int ble= userInput.nextInt();
								if (ble==1)
									{
										int rowChoice = 0;
										System.out.println("were would you like to place the Athens gate card. please type the row then the colom");
										System.out.println("for example A1");
										Scanner userInput1 = new Scanner(System.in);
										String bwa = userInput1.nextLine();
										switch (bwa.substring(0,1))
											{
											case "a":
											case "A":
												rowChoice = 0;
												break;
											case "b":
											case "B":
												rowChoice = 1;
												break;
											case "c":
											case "C":
												rowChoice = 2;
												break;
											case "d":
											case "D":
												rowChoice = 3;
												break;
											}
										int colChoice=Integer.parseInt(bwa.substring(1))-1;
										board[0][rowChoice][colChoice]= "Athens ";
										Board();
									}
								if (ble==2)
									{
										int rowChoice = 0;
										System.out.println("were would you like to place the Troy gate card please type the row then the column");
										System.out.println("for example A1");
										Scanner userInput2 = new Scanner(System.in);
										String bwa = userInput2.nextLine();
										switch (bwa.substring(0,1))
											{
											case "a":
											case "A":
												rowChoice = 0;
												break;
											case "b":
											case "B":
												rowChoice = 1;
												break;
											case "c":
											case "C":
												rowChoice = 2;
												break;
											case "d":
											case "D":
												rowChoice = 3;
												break;
											}
										int colChoice=Integer.parseInt(bwa.substring(1))-1;
										board[0][rowChoice][colChoice]= " Troy  ";
										Board();
									}
								if (ble==3)
									{
										int rowChoice = 0;
										System.out.println("were would you like to place the Tartorus gate card please type the row then the colom");
										System.out.println("for example A1");
										Scanner userInput3 = new Scanner(System.in);
										String bwa = userInput3.nextLine();
										switch (bwa.substring(0,1))
										{
										case "a":
										case "A":
											rowChoice = 0;
											break;
										case "b":
										case "B":
											rowChoice = 1;
											break;
										case "c":
										case "C":
											rowChoice = 2;
											break;
										case "d":
										case "D":
											rowChoice = 3;
											break;
										}
										int colChoice=Integer.parseInt(bwa.substring(1))-1;
										board[0][rowChoice][colChoice]= "Tartors";
										Board();
									}
							}
					}
			}

	}
