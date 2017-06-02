package Monster_Unit;

import Monster_Type.Boss_Monster;

public class Malthael extends Boss_Monster{		// 5스테이지 보스 : 말티엘
	
	public  Malthael()							// 생성자에서 변수 초기화
	{
		Name = "말티엘";
		S1 = "영혼구";
		S2 = "영혼안개";
		S3 = "파멸구름";
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
