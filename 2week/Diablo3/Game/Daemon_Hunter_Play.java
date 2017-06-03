package Game;

import Job.Daemon_Hunter;
import Job.Daemon_Hunter;
import Monster_Unit.*;
import java.util.Random;

public class Daemon_Hunter_Play extends Game{
	
	public void Go_Normal_Dungeon_Act1(Daemon_Hunter daemon_hunter)	// 악마사냥꾼 Act1 일반던전 사냥
	{
		bar();
		System.out.println("Act1 던전을 탐험합니다");
		boolean back_To_Town = false;					// 마을복귀 변수. true: 복귀. false: 진행
		
		while(true)
		{
			if(daemon_hunter.HP <= 0)	// 악마사냥꾼 사먕시 마을로 돌아감
				break;
			
			if(back_To_Town)	// 마을복귀 선택시 마을로 돌아감
				break;
			
			Compulsion_Common_Monster compulsion
				= new Compulsion_Common_Monster();								// 일반 몬스터 : "강제자" 생성
			Raise_Darkness_Champion_Monster raise_darkness
				= new Raise_Darkness_Champion_Monster();						// 챔피언 몬스터 : "어둠을 키우는 자" 생성
			Ruler_of_Element_Unique_Monster element
				= new Ruler_of_Element_Unique_Monster();						// 유니크 몬스터 생성 "원소지배자" 생성
			
			Random random = new Random();
			int Monster_Apear_Chance = random.nextInt(100) + 1;					// 몬스터 출현확률(일반 85%, 챔피언 10%, 유니크 5%)
			
			Monster_Appear(compulsion, raise_darkness, element, Monster_Apear_Chance); 			// 몬스터 등장 문구
			
			while(true)
			{
				if(daemon_hunter.HP <= 0) // 야만전사 사망시
				{
					daemon_hunter.HP = daemon_hunter.Full_HP*0.3;		// 사망시 생명력 30% 로 부활 후 마을귀환
					System.out.println(daemon_hunter.Name + "가 사망하였습니다. 마을에서 부활합니다.");
					break;
				}
				else	// 야만전사 생존시
				{
					boolean Monster_Kill_Success 
						= Monster_Kill_Success(compulsion, raise_darkness, 
												element, Monster_Apear_Chance); 							// 몬스터 처치 성공 여부
					if(Monster_Kill_Success) // 몬스터 처치 성공시
					{
						Get_Experience(compulsion, raise_darkness, 
										element, daemon_hunter, Monster_Apear_Chance); 						// 몬스터 처치 성공시 경험치 획득
						Get_Gold(compulsion, raise_darkness, 
								element, daemon_hunter, Monster_Apear_Chance); 										// 몬스터 처치 성공시 골드 획득
						Level_Up(daemon_hunter);															// 레벨업 여부 판단
						break;
					}
					
					int num = Attack_Choice();	// 공격 선택
					
					if(num == 1) // 1. 일반공격 선택시
					{
						Normal_Attack(compulsion, raise_darkness, element, daemon_hunter, Monster_Apear_Chance); 												
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						Skill_Attack(compulsion, raise_darkness, element, daemon_hunter, Monster_Apear_Chance);
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(daemon_hunter);
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
	
	public int Daemon_Hunter_Skill_Choice()	// 악마사냥꾼 스킬 선택
	{
		bar2();
		System.out.println("1. 광분");
		System.out.println("2. 선조의 망치");
		System.out.println("3. 전장의 함성");
		System.out.println("4. 뒤로가기");
		bar2();
		System.out.println("선택하기(1~4) : ");
		int num = scan.nextInt();
		scan.nextLine();
		return num;
	}
	
	public void Normal_Attack(
								Compulsion_Common_Monster compulsion, 
								Raise_Darkness_Champion_Monster raise_darkness,
								Ruler_of_Element_Unique_Monster element,
								Daemon_Hunter daemon_hunter,
								int Monster_Apear_Chance
							 )	// 일반 공격
	{
		int Skill_Num = 0;		// 몬스터 스킬 공격 선택
		double Damage = 0;		// 데미지
		Random random = new Random();
		
		// 악마사냥꾼 공격
		System.out.println(daemon_hunter.Name + "가 " + daemon_hunter.Attack + "만큼의 데미지를 입힙니다");		// 악마사냥꾼가 몬스터에게 주는 데미지
		if(Monster_Apear_Chance <= 85) // 일반 몬스터
		{
			System.out.println(compulsion.Name + "이(가) " + daemon_hunter.Attack + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
			compulsion.HP = compulsion.HP - daemon_hunter.Attack;										// 데미지만큼 감소된 몬스터 생명력
			if(compulsion.HP > 0)	// 몬스터 생존시만
				System.out.println(compulsion.Name + "의  생명력이" +  compulsion.HP + "만큼 남았습니다.");
		}
		else if(Monster_Apear_Chance > 85 && Monster_Apear_Chance <= 95) // 챔피언 몬스터
		{
			System.out.println(raise_darkness.Name + "이(가) " + daemon_hunter.Attack + "만큼 데미지를 받았습니다!");
			compulsion.HP = raise_darkness.HP - daemon_hunter.Attack;
			if(raise_darkness.HP > 0)
				System.out.println(raise_darkness.Name + "의  생명력이" +  raise_darkness.HP + "만큼 남았습니다.");
		}
		else	// 유니크 몬스터
		{
			System.out.println(element.Name + "이(가) " + daemon_hunter.Attack + "만큼 데미지를 받았습니다!");
			element.HP = element.HP - daemon_hunter.Attack;
			if(element.HP > 0)
				System.out.println(element.Name + "의  생명력이" +  element.HP + "만큼 남았습니다.");
		}
		
		// 몬스터 공격
		if(Monster_Apear_Chance <= 85)	// 일반 몬스터
		{
			if(compulsion.HP > 0)
			{
				Damage = compulsion.Tightening();
				daemon_hunter.HP = daemon_hunter.HP - Damage;
				if(daemon_hunter.HP > 0)			// 악마사냥꾼 생존시에만 생명력 출력
					System.out.println(daemon_hunter.Name + "의 생명력이 " + daemon_hunter.HP + "만큼 남았습니다");
			}
		}
		else if(Monster_Apear_Chance > 85 && Monster_Apear_Chance <= 95)	// 챔피언 몬스터
		{
			if(raise_darkness.HP > 0)	// 챔피언 몬스터 생존시에만 공격
			{
				Skill_Num = random.nextInt(3)+1;	// 스킬 1~3번까지 랜덤 선택하여 시전
				if(Skill_Num == 1)
					Damage = raise_darkness.Melting();
				if(Skill_Num == 2)
					Damage = raise_darkness.Plague();
				if(Skill_Num == 3)
					Damage = raise_darkness.Shelling();
				
				daemon_hunter.HP = daemon_hunter.HP - Damage;			// 악마사냥꾼 생명력 감소
				if(daemon_hunter.HP > 0)		// 악마사냥꾼 생존시에만 생명력 출력
					System.out.println(daemon_hunter.Name + "의 생명력이 " + daemon_hunter.HP + "만큼 남았습니다");
			}
		}
		else
		{
			if(element.HP > 0)	// 유니크 몬스터 생존시에만 공격
			{
				Skill_Num = random.nextInt(3)+1;
				if(Skill_Num == 1)
					Damage = element.Flame_Hell();
				if(Skill_Num == 2)
					Damage = element.Freezing();
				if(Skill_Num == 3)
					Damage = element.Thunderbolt_Raid();
				
				daemon_hunter.HP = daemon_hunter.HP - Damage;
				if(daemon_hunter.HP > 0)
					System.out.println(daemon_hunter.Name + "의 생명력이 " + daemon_hunter.HP + "만큼 남았습니다");
			}
		}
	}
	
	public void Skill_Attack(
								Compulsion_Common_Monster compulsion, 
								Raise_Darkness_Champion_Monster raise_darkness,
								Ruler_of_Element_Unique_Monster element,
								Daemon_Hunter daemon_hunter,
								int Monster_Apear_Chance
							)	// 악마사냥꾼 스킬공격
	{
		double Damage = 0;		// 몬스터에 주는 데미지
		Random random = new Random();	
		int Skill_Num = Daemon_Hunter_Skill_Choice();	// 악마사냥꾼 스킬 선택
		
		if(Skill_Num == 1)	// 스킬 "굶주린 화살" 사용시
		{
			Damage = daemon_hunter.Hungry_Arrow();
			
			System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");
			compulsion.HP = compulsion.HP - Damage;
			if(compulsion.HP > 0)
				System.out.println(compulsion.Name + "의  생명력이" +  compulsion.HP + "만큼 남았습니다.");
		}
		else if(Skill_Num == 2)	// 스킬 "투검" 사용시
		{
			Damage = daemon_hunter.Throw_Knife();
			
			System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");
			compulsion.HP = compulsion.HP - Damage;
			if(compulsion.HP > 0)
				System.out.println(compulsion.Name + "의  생명력이" +  compulsion.HP + "만큼 남았습니다.");
		}
		else if(Skill_Num == 3) // 스킬 "어둠의 힘" 사용시
		{
			daemon_hunter.Attack_Up();
		}
		
		if(Skill_Num == 1 || Skill_Num == 2) // 공격스킬(1,2)번 사용시  몬스터 반격
		{
			if(Monster_Apear_Chance <= 85)	 // 일반 몬스터의 경우
			{
				if(compulsion.HP > 0)
				{
					Damage = compulsion.Tightening();
					daemon_hunter.HP = daemon_hunter.HP - Damage;
					if(daemon_hunter.HP > 0)
						System.out.println(daemon_hunter.Name + "의 생명력이 " + daemon_hunter.HP + "만큼 남았습니다");
				}
			}
			else if(Monster_Apear_Chance > 85 && Monster_Apear_Chance <= 95)	// 챔피언 몬스터의 경우
			{
				if(raise_darkness.HP > 0)	// 챔피언 몬스터 생존시 공격
				{
					Skill_Num = random.nextInt(3)+1;	// 스킬 랜덤으로 자동 사용.
					if(Skill_Num == 1)
						Damage = raise_darkness.Melting();
					if(Skill_Num == 2)
						Damage = raise_darkness.Plague();
					if(Skill_Num == 3)
						Damage = raise_darkness.Shelling();
					
					daemon_hunter.HP = daemon_hunter.HP - Damage;
					if(daemon_hunter.HP > 0)			// 악마사냥꾼 생존시에만 출력
						System.out.println(daemon_hunter.Name + "의 생명력이 " + daemon_hunter.HP + "만큼 남았습니다");
				}
			}
			else	// 유니크 몬스터의 경우
			{
				if(element.HP > 0)
				{
					Skill_Num = random.nextInt(3)+1;
					if(Skill_Num == 1)
						Damage = element.Flame_Hell();
					if(Skill_Num == 2)
						Damage = element.Freezing();
					if(Skill_Num == 3)
						Damage = element.Thunderbolt_Raid();
					
					daemon_hunter.HP = daemon_hunter.HP - Damage;
					if(daemon_hunter.HP > 0)
						System.out.println(daemon_hunter.Name + "의 생명력이 " + daemon_hunter.HP + "만큼 남았습니다");
				}
			}
		}
		
	}
	
	public void Get_Experience(
								Compulsion_Common_Monster compulsion, 
								Raise_Darkness_Champion_Monster raise_darkness,
								Ruler_of_Element_Unique_Monster element,
								Daemon_Hunter daemon_hunter,
								int Monster_Apear_Chance
							  )		// 경험치 획득
	{
		bar2();
		if(Monster_Apear_Chance <= 85)	// 일반 몬스터
		{
			System.out.println(compulsion.Exp + "의 경험치를 얻었습니다");
			daemon_hunter.Exp = daemon_hunter.Exp - compulsion.Exp;		// 남은 필요경험치 = 필요경험치 - 획득 경험치
			if(daemon_hunter.Exp > 0)	// 필요 경험치가 남았을 경우
				System.out.println((daemon_hunter.Level_Num + 1)+"레벨 까지 남은 경험치 " + daemon_hunter.Exp);		// 남은 필요 경험치 출력 
		}
		else if(Monster_Apear_Chance > 85 && Monster_Apear_Chance <= 95)	// 챔피언 몬스터
		{
			System.out.println(raise_darkness.Exp + "의 경험치를 얻었습니다");
			daemon_hunter.Exp = daemon_hunter.Exp - raise_darkness.Exp;
			if(daemon_hunter.Exp > 0)
				System.out.println((daemon_hunter.Level_Num+1)+"레벨 까지 남은 경험치 " + daemon_hunter.Exp);
		}
		else	// 유니크 몬스터
		{
			System.out.println(element.Exp + "의 경험치를 얻었습니다");
			daemon_hunter.Exp = daemon_hunter.Exp - element.Exp;
			if(daemon_hunter.Exp > 0)
				System.out.println((daemon_hunter.Level_Num+1)+"레벨 까지 남은 경험치 " + daemon_hunter.Exp);
		}
	}
	
	public void Get_Gold(
							Compulsion_Common_Monster compulsion, 
							Raise_Darkness_Champion_Monster raise_darkness,
							Ruler_of_Element_Unique_Monster element,
							Daemon_Hunter daemon_hunter,
							int Monster_Apear_Chance
						)		// 골드 획득
	{
		bar2();
		if(Monster_Apear_Chance <= 85)	// 일반 몬스터
		{
			System.out.println(compulsion.Gold + "의 골드를 얻었습니다");
			daemon_hunter.Gold = daemon_hunter.Gold + compulsion.Gold;		// 총 골드 = 현재 골드 + 획득 골드
			System.out.println("현재 " + daemon_hunter.Gold + "골드");
		}
		else if(Monster_Apear_Chance > 85 && Monster_Apear_Chance <= 95)	// 챔피언 몬스터
		{
			System.out.println(raise_darkness.Gold + "의 골드를 얻었습니다");
			daemon_hunter.Gold = daemon_hunter.Gold + raise_darkness.Gold;
			System.out.println("현재 " + daemon_hunter.Gold + "골드");
		}
		else	// 유니크 몬스터
		{
			System.out.println(element.Gold + "의 골드를 얻었습니다");
			daemon_hunter.Gold = daemon_hunter.Gold + element.Gold;
			System.out.println("현재 " + daemon_hunter.Gold + "골드");
		}
	}
	
	public void Recovery_HP(Daemon_Hunter daemon_hunter)	// 체력회복 메뉴 선택시
	{
		bar2();
		if(daemon_hunter.HP <= daemon_hunter.Full_HP*0.7)		// 생명력이 70% 이하일 때
		{
			daemon_hunter.HP = daemon_hunter.HP + daemon_hunter.Full_HP*0.3;
			System.out.println("생명력을 회복합니다");
			System.out.println(daemon_hunter.Name + " 의 생명력이 " + (int)(daemon_hunter.Full_HP*0.3) +"만큼 회복되었습니다");	// 생명력 30% 회복
			System.out.println("현재 " + daemon_hunter.Name + " 의 생명력" + daemon_hunter.HP);
		}
		else if((daemon_hunter.HP > daemon_hunter.Full_HP*0.7) && (daemon_hunter.HP < daemon_hunter.Full_HP))	// 생명력이 70% 초과 100% 미만이 때 남은 생명력 만큼 회복(최대치)
		{
			daemon_hunter.HP = daemon_hunter.Full_HP;
			System.out.println("생명력을 회복합니다");
			System.out.println(daemon_hunter.Name + " 의 생명력이 " + (int)(daemon_hunter.Full_HP - daemon_hunter.HP) +"만큼 회복되었습니다");
			System.out.println("현재 " + daemon_hunter.Name + " 의 생명력" + daemon_hunter.HP);
		}
		else	// 생명력이 가득 차 있을 경우
			System.out.println("생명력이 가득 차있습니다");
	}
	
	public void Level_Up(Daemon_Hunter daemon_hunter)			// 레벨업
	{
		int Daemon_Hunter_Level = daemon_hunter.Level_Num;	// 현재 레벨 입력
		while(true)
		{
			if(daemon_hunter.Exp == 0)	// 다음 레벨업만큼 경험치를 획득했을 때
			{
				Daemon_Hunter_Level++;
				daemon_hunter.Level(Daemon_Hunter_Level);		// 레벨업!
				System.out.println("축하합니다!" + daemon_hunter.Level_Num + "레벨이 되었습니다!");
			}
			else if(daemon_hunter.Exp < 0)	// 다음 레벨업 이상으로 경험치 획득시
			{
				while(true)			// 경험치 획득량만큼 레벨업.
				{
					if(daemon_hunter.Exp > 0) // 더이상 획득 경험치가 없을 때까지
						break;
					long Left_Exp = daemon_hunter.Exp;
					Daemon_Hunter_Level++;
					daemon_hunter.Level(Daemon_Hunter_Level);
					System.out.println("축하합니다!" + daemon_hunter.Level_Num + "로 레벨업 하였습니다!");
					daemon_hunter.Exp = daemon_hunter.Exp - Left_Exp;
				}
			}
			break;
		}
	}
}
