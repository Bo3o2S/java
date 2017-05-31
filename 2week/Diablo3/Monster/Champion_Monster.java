package Monster;
import Basic_Status.MonSter_BasicStatus;
import java.util.Random;

public class Champion_Monster extends MonSter_BasicStatus{
	
	public Champion_Monster()
	{
		Hp_Rate = 101;
		Attack_Rate = 11;
		Defence_Rate = 101;
		Evasion_Rate = 3;
		
		Add_Hp = 400;
		Add_Attack = 40;
		Add_Defence = 40;
		
		Set_Monster_Status();
	}
}
