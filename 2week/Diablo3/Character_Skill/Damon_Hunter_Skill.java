package Character_Skill;

import java.util.Random;
import Character.Daemon_Hunter;

public class Damon_Hunter_Skill extends Daemon_Hunter{
	
	// 악마사냥꾼 추가 스킬 세팅
	double Damage_S1= 1.5;
	double Damage_S1_Add= 3.0;
	double Damage_S2= 7.5;
	double Damage_S2_Add= 3.0;
	
	double Attack_Up = 1.1;
	
	int Chance_S1 = 35;
	int Chance_S2 = 15;
	
	int Hate_Make_S1 = 8;
	int Hate_Use_S2 = 40;
	
	int Full_Hate = 125;
	
	Random random = new Random();
	
	public double Skill_1()
	{
		double Damage = 0;
		double Damage_Add = 0;
		
		Damage = Attack*Damage_S1;
		bar();
		System.out.println("굶주린 화살을 시전합니다"+(int)Damage+"의 데미지를 주었습니다!");
		if(random.nextInt(100) < Chance_S1)
		{
			Damage_Add = Attack*Damage_S1_Add;
			System.out.println("추가데미지"+(int)Damage_Add+"를 주었습니다!");
		}
		if(Hate <= (Full_Hate - Hate_Make_S1))
		{
			System.out.println(Hate_Make_S1 + "의 증오를 회복합니다");
			Hate = Hate + Hate_Make_S1;
		}
		else if(Hate > (Full_Hate - Hate_Make_S1) && Hate < Full_Hate)
		{
			System.out.println((Full_Hate-Hate) + "의 증오를 회복합니다");
			Hate = 100;
		}
		else //증오 100%
		{
			System.out.println("증오가 꽉찼습니다");
		}
		System.out.println("현재 증오량 "+Hate);
		bar();
		return Damage;	
	}
	
	public double Skill_2()
	{
		double Damage = 0;
		double Damage_Add = 0;
		Damage = Attack*Damage_S2;
		bar();
		System.out.println("투검을 시전합니다"+(int)Damage+"의 데미지를 주었습니다!");
		if(random.nextInt(100) < Chance_S2)
		{
			Damage_Add = Attack*Damage_S2_Add;
			System.out.println("추가데미지"+(int)Damage_Add+"를 주었습니다!");
		}
		Hate = Hate - Hate_Use_S2;
		System.out.println("증오가 "+ Hate_Use_S2 + "소모되었습니다");		
		System.out.println("현재 증오량 "+Hate);
		bar();
		return Damage;	
	}
	
	public double Skill_3()
	{
		double Damage = 0;
		double temp = 0;
		temp = Attack;
		Attack = Attack*Attack_Up;
		bar();
		System.out.println("공격력이 " + (int)temp + "에서 " + Attack + "로 증가하였습니다");
		bar();
		return Damage;
	}
}
