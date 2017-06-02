package Monster_Type;

import Monster.MonSter;

public class Champion_Monster extends MonSter{
	
	public Champion_Monster()
	{
		HP_Chance = 101;
		Attack_Chance = 11;
		Defence_Chance = 101;
		Evasion_Chance = 3;
		
		HP_Rate = 50;
		Attack_Rate = 10;
		Defence_Rate = 10;
		
		Add_HP = 400;
		Add_Attack = 40;
		Add_Defence = 40;
		
		Set_Monster_Status();
	}
}
