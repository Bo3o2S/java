package Character;

public class Holy_Warrior extends Character_BasicStatus{
	
	// 성전사 추가 스탯
	int Holy_Hp = 40;
	int Holy_Strength = 2;
	int Holy_Vitality = 2;
	int Holy_Defence = 4;
	int Holy_Hp_Rate = 10;
	int Holy_Vital_Rate = 2;
	int Holy_Strength_Rate = 20;
	int Holy_Recovery_Rate = 2; 
	double Holy_Defence_Rate = 1;
	
	public Holy_Warrior()
	{
		HP = HP + Holy_Hp;
		Strength = Strength + Holy_Strength;
		Vitality = Strength + Holy_Vitality;
		Defence = Defence + Holy_Defence;
		HP_Rate = HP_Rate + Holy_Hp_Rate;
		Strength_Rate = Strength_Rate + Holy_Strength_Rate;
		Defence_Rate = Defence_Rate + Holy_Defence_Rate;
		Vitality_Rate = Vitality_Rate + Holy_Vital_Rate;
		Recovery_Rate = Recovery_Rate + Holy_Recovery_Rate;
	}
}
