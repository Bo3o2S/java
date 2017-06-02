package Monster_Unit;

import Monster_Type.Boss_Monster;

public class Diablo extends Boss_Monster{	// 4번째 스테이지 보스 : 디아블로
	
	public  Diablo()						// 생성자에서 변수 초기화
	{
		Name = "디아블로";
		S1 = "화염의 원";
		S2 = "화염발사";
		S3 = "화염지진";
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
