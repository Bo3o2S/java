package Character;

public class Daemon_Hunter extends Character_BasicStatus{
	
	// 악마사냥꾼 추가 스탯
	int DH_Hp = 30;
	int DH_Dex = 2;
	int DH_Dex_Rate = 20;
	double DH_Attack = 1;
	double DH_evasion = 4;
	double DH_Attack_Rate = 1;
	double DH_Evasion_Rate = 0.1;
	
	public Daemon_Hunter()
	{
		HP = HP + DH_Hp;
		Dex = Dex + DH_Dex;
		Attack = Attack + DH_Attack;
		evasion = evasion + DH_evasion;
		Attack_Rate = Attack_Rate + DH_Attack_Rate;
		Evasion_Rate = Evasion_Rate + DH_Evasion_Rate;
	}
}
