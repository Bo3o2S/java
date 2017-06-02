package Game;

import Job.*;
import Monster_Unit.*;

import java.util.Scanner;

public class Game {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String ID;
		int num;
		int act = 1;
		// 안내문
		WelCome();
		Babarian baba = new Babarian();
		// 직업선택
		int job_Num = Choice_Job();
		if(job_Num == 1)
		{
			//Babarian baba = new Babarian();

			// ID 입력
			ID = Input_ID();
			baba.ID = ID;
			
			while(true)
			{
				num = Play();
				if(num == 1)
				{
					Babarian_Status(baba);
				}
				else if(num == 2)
				{
					if(act == 1)
						Go_Act1();
//					if(act == 2)
//						Go_Act2();
//					if(act == 3)
//						Go_Act3();
//					if(act == 4)
//						Go_Act4();
//					if(act == 5)
//						Go_Act5();
				}
				else
					continue;
			}
			// 게임 시작
			
		}
		else if(job_Num == 2)
		{
			Holy_Warrior h_warrior = new Holy_Warrior();
			
			// ID 입력
			ID = Input_ID();
			h_warrior.ID = ID;
		}
		else if(job_Num == 3)
		{
			Daemon_Hunter daemon_hunter = new Daemon_Hunter();
			
			// ID 입력
			ID = Input_ID();
			daemon_hunter.ID = ID;
		}
		else if(job_Num == 0)
			System.exit(0);
		else
			System.exit(1);
			

	}
	
	public static void bar()
	{
		System.out.println("================================================");
	}
	
	public static void bar2()
	{
		System.out.println("------------------------------------------------");
	}
	
	public static void WelCome()
	{
		System.out.println("================ Welcome to Hell ===============");
		System.out.println("디아블로 3에 오신것을 환영합니다");
		System.out.println("디아블로 3의 던전은 Act 1,2,3,4,5로 구성되어 있습니다");
		System.out.println("직업은 야만용사, 성전사, 악마사냥꾼을 선택할 수 있습니다");
		System.out.println("몬스터는 일반, 챔피언, 유니크, 보스 등급으로 나뉘어져 있으며");
		System.out.println("각각의 몬스터 10마리를 처치한 후에 다음등급 몬스터를 사냥할 수 있습니다");
	}
	
	public static String Input_ID()
	{
		String ID;
		bar();
		System.out.println("캐릭터명을 입력해주세요 : ");
		ID = scan.next();
		scan.nextLine();
		System.out.println(ID + " 캐릭터가 생성되었습니다!");
		return ID;
		
	}
	
	public static int Choice_Job()
	{
		bar();
		System.out.println("직업을 선택해주세요");
		System.out.println("1. 야만용사");
		System.out.println("2. 성전사");
		System.out.println("3. 악마사냥꾼");
		System.out.println("0. 프로그램 종료");
		bar2();
		System.out.println("번호입력(0 ~ 3) : ");
		int Input_Num = scan.nextInt();
		scan.nextLine();
		return Input_Num;
	}
	
	public static int Play()
	{
		bar();
		System.out.println("1. 캐릭터 스탯 확인하기");
		System.out.println("2. 던전입장하기");
		System.out.println("3. 체력회복하기");
		bar2();
		System.out.println("번호입력(0 ~ 3) : ");
		int Input_Num = scan.nextInt();
		scan.nextLine();
		return Input_Num;
	}
	
	public static void Babarian_Status(Babarian baba)
	{
		bar();
		System.out.println("아이디: " + baba.ID);
		System.out.println("직업명 : " + baba.Job_Name);
		System.out.println("래밸 : " + baba.Level_Num);
		System.out.println("분노 : " + baba.Anger);
		System.out.println("생명력 : " + baba.HP);
		System.out.println("힘 : " + baba.Strength);
		System.out.println("민첩 : " + baba.Dex);
		System.out.println("지능 : " + baba.Intelligence);
		System.out.println("활력 : " + baba.Vitality);
		System.out.println("공격력 : " + baba.Attack);
		System.out.println("방어력 : " + baba.Defence);
		System.out.println("회복력 : " + baba.Recovery);
		System.out.println("회피력 : " + baba.evasion);
		System.out.println("골드 : " + baba.Gold);
		System.out.println("필요 경험치: " + baba.Exp);
		bar2();
	}
	
	public static void Go_Act1(Babarian baba)
	{
		while(true)
		{
			if(baba.HP <= 0)
			{
				break;
			}
			bar();
			int Mon_Count = 0;
			int Skill_Num = 0;
			Compulsion c_mon_1 = new Compulsion(); 
			System.out.println("Act1 던전을 탐험합니다");
			bar2();
			System.out.println(c_mon_1.Name + "가(이) 나타났습니다");
			System.out.println("교전을 시작합니다");
			while(true)
			{
				if(baba.HP <= 0)
				{
					System.out.println(baba.Job_Name + "가 사망하였습니다. 마을로 돌아갑니다");
					break;
				}					
				int num = Attack_Choice();
				if(num == 1)
				{
					System.out.println(baba.Job_Name + "가 " + baba.Attack + "만큼의 데미지를 입힙니다");
				}
				else if(num == 2)
				{
					Skill_Choice();
					System.out.println(baba.Job_Name + "가 " + baba.Attack + "만큼의 데미지를 입힙니다");
				}
			}
		}
		
		
			
	}
	
	public static int Attack_Choice()
	{
		bar2();
		System.out.println("1. 일반공격");
		System.out.println("2. 스킬공격");
		System.out.println("3. 체력회복");
		System.out.println("4. 후퇴하기");
		bar2();
		System.out.println("선택하기(1~4) : ");
		int num = scan.nextInt();
		scan.nextLine();
		return num;
	}
	
	public static int Skill_Choice()
	{
		bar2();
		System.out.println("1. 일반공격");
		System.out.println("2. 스킬공격");
		System.out.println("3. 체력회복");
		System.out.println("4. 후퇴하기");
		bar2();
		System.out.println("선택하기(1~4) : ");
		int num = scan.nextInt();
		scan.nextLine();
		return num;
	}
}
