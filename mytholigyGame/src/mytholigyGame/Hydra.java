package mytholigyGame;

public class Hydra
	{
		private String nation;
		private int power;
		private String abilityCard;
		private String typeOfMonster;
		
		public Hydra (String n, int p, String ac, String typ)
			{
				nation = n;
				power = p;
				abilityCard = ac;
				typeOfMonster = typ;
			}

		public String getNation()
			{
				return nation;
			}

		public void setNation(String nation)
			{
				this.nation = nation;
			}

		public int getPower()
			{
				return power;
			}

		public void setPower(int power)
			{
				this.power = power;
			}

		public String getAbilityCard()
			{
				return abilityCard;
			}

		public void setAbilityCard(String abilityCard)
			{
				this.abilityCard = abilityCard;
			}
		public String gettypeOfMonster()
			{
				return typeOfMonster;
			}

		public void settypeOfMonster(String typeOfMonster)
			{
				this.typeOfMonster = typeOfMonster;
			}

	}
