package Game;

import Job.*;
import Monster_Unit.*;

import java.util.Random;
import java.util.Scanner;

import Character.Character;

public class Game {
	
	public static void main(String[] args) {
		
		String ID;
		int num;
		int stage = 1;
		boolean Boss_Kill_Success = false;
		// 안내문
		WelCome();
		
		// 직업선택
		int job_Num = Choice_Job();
		if(job_Num == 1)
		{
			Babarian baba = new Babarian();
			// ID 입력
			ID = Input_ID();
			baba.ID = ID;
			
			while(true)
			{
				Boss_Kill_Success = false;
				num = Play(stage);
				if(num == 1)
				{
					Status(baba);				// 캐릭터 상태창 출력
				}
				else if(num == 2)
				{
					if(stage == 1)
						Go_Normal_Dungeon_Stage1(baba);					// 1막 일반던전 시작
					if(stage == 2)
						Go_Normal_Dungeon_Stage2(baba);					// 2막 일반던전 시작
					if(stage == 3)
						Go_Normal_Dungeon_Stage3(baba);					// 3막 일반던전 시작
					if(stage == 4)
						Go_Normal_Dungeon_Stage4(baba);					// 4막 일반던전 시작
					if(stage == 5)
						Go_Normal_Dungeon_Stage5(baba);					// 5막 일반던전 시작
				}
				else if(num == 3)
				{
					if(stage == 1)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(baba);					// 1막 보스던전 시작
					if(stage == 2)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage2(baba);					// 2막 보스던전 시작
					if(stage == 3)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage3(baba);					// 3막 보스던전 시작
					if(stage == 4)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage4(baba);					// 4막 보스던전 시작
					if(stage == 5)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage5(baba);					// 5막 보스던전 시작
					if(Boss_Kill_Success)
						stage++;
				}
				else if(num == 4)
				{
					System.out.println("생명력을 회복합니다");
					baba.HP = baba.Full_HP;
					System.out.println("생명력을 100% 회복되었습니다!");
					System.out.println("현재 생명력 : " + baba.HP);
				}
				else if(num == 5)
				{
					System.out.println("게임을 종료합니다!");
					System.exit(0);
				}
				else
					continue;
			}
		}
		else if(job_Num == 2)
		{
			Holy_Warrior h_warrior = new Holy_Warrior();
			
			// ID 입력
			ID = Input_ID();
			h_warrior.ID = ID;
			
			while(true)
			{
				Boss_Kill_Success = false;
				num = Play(stage);
				if(num == 1)
				{
					Status(h_warrior);				// 캐릭터 상태창 출력
				}
				else if(num == 2)
				{
					if(stage == 1)
						Go_Normal_Dungeon_Stage1(h_warrior);					// 1막 일반던전 시작
					if(stage == 2)
						Go_Normal_Dungeon_Stage2(h_warrior);					// 2막 일반던전 시작
					if(stage == 3)
						Go_Normal_Dungeon_Stage3(h_warrior);					// 3막 일반던전 시작
					if(stage == 4)
						Go_Normal_Dungeon_Stage4(h_warrior);					// 4막 일반던전 시작
					if(stage == 5)
						Go_Normal_Dungeon_Stage5(h_warrior);					// 5막 일반던전 시작
				}
				else if(num == 3)
				{
					if(stage == 1)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(h_warrior);					// 1막 보스던전 시작
					if(stage == 2)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(h_warrior);					// 2막 보스던전 시작
					if(stage == 3)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(h_warrior);					// 3막 보스던전 시작
					if(stage == 4)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(h_warrior);					// 4막 보스던전 시작
					if(stage == 5)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(h_warrior);					// 5막 보스던전 시작
					if(Boss_Kill_Success)
						stage++;
				}
				else if(num == 4)
				{
					System.out.println("생명력을 회복합니다");
					h_warrior.HP = h_warrior.Full_HP;
					System.out.println("생명력을 100% 회복되었습니다!");
					System.out.println("현재 생명력 : " + h_warrior.HP);
				}
				else if(num == 5)
				{
					System.out.println("게임을 종료합니다!");
					System.exit(0);
				}
				else
					continue;
			}
		}
		else if(job_Num == 3)
		{
			Daemon_Hunter daemon_hunter = new Daemon_Hunter();
			
			// ID 입력
			ID = Input_ID();
			daemon_hunter.ID = ID;
			
			while(true)
			{
				Boss_Kill_Success = false;
				num = Play(stage);
				if(num == 1)
				{
					Status(daemon_hunter);				// 캐릭터 상태창 출력
				}
				else if(num == 2)
				{
					if(stage == 1)
						Go_Normal_Dungeon_Stage1(daemon_hunter);					// 1막 일반던전 시작
					if(stage == 2)
						Go_Normal_Dungeon_Stage2(daemon_hunter);
					if(stage == 3)
						Go_Normal_Dungeon_Stage3(daemon_hunter);
					if(stage == 4)
						Go_Normal_Dungeon_Stage4(daemon_hunter);
					if(stage == 5)
						Go_Normal_Dungeon_Stage5(daemon_hunter);
				}
				else if(num == 3)
				{
					if(stage == 1)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(daemon_hunter);					// 1막 보스던전 시작
					if(stage == 2)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(daemon_hunter);					// 2막 보스던전 시작
					if(stage == 3)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(daemon_hunter);					// 3막 보스던전 시작
					if(stage == 4)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(daemon_hunter);					// 4막 보스던전 시작
					if(stage == 5)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(daemon_hunter);					// 5막 보스던전 시작
					if(Boss_Kill_Success)
						stage++;
				}
				else if(num == 4)
				{
					System.out.println("생명력을 회복합니다");
					daemon_hunter.HP = daemon_hunter.Full_HP;
					System.out.println("생명력을 100% 회복되었습니다!");
					System.out.println("현재 생명력 : " + daemon_hunter.HP);
				}
				else if(num == 5)
				{
					System.out.println("게임을 종료합니다!");
					System.exit(0);
				}
				else
					continue;
			}
		}
		else if(job_Num == 4)
		{
			Magician magician = new Magician();
			
			// ID 입력
			ID = Input_ID();
			magician.ID = ID;
			
			while(true)
			{	
				Boss_Kill_Success = false;
				num = Play(stage);
				if(num == 1)
				{
					Status(magician);				// 캐릭터 상태창 출력
				}
				else if(num == 2)
				{
					if(stage == 1)
						Go_Normal_Dungeon_Stage1(magician);					// 1막 일반던전 시작
					if(stage == 2)
						Go_Normal_Dungeon_Stage2(magician);					// 2막 일반던전 시작
					if(stage == 3)
						Go_Normal_Dungeon_Stage3(magician);					// 3막 일반던전 시작
					if(stage == 4)
						Go_Normal_Dungeon_Stage4(magician);					// 4막 일반던전 시작
					if(stage == 5)
						Go_Normal_Dungeon_Stage5(magician);					// 5막 일반던전 시작
				}
				else if(num == 3)
				{
					if(stage == 1)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(magician);					// 1막 보스던전 시작
					if(stage == 2)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(magician);					// 2막 보스던전 시작
					if(stage == 3)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(magician);					// 3막 보스던전 시작
					if(stage == 4)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(magician);					// 4막 보스던전 시작
					if(stage == 5)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(magician);					// 5막 보스던전 시작
					if(Boss_Kill_Success)
						stage++;
				}
				else if(num == 4)
				{
					System.out.println("생명력을 회복합니다");
					magician.HP = magician.Full_HP;
					System.out.println("생명력을 100% 회복되었습니다!");
					System.out.println("현재 생명력 : " + magician.HP);
				}
				else if(num == 5)
				{
					System.out.println("게임을 종료합니다!");
					System.exit(0);
				}
				else
					continue;
			}
		}
		else if(job_Num == 5)
		{
			Monk monk = new Monk();
			
			// ID 입력
			ID = Input_ID();
			monk.ID = ID;
			
			while(true)
			{
				num = Play(stage);
				if(num == 1)
				{
					Status(monk);				// 캐릭터 상태창 출력
				}
				else if(num == 2)
				{
					if(stage == 1)
						Go_Normal_Dungeon_Stage1(monk);					// 1막 일반던전 시작
					if(stage == 2)
						Go_Normal_Dungeon_Stage2(monk);					// 2막 일반던전 시작
					if(stage == 3)
						Go_Normal_Dungeon_Stage3(monk);					// 3막 일반던전 시작
					if(stage == 4)
						Go_Normal_Dungeon_Stage4(monk);					// 4막 일반던전 시작
					if(stage == 5)
						Go_Normal_Dungeon_Stage5(monk);					// 5막 일반던전 시작
				}
				else if(num == 3)
				{
					if(stage == 1)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(monk);					// 1막 보스던전 시작
					if(stage == 2)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(monk);					// 2막 보스던전 시작
					if(stage == 3)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(monk);					// 3막 보스던전 시작
					if(stage == 4)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(monk);					// 4막 보스던전 시작
					if(stage == 5)
						Boss_Kill_Success = Go_Boss_Dungeon_Stage1(monk);					// 5막 보스던전 시작
					if(Boss_Kill_Success)
						stage++;
				}
				else if(num == 4)
				{
					System.out.println("생명력을 회복합니다");
					monk.HP = monk.Full_HP;
					System.out.println("생명력을 100% 회복되었습니다!");
					System.out.println("현재 생명력 : " + monk.HP);
				}
				else if(num == 5)
				{
					System.out.println("게임을 종료합니다!");
					System.exit(0);
				}
				else
					continue;
			}
		}
		else if(job_Num == 0)
			System.exit(0);
		else
			System.exit(1);
			

	}
	
