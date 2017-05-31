package Monster_Skill;

import Monster.Champion_Monster;

public class Champion_Monster_Skill extends Champion_Monster{
	double Damage_S1= 2.0;
	double Damage_S2= 2.0;
	double Damage_S3= 2.0;
	
	public double Skill_1()
	{
		double Damage = 0;
		Damage = Attack*Damage_S1;
		bar();
		System.out.println("유니크 몬스터가 융해를 시전합니다" + Damage + "를 받았습니다!");
		return Damage;
	}
	
	public double Skill_2()
	{
		double Damage = 0;
		Damage = Attack*Damage_S2;
		bar();
		System.out.println("유니크 몬스터가 역병를 시전합니다" + Damage + "를 받았습니다!");
		return Damage;
	}
	
	public double Skill_3()
	{
		double Damage = 0;
		Damage = Attack*Damage_S3;
		bar();
		System.out.println("유니크 몬스터가 포격을 시전합니다" + Damage + "를 받았습니다!");
		return Damage;
	}
}
