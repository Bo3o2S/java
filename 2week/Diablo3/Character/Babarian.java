package Character;

import Basic_Status.Character_BasicStatus;

public class Babarian extends Character_BasicStatus{
	
	// 야만용사 추가 스탯
	int Baba_Hp = 40;
	int Baba_Strength = 2;
	int Baba_Vitality = 2;
	int Baba_Defence = 4;
	int Baba_Hp_Rate = 10;
	int Baba_Vital_Rate = 2;
	int Baba_Strength_Rate = 20;
	int Baba_Recovery_Rate = 2; 
	double Baba_Defence_Rate = 1;
	
	public Babarian()
	{
		HP = HP + Baba_Hp;
		Strength = Strength + Baba_Strength;
		Vitality = Strength + Baba_Vitality;
		Defence = Defence + Baba_Defence;
		HP_Rate = HP_Rate + Baba_Hp_Rate;
		Strength_Rate = Strength_Rate + Baba_Strength_Rate;
		Defence_Rate = Defence_Rate + Baba_Defence_Rate;
		Vitality_Rate = Vitality_Rate + Baba_Vital_Rate;
		Recovery_Rate = Recovery_Rate + Baba_Recovery_Rate;
	}
}
