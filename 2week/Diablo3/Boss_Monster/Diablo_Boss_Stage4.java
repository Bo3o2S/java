package Boss_Monster;

import java.util.Random;

import Monster_Type.Boss_Monster;
import Monster_Unit.Monster_Unit;

public class Diablo_Boss_Stage4 extends Boss_Monster implements Monster_Unit{	// 4번째 스테이지 보스 : 디아블로
	
	public String Name = "디아블로";
	double Damage_Fire_Circle= 4.0;					// 스킬 "화염의 원" 공격배수
	double Damage_Fire_Launch= 4.0;					// 스킬 "화염발사" 공격배수
	double Damage_Fire_Earthquake= 5.0;				// 스킬 "화염지진" 공격배수
	
	public double Fire_Circle() // 스킬 "화염의 원"
	{
		double Damage = 0;
		Damage = Attack*Damage_Fire_Circle;			// 스킬 "화염의 원" 데미지
		bar();
		System.out.println(Name + "이 화염의 원(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Fire_Launch() // 스킬 "화염발사"
	{
		double Damage = 0;
		Damage = Attack*Damage_Fire_Launch;			// 스킬 "화염발사" 데미지
		bar();
		System.out.println(Name + "이 화염발사(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Fire_Earthquake() // 스킬 "화염지진"
	{
		double Damage = 0;
		Damage = Attack*Damage_Fire_Earthquake;		// 스킬 "화염지진" 데미지
		bar();
		System.out.println(Name + "이 화염지진(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
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
			Damage = Fire_Circle();
		if(Skill_Num == 2)
			Damage = Fire_Launch();
		if(Skill_Num == 3)
			Damage = Fire_Earthquake();
		return Damage;
	}
	
	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}
}
