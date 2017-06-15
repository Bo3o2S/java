package Game;

import java.util.Random;

import Character.Character;
import Monster.MonSter;

public class Damage_Calculator
{
	public double Damage;
	public double Defence;
	public double Evasion;
	
	public Damage_Calculator(double Damage, Object object)
	{
		this.Damage = Damage;
		if(object instanceof Character)
		{
			this.Defence = ((Character)object).Defence;
			if(((Character)object).armor != null)
				this.Defence = this.Defence + ((Character)object).armor.Item_Defence;
			this.Evasion = ((Character)object).Evasion;
		}
		else if(object instanceof MonSter)
		{
			this.Defence = ((MonSter)object).Defence;
			this.Evasion = ((MonSter)object).Evasion;
		}
		
	}
	
	public double Damage_Conversion()
	{
		Random random = new Random();
		Damage = Damage-Defence*0.1;
		if( Evasion < random.nextInt(100)+1)
			return Damage;
		else
		{
			System.out.println("공격을 회피하였습니다!!!");
			return 0;
		}
	}
}