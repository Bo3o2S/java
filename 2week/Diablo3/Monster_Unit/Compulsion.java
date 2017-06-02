package Monster_Unit;

import Monster_Type.Common_Monster;

public class Compulsion extends Common_Monster{ 	//일반 몬스터 : 강제자
	
	public  Compulsion() 							// 초기화
	{
		Name = "강제자";
		S1 = "조이기";
		Damage_S1= 1.5;
	}
	
	public double Skill_1()
	{
		double Damage = 0;
		Damage = Attack*Damage_S1;
		bar();
		Skill_Comment(S1, Damage);
		
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
