package Boss_Monster;

import java.util.Random;

import Monster_Type.Boss_Monster;
import Monster_Unit.Monster_Unit;

public class Belial_Boss_Stage2 extends Boss_Monster implements Monster_Unit{ // 2번째 스테이지 보스
	
	public  Belial_Boss_Stage2() //초기화
	{
		Name = "베리얼";						// 보스 몬스터명
		
	}

	double Damage_Down_Tongs= 4.0;			// 스킬 "집게 내려찍기" 공격배수
	double Damage_Spout_Poison= 4.0;		// 스킬 "독뿜기" 공격배수
	double Damage_Poison_Fire= 5.0;			// 스킬 "독의 화염" 공격배수
	
	public double Down_Tongs()	// 스킬 "집게 내려찍기"
	{
		double Damage = 0;
		Damage = Attack*Damage_Down_Tongs;		// 스킬 "집게 내려찍기" 데미지
		bar();
		System.out.println(Name + "이 집게 내려찍기(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Spout_Poison() // 스킬 "독뿜기"
	{
		double Damage = 0;
		Damage = Attack*Damage_Spout_Poison;	// 스킬 "독뿜기 데미지
		bar();
		System.out.println(Name + "이 독 뿜기(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Poison_Fire()	// 스킬 "독의 화염"
	{
		double Damage = 0;
		Damage = Attack*Damage_Poison_Fire;		// 스킬 "독의 화염" 데미지
		bar();
		System.out.println(Name + "이 독의 화염(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public void Monster_Appear() {				// 몬스터 등장을 알림
		bar2();
		System.out.println(Monster_Type + " " + Name + "가(이) 나타났습니다");
		System.out.println("교전을 시작합니다");
	}
	
	@Override
	public boolean Kill_Success() {
		// TODO Auto-generated method stub
		boolean Monster_Kill_Success = false;
		if(HP <= 0)
		{
			System.out.println(Name + "을 처치하였습니다.");
			Monster_Kill_Success = true;
		}
		return Monster_Kill_Success;
	}
	
	@Override
	public double Monster_Attack() {
		// TODO Auto-generated method stub
		Random random = new Random();
		double Damage = 0;
		int Skill_Num = random.nextInt(3)+1;	// 스킬 1~3번까지 랜덤 선택하여 시전
		if(Skill_Num == 1)
			Damage = Down_Tongs();
		if(Skill_Num == 2)
			Damage = Spout_Poison();
		if(Skill_Num == 3)
			Damage = Poison_Fire();
		return Damage;
	}
	
	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}
}
