package Boss_Monster;

import java.util.Random;

import Monster_Type.Boss_Monster;
import Monster_Unit.Monster_Unit;

public class Butcher_Boss_Stage1 extends Boss_Monster implements Monster_Unit{ // 1번째 스테이지 보스
	
	public Butcher_Boss_Stage1() 						// 초기화
	{
		Name = "도살자";		
	}
	
	double Damage_Throw_Hook= 4.0;					// 스킬 "갈고리 날리기" 공격배수
	double Damage_Flamethrower= 4.0;				// 스킬 "화염방사" 공격배수
	double Damage_Crash= 5.0;						// 스킬 "충돌" 공격배수
	
	public double Throw_Hook() // 스킬 "갈고리 날리기"
	{
		double Damage = 0;
		Damage = Attack*Damage_Throw_Hook;			// 스킬 "갈고리 날리기" 데미지
		bar();
		System.out.println(Name + "가 갈고리 날리기(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Flamethrower() // 스킬 "화염방사"
	{
		double Damage = 0;
		Damage = Attack*Damage_Flamethrower;		// 스킬 "화염방사" 데미지
		bar();
		System.out.println(Name + "이 화염방사(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Crash() // 스킬 "충돌"
	{
		double Damage = 0;
		Damage = Attack*Damage_Crash;				// 스킬 "충돌" 데미지
		bar();
		System.out.println(Name + "이 충돌(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public void Monster_Appear() {				// 몬스터 등장을 알림
		bar2();
		System.out.println(Monster_Type + " " + Name + "가(이) 나타났습니다!");
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
	
	public double Monster_Attack() {
		// TODO Auto-generated method stub
		Random random = new Random();
		double Damage = 0;
		int Skill_Num = random.nextInt(3)+1;	// 스킬 1~3번까지 랜덤 선택하여 시전
		if(Skill_Num == 1)
			Damage = Throw_Hook();
		if(Skill_Num == 2)
			Damage = Flamethrower();
		if(Skill_Num == 3)
			Damage = Crash();
		return Damage;
	}
	
	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}
}