	public static void bar()
	{
		System.out.println("");
		System.out.println("================================================");
		System.out.println("");
	}
	
	public static void bar2()
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
		bar2();
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
		System.out.println("5. 게임 종료하기");
		bar2();
		System.out.println("번호입력(1 ~ 5) : ");
		int Input_Num = scan.nextInt();
		scan.nextLine();
		
		return Input_Num;
	}
	
	
	
	public static int Attack_Choice()
	{
		Scanner scan = new Scanner(System.in);
		bar2();
		System.out.println("1. 일반공격");
		System.out.println("2. 스킬공격");
		System.out.println("3. 체력회복");
		System.out.println("4. 후퇴하기");
		System.out.println("5. 마을복귀");
		bar2();
		System.out.println("선택하기(1~5) : ");
		int num = scan.nextInt();
		scan.nextLine();
		
		return num;
	}
		
	public static void Go_Normal_Dungeon_Stage1(Character character) { 	// 1막 일반던전 사냥

		bar();
		System.out.println("Stage1 던전을 탐험합니다");
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
			Ruler_of_Element_Unique_Monster element
				= new Ruler_of_Element_Unique_Monster();						// 유니크 몬스터 생성 "원소지배자" 생성
			
			
			int Common_Monster_Apear_Chance = 85;
			int Unique_Monster_Apear_Chance = 5;
			int Apear_Chance = 100;												// 몬스터 등장 확률 100%
			int Monster_Flag = 0;												// 몬스터 구분. 1:일반몬스터 	2.챔피언몬스터	3.유니크 몬스터 
			Random random = new Random();
			int Monster_Apear_Chance = random.nextInt(100) + 1;					// 몬스터 출현확률(일반 85%, 챔피언 10%, 유니크 5%)
			
			if(Monster_Apear_Chance <= Common_Monster_Apear_Chance) // 일반 몬스터
			{
				Monster_Appear_Print(compulsion);
				Monster_Flag = 1;	// 일반 몬스터
			}
			else if((Monster_Apear_Chance > Common_Monster_Apear_Chance) && (Monster_Apear_Chance <= (Apear_Chance-Unique_Monster_Apear_Chance))) // 챔피언 몬스터
			{
				Monster_Appear_Print(raise_darkness);
				Monster_Flag = 2;	// 챔피언 몬스터
			}
			else
			{
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
						Monster_Kill_Success = Monster_Kill_Success(compulsion);
					}
					else if(Monster_Flag == 2) // 챔피언 몬스터
					{
						Monster_Kill_Success = Monster_Kill_Success(raise_darkness);
					}
					else // 유니크 몬스터
						Monster_Kill_Success = Monster_Kill_Success(element); 					
					
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
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							Monster_Experience = raise_darkness.Exp;
							Get_Experience(Monster_Experience, character);
							Monster_Gold = raise_darkness.Gold;
							Get_Gold(Monster_Gold, character);
						}
						else
						{
							Monster_Experience = element.Exp;
							Get_Experience(Monster_Experience, character);
							Monster_Gold = element.Gold;
							Get_Gold(Monster_Gold, character);
						}
						
						Level_Up(character);																// 레벨업 여부 판단
						break;
					}
					
					int num = Attack_Choice();	// 공격 선택
					
					if(num == 1) // 1. 일반공격 선택시
					{
						double Damage = 0;
						if(Monster_Flag == 1) // 일반 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
								compulsion.HP = compulsion.HP - Damage;											
								System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

							}
							if(compulsion.HP > 0 )
							{
								System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
								Damage = Monster_Attack(compulsion);
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								character.HP = character.HP - Damage;
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
								raise_darkness.HP = raise_darkness.HP - Damage;
								System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
							}
							if(raise_darkness.HP > 0 )
							{
								System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
								Damage = Monster_Attack(raise_darkness);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
						else	// 유니크 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
								element.HP = element.HP - Damage;
								System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							}
							if(element.HP > 0 )
							{
								System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
								Damage = Monster_Attack(element);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						double Damage = 0;
						if(Monster_Flag == 1) // 일반 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Skill_Attack((Character_Job) character);
								compulsion.HP = compulsion.HP - Damage;
								System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
							}
							if(compulsion.HP > 0 )
							{
								System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
								Damage = Monster_Attack(compulsion);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
							
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Skill_Attack((Character_Job) character);
								raise_darkness.HP = raise_darkness.HP - Damage;
								System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
							}
							if(raise_darkness.HP > 0 )
							{
								System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
								Damage = Monster_Attack(raise_darkness);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
						}
						else
						{
							if(character.HP > 0)
							{
								Damage = Skill_Attack((Character_Job) character);
								element.HP = element.HP - Damage;
								System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							}
							if(element.HP > 0 )
							{
								System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
								Damage = Monster_Attack(element);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(character);
					}
					else if(num == 4) // 4. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 5) // 5. 마을복귀 선택시
					{
						System.out.println("마을로 돌아갑니다");
						back_To_Town = true;
						break;
					}
				}
			}
		}
		
	}
	
	public static void Go_Normal_Dungeon_Stage2(Character character) { 	// 2막 일반던전 사냥
	 	
			bar();
			System.out.println("Stage2 던전을 탐험합니다");
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
				Ruler_of_Element_Unique_Monster element
					= new Ruler_of_Element_Unique_Monster();						// 유니크 몬스터 생성 "원소지배자" 생성
				
				
				int Common_Monster_Apear_Chance = 85;
				int Unique_Monster_Apear_Chance = 5;
				int Apear_Chance = 100;												// 몬스터 등장 확률 100%
				int Monster_Flag = 0;												// 몬스터 구분. 1:일반몬스터 	2.챔피언몬스터	3.유니크 몬스터 
				Random random = new Random();
				int Monster_Apear_Chance = random.nextInt(100) + 1;					// 몬스터 출현확률(일반 85%, 챔피언 10%, 유니크 5%)
				
				if(Monster_Apear_Chance <= Common_Monster_Apear_Chance) // 일반 몬스터
				{
					Monster_Appear_Print(compulsion);
					Monster_Flag = 1;	// 일반 몬스터
				}
				else if((Monster_Apear_Chance > Common_Monster_Apear_Chance) && (Monster_Apear_Chance <= (Apear_Chance-Unique_Monster_Apear_Chance))) // 챔피언 몬스터
				{
					Monster_Appear_Print(raise_darkness);
					Monster_Flag = 2;	// 챔피언 몬스터
				}
				else
				{
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
							Monster_Kill_Success = Monster_Kill_Success(compulsion);
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							Monster_Kill_Success = Monster_Kill_Success(raise_darkness);
						}
						else // 유니크 몬스터
							Monster_Kill_Success = Monster_Kill_Success(element); 					
						
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
							}
							else if(Monster_Flag == 2) // 챔피언 몬스터
							{
								Monster_Experience = raise_darkness.Exp;
								Get_Experience(Monster_Experience, character);
								Monster_Gold = raise_darkness.Gold;
								Get_Gold(Monster_Gold, character);
							}
							else
							{
								Monster_Experience = element.Exp;
								Get_Experience(Monster_Experience, character);
								Monster_Gold = element.Gold;
								Get_Gold(Monster_Gold, character);
							}
							
							Level_Up(character);																// 레벨업 여부 판단
							break;
						}
						
						int num = Attack_Choice();	// 공격 선택
						
						if(num == 1) // 1. 일반공격 선택시
						{
							double Damage = 0;
							if(Monster_Flag == 1) // 일반 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
									compulsion.HP = compulsion.HP - Damage;											
									System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

								}
								if(compulsion.HP > 0 )
								{
									System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
									Damage = Monster_Attack(compulsion);
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									character.HP = character.HP - Damage;
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
							}
							else if(Monster_Flag == 2) // 챔피언 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
									raise_darkness.HP = raise_darkness.HP - Damage;
									System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
								}
								if(raise_darkness.HP > 0 )
								{
									System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
									Damage = Monster_Attack(raise_darkness);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
							}
							else	// 유니크 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
									element.HP = element.HP - Damage;
									System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
								}
								if(element.HP > 0 )
								{
									System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
									Damage = Monster_Attack(element);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
							}
						}
						else if(num == 2) // 2. 스킬공격 선택시
						{
							double Damage = 0;
							if(Monster_Flag == 1) // 일반 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Skill_Attack((Character_Job) character);
									compulsion.HP = compulsion.HP - Damage;
									System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
								}
								if(compulsion.HP > 0 )
								{
									System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
									Damage = Monster_Attack(compulsion);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
								
							}
							else if(Monster_Flag == 2) // 챔피언 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Skill_Attack((Character_Job) character);
									raise_darkness.HP = raise_darkness.HP - Damage;
									System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
								}
								if(raise_darkness.HP > 0 )
								{
									System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
									Damage = Monster_Attack(raise_darkness);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
							}
							else
							{
								if(character.HP > 0)
								{
									Damage = Skill_Attack((Character_Job) character);
									element.HP = element.HP - Damage;
									System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
								}
								if(element.HP > 0 )
								{
									System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
									Damage = Monster_Attack(element);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
							}
						}
						else if(num == 3) // 3. 체력회복 선택시
						{
							Recovery_HP(character);
						}
						else if(num == 4) // 4. 후퇴하기 선택시
						{
							System.out.println("후퇴합니다");
							break;
						}
						else if(num == 5) // 5. 마을복귀 선택시
						{
							System.out.println("마을로 돌아갑니다");
							back_To_Town = true;
							break;
						}
					}
				}
			}
	}
	
	public static void Go_Normal_Dungeon_Stage3(Character character) { 	// 3막 일반던전 사냥

	 	
			bar();
			System.out.println("Stage3 던전을 탐험합니다");
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
				Ruler_of_Element_Unique_Monster element
					= new Ruler_of_Element_Unique_Monster();						// 유니크 몬스터 생성 "원소지배자" 생성
				
				
				int Common_Monster_Apear_Chance = 85;
				int Unique_Monster_Apear_Chance = 5;
				int Apear_Chance = 100;												// 몬스터 등장 확률 100%
				int Monster_Flag = 0;												// 몬스터 구분. 1:일반몬스터 	2.챔피언몬스터	3.유니크 몬스터 
				Random random = new Random();
				int Monster_Apear_Chance = random.nextInt(100) + 1;					// 몬스터 출현확률(일반 85%, 챔피언 10%, 유니크 5%)
				
				if(Monster_Apear_Chance <= Common_Monster_Apear_Chance) // 일반 몬스터
				{
					Monster_Appear_Print(compulsion);
					Monster_Flag = 1;	// 일반 몬스터
				}
				else if((Monster_Apear_Chance > Common_Monster_Apear_Chance) && (Monster_Apear_Chance <= (Apear_Chance-Unique_Monster_Apear_Chance))) // 챔피언 몬스터
				{
					Monster_Appear_Print(raise_darkness);
					Monster_Flag = 2;	// 챔피언 몬스터
				}
				else
				{
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
							Monster_Kill_Success = Monster_Kill_Success(compulsion);
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							Monster_Kill_Success = Monster_Kill_Success(raise_darkness);
						}
						else // 유니크 몬스터
							Monster_Kill_Success = Monster_Kill_Success(element); 					
						
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
							}
							else if(Monster_Flag == 2) // 챔피언 몬스터
							{
								Monster_Experience = raise_darkness.Exp;
								Get_Experience(Monster_Experience, character);
								Monster_Gold = raise_darkness.Gold;
								Get_Gold(Monster_Gold, character);
							}
							else
							{
								Monster_Experience = element.Exp;
								Get_Experience(Monster_Experience, character);
								Monster_Gold = element.Gold;
								Get_Gold(Monster_Gold, character);
							}
							
							Level_Up(character);																// 레벨업 여부 판단
							break;
						}
						
						int num = Attack_Choice();	// 공격 선택
						
						if(num == 1) // 1. 일반공격 선택시
						{
							double Damage = 0;
							if(Monster_Flag == 1) // 일반 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
									compulsion.HP = compulsion.HP - Damage;											
									System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

								}
								if(compulsion.HP > 0 )
								{
									System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
									Damage = Monster_Attack(compulsion);
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									character.HP = character.HP - Damage;
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
							}
							else if(Monster_Flag == 2) // 챔피언 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
									raise_darkness.HP = raise_darkness.HP - Damage;
									System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
								}
								if(raise_darkness.HP > 0 )
								{
									System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
									Damage = Monster_Attack(raise_darkness);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
							}
							else	// 유니크 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
									element.HP = element.HP - Damage;
									System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
								}
								if(element.HP > 0 )
								{
									System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
									Damage = Monster_Attack(element);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
							}
						}
						else if(num == 2) // 2. 스킬공격 선택시
						{
							double Damage = 0;
							if(Monster_Flag == 1) // 일반 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Skill_Attack((Character_Job) character);
									compulsion.HP = compulsion.HP - Damage;
									System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
								}
								if(compulsion.HP > 0 )
								{
									System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
									Damage = Monster_Attack(compulsion);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
								
							}
							else if(Monster_Flag == 2) // 챔피언 몬스터
							{
								if(character.HP > 0)
								{
									Damage = Skill_Attack((Character_Job) character);
									raise_darkness.HP = raise_darkness.HP - Damage;
									System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
								}
								if(raise_darkness.HP > 0 )
								{
									System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
									Damage = Monster_Attack(raise_darkness);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
							}
							else
							{
								if(character.HP > 0)
								{
									Damage = Skill_Attack((Character_Job) character);
									element.HP = element.HP - Damage;
									System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
								}
								if(element.HP > 0 )
								{
									System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
									Damage = Monster_Attack(element);
									character.HP = character.HP - Damage;
									System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
									if(character.HP > 0)
										System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
								}
								
							}
						}
						else if(num == 3) // 3. 체력회복 선택시
						{
							Recovery_HP(character);
						}
						else if(num == 4) // 4. 후퇴하기 선택시
						{
							System.out.println("후퇴합니다");
							break;
						}
						else if(num == 5) // 5. 마을복귀 선택시
						{
							System.out.println("마을로 돌아갑니다");
							back_To_Town = true;
							break;
						}
					}
				}
			}
	}
	
	public static void Go_Normal_Dungeon_Stage4(Character character) { 	// 4막 일반던전 사냥
	 	
		bar();
		System.out.println("Stage4 던전을 탐험합니다");
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
			Ruler_of_Element_Unique_Monster element
				= new Ruler_of_Element_Unique_Monster();						// 유니크 몬스터 생성 "원소지배자" 생성
			
			
			int Common_Monster_Apear_Chance = 85;
			int Unique_Monster_Apear_Chance = 5;
			int Apear_Chance = 100;												// 몬스터 등장 확률 100%
			int Monster_Flag = 0;												// 몬스터 구분. 1:일반몬스터 	2.챔피언몬스터	3.유니크 몬스터 
			Random random = new Random();
			int Monster_Apear_Chance = random.nextInt(100) + 1;					// 몬스터 출현확률(일반 85%, 챔피언 10%, 유니크 5%)
			
			if(Monster_Apear_Chance <= Common_Monster_Apear_Chance) // 일반 몬스터
			{
				Monster_Appear_Print(compulsion);
				Monster_Flag = 1;	// 일반 몬스터
			}
			else if((Monster_Apear_Chance > Common_Monster_Apear_Chance) && (Monster_Apear_Chance <= (Apear_Chance-Unique_Monster_Apear_Chance))) // 챔피언 몬스터
			{
				Monster_Appear_Print(raise_darkness);
				Monster_Flag = 2;	// 챔피언 몬스터
			}
			else
			{
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
						Monster_Kill_Success = Monster_Kill_Success(compulsion);
					}
					else if(Monster_Flag == 2) // 챔피언 몬스터
					{
						Monster_Kill_Success = Monster_Kill_Success(raise_darkness);
					}
					else // 유니크 몬스터
						Monster_Kill_Success = Monster_Kill_Success(element); 					
					
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
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							Monster_Experience = raise_darkness.Exp;
							Get_Experience(Monster_Experience, character);
							Monster_Gold = raise_darkness.Gold;
							Get_Gold(Monster_Gold, character);
						}
						else
						{
							Monster_Experience = element.Exp;
							Get_Experience(Monster_Experience, character);
							Monster_Gold = element.Gold;
							Get_Gold(Monster_Gold, character);
						}
						
						Level_Up(character);																// 레벨업 여부 판단
						break;
					}
					
					int num = Attack_Choice();	// 공격 선택
					
					if(num == 1) // 1. 일반공격 선택시
					{
						double Damage = 0;
						if(Monster_Flag == 1) // 일반 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
								compulsion.HP = compulsion.HP - Damage;											
								System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

							}
							if(compulsion.HP > 0 )
							{
								System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
								Damage = Monster_Attack(compulsion);
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								character.HP = character.HP - Damage;
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
								raise_darkness.HP = raise_darkness.HP - Damage;
								System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
							}
							if(raise_darkness.HP > 0 )
							{
								System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
								Damage = Monster_Attack(raise_darkness);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
						else	// 유니크 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
								element.HP = element.HP - Damage;
								System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							}
							if(element.HP > 0 )
							{
								System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
								Damage = Monster_Attack(element);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						double Damage = 0;
						if(Monster_Flag == 1) // 일반 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Skill_Attack((Character_Job) character);
								compulsion.HP = compulsion.HP - Damage;
								System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
							}
							if(compulsion.HP > 0 )
							{
								System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
								Damage = Monster_Attack(compulsion);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
							
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Skill_Attack((Character_Job) character);
								raise_darkness.HP = raise_darkness.HP - Damage;
								System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
							}
							if(raise_darkness.HP > 0 )
							{
								System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
								Damage = Monster_Attack(raise_darkness);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
						}
						else
						{
							if(character.HP > 0)
							{
								Damage = Skill_Attack((Character_Job) character);
								element.HP = element.HP - Damage;
								System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							}
							if(element.HP > 0 )
							{
								System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
								Damage = Monster_Attack(element);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(character);
					}
					else if(num == 4) // 4. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 5) // 5. 마을복귀 선택시
					{
						System.out.println("마을로 돌아갑니다");
						back_To_Town = true;
						break;
					}
				}
			}
		}

	}
	
	public static void Go_Normal_Dungeon_Stage5(Character character) { 	// 5막 일반던전 사냥
	 	
		bar();
		System.out.println("Stage5 던전을 탐험합니다");
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
			Ruler_of_Element_Unique_Monster element
				= new Ruler_of_Element_Unique_Monster();						// 유니크 몬스터 생성 "원소지배자" 생성
			
			
			int Common_Monster_Apear_Chance = 85;
			int Unique_Monster_Apear_Chance = 5;
			int Apear_Chance = 100;												// 몬스터 등장 확률 100%
			int Monster_Flag = 0;												// 몬스터 구분. 1:일반몬스터 	2.챔피언몬스터	3.유니크 몬스터 
			Random random = new Random();
			int Monster_Apear_Chance = random.nextInt(100) + 1;					// 몬스터 출현확률(일반 85%, 챔피언 10%, 유니크 5%)
			
			if(Monster_Apear_Chance <= Common_Monster_Apear_Chance) // 일반 몬스터
			{
				Monster_Appear_Print(compulsion);
				Monster_Flag = 1;	// 일반 몬스터
			}
			else if((Monster_Apear_Chance > Common_Monster_Apear_Chance) && (Monster_Apear_Chance <= (Apear_Chance-Unique_Monster_Apear_Chance))) // 챔피언 몬스터
			{
				Monster_Appear_Print(raise_darkness);
				Monster_Flag = 2;	// 챔피언 몬스터
			}
			else
			{
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
						Monster_Kill_Success = Monster_Kill_Success(compulsion);
					}
					else if(Monster_Flag == 2) // 챔피언 몬스터
					{
						Monster_Kill_Success = Monster_Kill_Success(raise_darkness);
					}
					else // 유니크 몬스터
						Monster_Kill_Success = Monster_Kill_Success(element); 					
					
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
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							Monster_Experience = raise_darkness.Exp;
							Get_Experience(Monster_Experience, character);
							Monster_Gold = raise_darkness.Gold;
							Get_Gold(Monster_Gold, character);
						}
						else
						{
							Monster_Experience = element.Exp;
							Get_Experience(Monster_Experience, character);
							Monster_Gold = element.Gold;
							Get_Gold(Monster_Gold, character);
						}
						
						Level_Up(character);																// 레벨업 여부 판단
						break;
					}
					
					int num = Attack_Choice();	// 공격 선택
					
					if(num == 1) // 1. 일반공격 선택시
					{
						double Damage = 0;
						if(Monster_Flag == 1) // 일반 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
								compulsion.HP = compulsion.HP - Damage;											
								System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

							}
							if(compulsion.HP > 0 )
							{
								System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
								Damage = Monster_Attack(compulsion);
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								character.HP = character.HP - Damage;
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
								raise_darkness.HP = raise_darkness.HP - Damage;
								System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
							}
							if(raise_darkness.HP > 0 )
							{
								System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
								Damage = Monster_Attack(raise_darkness);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
						else	// 유니크 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Normal_Attack((Character_Job) character);									// 캐릭터 일반공격
								element.HP = element.HP - Damage;
								System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							}
							if(element.HP > 0 )
							{
								System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
								Damage = Monster_Attack(element);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						double Damage = 0;
						if(Monster_Flag == 1) // 일반 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Skill_Attack((Character_Job) character);
								compulsion.HP = compulsion.HP - Damage;
								System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
							}
							if(compulsion.HP > 0 )
							{
								System.out.println("현재 " + compulsion.Name + "의 HP : "+ compulsion.HP);			// 현재 몬스터 HP
								Damage = Monster_Attack(compulsion);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
							
						}
						else if(Monster_Flag == 2) // 챔피언 몬스터
						{
							if(character.HP > 0)
							{
								Damage = Skill_Attack((Character_Job) character);
								raise_darkness.HP = raise_darkness.HP - Damage;
								System.out.println(raise_darkness.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
							}
							if(raise_darkness.HP > 0 )
							{
								System.out.println("현재 " + raise_darkness.Name + "의 HP : "+ raise_darkness.HP);	// 현재 몬스터 HP
								Damage = Monster_Attack(raise_darkness);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
						}
						else
						{
							if(character.HP > 0)
							{
								Damage = Skill_Attack((Character_Job) character);
								element.HP = element.HP - Damage;
								System.out.println(element.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							}
							if(element.HP > 0 )
							{
								System.out.println("현재 " + element.Name + "의 HP : "+ element.HP);					// 현재 몬스터 HP
								Damage = Monster_Attack(element);
								character.HP = character.HP - Damage;
								System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
								if(character.HP > 0)
									System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
							}
							
						}
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(character);
					}
					else if(num == 4) // 4. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 5) // 5. 마을복귀 선택시
					{
						System.out.println("마을로 돌아갑니다");
						back_To_Town = true;
						break;
					}
				}
			}
		}

	}
		
	public static boolean Go_Boss_Dungeon_Stage1(Character character)	//  1막 보스던전 사냥
	{
		bar();
		System.out.println("Stage1 보스 던전을 탐험합니다");
		boolean back_To_Town = false;					// 마을복귀 변수. true: 복귀. false: 진행
		boolean Boss_Kill_Success = false;				// 보스 처치 성공여부
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
			
			Butcher_Boss_Stage1 butcher = new Butcher_Boss_Stage1(); 
						
			Monster_Appear_Print(butcher); 			// 보스 몬스터 등장 문구
			
			while(true)
			{
				if(character.HP <= 0) // 야만전사 사망시
				{
					break;
				}
				else	// 야만전사 생존시
				{
					Boss_Kill_Success 
						= Monster_Kill_Success(butcher); 								// 보스 몬스터 처치 성공 여부
					long Monster_Experience;
					long Monster_Gold;
					if(Boss_Kill_Success) // 몬스터 처치 성공시
					{
						Monster_Experience = butcher.Exp;
						Get_Experience(Monster_Experience, character);
						Monster_Gold = butcher.Gold;
						Get_Gold(Monster_Gold, character);
						return Boss_Kill_Success;
					}
					
					int num = Attack_Choice();	// 공격 선택
					double Damage;
					if(num == 1) // 1. 일반공격 선택시
					{
						
						if(character.HP > 0)
						{
							Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
							butcher.HP = butcher.HP - Damage;											
							System.out.println(butcher.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

						}
						if(butcher.HP > 0 )
						{
							System.out.println("현재 " + butcher.Name + "의 HP : "+ butcher.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(butcher);
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							character.HP = character.HP - Damage;
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						} 												
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						if(character.HP > 0)
						{
							Damage = Skill_Attack((Character_Job) character);
							butcher.HP = butcher.HP - Damage;
							System.out.println(butcher.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
						}
						if(butcher.HP > 0 )
						{
							System.out.println("현재 " + butcher.Name + "의 HP : "+ butcher.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(butcher);
							character.HP = character.HP - Damage;
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						}
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(character);
					}
					else if(num == 4) // 4. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 5) // 5. 마을복귀 선택시
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
	
	public static boolean Go_Boss_Dungeon_Stage2(Character character)	//  2막 보스던전 사냥
	{

		bar();
		System.out.println("Stage2 보스 던전을 탐험합니다");
		boolean back_To_Town = false;					// 마을복귀 변수. true: 복귀. false: 진행
		boolean Boss_Kill_Success = false;				// 보스 처치 성공여부
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
			
			Belial_Boss_Stage2 belial = new Belial_Boss_Stage2(); 
						
			Monster_Appear_Print(belial); 			// 보스 몬스터 등장 문구
			
			while(true)
			{
				if(character.HP <= 0) // 야만전사 사망시
				{
					break;
				}
				else	// 야만전사 생존시
				{
					Boss_Kill_Success 
						= Monster_Kill_Success(belial); 								// 보스 몬스터 처치 성공 여부
					long Monster_Experience;
					long Monster_Gold;
					if(Boss_Kill_Success) // 몬스터 처치 성공시
					{
						Monster_Experience = belial.Exp;
						Get_Experience(Monster_Experience, character);
						Monster_Gold = belial.Gold;
						Get_Gold(Monster_Gold, character);
						return Boss_Kill_Success;
					}
					
					int num = Attack_Choice();	// 공격 선택
					double Damage;
					if(num == 1) // 1. 일반공격 선택시
					{
						
						if(character.HP > 0)
						{
							Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
							belial.HP = belial.HP - Damage;											
							System.out.println(belial.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

						}
						if(belial.HP > 0 )
						{
							System.out.println("현재 " + belial.Name + "의 HP : "+ belial.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(belial);
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							character.HP = character.HP - Damage;
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						} 												
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						if(character.HP > 0)
						{
							Damage = Skill_Attack((Character_Job) character);
							belial.HP = belial.HP - Damage;
							System.out.println(belial.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
						}
						if(belial.HP > 0 )
						{
							System.out.println("현재 " + belial.Name + "의 HP : "+ belial.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(belial);
							character.HP = character.HP - Damage;
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						}
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(character);
					}
					else if(num == 4) // 4. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 5) // 5. 마을복귀 선택시
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
	
	public static boolean Go_Boss_Dungeon_Stage3(Character character)	//  3막 보스던전 사냥
	{

		bar();
		System.out.println("Stage1 보스 던전을 탐험합니다");
		boolean back_To_Town = false;					// 마을복귀 변수. true: 복귀. false: 진행
		boolean Boss_Kill_Success = false;				// 보스 처치 성공여부
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
			
			Azmodan_Boss_Stage3 azmodan = new Azmodan_Boss_Stage3(); 
						
			Monster_Appear_Print(azmodan); 			// 보스 몬스터 등장 문구
			
			while(true)
			{
				if(character.HP <= 0) // 야만전사 사망시
				{
					break;
				}
				else	// 야만전사 생존시
				{
					Boss_Kill_Success 
						= Monster_Kill_Success(azmodan); 								// 보스 몬스터 처치 성공 여부
					long Monster_Experience;
					long Monster_Gold;
					if(Boss_Kill_Success) // 몬스터 처치 성공시
					{
						Monster_Experience = azmodan.Exp;
						Get_Experience(Monster_Experience, character);
						Monster_Gold = azmodan.Gold;
						Get_Gold(Monster_Gold, character);
						return Boss_Kill_Success;
					}
					
					int num = Attack_Choice();	// 공격 선택
					double Damage;
					if(num == 1) // 1. 일반공격 선택시
					{
						
						if(character.HP > 0)
						{
							Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
							azmodan.HP = azmodan.HP - Damage;											
							System.out.println(azmodan.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

						}
						if(azmodan.HP > 0 )
						{
							System.out.println("현재 " + azmodan.Name + "의 HP : "+ azmodan.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(azmodan);
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							character.HP = character.HP - Damage;
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						} 												
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						if(character.HP > 0)
						{
							Damage = Skill_Attack((Character_Job) character);
							azmodan.HP = azmodan.HP - Damage;
							System.out.println(azmodan.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
						}
						if(azmodan.HP > 0 )
						{
							System.out.println("현재 " + azmodan.Name + "의 HP : "+ azmodan.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(azmodan);
							character.HP = character.HP - Damage;
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						}
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(character);
					}
					else if(num == 4) // 4. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 5) // 5. 마을복귀 선택시
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
	
	public static boolean Go_Boss_Dungeon_Stage4(Character character)	//  4막 보스던전 사냥
	{

		bar();
		System.out.println("Stage1 보스 던전을 탐험합니다");
		boolean back_To_Town = false;					// 마을복귀 변수. true: 복귀. false: 진행
		boolean Boss_Kill_Success = false;				// 보스 처치 성공여부
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
			
			Diablo_Boss_Stage4 diablo = new Diablo_Boss_Stage4(); 
						
			Monster_Appear_Print(diablo); 			// 보스 몬스터 등장 문구
			
			while(true)
			{
				if(character.HP <= 0) // 야만전사 사망시
				{
					break;
				}
				else	// 야만전사 생존시
				{
					Boss_Kill_Success 
						= Monster_Kill_Success(diablo); 								// 보스 몬스터 처치 성공 여부
					long Monster_Experience;
					long Monster_Gold;
					if(Boss_Kill_Success) // 몬스터 처치 성공시
					{
						Monster_Experience = diablo.Exp;
						Get_Experience(Monster_Experience, character);
						Monster_Gold = diablo.Gold;
						Get_Gold(Monster_Gold, character);
						return Boss_Kill_Success;
					}
					
					int num = Attack_Choice();	// 공격 선택
					double Damage;
					if(num == 1) // 1. 일반공격 선택시
					{
						
						if(character.HP > 0)
						{
							Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
							diablo.HP = diablo.HP - Damage;											
							System.out.println(diablo.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

						}
						if(diablo.HP > 0 )
						{
							System.out.println("현재 " + diablo.Name + "의 HP : "+ diablo.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(diablo);
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							character.HP = character.HP - Damage;
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						} 												
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						if(character.HP > 0)
						{
							Damage = Skill_Attack((Character_Job) character);
							diablo.HP = diablo.HP - Damage;
							System.out.println(diablo.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
						}
						if(diablo.HP > 0 )
						{
							System.out.println("현재 " + diablo.Name + "의 HP : "+ diablo.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(diablo);
							character.HP = character.HP - Damage;
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						}
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(character);
					}
					else if(num == 4) // 4. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 5) // 5. 마을복귀 선택시
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
	
	public static boolean Go_Boss_Dungeon_Stage5(Character character)	//  5막 보스던전 사냥
	{

		bar();
		System.out.println("Stage1 보스 던전을 탐험합니다");
		boolean back_To_Town = false;					// 마을복귀 변수. true: 복귀. false: 진행
		boolean Boss_Kill_Success = false;				// 보스 처치 성공여부
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
			
			Malthael_Boss_Stage5 malthael = new Malthael_Boss_Stage5(); 
						
			Monster_Appear_Print(malthael); 			// 보스 몬스터 등장 문구
			
			while(true)
			{
				if(character.HP <= 0) // 야만전사 사망시
				{
					break;
				}
				else	// 야만전사 생존시
				{
					Boss_Kill_Success 
						= Monster_Kill_Success(malthael); 								// 보스 몬스터 처치 성공 여부
					long Monster_Experience;
					long Monster_Gold;
					if(Boss_Kill_Success) // 몬스터 처치 성공시
					{
						Monster_Experience = malthael.Exp;
						Get_Experience(Monster_Experience, character);
						Monster_Gold = malthael.Gold;
						Get_Gold(Monster_Gold, character);
						return Boss_Kill_Success;
					}
					
					int num = Attack_Choice();	// 공격 선택
					double Damage;
					if(num == 1) // 1. 일반공격 선택시
					{
						
						if(character.HP > 0)
						{
							Damage = Normal_Attack((Character_Job) character);								// 캐릭터 일반공격
							malthael.HP = malthael.HP - Damage;											
							System.out.println(malthael.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지

						}
						if(malthael.HP > 0 )
						{
							System.out.println("현재 " + malthael.Name + "의 HP : "+ malthael.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(malthael);
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							character.HP = character.HP - Damage;
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						} 												
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						if(character.HP > 0)
						{
							Damage = Skill_Attack((Character_Job) character);
							malthael.HP = malthael.HP - Damage;
							System.out.println(malthael.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 몬스터가 받는 데미지
						}
						if(malthael.HP > 0 )
						{
							System.out.println("현재 " + malthael.Name + "의 HP : "+ malthael.HP);			// 현재 몬스터 HP
							Damage = Monster_Attack(malthael);
							character.HP = character.HP - Damage;
							System.out.println(character.ID + "이(가) " + Damage + "만큼 데미지를 받았습니다!");		// 캐릭터가 받는 데미지
							if(character.HP > 0)
								System.out.println("현재 " + character.ID +"의 HP : " + character.HP);				// 현재 캐릭터 HP
						}
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(character);
					}
					else if(num == 4) // 4. 후퇴하기 선택시
					{
						System.out.println("후퇴합니다");
						break;
					}
					else if(num == 5) // 5. 마을복귀 선택시
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
	public static boolean Monster_Kill_Success(Monster_Unit monster_unit)
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
		bar2();
		System.out.println(Monster_Experience + "의 경험치를 얻었습니다");
		character.Exp = character.Exp - Monster_Experience;			// 경험치 획득
		if(character.Exp > 0)
			System.out.println((character.Level_Num+1)+"레벨 까지 남은 경험치 " + character.Exp);
	}
	
	public static void Get_Gold(long Monster_Gold, Character character)
	{
		bar2();
		System.out.println(Monster_Gold + "의 골드를 얻었습니다");
		character.Gold = character.Gold + Monster_Gold;
		System.out.println("현재 " + character.Gold + "골드");
	}
	
	
	public static void Level_Up(Character character)			// 레벨업
	{
		int Level = character.Level_Num;	// 현재 레벨 입력
		while(true)
		{
			if(character.Exp == 0)	// 다음 레벨업만큼 경험치를 획득했을 때
			{
				Level++;
				character.Level(Level);		// 레벨업!
				System.out.println("축하합니다!" + character.Level_Num + "레벨이 되었습니다!");
			}
			else if(character.Exp < 0)	// 다음 레벨업 이상으로 경험치 획득시
			{
				while(true)			// 경험치 획득량만큼 레벨업.
				{
					if(character.Exp > 0) // 더이상 획득 경험치가 없을 때까지
						break;
					long Left_Exp = character.Exp;
					Level++;
					character.Level(Level);
					System.out.println("축하합니다!" + character.Level_Num + "로 레벨업 하였습니다!");
					character.Exp = character.Exp - Left_Exp;
				}
			}
			break;
		}
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
		bar2();
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
	}
}
