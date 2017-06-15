package Character_Job;

import java.util.Random;
import java.util.Scanner;

import Character.Character;

import Item.Armor;
import Item.Jewelry;
import Item.Weapon;

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
	
	// "혼령 수확" 마나 사용량
	int Mana_Use_Sprit_harvesting = 350;
	
	// "혼령 수확" 데미지 증가량
	double Damage_Mana_Use_Sprit_harvesting = 1.5;
	
	// 스킬 사용여부. 버프 스킬에 사용. true: 스킬 사용중. false : 스킬 사용가능.
	Boolean Skill_On = false;					
	Inven inven = new Inven();
	public int Jewerly_Num = 0; 
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
		{
			System.out.println("마나가 부족합니다");
			System.out.println("현재 마나량은 " + Mana + "입니다");
		}
		return Damage;	
	}
	
	public void Sprit_harvesting() // 스킬 "혼령수확"
	{
		Skill_Name = "혼령수확";
		if(Mana >= Mana_Use_Sprit_harvesting)
		{
			Thread thread = new Thread(new Runnable() 
			{
				@Override
				public void run() {
					int duration = 7;
					double temp_Damage_Poison_Sting = Damage_Poison_Sting;
					double temp_Damage_Dead_Mans_Hand = Damage_Dead_Mans_Hand;
					Damage_Poison_Sting = Damage_Poison_Sting*Damage_Mana_Use_Sprit_harvesting;
					Damage_Dead_Mans_Hand = Damage_Dead_Mans_Hand*Damage_Mana_Use_Sprit_harvesting;
					Skill_On = true;
					System.out.println(Skill_Name + "을 시전합니다." + duration + "초 만큼 지속됩니다.");
					System.out.println("독침 스킬 공격력이 증가합니다. 공격력의 " + (long)Damage_Poison_Sting*100 + "% 만큼 데미지를 줍니다");
					System.out.println("망자의 손아귀 스킬 공격력이 증가합니다. 공격력의 " + (long)Damage_Dead_Mans_Hand*100 + "% 만큼 데미지를 줍니다");
					
					try {
						Thread.sleep(duration*1000);
						Damage_Poison_Sting = temp_Damage_Poison_Sting;
						Damage_Dead_Mans_Hand = temp_Damage_Dead_Mans_Hand;
						Skill_On = false;
						System.out.println("독침 스킬 공격력이 원래대로 돌아옵니다 공격력의 " + (long)Damage_Poison_Sting*100 + "% 만큼 데미지를 줍니다");
						System.out.println("망자의 손아귀 스킬 공격력이 원래대로 돌아옵니다. 공격력의 " + (long)Damage_Dead_Mans_Hand*100 + "% 만큼 데미지를 줍니다");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			thread.start();
		}
		else
		{
			System.out.println("마나가 부족합니다");
			System.out.println("현재 마나량은 " + Mana + "입니다");
		}
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
		
		bar();
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
		if(!Skill_On)
		{
			if(Skill_Num == 3) // 스킬 "혼령 수확" 사용시
			{
				Sprit_harvesting();
			}
		}
		return Damage;
	}
	
	public int Skill_Choice()	// 스킬 선택
	{
		Scanner scan = new Scanner(System.in);
		bar();
		System.out.println("1. 독침");
		System.out.println("2. 망자의 손아귀");
		if(!Skill_On)
			System.out.println("3. 혼령수확");
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
		if(inven.jewelry1 == null)	inven.jewelry1 = jewelry;
		else if(inven.jewelry2 == null)	inven.jewelry2 = jewelry;
		else if(inven.jewelry2 == null)	inven.jewelry3 = jewelry;
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
