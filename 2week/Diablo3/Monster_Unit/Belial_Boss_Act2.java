package Monster_Unit;

import Monster_Type.Boss_Monster;

public class Belial_Boss_Act2 extends Boss_Monster{ // 2번째 스테이지 보스
	
	public  Belial_Boss_Act2() //초기화
	{
		Name = "베리얼";
		
	}
	
	S1 = "집게 내려찍기";
	S2 = "독뿜기";
	S3 = "독의 화염";
	double Damage_Down_Tongs= 4.0;
	double Damage_S2= 4.0;
	double Damage_S3= 5.0;
	
	public double Down_Tongs()
	{
		double Damage = 0;
		Damage = Attack*Damage_Down_Tongs;
		bar();
		System.out.println(Name + "이 집게 내려찍기(을)를 시전합니다. " + Damage + "를 받았습니다!");
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
