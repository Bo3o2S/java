package Character_Job;

import java.util.Random;
import java.util.Scanner;

import Character.Character;

import Item.Armor;
import Item.Jewelry;
import Item.Weapon;

public class Holy_Warrior extends Character implements Character_Job{

	public Holy_Warrior()	// 성전사 초기화
	{
		// 성전사 기본 스탯 세팅
		Name = "성전사";
		Level_Num = 1;
		HP = 140;
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
	
	public int Holy_Power = 100;				// 신성력 총량

	double Damage_Justice= 2.45;				// 스킬 "정의" 공격 배수
	double Add_Damage_Justice= 2.45;			// 스킬 "정의" 추가 공격 배수
	double Damage_Fist= 5.45;					// 스킬 "천상의 주먹" 공격 배수
	double Add_Damage_Fist= 2.45;				// 스킬 "천상의 주먹" 추가 공격 배수
	double Iron_Skin_Defence_Rate = 3.0;		// 스킬 "철갑피부" 방어력 강화 배수
	
	int Holy_Power_Make_Justice = 10;			// 스킬 "정의" 신성력 생성량
	int Holy_Power_Use_Fist = 20;				// 스킬 "천상의 주먹" 신성력 사용량 			
	int Holy_Power_Use_Iron_Skin = 50;				// 스킬 "철갑피부" 신성력 사용량
	
	int Full_Holy_Power = 100;					// 신성력 최고량
	
	Boolean Skill_On = false;					// 스킬 사용여부. 버프 스킬에 사용. true: 스킬 사용중. false : 스킬 사용가능. 
	Inven inven = new Inven();
	public int Jewerly_Num = 0; 
	public double Justice()	// 스킬 "정의"
	{
		double Damage = 0;
		double Damage_Add = 0;
		Damage = Attack*Damage_Justice;				// 데미지
		Damage_Add = Attack*Add_Damage_Justice;		// 추가 데미지
		bar();
		System.out.println("정의을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
		System.out.println("추가로 "+(int)Damage_Add+"의 데미지를 주었습니다!");
		if(Holy_Power <= (Full_Holy_Power - Holy_Power_Make_Justice))										// 신성력이 90이하인 경우
		{
			System.out.println(Holy_Power_Make_Justice + "의 신성력를 회복합니다");
			Holy_Power = Holy_Power + Holy_Power_Make_Justice;
		}
		else if(Holy_Power > (Full_Holy_Power - Holy_Power_Make_Justice) && Holy_Power < Full_Holy_Power)	// 신성력이 91 ~ 99 일 때
		{
			System.out.println((Full_Holy_Power-Holy_Power) + "의 신성력를 회복합니다");			
			Holy_Power = 100;
		}
		else //신성력 100% 일 때
		{
			System.out.println("신성력이 꽉찼습니다");
		}
		System.out.println("현재 신성력량 "+Holy_Power);	// 현재 신성력 량 
		bar();
		Damage = Damage + Damage_Add;
		return Damage;
	}
	
	public double Fist_of_Heaven()	// 스킬 "천상의 주먹" 
	{
		double Damage = 0;
		double Damage_Add = 0;
		Damage = Attack*Damage_Fist;			// 기본 데미지
		Damage_Add = Attack*Add_Damage_Fist;	// 추가 데미지
		if(Holy_Power >= Holy_Power_Use_Fist)	// 신성력 량이 충분할 때(신성력 20 이상)
		{
			Holy_Power = Holy_Power - Holy_Power_Use_Fist; // 남은 신성력
			bar();
			System.out.println("천상의 주먹을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
			System.out.println("추가로 "+(int)Damage_Add+" 데미지를 주었습니다!");
			System.out.println("신성력이 "+Holy_Power_Use_Fist+"만큼 감소합니다.");
			System.out.println("현재 신성력량 "+Holy_Power);
			bar();
			return Damage;
		}
		else	// 신성력이 부족할 때
		{
			System.out.println("신성력이 부족합니다. 현재 신성력량 " + Holy_Power);
			Damage = 0;
			return Damage;
		}
	}
	
	public void Iron_Skin()	// 스킬 "철갑 피부" 
	{
		Skill_Name = "철갑 피부";
		if(Holy_Power >= Holy_Power_Use_Iron_Skin)	// 신성력 량이 충분할 때(신성력 20 이상)
		{
			Thread thread = new Thread(new Runnable() 
			{
				@Override
				public void run() {
					int duration = 3;
					double temp_Defence = Defence;
					Defence = Defence*Iron_Skin_Defence_Rate;
					System.out.println(Skill_Name + "를 시전합니다. " + duration + "초 동안 지속됩니다");
					System.out.println("방어력이 " + (long)Iron_Skin_Defence_Rate*100 +"% 증가하였습니다");
					Skill_On = true;
					try {
						Thread.sleep(duration*1000);
						Defence = temp_Defence;
						System.out.println("방어력이 원래대로 돌아옵니다. 현재 방어력은 " + (long)Defence +"입니다");
						Skill_On = false;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			});
			thread.start();
		}
		else	// 신성력이 부족할 때
		{
			System.out.println("신성력이 부족합니다. 현재 신성력량 " + Holy_Power);
		}
		
		
	}
	
	public void Print_Status() {	// 캐릭터 상태창 출력
		// TODO Auto-generated method stub
		bar();
		System.out.println("아이디: " + ID);
		System.out.println("직업명 : " + Name);
		System.out.println("레벨 : " + Level_Num);
		System.out.println("신성력 : " + Holy_Power);
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
	public double Normal_Attack() {	// 일반 공격
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
		int Skill_Num = Skill_Choice();	// 스킬 선택
		
		if(Skill_Num == 1)	// 스킬 "정의" 사용시
		{
			Damage = Justice();
		}			
		else if(Skill_Num == 2)	// 스킬 "천상의 주먹" 사용시
		{
			Damage = Fist_of_Heaven();
		}
		if(!Skill_On)
		{
			if(Skill_Num == 3) // 스킬 "철갑 피부" 사용시
			{
				Iron_Skin();
			}
		}
		return Damage;
	}	
	
	public int Skill_Choice()	// 스킬 선택
	{
		Scanner scan = new Scanner(System.in);
		bar();
		System.out.println("1. 정의");
		System.out.println("2. 천상의 주먹");
		if(!Skill_On)
			System.out.println("3. 철갑피부");
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
					weapon.Item_Strength = ((Weapon) object).Item_Strength;
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
					armor.Item_Strength = ((Armor) object).Item_Strength;
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