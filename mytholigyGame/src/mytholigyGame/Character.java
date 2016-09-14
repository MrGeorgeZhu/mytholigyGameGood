package mytholigyGame;

public class Character
	{
		String nation;
		String monster1;
		String monster2;
		String monster3;
		int numberOfmonsters;
			
			public Character (String n, String m1, String m2, String m3, int nOfM)
				{
					nation = n;
					monster1 = m1;
					monster2 = m2;
					monster3 = m3;
					numberOfmonsters = nOfM;
				}

			public String getNation()
				{
					return nation;
				}

			public void setNation(String nation)
				{
					this.nation = nation;
				}

			public String getMonster1()
				{
					return monster1;
				}

			public void setMonster1(String monster1)
				{
					this.monster1 = monster1;
				}

			public String getMonster2()
				{
					return monster2;
				}

			public void setMonster2(String monster2)
				{
					this.monster2 = monster2;
				}

			public String getMonster3()
				{
					return monster3;
				}

			public void setMonster3(String monster3)
				{
					this.monster3 = monster3;
				}

			public int getNumberOfmonsters()
				{
					return numberOfmonsters;
				}

			public void setNumberOfmonsters(int numberOfmonsters)
				{
					this.numberOfmonsters = numberOfmonsters;
				}
			

	}
