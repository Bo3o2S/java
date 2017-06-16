package Character_Job;

import java.util.Random;
import java.util.Scanner;

import Character.Character;
import Character.Inven;
import Item.Armor;
import Item.Jewelry;
import Item.Weapon;
import Item_Jewelry_Common.*;
import Item_Jewelry_Rare.*;
import Item_Jewelry_Unique.*;
import Item_Weapon_Common.Common_Babarian_Giant_Sword;
import Item_Weapon_Rare.Item_Weapon_Rare;
import Item_Weapon_Unique.Item_Weapon_Unique;

public class Babarian extends Character implements Character_Job{
	
	public Babarian()
	{
		// 야만용사 기본 스탯 세팅
		Name = "야만용사";
		Level_Num = 1;
		//HP = 140;
		HP = 50000;
		Full_HP = HP;
		//Attack = 20;
		Attack = 50000;
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
		inven = new Inven();
	}
	
	//야만전사 추가 스킬 세팅
	
	public int Anger = 100;						// 초기 분노량 세팅
	double Damage_Fury = 2.2;					// 스킬 "광분"의 공격 배수
	double Damage_Ancestor_Hammer = 5.35;		// 스킬 "선조의 망치"의 공격 배수
	int Anger_Make_Fury = 4;					// 스킬 "광분"의 분노 생성량
	int Anger_Use_Ancestor_Hammer = 20;			// 스킬 "선조의 망치"의 분노 소비량
	int Anger_Make_Cry_of_Battlefield = 20;		// 스킬 "전장의 함성"의 분노 생성량
	int Full_Anger = 100;						// 분노 최대치
	Boolean Skill_On = false;					// 스킬 사용여부. 버프 스킬에 사용. true: 스킬 사용중. false : 스킬 사용가능. 
	
