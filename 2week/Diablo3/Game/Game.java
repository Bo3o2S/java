package Game;

import java.util.Random;
import java.util.Scanner;


import Boss_Monster.*;
import Common_Monster.*;
import Item.Armor;
import Item.Item;
import Item.Item_Interface;
import Item.Jewelry;
import Item.Weapon;
import Item_Weapon_Rare.Item_Weapon_Rare;
import Item_Weapon_Unique.Item_Weapon_Unique;
import Monster.MonSter;
import Champion_Monster.*;
import Unique_Monster.*;
import Monster_Unit.*;
import Character.Character;
import Character_Job.*;


public class Game {
	boolean Morning_On = true;
	Shared_Time shared_time = new Shared_Time(Morning_On);
	private static boolean Recovery_On = true;
	public static void main(String[] args) {
		
		String ID;
		
		// 안내문
		WelCome();
		
		// 직업선택
		int job_Num = Choice_Job();
		// ID 입력
		ID = Input_ID();
		if(job_Num == 1)
		{
			Babarian baba = new Babarian();
			baba.ID = ID;
			Play_Game(baba);
			
		}
		else if(job_Num == 2)
		{
			Holy_Warrior h_warrior = new Holy_Warrior();
			h_warrior.ID = ID;
			Play_Game(h_warrior);
			
		}
		else if(job_Num == 3)
		{
			Daemon_Hunter daemon_hunter = new Daemon_Hunter();
			daemon_hunter.ID = ID;
			Play_Game(daemon_hunter);
		}
		else if(job_Num == 4)
		{
			Magician magician = new Magician();
			magician.ID = ID;
			Play_Game(magician);
		}
		else if(job_Num == 5)
		{
			Monk monk = new Monk();
			monk.ID = ID;
			Play_Game(monk);
			
		}
		else if(job_Num == 6)
		{
			Witch_Doctor witch_doctor = new Witch_Doctor();
			witch_doctor.ID = ID;
			Play_Game(witch_doctor);
		}
		else if(job_Num == 0)
			System.exit(0);
		else
			System.exit(0);
	}
	
	
	private static void Play_Game(Character character) {
		
		Thread thread = new Thread(new Runnable()
		{
			double temp_character_attack = character.Attack;
			double temp_character_defence = character.Defence;
			@Override
			public void run() {
				while(true)
				{
					System.out.println("\t\t\t\t\t\t\t\t\t\t낮이 되었습니다");
					System.out.println("\t\t\t\t\t\t\t\t\t\t낮에는 공격력이 약해지고 방어력이 강화됩니다");
					character.Attack = temp_character_attack;
					character.Attack = character.Attack*0.9;
					character.Defence = temp_character_defence;
					character.Defence = character.Defence*1.1;
					try {
						Thread.sleep(300000);
						System.out.println("\t\t\t\t\t\t\t\t\t\t밤이 되었습니다");
						System.out.println("\t\t\t\t\t\t\t\t\t\t밤에는 공격력이 강해지고 방어력이 약화됩니다");
						character.Attack = temp_character_attack;
						character.Attack = character.Attack*1.1;
						character.Defence = temp_character_defence;
						character.Defence = character.Defence*0.9;
						Thread.sleep(300000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});
		
		int num;
		int stage = 1;
		boolean Boss_Kill_Success = false;
		
		while(true)
		{
			if(stage > 5)
			{
				System.out.println("축하합니다!!! 모든 스테이지를 클리어 하였습니다!");
				thread.stop();
				break;
			}
			
			Boss_Kill_Success = false;
			thread.start();
			num = Play(stage);
			if(num == 1)
			{
				Status((Character_Job)character);				// 캐릭터 상태창 출력
			}
			else if(num == 2)
			{
				if(stage == 1)
					Go_Normal_Dungeon(character, stage);					// 1막 일반던전 시작
				if(stage == 2)
					Go_Normal_Dungeon(character, stage);					// 2막 일반던전 시작
				if(stage == 3)
					Go_Normal_Dungeon(character, stage);					// 3막 일반던전 시작
				if(stage == 4)
					Go_Normal_Dungeon(character, stage);					// 4막 일반던전 시작
				if(stage == 5)
					Go_Normal_Dungeon(character, stage);					// 5막 일반던전 시작
			}
			else if(num == 3)
			{
				if(stage == 1)
				{
					Butcher_Boss_Stage1 butcher = new Butcher_Boss_Stage1();
					Boss_Kill_Success = Go_Boss_Dungeon(character, butcher, stage);					// 1막 보스던전 시작
				}
				if(stage == 2)
				{
					Belial_Boss_Stage2 belial = new Belial_Boss_Stage2();
					Boss_Kill_Success = Go_Boss_Dungeon(character, belial, stage);					// 2막 보스던전 시작
				}
				if(stage == 3)
				{
					Azmodan_Boss_Stage3 azmodan = new Azmodan_Boss_Stage3();
					Boss_Kill_Success = Go_Boss_Dungeon(character, azmodan, stage);					// 3막 보스던전 시작
				}
				if(stage == 4)
				{
					Diablo_Boss_Stage4 diablo = new Diablo_Boss_Stage4();
					Boss_Kill_Success = Go_Boss_Dungeon(character, diablo, stage);					// 4막 보스던전 시작
				}
				if(stage == 5)
				{
					Malthael_Boss_Stage5 malthael = new Malthael_Boss_Stage5();
					Boss_Kill_Success = Go_Boss_Dungeon(character, malthael, stage);					// 5막 보스던전 시작
				}
				if(Boss_Kill_Success)
					stage++;
			}
			else if(num == 4)
			{
				System.out.println("생명력을 회복합니다");
				character.HP = character.Full_HP;
				System.out.println("생명력을 100% 회복되었습니다!");
				System.out.println("현재 생명력 : " + character.HP);
			}
			else if(num == 5)
			{
				Visit_Jeweler(character);
			}
//			else if(num == 6)
//			{
//				Kanai_Treasure_Box(baba);
//			}
			else if(num == 6)
			{
				System.out.println("게임을 종료합니다!");
				thread.stop();
				System.exit(0);
			}
			else
				continue;
		}
		
	}


	private static void Kanai_Treasure_Box(Character character) {
				
	}


	private static void Visit_Jeweler(Character character) {
		while(true)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println("");
			System.out.println("보석상에 오신것을 확영합니다!!");
			System.out.println("보석상에서는 현재 가지고 있는 보석을 아이템에 장착할 수 있으며");
			System.out.println("보석의 능력치를 아이템에 부여할수 있습니다");
			System.out.println("1. 보석 확인");
			System.out.println("2. 보석 장착");
			System.out.println("3. 보석 제거");
			System.out.println("4. 나가기");
			bar();
			System.out.println("선택(1~4) : ");
			int num = scan.nextInt();
			scan.nextLine();
			if(num == 1)
			{
				Show_Inven_Jewelry(character);
				Weapon_Mounted_Jewelry(character);
				Armor_Mounted_Jewelry(character);
			}
			else if(num == 2)
			{
				bar();
				System.out.println("1. 무기 보석 착용");
				System.out.println("2. 방어구 보석 착용");
				System.out.println("");
				System.out.println("선택(1~2) : ");
				int number = scan.nextInt();
				scan.nextLine();
				Insert_Jewelry(character, number);
			}
			else if(num == 3)
			{
				bar();
				System.out.println("1. 무기 보석 제거");
				System.out.println("2. 방어구 보석 제거");
				System.out.println("");
				System.out.println("선택(1~2) : ");
				int number = scan.nextInt();
				scan.nextLine();
				Remove_Jewelry(character, number);
			}
			else if(num == 4)
			{
				break;
			}
		}
		
	}
	
	private static void Show_Inven_Jewelry(Character character) {
		if(character.inven.jewelry1.Item_Name != null || character.inven.jewelry2.Item_Name != null || character.inven.jewelry3.Item_Name != null)
		{
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println("");
			System.out.println("인벤토리에 보관된 보석입니다");
		}
		else
		{
			bar();
			System.out.println("인벤토리에 보석이 없습니다");
			bar();
			return;
		}
		if(character.inven.jewelry1.Item_Name != null)
		{
			bar();
			if(character.inven.jewelry1.Item_Type == 0)
			{
				System.out.println("등급 : " + character.inven.jewelry1.Item_Grade);
				System.out.println("이름 : " + character.inven.jewelry1.Item_Name);
				System.out.println("공격력 : " + character.inven.jewelry1.Attack);
			}
			else if(character.inven.jewelry1.Item_Type == 1)
			{
				System.out.println("등급 : " + character.inven.jewelry1.Item_Grade);
				System.out.println("이름 : " + character.inven.jewelry1.Item_Name);
				System.out.println("방어력 : " + character.inven.jewelry1.Defence);
			}
			bar();
		}
		if(character.inven.jewelry2.Item_Name != null)
		{
			bar();
			if(character.inven.jewelry2.Item_Type == 0)
			{
				System.out.println("등급 : " + character.inven.jewelry2.Item_Grade);
				System.out.println("이름 : " + character.inven.jewelry2.Item_Name);
				System.out.println("공격력 : " + character.inven.jewelry2.Attack);
			}
			else if(character.inven.jewelry2.Item_Type == 1)
			{
				System.out.println("등급 : " + character.inven.jewelry2.Item_Grade);
				System.out.println("이름 : " + character.inven.jewelry2.Item_Name);
				System.out.println("방어력 : " + character.inven.jewelry2.Defence);
			}
			bar();
		}
		if(character.inven.jewelry3.Item_Name != null)
		{
			bar();
			if(character.inven.jewelry3.Item_Type == 0)
			{
				System.out.println("등급 : " + character.inven.jewelry3.Item_Grade);
				System.out.println("종류 : 공격보석");
				System.out.println("공격력 : " + character.inven.jewelry3.Attack);
			}
			else if(character.inven.jewelry3.Item_Type == 1)
			{
				System.out.println("등급 : " + character.inven.jewelry3.Item_Grade);
				System.out.println("종류 : 방어보석");
				System.out.println("공격력 : " + character.inven.jewelry3.Defence);
			}
			bar();
		}
	}
	
	private static void Weapon_Mounted_Jewelry(Character character) 
	{
		if(character.weapon == null)
		{	
			bar();
			System.out.println("현재 착용한 무기가 없습니다");
			bar();
			return;
		}
		if( character.weapon.jewelry_hole.jewelry1.Item_Name != null)
		{
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println("");
			System.out.println("무기에 장착된 보석입니다");
		}
		else if(character.weapon.jewelry_hole.jewelry2.Item_Name != null)
		{
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println("");
			System.out.println("무기에 장착된 보석입니다");
		}
		else if(character.weapon.jewelry_hole.jewelry3.Item_Name != null)
		{
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println("");
			System.out.println("무기에 장착된 보석입니다");
		}
		else
		{
			bar();
			System.out.println("무기에 장착된 보석이 없습니다");
			bar();
			return;
		}
			
		if(character.weapon.jewelry_hole.jewelry1.Item_Name != null)
		{
			bar();
			System.out.println("등급 : " + character.weapon.jewelry_hole.jewelry1.Item_Grade);
			System.out.println("이름 : " + character.weapon.jewelry_hole.jewelry1.Item_Name);
			System.out.println("공격력 : " + character.weapon.jewelry_hole.jewelry1.Attack);
			
			bar();
		}
		if(character.weapon.jewelry_hole.jewelry2.Item_Name != null)
		{
			bar();
			System.out.println("등급 : " + character.weapon.jewelry_hole.jewelry2.Item_Grade);
			System.out.println("이름 : " + character.weapon.jewelry_hole.jewelry2.Item_Name);
			System.out.println("공격력 : " + character.weapon.jewelry_hole.jewelry2.Attack);
			bar();
		}
		if(character.weapon.jewelry_hole.jewelry3.Item_Name != null)
		{
			bar();
			System.out.println("등급 : " + character.weapon.jewelry_hole.jewelry3.Item_Grade);
			System.out.println("이름 : " + character.weapon.jewelry_hole.jewelry3.Item_Name);
			System.out.println("공격력 : " + character.weapon.jewelry_hole.jewelry3.Attack);
			bar();
		}
	}
	
	private static void Armor_Mounted_Jewelry(Character character) 
	{
		if(character.armor == null)
		{	
			bar();
			System.out.println("현재 착용한 방어구가 없습니다");
			bar();
			return;
		}
		if( character.armor.jewelry_hole.jewelry1.Item_Name != null || character.armor.jewelry_hole.jewelry2.Item_Name  != null || character.armor.jewelry_hole.jewelry3.Item_Name  != null)
		{
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println("");
			System.out.println("방어구에 장착된 보석입니다");
		}
		else
		{
			bar();
			System.out.println("방어구에 장착된 보석이 없습니다");
			bar();
			return;
		}
			
		if(character.armor.jewelry_hole.jewelry1.Item_Name != null)
		{
			bar();
			System.out.println("등급 : " + character.armor.jewelry_hole.jewelry1.Item_Grade);
			System.out.println("이름 : " + character.armor.jewelry_hole.jewelry1.Item_Name);
			System.out.println("방어력 : " + character.armor.jewelry_hole.jewelry1.Defence);
			bar();
		}
		if(character.armor.jewelry_hole.jewelry2.Item_Name != null)
		{
			bar();
			System.out.println("등급 : " + character.armor.jewelry_hole.jewelry2.Item_Grade);
			System.out.println("이름 : " + character.armor.jewelry_hole.jewelry2.Item_Name);
			System.out.println("방어력 : " + character.armor.jewelry_hole.jewelry2.Defence);
			bar();
		}
		if(character.armor.jewelry_hole.jewelry3.Item_Name != null)
		{
			bar();
			System.out.println("등급 : " + character.armor.jewelry_hole.jewelry3.Item_Grade);
			System.out.println("이름 : " + character.armor.jewelry_hole.jewelry3.Item_Name);
			System.out.println("방어력 : " + character.armor.jewelry_hole.jewelry3.Defence);
			bar();
		}
	}
	
	private static void Insert_Jewelry(Character character, int number) 
	{
			((Character_Job)character).Insert_Jewelry(number);
	}
	
	private static void Remove_Jewelry(Character character, int number) 
	{
			((Character_Job)character).Remove_Jewelry(number);
	}
	public static void bar()
	{
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("");
	}
	
	public static void WelCome()
	{
		System.out.println("================ Welcome to Hell ===============");
		System.out.println("디아블로 3에 오신것을 환영합니다");
		System.out.println("디아블로 3의 던전은 Act 1,2,3,4,5로 구성되어 있습니다");
		System.out.println("직업은 , 성전사, 악마사냥꾼을 선택할 수 있습니다");
		System.out.println("몬스터는 일반, 챔피언, 유니크, 보스 등급으로 나뉘어져 있으며");
		System.out.println("일반 던전과  보스 던전으로 나누어져 있습니다");
		System.out.println("일반던전을 통해 레벨업 후 보스던전 공략을 추천드립니다");
		System.out.println("각 Act별 보스 공략 후 다음 Act로 넘어갈 수 있습니다.");
	}
	
	public static String Input_ID()
	{
		Scanner scan = new Scanner(System.in);
		String ID;
		bar();
		System.out.println("캐릭터명을 입력해주세요 : ");
		ID = scan.nextLine();
		
		System.out.println(ID + " 캐릭터가 생성되었습니다!");
		return ID;
		
	}
	
	public static int Choice_Job()
	{
		Scanner scan = new Scanner(System.in);
		bar();
		System.out.println("직업을 선택해주세요");
		System.out.println("1. 야만전사");
		System.out.println("2. 성전사");
		System.out.println("3. 악마사냥꾼");
		System.out.println("4. 마법사");
		System.out.println("5. 수도사");
		System.out.println("0. 프로그램 종료");
		bar();
		System.out.println("번호입력(0 ~ 3) : ");
		int Input_Num = scan.nextInt();
		scan.nextLine();
		
		return Input_Num;
	}
	
	public static int Play(int stage)	// 스테이지별  안내문 출력
	{
		Scanner scan = new Scanner(System.in);
		bar();
		System.out.println(stage + "막에 오신것을 환영합니다!");
		System.out.println("마을 광장입니다!");
		System.out.println("1. 캐릭터 스탯 확인하기");
		System.out.println("2. 일반 던전 입장하기");
		System.out.println("3. 보스 던전 입장하기");
		System.out.println("4. 체력 회복하기");
		System.out.println("5. 보석상");
		//System.out.println("6. 카나이함");
		System.out.println("6. 게임 종료하기");
		bar();
		System.out.println("번호입력(1 ~ 6) : ");
		int Input_Num = scan.nextInt();
		scan.nextLine();
		
		return Input_Num;
	}
	
	public static void Go_Normal_Dungeon(Character character, int stage) { 	// 1막 일반던전 사냥

		bar();
		System.out.println("Stage" + stage +" 던전을 탐험합니다");
		boolean back_To_Town = false;					// 마을복귀 변수. true: 복귀. false: 진행
		
		while(true)
		{
			if(character.HP <= 0)	// 사망시 마을로 돌아감
			{
				character.HP = character.Full_HP*0.3;		// 사망시 생명력 30% 로 부활 후 마을귀환
				System.out.println(character.Name + "가 사망하였습니다. 마을에서 부활합니다.");
				break;
			}

			if(back_To_Town)	// 마을복귀 선택시 마을로 돌아감
				break;
			
			Compulsion_Common_Monster compulsion
			= new Compulsion_Common_Monster();								// 일반 몬스터 : "강제자" 생성
			Raise_Darkness_Champion_Monster raise_darkness
				= new Raise_Darkness_Champion_Monster();						// 챔피언 몬스터 : "어둠을 키우는 자" 생성
			Azrase_Unique_Monster element
				= new Azrase_Unique_Monster();									// 유니크 몬스터 생성 "원소지배자" 생성
			
			
			int Common_Monster_Apear_Chance = 85;
			int Unique_Monster_Apear_Chance = 5;
			int Apear_Chance = 100;												// 몬스터 등장 확률 100%
			int Monster_Flag = 0;												// 몬스터 구분. 1:일반몬스터 	2.챔피언몬스터	3.유니크 몬스터
			
			Random random = new Random();
			int Monster_Apear_Chance = random.nextInt(100) + 1;					// 몬스터 출현확률(일반 85%, 챔피언 10%, 유니크 5%)
			SharedResource_Battle sharedresource_battle;
			if(Monster_Apear_Chance <= Common_Monster_Apear_Chance) // 일반 몬스터
			{
				sharedresource_battle = new SharedResource_Battle(character.HP, compulsion.HP);
				Monster_Appear_Print(compulsion);
				Monster_Flag = 1;	// 일반 몬스터
			}
			else if((Monster_Apear_Chance > Common_Monster_Apear_Chance) && (Monster_Apear_Chance <= (Apear_Chance-Unique_Monster_Apear_Chance))) // 챔피언 몬스터
			{
				sharedresource_battle = new SharedResource_Battle(character.HP, raise_darkness.HP);
				Monster_Appear_Print(raise_darkness);
				Monster_Flag = 2;	// 챔피언 몬스터
			}
			else
			{
				sharedresource_battle = new SharedResource_Battle(character.HP, element.HP);
				Monster_Appear_Print(element);
				Monster_Flag = 3;	// 유니크 몬스터
			}
			while(true)
			{
				if(character.HP <= 0) // 사망시
				{
					break;
				}
				else	// 생존시
				{
					boolean Monster_Kill_Success = false;
					if(Monster_Flag == 1) // 일반 몬스터
					{
						Monster_Kill_Success = Monster_Kill_Success(compulsion, character);
					}
					else if(Monster_Flag == 2) // 챔피언 몬스터
					{
						Monster_Kill_Success = Monster_Kill_Success(raise_darkness, character);
					}
					else if(Monster_Flag == 3)// 유니크 몬스터
						Monster_Kill_Success = Monster_Kill_Success(element, character); 					
					
					if(Monster_Kill_Success) // 몬스터 처치 성공시
					{
						long Monster_Experience;
						long Monster_Gold;
						if(Monster_Flag == 1) // 일반 몬스터
						{
							Monster_Experience = compulsion.Exp;
							Get_Experience(Monster_Experience, character);
							Monster_Gold = compulsion.Gold;
							Get_Gold(Monster_Gold, character);
							Item item = Get_Item(compulsion, character);
							Get_Jewelry(compulsion, character);
							Level_Up(character);
							((Character_Job)character).Wear_Equipment(item);
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							Monster_Experience = raise_darkness.Exp;
							Get_Experience(Monster_Experience, character);
							Monster_Gold = raise_darkness.Gold;
							Get_Gold(Monster_Gold, character);
							Item item = Get_Item(raise_darkness, character);
							Get_Jewelry(raise_darkness, character);
							Level_Up(character);
							((Character_Job)character).Wear_Equipment(item);
						}
						else // 유니크 몬스터
						{
							Monster_Experience = element.Exp;
							Get_Experience(Monster_Experience, character);
							Monster_Gold = element.Gold;
							Get_Gold(Monster_Gold, character);
							Item item = Get_Item(element, character);
							Get_Jewelry(element, character);
							Level_Up(character);							// 레벨업 여부 판단
							((Character_Job)character).Wear_Equipment(item);
						}
						break;
					}
					
					int num = Attack_Choice();	// 행동 선택 : 1. 공격하기 	2. 체력회복	3. 후퇴하기	4. 마을복귀
					
					if(num == 1) // 1. 공격하기 선택시
					{
						Monster_Attack_Thread common_attack_thread = new Monster_Attack_Thread();
						common_attack_thread.character = character;
						common_attack_thread.sharedresource_battle = sharedresource_battle;
						
						if(Monster_Flag == 1) // 일반 몬스터
						{
							if(compulsion.HP > 0 )
							{
								System.out.println("현재 " + compulsion.Name + "의 HP : "+ (int)sharedresource_battle.Monster_HP);			// 현재 몬스터 HP
								common_attack_thread.monster_unit = compulsion;
								common_attack_thread.start();
								character.HP = sharedresource_battle.Character_HP;
							}
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							if(raise_darkness.HP > 0 )
							{
								System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ (int)sharedresource_battle.Monster_HP);			// 현재 몬스터 HP
								common_attack_thread.monster_unit = raise_darkness;
								common_attack_thread.start();
								character.HP = sharedresource_battle.Character_HP;			// 현재 캐릭터 HP
							}
						}
						else	// 유니크 몬스터
						{
							if(element.HP > 0 )
							{
								System.out.println("현재 " + element.Name + "의 HP : "+ (int)sharedresource_battle.Monster_HP);			// 현재 몬스터 HP
								common_attack_thread.monster_unit = element;
								common_attack_thread.start();
								character.HP = sharedresource_battle.Character_HP;			// 현재 캐릭터 HP
							}
						}
						while(true)
						{
							if(sharedresource_battle.Monster_HP <= 0 || sharedresource_battle.Character_HP <= 0)
								break;
							int attack_num = Attack_or_Retreat();
							if(attack_num == 1) // 1. 일반공격 선택시
							{
								if(character.HP > 0)
								{
									if(Monster_Flag == 1) // 일반 몬스터
									{
										Character_Normal_Attack(character, compulsion, sharedresource_battle);
									}
									else if(Monster_Flag == 2)
									{
										Character_Normal_Attack(character, raise_darkness, sharedresource_battle);
									} 
									else
										Character_Normal_Attack(character, element, sharedresource_battle);
								}
							}
							else if(attack_num == 2) // 2. 스킬공격 선택시
							{
								
								if(character.HP > 0)
								{
									if(Monster_Flag == 1) // 일반 몬스터
									{
										Character_Skill_Attack(character, compulsion, sharedresource_battle);
									}
									else if(Monster_Flag == 2)
									{
										Character_Skill_Attack(character, raise_darkness, sharedresource_battle);
									}
									else
										Character_Skill_Attack(character, element, sharedresource_battle);
								}
							}
							else // 3. 후퇴하기
							{
								common_attack_thread.stop();
								break;
							}
								
						}
					}
					
					else if(num == 2) // 2. 체력회복 선택시
					{
						if(Recovery_On)
							Recovery_HP(character);
					}
					else if(num == 3) // 3. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 4) // 4. 마을복귀 선택시
					{
						System.out.println("마을로 돌아갑니다");
						back_To_Town = true;
						break;
					}
				}
			}
		}
	}
	
	public static boolean Go_Boss_Dungeon(Character character, MonSter monster, int stage)	//  1막 보스던전 사냥
	{
		bar();
		System.out.println("Stage" + stage + " 보스 던전을 탐험합니다");
		boolean back_To_Town = false;					// 마을복귀 변수. true: 복귀. false: 진행
		boolean Boss_Kill_Success = false;				// 보스 처치 성공여부
		SharedResource_Battle sharedresource_battle;
		while(true)
		{
			if(character.HP <= 0)	//  사망시 마을로 돌아감
			{
				character.HP = character.Full_HP*0.3;		// 사망시 생명력 30% 로 부활 후 마을귀환
				System.out.println(character.ID + "가 사망하였습니다. 마을에서 부활합니다.");
				break;
			}
			
			if(back_To_Town)	// 마을복귀 선택시 마을로 돌아감
				break;
			
			sharedresource_battle = new SharedResource_Battle(character.HP, monster.HP);
			sharedresource_battle.Boss_Monster_Sheild = 10000;
			Monster_Appear_Print((Monster_Unit)monster); 			// 보스 몬스터 등장 문구
			
			while(true)
			{
				if(character.HP <= 0) // 야만전사 사망시
				{
					break;
				}
				else	// 야만전사 생존시
				{
					Boss_Kill_Success 
						= Monster_Kill_Success((Monster_Unit)monster, character); 								// 보스 몬스터 처치 성공 여부
					long Monster_Experience;
					long Monster_Gold;
					if(Boss_Kill_Success) // 몬스터 처치 성공시
					{
						Monster_Experience = monster.Exp;
						Get_Experience(Monster_Experience, character);
						Monster_Gold = monster.Gold;
						Get_Gold(Monster_Gold, character);
						Item item = Get_Item((Monster_Unit)monster, character);
						Get_Jewelry((Monster_Unit)monster, character);
						Level_Up(character);
						((Character_Job)character).Wear_Equipment(item);
						return Boss_Kill_Success;
					}
					
					int num = Attack_Choice();	// 행동 선택 : 1. 공격하기 	2. 체력회복	3. 후퇴하기	4. 마을복귀
					
					double Damage;
					if(num == 1) // 1. 공격하기 선택시
					{
						Monster_Attack_Thread common_attack_thread = new Monster_Attack_Thread();
						common_attack_thread.character = character;
						common_attack_thread.sharedresource_battle = sharedresource_battle;
						if(monster.HP > 0 )
						{
							System.out.println("현재 " + monster.Name + "의 HP : "+ (int)sharedresource_battle.Monster_HP);			// 현재 몬스터 HP
							common_attack_thread.monster_unit = (Monster_Unit)monster;
							common_attack_thread.start();
							character.HP = sharedresource_battle.Character_HP;
						} 	
						while(true)
						{
							if(sharedresource_battle.Monster_HP <= 0 || sharedresource_battle.Character_HP <= 0)
								break;
							int attack_num = Attack_or_Retreat();
							if(attack_num == 1) // 1. 일반공격 선택시
							{
								if(character.HP > 0)
									Character_Normal_Attack(character, monster, sharedresource_battle);
								
							}
							else if(attack_num == 2) // 2. 스킬공격 선택시
							{
								if(character.HP > 0)
									Character_Skill_Attack(character, monster, sharedresource_battle);
							}
							else // 3. 후퇴하기
							{
								common_attack_thread.stop();
								break;
							}
								
						}
																	
					}
					else if(num == 2) // 2. 체력회복 선택시
					{
						Recovery_HP(character);
					}
					else if(num == 3) // 3. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 4) // 4. 마을복귀 선택시
					{
						System.out.println("마을로 돌아갑니다");
						back_To_Town = true;
						break;
					}
				}
			}
		}
		return Boss_Kill_Success;
	}
		
	public static void Monster_Appear_Print(Monster_Unit monster_unit)
	{
		monster_unit.Monster_Appear();	// 몬스터 등장 알림
	}
	public static boolean Monster_Kill_Success(Monster_Unit monster_unit, Character character)
	{
		boolean Success = false;
		Success = monster_unit.Kill_Success();
		return Success;
	}
	
	public static void Status(Character_Job character_job)
	{
		character_job.Print_Status();
	}
	
	public static void Get_Experience(long Monster_Experience, Character character)
	{
		bar();
		System.out.println(Monster_Experience + "의 경험치를 얻었습니다");
		character.Exp = character.Exp - Monster_Experience;			// 경험치 획득
		if(character.Exp > 0)
			System.out.println((character.Level_Num+1)+"레벨 까지 남은 경험치 " + character.Exp);
	}
	
	public static void Get_Gold(long Monster_Gold, Character character)
	{
		bar();
		System.out.println(Monster_Gold + "의 골드를 얻었습니다");
		character.Gold = character.Gold + Monster_Gold;
		System.out.println("현재 " + character.Gold + "골드");
	}
	
	public static void Level_Up(Character character)			// 레벨업
	{
		int Level = character.Level_Num;	// 현재 레벨 입력
		while(true)
		{
			if(character.Exp == 0)			// 다음 레벨업만큼 경험치를 획득했을 때
			{
				Level++;
				character.Level(Level);		// 레벨업!
				System.out.println("축하합니다!" + character.Level_Num + "레벨이 되었습니다!");
			}
			else if(character.Exp < 0)		// 다음 레벨업 이상으로 경험치 획득시
			{
				
				while(true)					// 경험치 획득량만큼 레벨업.
				{
					if(character.Exp > 0) 	// 더이상 획득 경험치가 없을 때까지
						break;
					long Left_Exp = character.Exp;
					Level++;
					character.Level(Level);
					character.Exp = character.Exp + Left_Exp;
				}
				System.out.println("축하합니다!" + character.Level_Num + "레벨이 되었습니다!");
			}
			break;
		}
	}
	
	private static Item Get_Item(Monster_Unit monster_unit, Character character) {
		Item item = (Item)monster_unit.Drop_Item((Character_Job)character);
		if(item instanceof Weapon)
			System.out.println(((Weapon)item).Item_Name + "(을)를 획득하였습니다!");
		if(item instanceof Armor)
			System.out.println(((Armor)item).Item_Name + "(을)를 획득하였습니다!");
		
		return item;
	}
	
	public static double Monster_Attack(Monster_Unit monster_unit)
	{
		double Damage;
		Damage = monster_unit.Monster_Attack();
		return Damage;
	}
	
	public static double Normal_Attack(Character_Job character_job)
	{
		double Damage;
		Damage = character_job.Normal_Attack();
		return Damage;
	}
	
	public static double Skill_Attack(Character_Job character_job)
	{
		double Damage;
		Damage = character_job.Skill_Attack();
		return Damage;
	}
	
	public static void Recovery_HP(Character character)	// 체력회복 메뉴 선택시
	{
		Thread thread = new Thread(new Runnable()
		{

			@Override
			public void run() {
				bar();
				if(character.HP <= character.Full_HP*0.7)		// 생명력이 70% 이하일 때
				{
					character.HP = character.HP + character.Full_HP*0.3;
					System.out.println("생명력을 회복합니다");
					System.out.println(character.Name + " 의 생명력이 " + (int)(character.Full_HP*0.3) +"만큼 회복되었습니다");	// 생명력 30% 회복
					System.out.println("현재 " + character.Name + " 의 생명력" + character.HP);
				}
				else if((character.HP > character.Full_HP*0.7) && (character.HP < character.Full_HP))	// 생명력이 70% 초과 100% 미만이 때 남은 생명력 만큼 회복(최대치)
				{
					character.HP = character.Full_HP;
					System.out.println("생명력을 회복합니다");
					System.out.println(character.Name + " 의 생명력이 " + (int)(character.Full_HP - character.HP) +"만큼 회복되었습니다");
					System.out.println("현재 " + character.Name + " 의 생명력" + character.HP);
				}
				else	// 생명력이 가득 차 있을 경우
					System.out.println("생명력이 가득 차있습니다");
				Recovery_On = false;
				try {
					Thread.sleep(30000);
					Recovery_On = true;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread.start();	
	}
	
	public static void Character_Normal_Attack(Character character, MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		double Damage;
		
		if(sharedresource_battle.Monster_HP > 0)
		{
			Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
			if(sharedresource_battle.Boss_Monster_Sheild > 0)
			{
				Boss_Monster_Reflective_Shield(Damage, sharedresource_battle, character, (Monster_Unit)monster);
			}
			else
			{
				Damage_Calculator damage_calculator = new Damage_Calculator(Damage, monster);
				Damage = damage_calculator.Damage_Conversion();
				sharedresource_battle.Character_Attack(Damage);
				monster.HP = sharedresource_battle.Monster_HP;
				System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
				if(sharedresource_battle.Monster_HP > 0)
					System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
			}
			
			
		}
		if(sharedresource_battle.Monster_HP > 0)
		{
			if(character.weapon instanceof Item_Weapon_Unique)
			{
				((Item_Weapon_Unique)character.weapon).Unique_Weapon_Skill(monster, sharedresource_battle);
			}
			else if(character.weapon instanceof Item_Weapon_Rare)
			{
				((Item_Weapon_Rare)character.weapon).Rare_Weapon_Skill(monster, sharedresource_battle);
			}
			if(sharedresource_battle.Monster_HP > 0)
				System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
		}
	}
	
	public static void Character_Skill_Attack(Character character, MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		double Damage;
		Damage = Skill_Attack((Character_Job) character);
		if(Damage > 0) // 공격스킬 사용시에만
		{
			if(sharedresource_battle.Monster_HP > 0)
			{
				if(sharedresource_battle.Boss_Monster_Sheild > 0)
				{
					Boss_Monster_Reflective_Shield(Damage, sharedresource_battle, character, (Monster_Unit)monster);
				}
				else
				{
					Damage_Calculator damage_calculator = new Damage_Calculator(Damage, monster);
					Damage = damage_calculator.Damage_Conversion();
					sharedresource_battle.Character_Attack(Damage);
					monster.HP = sharedresource_battle.Monster_HP;
					System.out.println(monster.Name + "이(가) " + (int)Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
					if(sharedresource_battle.Monster_HP > 0)
						System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
				}
			}
			if(sharedresource_battle.Monster_HP > 0)
			{
				if(character.weapon instanceof Item_Weapon_Unique)
				{
					((Item_Weapon_Unique)character.weapon).Unique_Weapon_Skill(monster, sharedresource_battle);
				}
				else if(character.weapon instanceof Item_Weapon_Rare)
				{
					((Item_Weapon_Rare)character.weapon).Rare_Weapon_Skill(monster, sharedresource_battle);
				}
				if(sharedresource_battle.Monster_HP > 0)
					System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
			}
		}			
	}
	
	private static void Get_Jewelry(Monster_Unit monster_unit, Character character) {
		Jewelry jewelry = (Jewelry) monster_unit.Drop_Jewelry();
		if(jewelry != null)
		{
			System.out.println(((Jewelry)jewelry).Item_Name + "(을)를 획득하였습니다!");
			boolean can_pick_up = ((Character_Job)character).Pick_Up_Jewerly(jewelry);
			if(!can_pick_up)
				((Character_Job)character).Exchange_Jewerly(jewelry);
		}
	}
	private static int Attack_or_Retreat() {
		Scanner scan = new Scanner(System.in);
		bar();
		System.out.println("1. 일반공격	");
		System.out.println("2. 스킬공격	");
		System.out.println("3. 후퇴");
		System.out.println("선택 : ");
		bar();
		int num = scan.nextInt();
		scan.nextLine();
		return num;
	}

	private static int Attack_Choice() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		if(Recovery_On)
		{
			System.out.println("1. 전투하기");
			System.out.println("2. 체력회복");
			System.out.println("3. 후퇴하기");
			System.out.println("4. 마을복귀");
			System.out.println("선택하기(1~4) : ");
		}
		else
		{
			System.out.println("1. 공격하기");
			System.out.println("2. 후퇴하기");
			System.out.println("3. 마을복귀");
			System.out.println("선택하기(1~3) : ");
		}
		
		int num = scan.nextInt();
		scan.nextLine();
		return num;
	}
	
	private static void Boss_Monster_Reflective_Shield(double Damage, SharedResource_Battle sharedresource_battle, Character character, Monster_Unit monster_unit)
	{
		double Reflective_Damage;
		if(Damage > 0)
		{
			bar();
			Reflective_Damage = sharedresource_battle.Sheild_Energy(Damage);
			System.out.println(((MonSter)monster_unit).Name + "의 쉴드에 " + Damage + "만큼의 데미지를 주었습니다!");
			sharedresource_battle.Monster_Attack(Reflective_Damage);
			character.HP = sharedresource_battle.Character_HP;
			System.out.println(character.ID + "가 " +((MonSter)monster_unit).Name + "에게 " + Reflective_Damage + " 만큼의 데미지를 받았습니다!");
			System.out.println("현재 " + character.ID + "의 HP : " + character.HP);
			bar();
		}
		if(sharedresource_battle.Boss_Monster_Sheild <= 0)
		{
			bar();
			System.out.println(((MonSter)monster_unit).Name + "의 쉴드가 깨졌습니다!");
			bar();
		}
	}
}

class Monster_Attack_Thread extends Thread
{
	SharedResource_Battle sharedresource_battle;
	Monster_Unit monster_unit;
	Character character;
	double Damage;
	
	@Override
	public void run() {
		while(true)
		{
			if(sharedresource_battle.Monster_HP <= 0 || sharedresource_battle.Character_HP <= 0)
				break;
			if(sharedresource_battle.Monster_HP > 0)
			{
				Damage = monster_unit.Monster_Attack();
				Damage_Calculator damage_calculator = new Damage_Calculator(Damage, character);
				Damage = damage_calculator.Damage_Conversion();
				System.out.println(character.ID + "이(가) " + (int)Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
				sharedresource_battle.Monster_Attack(Damage);
				if(sharedresource_battle.Character_HP > 0)
					System.out.println("현재 " + character.ID +"의 HP : " + (int)sharedresource_battle.Character_HP);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Shared_Time
{
	public boolean Morning_On = true;
	public Shared_Time(boolean bool)
	{
		this.Morning_On = bool;
	}
	public synchronized void Morning_On(boolean bool)
	{
		this.Morning_On  = bool;
	}
}

