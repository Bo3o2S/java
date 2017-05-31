package Monster_Skill;

import Monster.Common_Monster;

public class Common_Monster_Skill extends Common_Monster{
	
	double Damage_S1= 1.5;
	
	public double Skill_1()
	{
		double Damage = 0;
		Damage = Attack*Damage_S1;
		bar();
		System.out.println("일반몬스터가 할퀴기를 시전합니다."+(int)Damage+"의 데미지를 받았습니다!");
		
		return Damage;
	}
	
	public double Skill_2()
	{
		double Damage = 0;
		return Damage;
	}
	
	public double Skill_3()
	{
		double Damage = 0;
		return Damage;
	}
	
}
