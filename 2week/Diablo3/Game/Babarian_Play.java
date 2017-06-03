package Game;

import Job.*;
import Monster_Unit.*;
import java.util.Random;

public class Babarian_Play extends Game {
	
	
	public void Go_Boss_Dungeon_Act1(Babarian baba)	// 야만용사 Act1 일반던전 사냥
	{
		bar();
		System.out.println("Act1 보스 던전을 탐험합니다");
		boolean back_To_Town = false;					// 마을복귀 변수. true: 복귀. false: 진행
		
		while(true)
		{
			if(baba.HP <= 0)	// 야만용사 사망시 마을로 돌아감
				break;
			
			if(back_To_Town)	// 마을복귀 선택시 마을로 돌아감
				break;
			
			Butcher_Boss_Stage1 butcher = new Butcher_Boss_Stage1(); 
			
						
			Monster_Appear(butcher); 			// 보스 몬스터 등장 문구
			
			while(true)
			{
				if(baba.HP <= 0) // 야만전사 사망시
				{
					baba.HP = baba.Full_HP*0.3;		// 사망시 생명력 30% 로 부활 후 마을귀환
					System.out.println(baba.Name + "가 사망하였습니다. 마을에서 부활합니다.");
					break;
				}
				else	// 야만전사 생존시
				{
					boolean Boss_Kill_Success 
						= Monster_Kill_Success(butcher); 								// 보스 몬스터 처치 성공 여부
					if(Boss_Kill_Success) // 몬스터 처치 성공시
					{
						Get_Experience(butcher, baba); 						// 보스 몬스터 처치 성공시 경험치 획득
						Get_Gold(butcher, baba); 								// 보스 몬스터 처치 성공시 골드 획득
						Level_Up(baba);												// 레벨업 여부 판단
						break;
					}
					
					int num = Attack_Choice();	// 공격 선택
					
					if(num == 1) // 1. 일반공격 선택시
					{
						Normal_Attack(butcher, baba); 												
					}
					else if(num == 2) // 2. 스킬공격 선택시
					{
						Skill_Attack(butcher, baba);
					}
					else if(num == 3) // 3. 체력회복 선택시
					{
						Recovery_HP(baba);
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
	
	public int Babarian_Skill_Choice()	// 야만용사 스킬 선택
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
								Babarian baba,
								int Monster_Apear_Chance
							 )	// 일반 공격
	{
		int Skill_Num = 0;		// 몬스터 스킬 공격 선택
		double Damage = 0;		// 데미지
		Random random = new Random();
		
		// 야만용사 공격
		System.out.println(baba.Name + "가 " + baba.Attack + "만큼의 데미지를 입힙니다");		// 야만용사가 몬스터에게 주는 데미지
		if(Monster_Apear_Chance <= 85) // 일반 몬스터
		{
			System.out.println(compulsion.Name + "이(가) " + baba.Attack + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
			compulsion.HP = compulsion.HP - baba.Attack;										// 데미지만큼 감소된 몬스터 생명력
			if(compulsion.HP > 0)	// 몬스터 생존시만
				System.out.println(compulsion.Name + "의  생명력이" +  compulsion.HP + "만큼 남았습니다.");
		}
		else if(Monster_Apear_Chance > 85 && Monster_Apear_Chance <= 95) // 챔피언 몬스터
		{
			System.out.println(raise_darkness.Name + "이(가) " + baba.Attack + "만큼 데미지를 받았습니다!");
			compulsion.HP = raise_darkness.HP - baba.Attack;
			if(raise_darkness.HP > 0)
				System.out.println(raise_darkness.Name + "의  생명력이" +  raise_darkness.HP + "만큼 남았습니다.");
		}
		else	// 유니크 몬스터
		{
			System.out.println(element.Name + "이(가) " + baba.Attack + "만큼 데미지를 받았습니다!");
			element.HP = element.HP - baba.Attack;
			if(element.HP > 0)
				System.out.println(element.Name + "의  생명력이" +  element.HP + "만큼 남았습니다.");
		}
		
		// 몬스터 공격
		if(Monster_Apear_Chance <= 85)	// 일반 몬스터
		{
			if(compulsion.HP > 0)
			{
				Damage = compulsion.Tightening();
				baba.HP = baba.HP - Damage;
				if(baba.HP > 0)			// 야만용사 생존시에만 생명력 출력
					System.out.println(baba.Name + "의 생명력이 " + baba.HP + "만큼 남았습니다");
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
				
				baba.HP = baba.HP - Damage;			// 야만용사 생명력 감소
				if(baba.HP > 0)		// 야만용사 생존시에만 생명력 출력
					System.out.println(baba.Name + "의 생명력이 " + baba.HP + "만큼 남았습니다");
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
				
				baba.HP = baba.HP - Damage;
				if(baba.HP > 0)
					System.out.println(baba.Name + "의 생명력이 " + baba.HP + "만큼 남았습니다");
			}
		}
	}
	
	public void Normal_Attack(Butcher_Boss_Stage1 butcher, Babarian baba)
	{
		int Skill_Num = 0;		// 몬스터 스킬 공격 선택
		double Damage = 0;		// 데미지
		Random random = new Random();
		
		// 야만용사 공격
		System.out.println(baba.Name + "가 " + baba.Attack + "만큼의 데미지를 입힙니다");		// 야만용사가 몬스터에게 주는 데미지
		
		System.out.println(butcher.Name + "이(가) " + baba.Attack + "만큼 데미지를 받았습니다!");	// 몬스터가 받는 데미지
		butcher.HP = butcher.HP - baba.Attack;										// 데미지만큼 감소된 몬스터 생명력
		if(butcher.HP > 0)	// 몬스터 생존시만
			System.out.println(butcher.Name + "의  생명력이" +  butcher.HP + "만큼 남았습니다.");
		
		// 도살자 공격
		if(butcher.HP > 0)	// 챔피언 몬스터 생존시에만 공격
		{
			Skill_Num = random.nextInt(3)+1;	// 스킬 1~3번까지 랜덤 선택하여 시전
			if(Skill_Num == 1)
				Damage = butcher.Throw_Hook();
			if(Skill_Num == 2)
				Damage = butcher.Flamethrower();
			if(Skill_Num == 3)
				Damage = butcher.Crash();
			
			baba.HP = baba.HP - Damage;			// 야만용사 생명력 감소
			if(baba.HP > 0)		// 야만용사 생존시에만 생명력 출력
				System.out.println(baba.Name + "의 생명력이 " + baba.HP + "만큼 남았습니다");
		}
	}
	
	public void Skill_Attack(
								Compulsion_Common_Monster compulsion, 
								Raise_Darkness_Champion_Monster raise_darkness,
								Ruler_of_Element_Unique_Monster element,
								Babarian baba,
								int Monster_Apear_Chance
							)	// 야만용사 스킬공격
	{
		double Damage = 0;		// 몬스터에 주는 데미지
		Random random = new Random();	
		int Skill_Num = Babarian_Skill_Choice();	// 야만용사 스킬 선택
		
		if(Skill_Num == 1)	// 스킬 "광분" 사용시
		{
			Damage = baba.Fury();
			if(Monster_Apear_Chance <= 85)	 // 일반 몬스터의 경우
			{
				System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");
				compulsion.HP = compulsion.HP - Damage;
				if(compulsion.HP > 0)
					System.out.println(compulsion.Name + "의  생명력이" +  compulsion.HP + "만큼 남았습니다.");
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
					
					baba.HP = baba.HP - Damage;
					if(baba.HP > 0)			// 야만용사 생존시에만 출력
						System.out.println(baba.Name + "의 생명력이 " + baba.HP + "만큼 남았습니다");
				}
			}
			
		}
		else if(Skill_Num == 2)	// 스킬 "선조의 망치" 사용시
		{
			Damage = baba.Ancestor_Hammer();
			
			System.out.println(compulsion.Name + "이(가) " + Damage + "만큼 데미지를 받았습니다!");
			compulsion.HP = compulsion.HP - Damage;
			if(compulsion.HP > 0)
				System.out.println(compulsion.Name + "의  생명력이" +  compulsion.HP + "만큼 남았습니다.");
		}
		else if(Skill_Num == 3) // 스킬 "전장의 함성" 사용시
		{
			baba.Cry_of_Battlefield();
		}
		
		if(Skill_Num == 1 || Skill_Num == 2) // 공격스킬(1,2)번 사용시  몬스터 반격
		{
			if(Monster_Apear_Chance <= 85)	 // 일반 몬스터의 경우
			{
				if(compulsion.HP > 0)
				{
					Damage = compulsion.Tightening();
					baba.HP = baba.HP - Damage;
					if(baba.HP > 0)
						System.out.println(baba.Name + "의 생명력이 " + baba.HP + "만큼 남았습니다");
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
					
					baba.HP = baba.HP - Damage;
					if(baba.HP > 0)			// 야만용사 생존시에만 출력
						System.out.println(baba.Name + "의 생명력이 " + baba.HP + "만큼 남았습니다");
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
					
					baba.HP = baba.HP - Damage;
					if(baba.HP > 0)
						System.out.println(baba.Name + "의 생명력이 " + baba.HP + "만큼 남았습니다");
				}
			}
		}
		
	}
	
	public void Skill_Attack(Butcher_Boss_Stage1 butcher, Babarian baba)
	{
		
	}
	
	public void Get_Experience(
								Compulsion_Common_Monster compulsion, 
								Raise_Darkness_Champion_Monster raise_darkness,
								Ruler_of_Element_Unique_Monster element,
								Babarian baba,
								int Monster_Apear_Chance
							  )		// 경험치 획득
	{
		bar2();
		if(Monster_Apear_Chance <= 85)	// 일반 몬스터
		{
			System.out.println(compulsion.Exp + "의 경험치를 얻었습니다");
			baba.Exp = baba.Exp - compulsion.Exp;		// 남은 필요경험치 = 필요경험치 - 획득 경험치
			if(baba.Exp > 0)	// 필요 경험치가 남았을 경우
				System.out.println((baba.Level_Num + 1)+"레벨 까지 남은 경험치 " + baba.Exp);		// 남은 필요 경험치 출력 
		}
		else if(Monster_Apear_Chance > 85 && Monster_Apear_Chance <= 95)	// 챔피언 몬스터
		{
			System.out.println(raise_darkness.Exp + "의 경험치를 얻었습니다");
			baba.Exp = baba.Exp - raise_darkness.Exp;
			if(baba.Exp > 0)
				System.out.println((baba.Level_Num+1)+"레벨 까지 남은 경험치 " + baba.Exp);
		}
		else	// 유니크 몬스터
		{
			System.out.println(element.Exp + "의 경험치를 얻었습니다");
			baba.Exp = baba.Exp - element.Exp;
			if(baba.Exp > 0)
				System.out.println((baba.Level_Num+1)+"레벨 까지 남은 경험치 " + baba.Exp);
		}
	}
	
	public void Get_Experience(Butcher_Boss_Stage1 butcher, Babarian baba) // 1막 보스 "도살자" 경험치 획득
	{
		bar2();
		System.out.println(butcher.Exp + "의 경험치를 얻었습니다");
		baba.Exp = baba.Exp - butcher.Exp;			// 경험치 획득
		if(baba.Exp > 0)
			System.out.println((baba.Level_Num+1)+"레벨 까지 남은 경험치 " + baba.Exp);
		
	}
	
	public void Get_Gold(
							Compulsion_Common_Monster compulsion, 
							Raise_Darkness_Champion_Monster raise_darkness,
							Ruler_of_Element_Unique_Monster element,
							Babarian baba,
							int Monster_Apear_Chance
						)		// 골드 획득
	{
		bar2();
		if(Monster_Apear_Chance <= 85)	// 일반 몬스터
		{
			System.out.println(compulsion.Gold + "의 골드를 얻었습니다");
			baba.Gold = baba.Gold + compulsion.Gold;		// 총 골드 = 현재 골드 + 획득 골드
			System.out.println("현재 " + baba.Gold + "골드");
		}
		else if(Monster_Apear_Chance > 85 && Monster_Apear_Chance <= 95)	// 챔피언 몬스터
		{
			System.out.println(raise_darkness.Gold + "의 골드를 얻었습니다");
			baba.Gold = baba.Gold + raise_darkness.Gold;
			System.out.println("현재 " + baba.Gold + "골드");
		}
		else	// 유니크 몬스터
		{
			System.out.println(element.Gold + "의 골드를 얻었습니다");
			baba.Gold = baba.Gold + element.Gold;
			System.out.println("현재 " + baba.Gold + "골드");
		}
	}
	
	public void Get_Gold(Butcher_Boss_Stage1 butcher, Babarian baba)
	{
		System.out.println(butcher.Gold + "의 골드를 얻었습니다");
		baba.Gold = baba.Gold + butcher.Gold;
		System.out.println("현재 " + baba.Gold + "골드");
	}
	
	public void Recovery_HP(Babarian baba)	// 체력회복 메뉴 선택시
	{
		bar2();
		if(baba.HP <= baba.Full_HP*0.7)		// 생명력이 70% 이하일 때
		{
			baba.HP = baba.HP + baba.Full_HP*0.3;
			System.out.println("생명력을 회복합니다");
			System.out.println(baba.Name + " 의 생명력이 " + (int)(baba.Full_HP*0.3) +"만큼 회복되었습니다");	// 생명력 30% 회복
			System.out.println("현재 " + baba.Name + " 의 생명력" + baba.HP);
		}
		else if((baba.HP > baba.Full_HP*0.7) && (baba.HP < baba.Full_HP))	// 생명력이 70% 초과 100% 미만이 때 남은 생명력 만큼 회복(최대치)
		{
			baba.HP = baba.Full_HP;
			System.out.println("생명력을 회복합니다");
			System.out.println(baba.Name + " 의 생명력이 " + (int)(baba.Full_HP - baba.HP) +"만큼 회복되었습니다");
			System.out.println("현재 " + baba.Name + " 의 생명력" + baba.HP);
		}
		else	// 생명력이 가득 차 있을 경우
			System.out.println("생명력이 가득 차있습니다");
	}
	
	public void Level_Up(Babarian baba)			// 레벨업
	{
		int Babarian_Level = baba.Level_Num;	// 현재 레벨 입력
		while(true)
		{
			if(baba.Exp == 0)	// 다음 레벨업만큼 경험치를 획득했을 때
			{
				Babarian_Level++;
				baba.Level(Babarian_Level);		// 레벨업!
				System.out.println("축하합니다!" + baba.Level_Num + "레벨이 되었습니다!");
			}
			else if(baba.Exp < 0)	// 다음 레벨업 이상으로 경험치 획득시
			{
				while(true)			// 경험치 획득량만큼 레벨업.
				{
					if(baba.Exp > 0) // 더이상 획득 경험치가 없을 때까지
						break;
					long Left_Exp = baba.Exp;
					Babarian_Level++;
					baba.Level(Babarian_Level);
					System.out.println("축하합니다!" + baba.Level_Num + "로 레벨업 하였습니다!");
					baba.Exp = baba.Exp - Left_Exp;
				}
			}
			break;
		}
	}
}
