package Monster;
import Basic_Status.MonSter_BasicStatus;

public class Common_Monster extends MonSter_BasicStatus{
	
	public Common_Monster()
	{
		Hp_Rate = 101;
		Attack_Rate = 11;
		Defence_Rate = 11;
		Evasion_Rate = 3;
		
		Set_Monster_Status();
	}
}
