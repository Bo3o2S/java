package Character_Job;

import java.util.Random;
import java.util.Scanner;

import Character.Character;
import Item.Armor;
import Item.Jewelry;
import Item.Weapon;

public class Daemon_Hunter extends Character implements Character_Job{
	
	public Daemon_Hunter()
	{
		// 악마사냥꾼 기본 스탯 세팅
		Name = "악마사냥꾼";
		Level_Num = 1;
		HP = 130;
		Attack = 22;
		Defence = 12;
		Evasion = 7;
		Strength = 8;  
		Dex = 10;
		Intelligence = 8;
		Recovery = 10;
		Vitality = 10;
		Defence = 12;
		Gold = 5000;
		Exp = 100;
		Full_Exp = Exp;
		
		// 레벨 증가시 수치 향상 비율
		HP_Rate = 190;
		Strength_Rate = 10; 
		Dex_Rate = 30;
		Defence_Rate = 10;
		Intelligence_Rate = 10;		
		Vitality_Rate = 10;
		Recovery_Rate = 10;
		Vital_Hp_Rate = 0.05;		
		Exp_Rate = 200;
		Attack_Rate = 22;
		Defence_Rate = 9;
		Evasion_Rate = 0.3;
	}
	
	// 악마사냥꾼 추가 스탯 세팅
	public int Hate = 125;
	public int Moderation = 30;
	
	// 증오, 절제의 최고량
	int Full_Hate = 125;
	int Full_Moderation = 30;
	
	// "굶주린 화살" 데미지 증가량
	double Damage_Hungry_Arrow= 1.5;
	double Add_Damage_Hungry_Arrow= 3.0;
	
	// "투검" 데미지 증가량
	double Damage_Throw_Knife= 7.5;
	double Add_Damage_Throw_Knife= 3.0;
	
	// "공격력 상승" 공격력 증가량
	double Damage_Dark_Power = 1.1;
	
	// "굶주린 화살" 추가 공격 발생확률
	int Chance_Hungry_Arrow = 35;
	
	// "투검" 추가 공격 발생확률
	int Chance_Throw_Knife = 15;
	
	// "굶주린 화살" 증오 생성량
	int Hate_Make_Hungry_Arrow = 8;
	
	// "투검" 증오 사용량
	int Hate_Use_Throw_Knife = 40;
	
	// 스킬 사용여부. 버프 스킬에 사용. true: 스킬 사용중. false : 스킬 사용가능. 
	Boolean Skill_On = false;
	Inven inven = new Inven();
	public int Jewerly_Num = 0; 
	Random random = new Random();
	
	public double Hungry_Arrow()
	{
		double Damage = 0;
		double Damage_Add = 0;
		
		Damage = Attack*Damage_Hungry_Arrow;
		bar();
		System.out.println("굶주린 화살을 시전합니다"+(int)Damage+"의 데미지를 주었습니다!");
		if(random.nextInt(100) < Chance_Hungry_Arrow)
		{
			Damage_Add = Attack*Add_Damage_Hungry_Arrow;
			System.out.println("추가데미지"+(int)Damage_Add+"를 주었습니다!");
		}
		if(Hate <= (Full_Hate - Hate_Make_Hungry_Arrow))
		{
			System.out.println(Hate_Make_Hungry_Arrow + "의 증오를 회복합니다");
			Hate = Hate + Hate_Make_Hungry_Arrow;
		}
		else if(Hate > (Full_Hate - Hate_Make_Hungry_Arrow) && Hate < Full_Hate)
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
	
	public double Throw_Knife()
	{
		double Damage = 0;
		double Damage_Add = 0;
		if(Hate >= Hate_Use_Throw_Knife)
		{
			Damage = Attack*Damage_Throw_Knife;
			bar();
			System.out.println("투검을 시전합니다"+(int)Damage+"의 데미지를 주었습니다!");
			if(random.nextInt(100) < Chance_Throw_Knife)
			{
				Damage_Add = Attack*Add_Damage_Throw_Knife;
				System.out.println("추가데미지"+(int)Damage_Add+"를 주었습니다!");
			}
			
			Hate = Hate - Hate_Use_Throw_Knife;
			System.out.println("증오가 "+ Hate_Use_Throw_Knife + "소모되었습니다");		
			System.out.println("현재 증오량 "+Hate);
			bar();
		}
		else
			System.out.println("증오가 부족합니다");
		return Damage;	
	}
	
	public double Dark_Power()
	{
		Skill_Name = "어둠의 힘";
		
		Thread thread = new Thread(new Runnable() 
		{
			@Override
			public void run() {
				double temp = 0;
				int duration = 15; // 스킬 지속 시간
				temp = Attack;
				Attack = Attack*Damage_Dark_Power;
				System.out.println(Skill_Name + "을 시전합니다. " + duration + "초 동안 지속됩니다");
				System.out.println("공격력이 " + (long)temp + "에서 " +(long)Attack + "로 증가하였습니다");
				Skill_On = true;
				try {
					Thread.sleep(duration*1000);
					Attack = temp;
					System.out.println("공격력이 원래대로 돌아옵니다. 현재 공격력은 " + (long)Attack);
					Skill_On = false;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		});
		thread.start();
		
		bar();
		return 0;
	}
	
	public void Print_Status() // 캐릭터 상태창 출력
	{
		bar();
		System.out.println("아이디: " + ID);
		System.out.println("직업명 : " + Name);
		System.out.println("레벨 : " + Level_Num);
		System.out.println("증오 : " + Hate);
		System.out.println("절제 : " + Moderation);
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
	public double Normal_Attack() {	// 일반공격
		// TODO Auto-generated method stub
		double Damage = 0;
		Damage = Attack;
		System.out.println(Name + "가 " + Attack + "만큼의 데미지를 입힙니다");		// 몬스터에게 주는 데미지
		return Damage;
	}

	@Override
	public double Skill_Attack() {	// 스킬공격
		// TODO Auto-generated method stub
		double Damage = 0;		// 몬스터에 주는 데미지
		Random random = new Random();	
		int Skill_Num = Skill_Choice();	// 스킬 선택
		
		if(Skill_Num == 1)	// 스킬 "굶주린 화살" 사용시
		{
			Damage = Hungry_Arrow();
		}			
		else if(Skill_Num == 2)	// 스킬 "투검" 사용시
		{
			Damage = Throw_Knife();
		}
		if(!Skill_On)
		{
			if(Skill_Num == 3) // 스킬 "공격력 증가" 사용시
			{
				Dark_Power();
			}
		}
		return Damage;
	}	
	
	public int Skill_Choice()	// 스킬 선택
	{
		Scanner scan = new Scanner(System.in);
		bar();
		System.out.println("1. 굶주린 화살");
		System.out.println("2. 투검");
		if(!Skill_On)
			System.out.println("3. 어둠의 힘");
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
					weapon.Item_Dex = ((Weapon) object).Item_Dex;
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
					armor.Item_Dex = ((Armor) object).Item_Dex;
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

	public void Delete_Jewerly(Jewelry jewelry)
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