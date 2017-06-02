package Job;

import Character.Character;

public class Monk extends Character{
	
	public int Spirit_Power = 250;
	
	
	public Monk()
	{
		// 성전사 기본 스탯 세팅
		Name = "수도사";
		Level_Num = 1;
		HP = 135;
		Attack = 5.5;
		Defence = 14;
		Evasion = 7;
		Strength = 8;
		Dex = 10;
		Intelligence = 8;
		Recovery = 10;
		Vitality = 10;
		Defence = 16;
		Gold = 5000;
		Exp = 100;
		
		// 레벨 증가시 수치 향상 비율
		HP_Rate = 195;
		Strength_Rate = 10; 
		Dex_Rate = 30;
		Defence_Rate = 10;
		Intelligence_Rate = 10;
		Vitality_Rate = 9;
		Recovery_Rate = 9;
		Vital_Hp_Rate = 0.05;
		Exp_Rate = 200;
		Attack_Rate = 10;
		Defence_Rate = 10;
		Evasion_Rate = 0.4;
	}
	
}
