package Monster_Type;
import Monster.MonSter;

public class Boss_Monster extends MonSter{

	public Boss_Monster()
	{
		HP_Chance = 301;
		Attack_Chance = 101;
		Defence_Chance = 101;
		Evasion_Chance = 6;
		
		HP_Rate = 100;
		Attack_Rate = 20;
		Defence_Rate = 20;
		
		Add_HP = 1100;
		Add_Attack = 490;
		Add_Defence = 390;
		
		Set_Monster_Status();
	}
}
