package Job;

import java.util.Random;
import java.util.Scanner;

import Character.Character;

public class Witch_Doctor extends Character implements Character_Job{
	
	public Witch_Doctor()
	{
		// 부두술사 기본 스탯 세팅
		Name = "부두술사";
		Level_Num = 1;
		HP = 130;
		Attack = 22;
		Defence = 12;
		Evasion = 7;
		Strength = 8;  
		Dex = 8;
		Intelligence = 10;
		Recovery = 10;
		Vitality = 10;
		Defence = 12;
		Gold = 5000;
		Exp = 100;
		Full_Exp = Exp;
		
		// 레벨 증가시 수치 향상 비율
		HP_Rate = 190;
		Strength_Rate = 10; 
		Dex_Rate = 10;
		Defence_Rate = 10;
		Intelligence_Rate = 30;		
		Vitality_Rate = 10;
		Recovery_Rate = 10;
		Vital_Hp_Rate = 0.05;		
		Exp_Rate = 200;
		Attack_Rate = 22;
		Defence_Rate = 9;
		Evasion_Rate = 0.3;
	}
	
	// 부두술사 추가 스탯
	public int Mana = 750;
	
	// 마나 최고량
	int Full_Mana = 750;
	
	// "독침" 데미지 증가량
	double Damage_Poison_Sting= 3.56;
	
	// "망자의 손아귀" 데미지 증가량
	double Damage_Dead_Mans_Hand= 7.5;
	
	// "독침" 마나 생성량
	int Mana_Make_Poison_Sting = 50;
	
	// "망자의 손아귀" 마나 사용량
	int Mana_Use_Dead_Mans_Hand = 150;
		
	public double Poison_Sting()	// 스킬 "독침"
	{
		double Damage = 0;
		Damage = Attack*Damage_Poison_Sting;
		bar();
		System.out.println("독침을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
		if(Mana <= (Full_Mana - Mana_Make_Poison_Sting))
		{
			System.out.println(Mana_Make_Poison_Sting + "의 마나를 회복합니다");
			Mana = Mana + Mana_Make_Poison_Sting;
		}
		else if(Mana > (Full_Mana - Mana_Make_Poison_Sting) && Mana < Full_Mana)
		{
			System.out.println((Full_Mana-Mana) + "의 마나를 회복합니다");
			Mana = 100;
		}
		else //마나 100%
		{
			System.out.println("마나가 꽉찼습니다");
		}
		System.out.println("현재 마나량 "+Mana);
		bar();
		return Damage;
	}
	
	public double Dead_Mans_Hand()	// 스킬 "망자의 손길"
	{
		double Damage = 0;
		System.out.println("망자의 손아귀를 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
		if(Mana >= Mana_Use_Dead_Mans_Hand)
		{
			Damage = Attack*Mana_Use_Dead_Mans_Hand;
			bar();
			System.out.println("서리광선을 시전합니다"+(int)Damage+"의 데미지를 주었습니다!");
			Mana = Mana - Mana_Use_Dead_Mans_Hand;
			System.out.println("마나가 "+ Mana_Use_Dead_Mans_Hand + "소모되었습니다");		
			System.out.println("현재 마나량 "+Mana);
			bar();
		}
		else
			System.out.println("마나가 부족합니다");
		return Damage;	
	}
	
	public double Sprit_harvesting() // 스킬 "혼령수확"
	{
		double Damage = 0;
		return Damage;
	}
	
	@Override
	public double Normal_Attack() { // 스킬 "기본공격"
		// TODO Auto-generated method stub
		double Damage = 0;
		Damage = Attack;
		System.out.println(Name + "가 " + Attack + "만큼의 데미지를 입힙니다");		// 몬스터에게 주는 데미지
		return Damage;
	}

	@Override
	public void Print_Status() { // 상태 출력
		// TODO Auto-generated method stub
		bar();
		System.out.println("아이디: " + ID);
		System.out.println("직업명 : " + Name);
		System.out.println("레벨 : " + Level_Num);
		System.out.println("마나 : " + Mana);
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
	public double Skill_Attack() { // 스킬공격
		// TODO Auto-generated method stub
		double Damage = 0;		// 몬스터에 주는 데미지
		Random random = new Random();	
		int Skill_Num = Skill_Choice();	// 스킬 선택
		
		if(Skill_Num == 1)	// 스킬 "독침" 사용시
		{
			Damage = Poison_Sting();
		}			
		else if(Skill_Num == 2)	// 스킬 "망자의 손아귀" 사용시
		{
			Damage = Dead_Mans_Hand();
		}
		else if(Skill_Num == 3) // 스킬 "혼령 수확" 사용시
		{
			Damage = Sprit_harvesting();
		}
		return Damage;
	}
	
	public int Skill_Choice()	// 스킬 선택
	{
		Scanner scan = new Scanner(System.in);
		bar2();
		System.out.println("1. 독침");
		System.out.println("2. 망자의 손아귀");
		System.out.println("3. 혼령수확");
		bar2();
		System.out.println("선택하기(1~3) : ");
		int num = scan.nextInt();
		scan.nextLine();
		
		return num;
	}	
}
