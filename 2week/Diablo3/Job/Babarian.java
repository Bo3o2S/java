package Job;

import java.util.Random;
import java.util.Scanner;

import Character.Character;

public class Babarian extends Character implements Character_Job{
	
	public Babarian()
	{
		// 야만용사 기본 스탯 세팅
		Name = "야만용사";
		Level_Num = 1;
		HP = 140;
		Full_HP = HP;
		Attack = 20;
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
		Full_Exp = Exp;
		
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
		Attack_Rate = 20;
		Defence_Rate = 10;
		Evasion_Rate = 0.3;
	}
	
	//야만전사 추가 스킬 세팅
	
	public int Anger = 100;						// 초기 분노량 세팅
	double Damage_Fury = 2.2;					// 스킬 "광분"의 공격 배수
	double Damage_Ancestor_Hammer = 5.35;		// 스킬 "선조의 망치"의 공격 배수
	int Anger_Make_Fury = 4;					// 스킬 "광분"의 분노 생성량
	int Anger_Use_Ancestor_Hammer = 20;			// 스킬 "선조의 망치"의 분노 소비량
	int Anger_Make_Cry_of_Battlefield = 20;		// 스킬 "전장의 함성"의 분노 생성량
	int Full_Anger = 100;						// 분노 최대치
	
	public double Fury() // 스킬 "광분"
	{
		Skill_Name = "광분";
		double Damage = 0;
		Damage = Attack*Damage_Fury;		// 스킬 "광분"의 데미지
		bar();
		System.out.println(Skill_Name + "을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
		
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
		Skill_Name = "선조의 망치";
		double Damage = 0;
		if(Anger >= Anger_Use_Ancestor_Hammer) // 스킬 "선조의 망치"가 사용가능 할때(분노 20이상)
		{
			
			Damage = Attack*Damage_Ancestor_Hammer;		// 스킬 "선조의 망치"의 데미지
			
			Anger = Anger - Anger_Use_Ancestor_Hammer;	// 분노 사용량만큼 감소(20감소)
			bar();
			System.out.println(Skill_Name + "를 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
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
		
		Defence = Defence + Defence*0.2;		// 방어력 20% 증가
		
		HP = HP + HP*0.1;						// 생명력 10% 증가

		bar();
		System.out.println(Skill_Name + "을 시전합니다");
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

	public void Print_Status() {	// 캐릭터 상태창 출력
		// TODO Auto-generated method stub
		bar();
		System.out.println("아이디: " + ID);
		System.out.println("직업명 : " + Name);
		System.out.println("레벨 : " + Level_Num);
		System.out.println("분노 : " + Anger);
		System.out.println("전체 생명력 : " + HP);
		System.out.println("현재 생명력 : " + HP);
		System.out.println("힘 : " + Strength);
		System.out.println("민첩 : " + Dex);
		System.out.println("지능 : " + Intelligence);
		System.out.println("활력 : " + Vitality);
		System.out.println("공격력 : " + Attack);
		System.out.println("방어력 : " + Defence);
		System.out.println("회복력 : " + Recovery);
		System.out.println("회피력 : " + Evasion);
		System.out.println("골드 : " + Gold);
		System.out.println("경험치: " + (Full_Exp-Exp) + "/" + Full_Exp);
		bar2();
	}

	@Override
	public double Normal_Attack() {
		// TODO Auto-generated method stub
		double Damage = 0;
		Damage = Attack;
		System.out.println(Name + "가 " + Attack + "만큼의 데미지를 입힙니다");		// 몬스터에게 주는 데미지
		return Damage;
	}

	@Override
	public double Skill_Attack() {
		// TODO Auto-generated method stub
		double Damage = 0;		// 몬스터에 주는 데미지
		Random random = new Random();	
		int Skill_Num = Skill_Choice();	// 야만용사 스킬 선택
		
		if(Skill_Num == 1)	// 스킬 "광분" 사용시
		{
			Damage = Fury();
		}			
		else if(Skill_Num == 2)	// 스킬 "선조의 망치" 사용시
		{
			Damage = Ancestor_Hammer();
		}
		else if(Skill_Num == 3) // 스킬 "전장의 함성" 사용시
		{
			Cry_of_Battlefield();
		}
		return Damage;
	}
	
	public int Skill_Choice()	// 야만용사 스킬 선택
	{
		Scanner scan = new Scanner(System.in);
		bar2();
		System.out.println("1. 광분");
		System.out.println("2. 선조의 망치");
		System.out.println("3. 전장의 함성");
		bar2();
		System.out.println("선택하기(1~3) : ");
		int num = scan.nextInt();
		scan.nextLine();
		
		return num;
	}
}