	public int Jewerly_Num = 0; 
	public double Fury() // 스킬 "광분"
	{
		Skill_Name = "광분";
		double Damage = 0;
		if(weapon != null)
			Damage = (Attack+weapon.Item_Attack)*Damage_Fury;		// 스킬 "광분"의 데미지
		else
			Damage = Attack*Damage_Fury;
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
			if(weapon != null)
				Damage = (Attack+weapon.Item_Attack)*Damage_Ancestor_Hammer;		// 스킬 "선조의 망치"의 데미지
			else
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
		Skill_Name = "전장의 함성";
		double temp_HP, temp_Defence;
		temp_Defence = Defence;
		temp_HP = HP;
		int duration = 10;
		Thread thread = new Thread(new Runnable() 
		{
			@Override
			public void run() {
				bar();
				System.out.println(Skill_Name + "을 시전합니다. " + duration + "초 동안 지속됩니다");
				System.out.println("방어력이 " + (long)Defence*0.2 +"만큼 증가하였습니다");
				System.out.println("HP가 " + (long)HP*0.1 +"만큼 증가하였습니다");
				Defence = Defence*1.2;			// 방어력 20% 증가
				HP = HP*1.2;					// 생명력 10% 증가
				Skill_On = true;
				System.out.println("현재 방어력은 " + (long)Defence +"입니다");
				System.out.println("현재 HP는 " + (long)HP +"입니다");
				bar();
				try {
					Thread.sleep(duration*1000);
					Defence = temp_Defence;
					HP = temp_HP;
					bar();
					System.out.println("방어력이 원래대로 돌아옵니다. 현재 방어력은 " + (long)Defence +"입니다");
					System.out.println("HP가 원래대로 돌아옵니다. 현재 HP는 " + (long)HP +"입니다");
					bar();
					Skill_On = false;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread.start();
		bar();
		
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
		
		bar();
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
		System.out.println("전체 생명력 : " + Full_HP);
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
		if(weapon != null)
			System.out.println("착용무기 : " + weapon.Item_Name);
		if(armor != null)
			System.out.println("착용방어구 : " + armor.Item_Name);
		bar();
	}

	@Override
	public double Normal_Attack() {
		// TODO Auto-generated method stub
		double Damage = 0;
		Damage = Attack;
		if(weapon != null)
			Damage = Attack + weapon.Item_Attack;
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
		if(!Skill_On)
		{
			if(Skill_Num == 3) // 스킬 "전장의 함성" 사용시
			{
				Cry_of_Battlefield();
			}
		}
		return Damage;
	}
	
	public int Skill_Choice()	// 야만용사 스킬 선택
	{
		Scanner scan = new Scanner(System.in);
		bar();
		System.out.println("1. 광분");
		System.out.println("2. 선조의 망치");
		if(!Skill_On)
			System.out.println("3. 전장의 함성");
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
				if(weapon == null)
				{
					weapon = new Weapon();
					System.out.println("몬스터에서 드롭된 장비 " + ((Weapon)object).Item_Name + "(을)를 착용합니다");
//					weapon.Item_Type = ((Weapon) object).Item_Type;
//					weapon.Item_Name = ((Weapon) object).Item_Name;
//					weapon.Item_Attack = ((Weapon) object).Item_Attack;
//					weapon.Item_Strength = ((Weapon) object).Item_Strength;
//					weapon.Item_Jewelry_Hole_Num = ((Weapon) object).Item_Jewelry_Hole_Num;
//					weapon.jewelry_hole = ((Weapon) object).jewelry_hole;
//					weapon.Item_Vitality = ((Weapon) object).Item_Vitality;
					weapon = (Weapon)object;
				}
				else
				{
					System.out.println("몬스터에서 드롭된 장비 " + ((Weapon)object).Item_Name + "(을)를 착용하시겠습니까?");
					System.out.println("현재 착용한 장비는 " + weapon.Item_Name + " 입니다");
					System.out.println("Y 선택시 장비를 착용하게 되며 기존장비는 삭제됩니다.");
					System.out.println("N 선택시 장비는 삭제됩니다");
					System.out.println("선택해주세요.예(Y), 아니오(N) : ");
					answer = scan.next();
					scan.nextLine();
					if(answer.equals("Y") || answer.equals("y"))
					{
//						weapon.Item_Type = ((Weapon) object).Item_Type;
//						weapon.Item_Name = ((Weapon) object).Item_Name;
//						weapon.Item_Attack = ((Weapon) object).Item_Attack;
//						weapon.Item_Strength = ((Weapon) object).Item_Strength;
//						weapon.Item_Jewelry_Hole_Num = ((Weapon) object).Item_Jewelry_Hole_Num;
//						weapon.jewelry_hole = ((Weapon) object).jewelry_hole;
//						weapon.Item_Vitality = ((Weapon) object).Item_Vitality;
						System.out.println(((Weapon)object).Item_Name + "을 착용하였습니다");
						weapon = (Weapon)object;
					}
					else
					{
						//System.out.println(((Weapon)object).Item_Name + "를 인벤토리에 저장합니다.");
						System.out.println(((Weapon)object).Item_Name + "이 삭제되었습니다");
						inven.weapon = (Weapon)object;
					}
						
				}
			}
			else if(object instanceof Armor)
			{
				if(armor == null)
				{
					armor = new Armor();
					System.out.println("몬스터에서 드롭된 장비 " + ((Armor)object).Item_Name + "(을)를 착용합니다");
					armor.Item_Type = ((Armor) object).Item_Type;
					armor.Item_Name = ((Armor) object).Item_Name;
					armor.Item_Defence = ((Armor) object).Item_Defence;
					armor.Item_Strength = ((Armor) object).Item_Strength;
					armor.Item_Jewelry_Hole_Num = ((Armor) object).Item_Jewelry_Hole_Num;
					armor.jewelry_hole = ((Armor) object).jewelry_hole;
					armor.Item_Vitality = ((Armor) object).Item_Vitality;
				}
				else
				{
					System.out.println("몬스터에서 드롭된 장비 " + ((Armor)object).Item_Name + "(을)를 착용하시겠습니까?");
					System.out.println("장비 착용시 기존장비는 삭제됩니다");
					System.out.println("현재 착용한 장비는 " + armor.Item_Name + " 입니다");
					System.out.println("선택해주세요.예(Y), 아니오(N) : ");
					answer = scan.next();
					scan.nextLine();
					if(answer.equals("Y") || answer.equals("y"))
					{
						armor.Item_Type = ((Armor) object).Item_Type;
						armor.Item_Name = ((Armor) object).Item_Name;
						armor.Item_Defence = ((Armor) object).Item_Defence;
						armor.Item_Strength = ((Armor) object).Item_Strength;
						armor.Item_Jewelry_Hole_Num = ((Armor) object).Item_Jewelry_Hole_Num;
						armor.jewelry_hole = ((Armor) object).jewelry_hole;
						armor.Item_Vitality = ((Armor) object).Item_Vitality;
					}
					else
					{
						//System.out.println(((Armor)object).Item_Name + "를 인벤토리에 저장합니다.");
						System.out.println(((Armor)object).Item_Name + "를 삭제합니다");
						inven.armor = (Armor)object;
					}
				}
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
		System.out.println("인벤토리에 보석을 저장합니다");
		System.out.println("기존 보석을 교체하시겠습니까?");
		System.out.println("보석 교체시 기존 보석은 삭제됩니다");
		System.out.println("1." + inven.jewelry1.Item_Name + " 삭제");
		System.out.println("2." + inven.jewelry2.Item_Name + " 삭제");
		System.out.println("3." + inven.jewelry3.Item_Name + " 삭제");
		System.out.println("4.교체하지 않음");
		System.out.println("선택(1~4) : ");
		num = scan.nextInt();
		scan.nextLine();
		
		if(num == 1)	inven.jewelry1 = jewelry;
		if(num == 2)	inven.jewelry2 = jewelry;
		if(num == 3)	inven.jewelry3 = jewelry;
		
	}
	
	public void Inventory(Object object)
	{
		if(object instanceof Weapon)	inven.weapon = (Weapon) object;
		else if(object instanceof Armor)	inven.armor = (Armor) object;
		else if(object instanceof Jewelry)	inven.jewelry1 = (Jewelry) object;
	}
	
	
	public void Show_Inventory()
	{
		bar();
		System.out.println("");
		System.out.println("★★★★★★★★★★★★★★★★★  인벤토리  ★★★★★★★★★★★★★★★★★");
		System.out.println("");
		if(inven.weapon != null)
		{
			System.out.println("종류 : " + inven.weapon.Item_Type);
			System.out.println("이름 : " + inven.weapon.Item_Name);
			System.out.println("공격력 : " + inven.weapon.Item_Attack);
			System.out.println("힘 : " + inven.weapon.Item_Strength);
			System.out.println("활력 : " + inven.weapon.Item_Vitality);
			System.out.println("보석홈 개수 : " + inven.weapon.Item_Jewelry_Hole_Num);
		}
		System.out.println("");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("");
	}
	
	public void Insert_Jewelry(int num)
	{
		while(true)
		{
			if(num == 1) // 무기
			{
				if(weapon == null)
				{
					bar();
					System.out.println("현재 착용하고 있는 무기가 없습니다.무기 획득 후 다시 방문 부탁드립니다");
					bar();
					break;
				}
				bar();
				Scanner scan = new Scanner(System.in);
				System.out.println(weapon.Item_Name + "에 장착할 보석을 선택하세요.");
				if(inven.jewelry1.Item_Name != null)
					System.out.println("1. " + inven.jewelry1.Item_Name);
				if(inven.jewelry2.Item_Name != null)
					System.out.println("2. " + inven.jewelry2.Item_Name);
				if(inven.jewelry3.Item_Name != null)
					System.out.println("3. " + inven.jewelry3.Item_Name);
				System.out.println("4. 나가기");
				System.out.println("선택 : ");
				int number = scan.nextInt();
				scan.nextLine();
				
				if(number == 1)
				{
					bar();
					if(inven.jewelry1 == null)
					{
						System.out.println("인벤에 보석이 없습니다. 보석 획득 후 이용해주세요!");
						continue;
					}
					if(inven.jewelry1.Item_Type == 1)
					{
						System.out.println("방어력 보석은 무기에 장착할 수 없습니다.!");
						System.out.println("공격력 보석을 선택해주세요!");
						continue;
					}
					if(weapon.jewelry_hole.jewelry1.Item_Name == null)
					{
						if(inven.jewelry1 instanceof Common_Jewelry_Attack)
						{
							Common_Jewelry_Attack common_jewelry_attack = new Common_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry1 = common_jewelry_attack;
						}
						else if(inven.jewelry1 instanceof Rare_Jewelry_Attack)
						{
							Rare_Jewelry_Attack rare_jewelry_attack = new Rare_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry1 = rare_jewelry_attack;
						}
						else if(inven.jewelry1 instanceof Unique_Jewelry_Attack)
						{
							Unique_Jewelry_Attack unique_jewelry_attack = new Unique_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry1 = unique_jewelry_attack;
						}
						
						weapon.Item_Attack = weapon.Item_Attack + weapon.jewelry_hole.jewelry1.Attack;
						inven.jewelry1.Item_Name = null;
						System.out.println("1번 홀에 " + weapon.jewelry_hole.jewelry1.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(weapon.Item_Name + "의 공격력이" + weapon.jewelry_hole.jewelry1.Attack + "만큼 증가하였습니다");
						System.out.println("현재" + weapon.Item_Name + "의 공격력 : " + weapon.Item_Attack);
					}
					else if(weapon.jewelry_hole.jewelry2.Item_Name == null)
					{
						if(inven.jewelry1 instanceof Common_Jewelry_Attack)
						{
							Common_Jewelry_Attack common_jewelry_attack = new Common_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry2 = common_jewelry_attack;
						}
						else if(inven.jewelry1 instanceof Rare_Jewelry_Attack)
						{
							Rare_Jewelry_Attack rare_jewelry_attack = new Rare_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry2 = rare_jewelry_attack;
						}
						else if(inven.jewelry1 instanceof Unique_Jewelry_Attack)
						{
							Unique_Jewelry_Attack unique_jewelry_attack = new Unique_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry2 = unique_jewelry_attack;
						}
						weapon.Item_Attack = weapon.Item_Attack + weapon.jewelry_hole.jewelry2.Attack;
						inven.jewelry1.Item_Name = null;
						System.out.println("2번 홀에" + weapon.jewelry_hole.jewelry2.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(weapon.Item_Name + "의 공격력이" + weapon.jewelry_hole.jewelry2.Attack + "만큼 증가하였습니다");
						System.out.println("현재" + weapon.Item_Name + "의 공격력 : " + weapon.Item_Attack);
					}
					else if(weapon.jewelry_hole.jewelry3.Item_Name == null)
					{
						if(inven.jewelry1 instanceof Common_Jewelry_Attack)
						{
							Common_Jewelry_Attack common_jewelry_attack = new Common_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry3 = common_jewelry_attack;
						}
						else if(inven.jewelry1 instanceof Rare_Jewelry_Attack)
						{
							Rare_Jewelry_Attack rare_jewelry_attack = new Rare_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry3 = rare_jewelry_attack;
						}
						else if(inven.jewelry1 instanceof Unique_Jewelry_Attack)
						{
							Unique_Jewelry_Attack unique_jewelry_attack = new Unique_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry3 = unique_jewelry_attack;
						}
						weapon.Item_Attack = weapon.Item_Attack + weapon.jewelry_hole.jewelry3.Attack;
						inven.jewelry1.Item_Name = null;
						System.out.println("3번 홀에" + weapon.jewelry_hole.jewelry3.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(weapon.Item_Name + "의 공격력이" + weapon.jewelry_hole.jewelry3.Attack + "만큼 증가하였습니다");
						System.out.println("현재" + weapon.Item_Name + "의 공격력 : " + weapon.Item_Attack);
					}
					else
					{
						System.out.println("비어 있는 홀이 없습니다. 보석 제거 후 사용해주세요!");
					}
				}
				else if(number == 2)
				{
					bar();
					if(inven.jewelry2 == null)
					{
						System.out.println("인벤에 보석이 없습니다. 보석 획득 후 이용해주세요!");
						continue;
					}
					if(inven.jewelry2.Item_Type == 1)
					{
						System.out.println("방어력 보석은 무기에 장착할 수 없습니다.!");
						System.out.println("공격력 보석을 선택해주세요!");
						continue;
					}
					if(weapon.jewelry_hole.jewelry1.Item_Name == null)
					{
						if(inven.jewelry2 instanceof Common_Jewelry_Attack)
						{
							Common_Jewelry_Attack common_jewelry_attack = new Common_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry1 = common_jewelry_attack;
						}
						else if(inven.jewelry2 instanceof Rare_Jewelry_Attack)
						{
							Rare_Jewelry_Attack rare_jewelry_attack = new Rare_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry1 = rare_jewelry_attack;
						}
						else if(inven.jewelry2 instanceof Unique_Jewelry_Attack)
						{
							Unique_Jewelry_Attack unique_jewelry_attack = new Unique_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry1 = unique_jewelry_attack;
						}
						weapon.Item_Attack = weapon.Item_Attack + weapon.jewelry_hole.jewelry1.Attack;
						inven.jewelry2.Item_Name = null;
						System.out.println("1번 홀에" + weapon.jewelry_hole.jewelry1.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(weapon.Item_Name + "의 공격력이" + weapon.jewelry_hole.jewelry1.Attack + "만큼 증가하였습니다");
						System.out.println("현재" + weapon.Item_Name + "의 공격력 : " + weapon.Item_Attack);
					}
					else if(weapon.jewelry_hole.jewelry2.Item_Name == null)
					{
						if(inven.jewelry2 instanceof Common_Jewelry_Attack)
						{
							Common_Jewelry_Attack common_jewelry_attack = new Common_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry2 = common_jewelry_attack;
						}
						else if(inven.jewelry2 instanceof Rare_Jewelry_Attack)
						{
							Rare_Jewelry_Attack rare_jewelry_attack = new Rare_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry2 = rare_jewelry_attack;
						}
						else if(inven.jewelry2 instanceof Unique_Jewelry_Attack)
						{
							Unique_Jewelry_Attack unique_jewelry_attack = new Unique_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry2 = unique_jewelry_attack;
						}
						weapon.Item_Attack = weapon.Item_Attack + weapon.jewelry_hole.jewelry2.Attack;
						inven.jewelry2.Item_Name = null;
						System.out.println("2번 홀에" + weapon.jewelry_hole.jewelry2.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(weapon.Item_Name + "의 공격력이" + weapon.jewelry_hole.jewelry2.Attack + "만큼 증가하였습니다");
						System.out.println("현재" + weapon.Item_Name + "의 공격력 : " + weapon.Item_Attack);
					}
					else if(weapon.jewelry_hole.jewelry3.Item_Name == null)
					{
						if(inven.jewelry2 instanceof Common_Jewelry_Attack)
						{
							Common_Jewelry_Attack common_jewelry_attack = new Common_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry3 = common_jewelry_attack;
						}
						else if(inven.jewelry2 instanceof Rare_Jewelry_Attack)
						{
							Rare_Jewelry_Attack rare_jewelry_attack = new Rare_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry3 = rare_jewelry_attack;
						}
						else if(inven.jewelry2 instanceof Unique_Jewelry_Attack)
						{
							Unique_Jewelry_Attack unique_jewelry_attack = new Unique_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry3 = unique_jewelry_attack;
						}
						weapon.Item_Attack = weapon.Item_Attack + weapon.jewelry_hole.jewelry3.Attack;
						inven.jewelry3.Item_Name = null;
						System.out.println("3번 홀에" + weapon.jewelry_hole.jewelry3.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(weapon.Item_Name + "의 공격력이" + weapon.jewelry_hole.jewelry3.Attack + "만큼 증가하였습니다");
						System.out.println("현재" + weapon.Item_Name + "의 공격력 : " + weapon.Item_Attack);
					}
					else
					{
						System.out.println("비어 있는 홀이 없습니다. 보석 제거 후 사용해주세요!");
					}
				}
				else if(number == 3)
				{
					bar();
					if(inven.jewelry3 == null)
					{
						System.out.println("인벤에 보석이 없습니다. 보석 획득 후 이용해주세요!");
						continue;
					}
					if(inven.jewelry3.Item_Type == 1)
					{
						System.out.println("방어력 보석은 무기에 장착할 수 없습니다.!");
						System.out.println("공격력 보석을 선택해주세요!");
						continue;
					}
					if(weapon.jewelry_hole.jewelry1.Item_Name == null)
					{
						if(inven.jewelry3 instanceof Common_Jewelry_Attack)
						{
							Common_Jewelry_Attack common_jewelry_attack = new Common_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry1 = common_jewelry_attack;
						}
						else if(inven.jewelry3 instanceof Rare_Jewelry_Attack)
						{
							Rare_Jewelry_Attack rare_jewelry_attack = new Rare_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry1 = rare_jewelry_attack;
						}
						else if(inven.jewelry3 instanceof Unique_Jewelry_Attack)
						{
							Unique_Jewelry_Attack unique_jewelry_attack = new Unique_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry1 = unique_jewelry_attack;
						}
						weapon.Item_Attack = weapon.Item_Attack + weapon.jewelry_hole.jewelry1.Attack;
						inven.jewelry3.Item_Name = null;
						System.out.println("1번 홀에" + weapon.jewelry_hole.jewelry1.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(weapon.Item_Name + "의 공격력이" + weapon.jewelry_hole.jewelry1.Attack + "만큼 증가하였습니다");
						System.out.println("현재" + weapon.Item_Name + "의 공격력 : " + weapon.Item_Attack);
					}
					else if(weapon.jewelry_hole.jewelry2.Item_Name == null)
					{
						if(inven.jewelry3 instanceof Common_Jewelry_Attack)
						{
							Common_Jewelry_Attack common_jewelry_attack = new Common_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry2 = common_jewelry_attack;
						}
						else if(inven.jewelry3 instanceof Rare_Jewelry_Attack)
						{
							Rare_Jewelry_Attack rare_jewelry_attack = new Rare_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry2 = rare_jewelry_attack;
						}
						else if(inven.jewelry3 instanceof Unique_Jewelry_Attack)
						{
							Unique_Jewelry_Attack unique_jewelry_attack = new Unique_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry2 = unique_jewelry_attack;
						}
						weapon.Item_Attack = weapon.Item_Attack + weapon.jewelry_hole.jewelry2.Attack;
						inven.jewelry3.Item_Name = null;
						System.out.println("2번 홀에" + weapon.jewelry_hole.jewelry2.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(weapon.Item_Name + "의 공격력이" + weapon.jewelry_hole.jewelry2.Attack + "만큼 증가하였습니다");
						System.out.println("현재" + weapon.Item_Name + "의 공격력 : " + weapon.Item_Attack);
					}
					else if(weapon.jewelry_hole.jewelry3.Item_Name == null)
					{
						if(inven.jewelry3 instanceof Common_Jewelry_Attack)
						{
							Common_Jewelry_Attack common_jewelry_attack = new Common_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry3 = common_jewelry_attack;
						}
						else if(inven.jewelry3 instanceof Rare_Jewelry_Attack)
						{
							Rare_Jewelry_Attack rare_jewelry_attack = new Rare_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry3 = rare_jewelry_attack;
						}
						else if(inven.jewelry3 instanceof Unique_Jewelry_Attack)
						{
							Unique_Jewelry_Attack unique_jewelry_attack = new Unique_Jewelry_Attack();
							this.weapon.jewelry_hole.jewelry3 = unique_jewelry_attack;
						}
						weapon.Item_Attack = weapon.Item_Attack + weapon.jewelry_hole.jewelry3.Attack;
						inven.jewelry3.Item_Name = null;
						System.out.println("3번 홀에" + weapon.jewelry_hole.jewelry3.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(weapon.Item_Name + "의 공격력이" + weapon.jewelry_hole.jewelry3.Attack + "만큼 증가하였습니다");
						System.out.println("현재" + weapon.Item_Name + "의 공격력 : " + weapon.Item_Attack);
					}
					else
					{
						System.out.println("비어 있는 홀이 없습니다. 보석 제거 후 사용해주세요!");
					}
				}
				else if(number == 4)
				{
					break;
				}
			}
			else if(num == 2)
			{
				if(armor == null)
				{
					bar();
					System.out.println("현재 착용하고 있는 방어구가 없습니다.방어구 획득 후 다시 방문 부탁드립니다");
					bar();
					break;
				}
				bar();
				Scanner scan = new Scanner(System.in);
				System.out.println(armor.Item_Name + "에 장착할 보석을 선택하세요.");
				if(inven.jewelry1.Item_Name != null)
					System.out.println("1. " + inven.jewelry1.Item_Name);
				if(inven.jewelry2.Item_Name != null)
					System.out.println("2. " + inven.jewelry2.Item_Name);
				if(inven.jewelry3.Item_Name != null)
					System.out.println("3. " + inven.jewelry3.Item_Name);
				System.out.println("4. 나가기");
				System.out.println("선택 : ");
				int number = scan.nextInt();
				scan.nextLine();
				if(number == 1)
				{
					bar();
					if(inven.jewelry1 == null)
					{
						System.out.println("인벤에 보석이 없습니다. 보석 획득 후 이용해주세요!");
						continue;
					}
					if(inven.jewelry1.Item_Type == 0)
					{
						System.out.println("공격력 보석은 방어구에 장착할 수 없습니다.!");
						System.out.println("방어력 보석을 선택해주세요!");
						continue;
					}
					if(armor.jewelry_hole.jewelry1.Item_Name == null)
					{
						if(inven.jewelry1 instanceof Common_Jewelry_Defence)
						{
							Common_Jewelry_Defence common_jewelry_defence = new Common_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry1 = common_jewelry_defence;
						}
						else if(inven.jewelry1 instanceof Rare_Jewelry_Defence)
						{
							Rare_Jewelry_Defence rare_jewelry_defence = new Rare_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry1 = rare_jewelry_defence;
						}
						else if(inven.jewelry1 instanceof Unique_Jewelry_Defence)
						{
							Unique_Jewelry_Defence unique_jewelry_defence = new Unique_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry1 = unique_jewelry_defence;
						}
						armor.Item_Defence = armor.Item_Defence + armor.jewelry_hole.jewelry1.Defence;
						inven.jewelry1.Item_Name = null;
						System.out.println("1번 홀에" + armor.jewelry_hole.jewelry1.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(armor.Item_Name + "의 방어력이" + armor.jewelry_hole.jewelry1.Defence + "만큼 증가하였습니다");
						System.out.println("현재" + armor.Item_Name + "의 방어력 : " + armor.Item_Defence);
					}
					else if(armor.jewelry_hole.jewelry2.Item_Name == null)
					{
						if(inven.jewelry1 instanceof Common_Jewelry_Defence)
						{
							Common_Jewelry_Defence common_jewelry_defence = new Common_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry2 = common_jewelry_defence;
						}
						else if(inven.jewelry1 instanceof Rare_Jewelry_Defence)
						{
							Rare_Jewelry_Defence rare_jewelry_defence = new Rare_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry2 = rare_jewelry_defence;
						}
						else if(inven.jewelry1 instanceof Unique_Jewelry_Defence)
						{
							Unique_Jewelry_Defence unique_jewelry_defence = new Unique_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry2 = unique_jewelry_defence;
						}
						armor.Item_Defence = armor.Item_Defence + armor.jewelry_hole.jewelry2.Defence;
						inven.jewelry1.Item_Name = null;
						System.out.println("2번 홀에" + armor.jewelry_hole.jewelry2.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(armor.Item_Name + "의 방어력이" + armor.jewelry_hole.jewelry2.Defence + "만큼 증가하였습니다");
						System.out.println("현재" + armor.Item_Name + "의 방어력 : " + armor.Item_Defence);
					}
					else if(armor.jewelry_hole.jewelry3.Item_Name == null)
					{
						if(inven.jewelry1 instanceof Common_Jewelry_Defence)
						{
							Common_Jewelry_Defence common_jewelry_defence = new Common_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry3 = common_jewelry_defence;
						}
						else if(inven.jewelry1 instanceof Rare_Jewelry_Defence)
						{
							Rare_Jewelry_Defence rare_jewelry_defence = new Rare_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry3 = rare_jewelry_defence;
						}
						else if(inven.jewelry1 instanceof Unique_Jewelry_Defence)
						{
							Unique_Jewelry_Defence unique_jewelry_defence = new Unique_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry3 = unique_jewelry_defence;
						}
						armor.Item_Defence = armor.Item_Defence + armor.jewelry_hole.jewelry3.Defence;
						inven.jewelry1.Item_Name = null;
						System.out.println("3번 홀에" + armor.jewelry_hole.jewelry3.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(armor.Item_Name + "의 방어력이" + armor.jewelry_hole.jewelry3.Defence + "만큼 증가하였습니다");
						System.out.println("현재" + armor.Item_Name + "의 방어력 : " + armor.Item_Defence);
					}
					else
					{
						System.out.println("비어 있는 홀이 없습니다. 보석 제거 후 사용해주세요!");
					}
				}
				else if(number == 2)
				{
					bar();
					if(inven.jewelry2 == null)
					{
						System.out.println("인벤에 보석이 없습니다. 보석 획득 후 이용해주세요!");
						continue;
					}
					if(inven.jewelry2.Item_Type == 0)
					{
						System.out.println("공격력 보석은 방어구에 장착할 수 없습니다.!");
						System.out.println("방어력 보석을 선택해주세요!");
						continue;
					}
					if(armor.jewelry_hole.jewelry1.Item_Name == null)
					{
						if(inven.jewelry2 instanceof Common_Jewelry_Defence)
						{
							Common_Jewelry_Defence common_jewelry_defence = new Common_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry1 = common_jewelry_defence;
						}
						else if(inven.jewelry2 instanceof Rare_Jewelry_Defence)
						{
							Rare_Jewelry_Defence rare_jewelry_defence = new Rare_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry1 = rare_jewelry_defence;
						}
						else if(inven.jewelry2 instanceof Unique_Jewelry_Defence)
						{
							Unique_Jewelry_Defence unique_jewelry_defence = new Unique_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry1 = unique_jewelry_defence;
						}
						armor.Item_Defence = armor.Item_Defence + armor.jewelry_hole.jewelry1.Defence;
						inven.jewelry2.Item_Name = null;
						System.out.println("1번 홀에" + armor.jewelry_hole.jewelry1.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(armor.Item_Name + "의 방어력이" + armor.jewelry_hole.jewelry1.Defence + "만큼 증가하였습니다");
						System.out.println("현재" + armor.Item_Name + "의 방어력 : " + armor.Item_Defence);
					}
					else if(armor.jewelry_hole.jewelry2.Item_Name == null)
					{
						if(inven.jewelry2 instanceof Common_Jewelry_Defence)
						{
							Common_Jewelry_Defence common_jewelry_defence = new Common_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry2 = common_jewelry_defence;
						}
						else if(inven.jewelry2 instanceof Rare_Jewelry_Defence)
						{
							Rare_Jewelry_Defence rare_jewelry_defence = new Rare_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry2 = rare_jewelry_defence;
						}
						else if(inven.jewelry2 instanceof Unique_Jewelry_Defence)
						{
							Unique_Jewelry_Defence unique_jewelry_defence = new Unique_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry2 = unique_jewelry_defence;
						}
						armor.Item_Defence = armor.Item_Defence + armor.jewelry_hole.jewelry2.Defence;
						inven.jewelry2.Item_Name = null;
						System.out.println("2번 홀에" + armor.jewelry_hole.jewelry2.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(armor.Item_Name + "의 방어력이" + armor.jewelry_hole.jewelry2.Defence + "만큼 증가하였습니다");
						System.out.println("현재" + armor.Item_Name + "의 방어력 : " + armor.Item_Defence);
					}
					else if(armor.jewelry_hole.jewelry3.Item_Name == null)
					{
						if(inven.jewelry2 instanceof Common_Jewelry_Defence)
						{
							Common_Jewelry_Defence common_jewelry_defence = new Common_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry3 = common_jewelry_defence;
						}
						else if(inven.jewelry2 instanceof Rare_Jewelry_Defence)
						{
							Rare_Jewelry_Defence rare_jewelry_defence = new Rare_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry3 = rare_jewelry_defence;
						}
						else if(inven.jewelry2 instanceof Unique_Jewelry_Defence)
						{
							Unique_Jewelry_Defence unique_jewelry_defence = new Unique_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry3 = unique_jewelry_defence;
						}
						armor.Item_Defence = armor.Item_Defence + armor.jewelry_hole.jewelry3.Defence;
						inven.jewelry3.Item_Name = null;
						System.out.println("3번 홀에" + armor.jewelry_hole.jewelry3.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(armor.Item_Name + "의 방어력이" + armor.jewelry_hole.jewelry3.Defence + "만큼 증가하였습니다");
						System.out.println("현재" + armor.Item_Name + "의 방어력 : " + armor.Item_Defence);
					}
					else
					{
						System.out.println("비어 있는 홀이 없습니다. 보석 제거 후 사용해주세요!");
					}
				}
				else if(number == 3)
				{
					bar();
					if(inven.jewelry3 == null)
					{
						System.out.println("인벤에 보석이 없습니다. 보석 획득 후 이용해주세요!");
						continue;
					}
					if(inven.jewelry3.Item_Type == 0)
					{
						System.out.println("공격력 보석은 방어구에 장착할 수 없습니다.!");
						System.out.println("방어력 보석을 선택해주세요!");
						continue;
					}
					if(armor.jewelry_hole.jewelry1.Item_Name == null)
					{
						if(inven.jewelry3 instanceof Common_Jewelry_Defence)
						{
							Common_Jewelry_Defence common_jewelry_defence = new Common_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry1 = common_jewelry_defence;
						}
						else if(inven.jewelry3 instanceof Rare_Jewelry_Defence)
						{
							Rare_Jewelry_Defence rare_jewelry_defence = new Rare_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry1 = rare_jewelry_defence;
						}
						else if(inven.jewelry3 instanceof Unique_Jewelry_Defence)
						{
							Unique_Jewelry_Defence unique_jewelry_defence = new Unique_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry1 = unique_jewelry_defence;
						}
						armor.Item_Defence = armor.Item_Defence + armor.jewelry_hole.jewelry1.Defence;
						inven.jewelry3.Item_Name = null;
						System.out.println("1번 홀에" + armor.jewelry_hole.jewelry1.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(armor.Item_Name + "의 방어력이" + armor.jewelry_hole.jewelry1.Defence + "만큼 증가하였습니다");
						System.out.println("현재" + armor.Item_Name + "의 방어력 : " + armor.Item_Defence);
					}
					else if(armor.jewelry_hole.jewelry2.Item_Name == null)
					{
						if(inven.jewelry3 instanceof Common_Jewelry_Defence)
						{
							Common_Jewelry_Defence common_jewelry_defence = new Common_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry2 = common_jewelry_defence;
						}
						else if(inven.jewelry3 instanceof Rare_Jewelry_Defence)
						{
							Rare_Jewelry_Defence rare_jewelry_defence = new Rare_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry2 = rare_jewelry_defence;
						}
						else if(inven.jewelry3 instanceof Unique_Jewelry_Defence)
						{
							Unique_Jewelry_Defence unique_jewelry_defence = new Unique_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry2 = unique_jewelry_defence;
						}
						armor.Item_Defence = armor.Item_Defence + armor.jewelry_hole.jewelry2.Defence;
						inven.jewelry3.Item_Name = null;
						System.out.println("2번 홀에" + armor.jewelry_hole.jewelry2.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(armor.Item_Name + "의 방어력이" + armor.jewelry_hole.jewelry2.Defence + "만큼 증가하였습니다");
						System.out.println("현재" + armor.Item_Name + "의 방어력 : " + armor.Item_Defence);
					}
					else if(armor.jewelry_hole.jewelry3.Item_Name == null)
					{
						if(inven.jewelry3 instanceof Common_Jewelry_Defence)
						{
							Common_Jewelry_Defence common_jewelry_defence = new Common_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry3 = common_jewelry_defence;
						}
						else if(inven.jewelry3 instanceof Rare_Jewelry_Defence)
						{
							Rare_Jewelry_Defence rare_jewelry_defence = new Rare_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry3 = rare_jewelry_defence;
						}
						else if(inven.jewelry3 instanceof Unique_Jewelry_Defence)
						{
							Unique_Jewelry_Defence unique_jewelry_defence = new Unique_Jewelry_Defence();
							this.weapon.jewelry_hole.jewelry3 = unique_jewelry_defence;
						}
						armor.Item_Defence = armor.Item_Defence + armor.jewelry_hole.jewelry3.Defence;
						inven.jewelry3.Item_Name = null;
						System.out.println("3번 홀에" + armor.jewelry_hole.jewelry3.Item_Name + "이 장착되었습니다.!!!");
						System.out.println(armor.Item_Name + "의 방어력이" + armor.jewelry_hole.jewelry3.Defence + "만큼 증가하였습니다");
						System.out.println("현재" + armor.Item_Name + "의 방어력 : " + armor.Item_Defence);
					}
					else
					{
						System.out.println("비어 있는 홀이 없습니다. 보석 제거 후 사용해주세요!");
					}
				}
				else if(number == 4)
				{
					break;
				}
			
			}
		}
	}
		
	
	public void Remove_Jewelry(int num)
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{	
			if(num == 1)
			{
				if(weapon == null)
				{
					bar();
					System.out.println("착용하고 있는 무기가 없습니다. 무기 착용 후 다시 방문해주세요");
					bar();
					break;
				}
				bar();
				System.out.println(weapon.Item_Name + "에 장착된 보석은 아래와 같습니다");
				if(weapon.jewelry_hole.jewelry1.Item_Name != null)
					System.out.println("1. " + weapon.jewelry_hole.jewelry1.Item_Name);
				if(weapon.jewelry_hole.jewelry2.Item_Name != null)
					System.out.println("2. " + weapon.jewelry_hole.jewelry2.Item_Name);
				if(weapon.jewelry_hole.jewelry3.Item_Name != null)
					System.out.println("3. " + weapon.jewelry_hole.jewelry3.Item_Name);
				System.out.println("4. 나가기");
				System.out.println("선택 : ");
				int number = scan.nextInt();
				scan.nextLine();
				if(number == 1)
				{
					weapon.jewelry_hole.jewelry1.Item_Name = null;
					System.out.println(weapon.Item_Name + "의 1번 보석이 삭제되었습니다!");
				}
				else if(number == 2)
				{
					weapon.jewelry_hole.jewelry2.Item_Name = null;
					System.out.println(weapon.Item_Name + "의 2번 보석이 삭제되었습니다!");
				}
				else if(number == 3)
				{
					weapon.jewelry_hole.jewelry3.Item_Name = null;
					System.out.println(weapon.Item_Name + "의 3번 보석이 삭제되었습니다!");
				}
				else if(number == 4)
					break;
			}
			if(num == 2)
			{
				if(armor == null)
				{
					bar();
					System.out.println("착용하고 있는 방어구가 없습니다. 방어구 착용 후 다시 방문해주세요");
					bar();
					break;
				}
				bar();
				System.out.println(armor.Item_Name + "에 장착된 보석은 아래와 같습니다");
				if(armor.jewelry_hole.jewelry1 != null)
					System.out.println("1. " + armor.jewelry_hole.jewelry1.Item_Name);
				if(armor.jewelry_hole.jewelry2 != null)
					System.out.println("2. " + armor.jewelry_hole.jewelry2.Item_Name);
				if(armor.jewelry_hole.jewelry3 != null)
					System.out.println("3. " + armor.jewelry_hole.jewelry3.Item_Name);
				System.out.println("4. 나가기");
				System.out.println("선택 : ");
				int number = scan.nextInt();
				scan.nextLine();
				if(number == 1)
				{
					armor.jewelry_hole.jewelry1.Item_Name = null;
					System.out.println(armor.Item_Name + "의 1번 보석이 삭제되었습니다!");
				}
				else if(number == 2)
				{
					armor.jewelry_hole.jewelry2.Item_Name = null;
					System.out.println(armor.Item_Name + "의 2번 보석이 삭제되었습니다!");
				}
				else if(number == 3)
				{
					armor.jewelry_hole.jewelry3.Item_Name = null;
					System.out.println(armor.Item_Name + "의 3번 보석이 삭제되었습니다!");
				}
				else if(number == 4)
					break;
			}
		}
	}	
}

class Copy_Jewelry
{
	public Jewelry jewelry;
	
	public Copy_Jewelry(Jewelry jewelry)
	{
		this.jewelry = jewelry;
	}
}
