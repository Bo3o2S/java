package Monster_Type;
import Monster.MonSter;

public class Unique_Monster extends MonSter{
	
	public Unique_Monster()
	{
		HP_Chance = 101;
		Attack_Chance = 21;
		Defence_Chance = 101;
		Evasion_Chance = 6;
		
		HP_Rate = 80;
		Attack_Rate = 15;
		Defence_Rate = 15;
		
		Add_HP = 800;
		Add_Attack = 90;
		Add_Defence = 90;
		
		Set_Monster_Status();
	}

}
