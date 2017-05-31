package Monster;
import Basic_Status.MonSter_BasicStatus;

public class Unique_Monster extends MonSter_BasicStatus{
	
	public Unique_Monster()
	{
		Hp_Rate = 101;
		Attack_Rate = 21;
		Defence_Rate = 101;
		Evasion_Rate = 6;
		
		Add_Hp = 800;
		Add_Attack = 90;
		Add_Defence = 90;
		
		Set_Monster_Status();
	}

}
