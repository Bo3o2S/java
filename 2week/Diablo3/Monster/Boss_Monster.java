package Monster;
import Basic_Status.MonSter_BasicStatus;

public class Boss_Monster extends MonSter_BasicStatus{

	public Boss_Monster()
	{
		Hp_Rate = 301;
		Attack_Rate = 101;
		Defence_Rate = 101;
		Evasion_Rate = 6;
		
		Add_Hp = 1100;
		Add_Attack = 490;
		Add_Defence = 390;
		
		Set_Monster_Status();
	}
}
