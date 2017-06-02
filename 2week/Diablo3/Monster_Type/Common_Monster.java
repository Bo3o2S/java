package Monster_Type;
import Monster.MonSter;

public class Common_Monster extends MonSter{
	
	public Common_Monster()
	{
		HP_Chance = 101;
		Attack_Chance = 11;
		Defence_Chance = 11;
		Evasion_Chance = 3;
		
		HP_Rate = 20;
		Attack_Rate = 5;
		Defence_Rate = 5;
		
		Set_Monster_Status();
	}
}
