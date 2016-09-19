package mytholigyGame;

public class abilityCards
	{
		String name;
		int powerUp; 
		int powerDown; 
		
		public abilityCards(String nm, int pu, int pd)
		{
			name = nm;
			powerUp = pu;
			powerDown = pd;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getPowerUp()
			{
				return powerUp;
			}

		public void setPowerUp(int powerUp)
			{
				this.powerUp = powerUp;
			}

		public int getPowerDown()
			{
				return powerDown;
			}

		public void setPowerDown(int powerDown)
			{
				this.powerDown = powerDown;
			}
		

	}
