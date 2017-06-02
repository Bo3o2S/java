package Monster_Unit;

import Monster_Type.Unique_Monster;

public class Ruler_of_Element extends Unique_Monster{
	
	public  Ruler_of_Element()
	{
		Name = "원소의 지배자";
		S1 = "화염지옥";
		S2 = "번개작렬";
		S3 = "빙결";
		Damage_S1= 3.0;
		Damage_S2= 3.0;
		Damage_S3= 3.0;
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
