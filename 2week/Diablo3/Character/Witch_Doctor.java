package Character;

import Basic_Status.Character_BasicStatus;

public class Witch_Doctor extends Character_BasicStatus{
	
	// 부두술사  추가스탯
	int WD_Hp = 30;
	int WD_Intelligence = 2;
	int WD_Intelligence_Rate = 20;
	double WD_Attack = 1;
	double WD_Attack_Rate = 1;
	
	public Witch_Doctor()
	{
		HP = HP + WD_Hp;
		Intelligence = Intelligence + WD_Intelligence;
		Intelligence_Rate = Intelligence_Rate + WD_Intelligence_Rate;
		Attack = Attack + WD_Attack;
		Attack_Rate = Attack_Rate + WD_Attack_Rate;
	}
}
