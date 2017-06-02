package Monster_Unit;

import Monster_Type.Boss_Monster;

public class Butcher extends Boss_Monster{ 	// 첫번째 스테이지 보스
	
	public Butcher() 						// 초기화
	{
		Name = "도살자";
		S1 = "갈고리 날리기";
		S2 = "화염 일으키기";
		S3 = "충돌";
		Damage_S1= 4.0;
		Damage_S2= 4.0;
		Damage_S3= 5.0;
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
		Damage = Attack*Damage_S2;
		bar();
		Skill_Comment(S2, Damage);
		return Damage;
	}
	
	public double Skill_3()
	{
		double Damage = 0;
		Damage = Attack*Damage_S3;
		bar();
		Skill_Comment(S3, Damage);
		return Damage;
	}
}
