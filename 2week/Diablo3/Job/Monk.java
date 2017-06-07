package Job;

import java.util.Random;
import java.util.Scanner;

import Character.Character;

public class Monk extends Character implements Character_Job{
	
	public Monk()
	{
		// 수도사 기본 스탯 세팅
		Name = "수도사";
		Level_Num = 1;
		HP = 135;
		Attack = 5.5;
		Defence = 14;
		Evasion = 7;
		Strength = 8;
		Dex = 10;
		Intelligence = 8;
		Recovery = 10;
		Vitality = 10;
		Defence = 16;
		Gold = 5000;
		Exp = 100;
		Full_Exp = Exp;
		
		// 레벨 증가시 수치 향상 비율
		HP_Rate = 195;
		Strength_Rate = 10; 
		Dex_Rate = 30;
		Defence_Rate = 10;
		Intelligence_Rate = 10;
		Vitality_Rate = 9;
		Recovery_Rate = 9;
		Vital_Hp_Rate = 0.05;
		Exp_Rate = 200;
		Attack_Rate = 10;
		Defence_Rate = 10;
		Evasion_Rate = 0.4;
	}
	
	// 수도사 추가 스탯
	public int Spirit_Power = 250;
	int Full_Spirit_Power = 250;
	
	// "천둥주먹" 데미지 증가량
	double Damage_Thunder_Fist = 4.0;
	
	
	// "반달차기" 데미지 증가량
	double Damage_Halfmoon_Kick = 7.55;
	
	// "천상의 숨결" HP 증가량
	double HP_Up = 0.7;
	
	// "천둥주먹" 공력 생성량
	int Spirit_Make_Thunder_Fist = 14;
	
	// "반달차기" 공력 사용량
	int Spirit_Use_Halfmoon_Kick = 50;
	
	public double Thunder_Fist()	// 스킬 "천둥주먹"
	{
		double Damage = 0;
		Damage = Attack*Damage_Thunder_Fist;
		bar();
		System.out.println("천둥주먹을 시전합니다"+(int)Damage+"의 데미지를 주었습니다!");
		if(Spirit_Power <= (Full_Spirit_Power - Spirit_Make_Thunder_Fist))
		{
			System.out.println(Spirit_Make_Thunder_Fist + "의 공력를 회복합니다");
			Spirit_Power = Spirit_Power + Spirit_Make_Thunder_Fist;
		}
		else if(Spirit_Power > (Full_Spirit_Power - Spirit_Make_Thunder_Fist) && Spirit_Power < Full_Spirit_Power)
		{
			System.out.println((Full_Spirit_Power-Spirit_Power) + "의 공력를 회복합니다");
			Spirit_Power = 100;
		}
		else //공력 100%
		{
			System.out.println("공력가 꽉찼습니다");
		}
		System.out.println("현재 공력량 "+Spirit_Power);
		bar();
		return Damage;	
	}
	
	public double Halfmoon_Kick()	// 스킬 "반달차기"
	{
		double Damage = 0;
		double Damage_Add = 0;
		if(Spirit_Power >= Spirit_Use_Halfmoon_Kick)
		{
			Damage = Attack*Damage_Halfmoon_Kick;
			bar();
			System.out.println("반달차기를 시전합니다"+(int)Damage+"의 데미지를 주었습니다!");
			Spirit_Power = Spirit_Power - Spirit_Use_Halfmoon_Kick;
			System.out.println("증오가 "+ Spirit_Use_Halfmoon_Kick + "소모되었습니다");		
			System.out.println("현재 증오량 "+Spirit_Power);
			bar();
		}
		else
			System.out.println("증오가 부족합니다");
		return Damage;
	}
	
	public double Heaven_Breath()	// 스킬 "천상의 숨결"
	{
		double Damage = 0;
		if(HP <= Full_HP*0.3)
		{
			HP = HP + Full_HP*0.7;
			System.out.println("생명력이 70% 회복되었습니다!");
			System.out.println("현재 생명력 " + HP);
		}
		else
		{
			System.out.println("생명력이 회복되었습니다!");
			HP = Full_HP;
			System.out.println("현재 생명력 " + HP);
		}
		return Damage;
	}
	
	@Override
	public void Print_Status() {
		// TODO Auto-generated method stub
		bar();
		System.out.println("아이디: " + ID);
		System.out.println("직업명 : " + Name);
		System.out.println("레벨 : " + Level_Num);
		System.out.println("공력 : " + Spirit_Power);
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
	public double Skill_Attack() {	// 스킬공격
		// TODO Auto-generated method stub
		double Damage = 0;		// 몬스터에 주는 데미지
		Random random = new Random();	
		int Skill_Num = Skill_Choice();	// 스킬 선택
		
		if(Skill_Num == 1)	// 스킬 "천둥주먹" 사용시
		{
			Damage = Thunder_Fist();
		}			
		else if(Skill_Num == 2)	// 스킬 "반달차기" 사용시
		{
			Damage = Halfmoon_Kick();
		}
		else if(Skill_Num == 3) // 스킬 "천상의 숨결" 사용시
		{
			Heaven_Breath();
		}
		return Damage;
	}	
	
	public int Skill_Choice()	// 스킬 선택
	{
		Scanner scan = new Scanner(System.in);
		bar2();
		System.out.println("1. 천둥주먹");
		System.out.println("2. 반달차기");
		System.out.println("3. 천상의 숨결");
		bar2();
		System.out.println("선택하기(1~3) : ");
		int num = scan.nextInt();
		scan.nextLine();
		
		return num;
	}

	@Override
	public double Normal_Attack() {	// 일반공격
		// TODO Auto-generated method stub
		double Damage = 0;
		Damage = Attack;
		System.out.println(Name + "가 " + Attack + "만큼의 데미지를 입힙니다");		// 몬스터에게 주는 데미지
		return Damage;
	}
	
}
