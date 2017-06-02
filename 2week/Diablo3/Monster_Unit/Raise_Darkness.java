package Monster_Unit;

import Monster_Type.Champion_Monster;

public class Raise_Darkness extends Champion_Monster{	// 챔피언 몬스터 : 어둠을 키우는 자
	
	public  Raise_Darkness() 							// 생성자에서 변수 초기화
	{
		Name = "어둠을 키우는 자";
		S1 = "융해";
		S2 = "역병";
		S3 = "포격";
	}
	
	double Damage_S1= 2.0;
	double Damage_S2= 2.0;
	double Damage_S3= 2.0;
	
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
