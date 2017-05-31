package Character;

import Basic_Status.Character_BasicStatus;

public class Monk extends Character_BasicStatus{
	
	//Monk 추가 스탯
	int Monk_Hp = 35;
	int Monk_Dex = 2;
	int Monk_Vitality = 1;
	int Monk_Defence = 2;
	int Monk_Evasion = 4;
	int Monk_Hp_Rate = 5;
	int Monk_Dex_Rate = 20;
	int Monk_Vital_Rate = 1;
	int Monk_Recovery_Rate = 1; 
	double Monk_Attack = 0.5;
	double Monk_Attack_Rate = 0.5;
	double Monk_Defence_Rate = 0.5;
	double Monk_Evasion_Rate = 0.1;
	
	public Monk()
	{
		HP = HP + Monk_Hp;
		Dex = Dex + Monk_Dex;
		Vitality = Vitality + Monk_Vitality;
		Attack = Attack + Monk_Attack;
		Attack_Rate = Attack_Rate + Monk_Attack_Rate;
		Defence = Defence + Monk_Defence;
		evasion = evasion + Monk_Evasion;
		HP_Rate = HP_Rate + Monk_Hp_Rate;
		Dex_Rate = Dex_Rate + Monk_Dex_Rate;
		Defence_Rate = Defence_Rate + Monk_Defence_Rate;
		Vitality_Rate = Vitality_Rate + Monk_Vital_Rate;
		Recovery_Rate = Recovery_Rate + Monk_Recovery_Rate;
		Evasion_Rate = Evasion_Rate + Monk_Evasion_Rate;
	}
	
}
