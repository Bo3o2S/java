package Unique_Monster;

import java.util.Random;

import Monster_Type.Unique_Monster;
import Monster_Unit.Monster_Unit;

public class Azrase_Unique_Monster extends Unique_Monster implements Monster_Unit, Runnable{	// 유니크 몬스터 : 원소의 지배자
	
	public String Name = "악마피붙이 애즈래스";
	double Damage_Flame_Hell= 3.0;										// 스킬 "화염지옥" 공격배수
	double Damage_Thunderbolt_Raid= 3.0;								// 스킬 "번개작렬" 공격배수
	double Damage_Freezing= 3.0;										// 스킬 "빙결" 공격배수
	
	public double Flame_Hell() // 스킬 "화염지옥"
	{
		double Damage = 0;
		Damage = Attack*Damage_Flame_Hell;								// 스킬 "화염지옥" 데미지
		bar();
		System.out.println(Name + "이 화염지옥(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Thunderbolt_Raid() // 스킬 "번개작렬"
	{
		double Damage = 0;
		Damage = Attack*Damage_Thunderbolt_Raid;						// 스킬 "번개벼락" 데미지
		bar();
		System.out.println(Name + "이 번개벼락(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Freezing() // 스킬 "빙결"
	{
		double Damage = 0;
		Damage = Attack*Damage_Freezing;								// 스킬 "빙결" 데미지
		bar();
		System.out.println(Name + "이 빙결(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public void Monster_Appear() {				// 몬스터 등장을 알림
		bar();
		System.out.println(Monster_Type + " " + Name + "가(이) 나타났습니다");
		System.out.println("전투를 시작합니다");
		bar();
	}
	
	@Override
	public boolean Kill_Success() {
		// TODO Auto-generated method stub
		boolean Monster_Kill_Success = false;
		if(HP <= 0)
		{
			bar();
			System.out.println(Name + "을 처치하였습니다.");
			Monster_Kill_Success = true;
			bar();
		}
		return Monster_Kill_Success;
	}
	
	public double Monster_Attack() {
		// TODO Auto-generated method stub
		Random random = new Random();
		double Damage = 0;
		int Skill_Num = random.nextInt(3)+1;	// 스킬 1~3번까지 랜덤 선택하여 시전
		if(Skill_Num == 1)
			Damage = Flame_Hell();
		if(Skill_Num == 2)
			Damage = Thunderbolt_Raid();
		if(Skill_Num == 3)
			Damage = Freezing();
		return Damage;
	}
	
	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Monster_Attack();
	}
}


