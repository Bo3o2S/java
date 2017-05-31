package Character_Skill;

import Character.Babarian;

public class Babarian_Skill extends Babarian{
	
	
	//야만전사 추가 스킬 세팅
	double Damage_S1= 2.2;
	double Damage_S2= 5.35;
	
	int Anger_Make_S1 = 4;
	int Anger_Use_S2 = 20;
	int Anger_Make_S3 = 20;
	
	int Full_Anger = 100;
	
	public double Skill_1()
	{
		double Damage = 0;
		Damage = Attack*Damage_S1;
		bar();
		System.out.println("광분을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
		
		if(Anger <= (Full_Anger - Anger_Make_S1))
		{
			System.out.println(Anger_Make_S1 + "의 분노를 회복합니다");
			Anger = Anger + Anger_Make_S1;
		}
		else if(Anger > (Full_Anger - Anger_Make_S1) && Anger < Full_Anger)
		{
			System.out.println((Full_Anger-Anger) + "의 분노를 회복합니다");
			Anger = 100;
		}
		else //분노 100%
		{
			System.out.println("분노가 꽉찼습니다");
		}
		System.out.println("현재 분노량 "+Anger);
		
		return Damage;
	}
	
	public double Skill_2()
	{
		double Damage = 0;
		if(Anger >= Anger_Use_S2)
		{
			Damage = Attack*Damage_S2;
			Anger = Anger - Anger_Use_S2;
			bar();
			System.out.println("선조의 망치를 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
			System.out.println("분노가 "+Anger_Use_S2+"만큼 감소합니다.");
			System.out.println("현재 분노량 "+Anger);
			
			return Damage;
		}
		else
		{
			System.out.println("분노가 부족합니다. 현재 분노량 " + Anger);
			Damage = 0;
			return Damage;
		}
	}
	
	public double Skill_3()
	{
		Defence = Defence + Defence*0.2;
		HP = HP + HP*0.1;
		Anger = Anger + Anger_Make_S3;
		bar();
		System.out.println("방어력이 " + Defence*0.2 +"만큼 증가하였습니다\n");
		System.out.println("HP가 " + HP*0.1 +"만큼 증가하였습니다\n");
		System.out.println("분노가 " + Anger_Make_S3 +"만큼 증가하였습니다\n");
		
		return 0;
	}
}
