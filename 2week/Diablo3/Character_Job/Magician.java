package Character_Job;

import java.util.Random;
import java.util.Scanner;

import Character.Character;

import Item.Armor;
import Item.Jewelry;
import Item.Weapon;

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
	
	// "비전집중" 비전력 사용량
	int Arcane_Use_Arcane_Concentration = 50;
	
	// "비전집중" 공격력 증가 배수
	double Arcane_Concentration_Attack = 2.0;
	
	// 스킬 사용여부. 버프 스킬에 사용. true: 스킬 사용중. false : 스킬 사용가능.
	Boolean Skill_On = false;					
	Inven inven = new Inven();
	public int Jewerly_Num = 0; 
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
	
	public void Arcane_Concentration()		// 스킬 "비전집중"
	{
		Skill_Name = "비전집중";
		Thread thread = new Thread(new Runnable() 
		{
			
			@Override
			public void run() {
				int duration = 5;
				double temp_Attack = Attack;
				Attack = Attack * Arcane_Concentration_Attack;
				Skill_On = true;
				System.out.println(Skill_Name + "을 시전합니다. " + duration + "초 만큼 지속됩니다");
				System.out.println("공격력이 " + Arcane_Concentration_Attack*100 + "% 만큼 증가합니다");
				try {
					Thread.sleep(duration*1000);
					Attack = temp_Attack;
					System.out.println("공격력이 원래대로 돌아옵니다. 현재 공격력은 " + (long)Attack +"입니다");
					Skill_On = false;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		});
		thread.start();
		
		System.out.println("비전집중을 시전합니다. HP가 20% 상승합니다");
		
		HP = HP*1.2;
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
		System.out.println("경험치: " + (Full_Exp-Exp) + "/" + Full_Exp);
		
		bar();
	}

	@Override
	public double Skill_Attack() {
		// TODO Auto-generated method stub
		double Damage = 0;		// 몬스터에 주는 데미지
		Random random = new Random();	
		int Skill_Num = Skill_Choice();	// 스킬 선택
		
		if(Skill_Num == 1)	// 스킬 "마법탄" 사용시
		{
			Damage = Magic_Bullet();
		}			
		else if(Skill_Num == 2)	// 스킬 "서리 광선" 사용시
		{
			Damage = Frost_Beam();
		}
		else if(Skill_Num == 3) // 스킬 "비전 집중" 사용시
		{
			Arcane_Concentration();
		}
		return Damage;
	}
	
	public int Skill_Choice()	// 스킬 선택
	{
		Scanner scan = new Scanner(System.in);
		bar();
		System.out.println("1. 마법탄");
		System.out.println("2. 서리광선");
		if(!Skill_On)
			System.out.println("3. 비전집중");
		bar();
		if(!Skill_On)
			System.out.println("선택하기(1~3) : ");
		else
			System.out.println("선택하기(1~2) : ");
		int num = scan.nextInt();
		scan.nextLine();
		
		return num;
	}
	
	@Override
	public void Wear_Equipment(Object object) {
		if(object != null)
		{	
			Scanner scan = new Scanner(System.in);
			String answer;
			if(object instanceof Weapon)
			{
				System.out.println("몬스터에서 드롭된 장비 " + ((Weapon)object).Item_Name + "(을)를 착용하시겠습니까?");
				System.out.println("장비 착용시 기존장비는 삭제됩니다");
				System.out.println("선택해주세요.예(Y), 아니오(N) : ");
				answer = scan.next();
				scan.nextLine();
				if(answer.equals("Y") || answer.equals("y"))
				{
					weapon.Item_Type = ((Weapon) object).Item_Type;
					weapon.Item_Name = ((Weapon) object).Item_Name;
					weapon.Item_Attack = ((Weapon) object).Item_Attack;
					weapon.Item_Intelligence = ((Weapon) object).Item_Intelligence;
					weapon.Item_Jewelry_Hole_Num = ((Weapon) object).Item_Jewelry_Hole_Num;
					weapon.jewelry_hole = ((Weapon) object).jewelry_hole;
					weapon.Item_Vitality = ((Weapon) object).Item_Vitality;
				}
				else
					System.out.println(((Weapon)object).Item_Name + "는 삭제됩니다.");
			}
			else if(object instanceof Armor)
			{
				System.out.println("몬스터에서 드롭된 장비 " + ((Armor)object).Item_Name + "(을)를 착용하시겠습니까?");
				System.out.println("장비 착용시 기존장비는 삭제됩니다");
				System.out.println("선택해주세요.예(Y), 아니오(N) : ");
				answer = scan.next();
				scan.nextLine();
				if(answer.equals("Y") || answer.equals("y"))
				{
					armor.Item_Type = ((Armor) object).Item_Type;
					armor.Item_Name = ((Armor) object).Item_Name;
					armor.Item_Defence = ((Armor) object).Item_Defence;
					armor.Item_Intelligence = ((Armor) object).Item_Intelligence;
					armor.Item_Jewelry_Hole_Num = ((Armor) object).Item_Jewelry_Hole_Num;
					armor.jewelry_hole = ((Armor) object).jewelry_hole;
					armor.Item_Vitality = ((Armor) object).Item_Vitality;
				}
				else
					System.out.println(((Weapon)object).Item_Name + "는 삭제됩니다.");
			}
		}
	}

	public boolean Pick_Up_Jewerly(Jewelry jewelry)
	{
		boolean success = true;
		if(inven.jewelry1.Item_Name == null)	inven.jewelry1 = jewelry;
		else if(inven.jewelry2.Item_Name == null)	inven.jewelry2 = jewelry;
		else if(inven.jewelry3.Item_Name == null)	inven.jewelry3 = jewelry;
		else
		{
			System.out.println("보석함이 가득 찼습니다.");
			success = false;
		}
		return success;
	}

	public void Exchange_Jewerly(Jewelry jewelry)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		bar();
		System.out.println(jewelry.Item_Name + "을 얻었습니다.");
		System.out.println("기존 보석을 교체하시겠습니까?");
		System.out.println("보석 교체시 기존 보석은 삭제됩니다");
		System.out.println("1." + inven.jewelry1.Item_Name + " 삭제");
		System.out.println("2." + inven.jewelry2.Item_Name + " 삭제");
		System.out.println("3." + inven.jewelry3.Item_Name + " 삭제");
		System.out.println("선택(1~3) : ");
		num = scan.nextInt();
		scan.nextLine();
		
		if(num == 1)	inven.jewelry1 = jewelry;
		if(num == 2)	inven.jewelry2 = jewelry;
		if(num == 3)	inven.jewelry3 = jewelry;
		
	}
}
