package Boss_Monster;

import java.util.Random;

import Monster_Type.Boss_Monster;
import Monster_Unit.Monster_Unit;

public class Malthael_Boss_Stage5 extends Boss_Monster implements Monster_Unit{	// 5스테이지 보스 : 말티엘
	
	public String Name = "말티엘";
	double Damage_Sprit_Ball= 4.0;						// 스킬 "영혼구" 공격배수
	double Damage_Spirit_Fog= 4.0;						// 스킬 "영혼의 안개" 공격배수
	double Damage_Ruin_Cloud= 5.0;						// 스킬 "파멸의 구름" 공격배수
	
	public double Sprit_Ball() // 스킬 "영혼구"
	{
		double Damage = 0;
		Damage = Attack*Damage_Sprit_Ball;				// 스킬 "영혼구" 데미지
		bar();
		System.out.println(Name + "이 영혼구(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Spirit_Fog() // 스킬 "영혼의 안개"
	{
		double Damage = 0;
		Damage = Attack*Damage_Spirit_Fog;				// 스킬 "영혼의 안개" 데미지
		bar();
		System.out.println(Name + "이 영혼의 안개(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Ruin_Cloud() // 스킬 "파멸의 구름"
	{
		double Damage = 0;
		Damage = Attack*Damage_Ruin_Cloud;				// 스킬 "파멸구름" 데미지
		bar();
		System.out.println(Name + "이 파멸의 구름(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
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
			Damage = Sprit_Ball();
		if(Skill_Num == 2)
			Damage = Spirit_Fog();
		if(Skill_Num == 3)
			Damage = Ruin_Cloud();
		return Damage;
	}
	
	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}
}
