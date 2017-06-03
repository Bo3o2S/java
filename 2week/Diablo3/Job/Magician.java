package Job;

import java.util.Random;
import java.util.Scanner;

import Character.Character;

public class Magician extends Character implements Character_Job{
		
	public Magician()
	{
		// 마법사 기본 스탯 세팅
		Name = "마법사";
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
	
	
	// 마법사  추가스탯
	public int Arcane_Power = 100;
	
	// 비전력 최고량
	int Full_Arcane_Power = 100;
	
	// "마법탄" 데미지 증가량
	double Damage_Magic_Bullet= 2.3;
	double Add_Damage_Magic_Bullet= 1.8;
	
	// "서리광선" 데미지 증가량
	double Damage_Frost_Beam= 4.3;
		
	// "마법탄" 비전력 생성량
	int Arcane_Make_Magic_Bullet = 10;
	
	// "서리광선" 비전력 사용량
	int Arcane_Use_Frost_Beam = 16;
	
	// "얼음갑옷" 비전력 사용량
	int Arcane_Use_Frost_Armor = 16;
		
	public double Magic_Bullet()	// 스킬 "마법탄"
	{
		double Damage = 0;
		double Damage_Add = 0;
		Damage = Attack*Damage_Magic_Bullet;
		bar();
		System.out.println("마법탄을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
		Damage_Add = Attack*Add_Damage_Magic_Bullet;
		System.out.println("추가데미지"+(int)Damage_Add+"를 주었습니다!");
		if(Arcane_Power <= (Full_Arcane_Power - Arcane_Make_Magic_Bullet))
		{
			System.out.println(Arcane_Make_Magic_Bullet + "의 비전력를 회복합니다");
			Arcane_Power = Arcane_Power + Arcane_Make_Magic_Bullet;
		}
		else if(Arcane_Power > (Full_Arcane_Power - Arcane_Make_Magic_Bullet) && Arcane_Power < Full_Arcane_Power)
		{
			System.out.println((Full_Arcane_Power-Arcane_Power) + "의 비전력를 회복합니다");
			Arcane_Power = 100;
		}
		else //비전력 100%
		{
			System.out.println("비전력이 꽉찼습니다");
		}
		System.out.println("현재 비전력량 "+Arcane_Power);
		bar();
		return Damage;
	}
	
	public double Frost_Beam()		// 스킬 "서리광선"
	{
		double Damage = 0;
		double Damage_Add = 0;
		if(Arcane_Power >= Arcane_Use_Frost_Beam)
		{
			Damage = Attack*Damage_Frost_Beam;
			bar();
			System.out.println("서리광선을 시전합니다"+(int)Damage+"의 데미지를 주었습니다!");
			Arcane_Power = Arcane_Power - Arcane_Use_Frost_Beam;
			System.out.println("비전력이 "+ Arcane_Use_Frost_Beam + "소모되었습니다");		
			System.out.println("현재 비전력량 "+Arcane_Power);
			bar();
		}
		else
			System.out.println("비전력이 부족합니다");
		return Damage;	
	}
	
	public double Frost_Armor()		// 스킬 "얼음갑옷"
	{
		double Damage = 0;
		System.out.println("얼음갑옷을 시전합니다. HP가 20% 상승합니다");
		HP = HP*1.2;
		return Damage;
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
	public void Print_Status() {
		// TODO Auto-generated method stub
		bar();
		System.out.println("아이디: " + ID);
		System.out.println("직업명 : " + Name);
		System.out.println("레벨 : " + Level_Num);
		System.out.println("비전력 : " + Arcane_Power);
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
		System.out.println("레벨업 필요 경험치: " + Exp);
		System.out.println("전체 경험치: " + Full_Exp);
		
		bar2();
	}

	@Override
	public double Skill_Attack() {
		// TODO Auto-generated method stub
		double Damage = 0;		// 몬스터에 주는 데미지
		Random random = new Random();	
		int Skill_Num = Skill_Choice();	// 스킬 선택
		
		if(Skill_Num == 1)	// 스킬 "굶주린 화살" 사용시
		{
			Damage = Magic_Bullet();
		}			
		else if(Skill_Num == 2)	// 스킬 "투검" 사용시
		{
			Damage = Frost_Beam();
		}
		else if(Skill_Num == 3) // 스킬 "공격력 증가" 사용시
		{
			Frost_Armor();
		}
		return Damage;
	}
	
	public int Skill_Choice()	// 스킬 선택
	{
		Scanner scan = new Scanner(System.in);
		bar2();
		System.out.println("1. 마법탄");
		System.out.println("2. 서리광선");
		System.out.println("3. 얼음갑옷");
		bar2();
		System.out.println("선택하기(1~3) : ");
		int num = scan.nextInt();
		scan.nextLine();
		
		return num;
	}
}
