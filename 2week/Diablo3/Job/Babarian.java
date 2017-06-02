package Job;

import Character.Character;

public class Babarian extends Character{
	
	
	public Babarian()
	{
		// 야만용사 기본 스탯 세팅
		Name = "야만용사";
		Level_Num = 1;
		HP = 140;
		Attack = 5;
		Defence = 16;
		Evasion = 3;
		Strength = 10;  
		Dex = 8;
		Intelligence = 8;
		Recovery = 10;
		Vitality = 10;
		Defence = 16;
		Gold = 5000;
		Exp = 100;
		
		// 레벨 증가시 수치 향상 비율
		HP_Rate = 200;
		Strength_Rate = 30; 
		Dex_Rate = 10;
		Defence_Rate = 10;
		Intelligence_Rate = 10;		
		Vitality_Rate = 10;
		Recovery_Rate = 10;
		Vital_Hp_Rate = 0.05;		
		Exp_Rate = 200;
		Attack_Rate = 10;
		Defence_Rate = 10;
		Evasion_Rate = 0.3;
	}
	
	//야만전사 추가 스킬 세팅
	
	//초기 분노량 세팅
	public int Anger = 100;
	
	// 스킬 "광분"의 공격 배수
	double Damage_Fury = 2.2;
	
	// 스킬 "선조의 망치"의 공격 배수
	double Damage_Ancestor_Hammer = 5.35;
	
	// 스킬 "광분"의 분노 생성량
	int Anger_Make_Fury = 4;
	// 스킬 "선조의 망치"의 분노 소비량	
	int Anger_Use_Ancestor_Hammer = 20;
	// 스킬 "전장의 함성"의 분노 생성량
	int Anger_Make_Cry_of_Battlefield = 20;
	
	// 분노 최대치
	int Full_Anger = 100;
	
	public double Fury() // 스킬 "광분"
	{
		double Damage = 0;
		// 스킬 "광분"의 데미지
		Damage = Attack*Damage_Fury;
		bar();
		System.out.println("광분을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
		
		if(Anger <= (Full_Anger - Anger_Make_Fury))	// 분노가 96이하 일때
		{
			System.out.println(Anger_Make_Fury + "의 분노를 회복합니다");
			Anger = Anger + Anger_Make_Fury;
		} 
		else if(Anger > (Full_Anger - Anger_Make_Fury) && Anger < Full_Anger) // 분노가 97 ~ 99 일때
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
	
	public double Ancestor_Hammer()	// 스킬 "선조의 망치"
	{
		double Damage = 0;
		if(Anger >= Anger_Use_Ancestor_Hammer) // 스킬 "선조의 망치"가 사용가능 할때(분노 20이상)
		{
			// 스킬 "선조의 망치"의 데미지
			Damage = Attack*Damage_Ancestor_Hammer;
			// 분노 사용량만큼 감소(20감소)
			Anger = Anger - Anger_Use_Ancestor_Hammer;
			bar();
			System.out.println("선조의 망치를 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
			System.out.println("분노가 "+Anger_Use_Ancestor_Hammer+"만큼 감소합니다.");
			System.out.println("현재 분노량 "+Anger);
			
			return Damage;
		}
		else // 분노가 20이하일 때
		{
			System.out.println("분노가 부족합니다. 현재 분노량 " + Anger);
			Damage = 0;
			return Damage;
		}
	}
	
	public double Cry_of_Battlefield() //스킬 "전장의 함성"
	{
		// 방어력 20% 증가
		Defence = Defence + Defence*0.2;
		// 생명력 10% 증가
		HP = HP + HP*0.1;

		bar();
		System.out.println("방어력이 " + Defence*0.2 +"만큼 증가하였습니다\n");
		System.out.println("HP가 " + HP*0.1 +"만큼 증가하였습니다\n");
		if(Anger <= (Full_Anger - Anger_Make_Cry_of_Battlefield))	// 분노가 80이하 일때
		{
			System.out.println(Anger_Make_Cry_of_Battlefield + "의 분노를 회복합니다");
			Anger = Anger + Anger_Make_Cry_of_Battlefield;
		} 
		else if(Anger > (Full_Anger - Anger_Make_Cry_of_Battlefield) && Anger < Full_Anger) // 분노가 81 ~ 99 일때
		{
			System.out.println((Full_Anger-Anger) + "의 분노를 회복합니다");
			Anger = 100;
		}
		else //분노 100%
		{
			System.out.println("분노가 꽉찼습니다");
		}
		
		bar2();
		System.out.println("현재 방어력 "+Defence);
		System.out.println("현재 HP "+HP);
		System.out.println("현재 분노량 "+Anger);
		
		return 0;
	}
}
