package Monster_Unit;

import Monster_Type.Boss_Monster;
import java.util.Random;

public class Azmodan_Boss_Stage3 extends Boss_Monster implements Monster_Unit{	// 3번쨰 스테이지 보스 : 아즈모단
	public  Azmodan_Boss_Stage3()							// 초기화
	{
		Name = "아즈모단";	
	}
	
	double Damage_Throw_Corpse= 4.0;			// 스킬 "시체투하" 공격배수
	double Damage_Darkness_Area= 4.0;			// 스킬 "어둠의 영역" 공격배수
	double Damage_Fireball= 5.0;				// 스킬 "화염구" 공격배수
	
	public double Throw_Corpse()
	{
		double Damage = 0;
		Damage = Attack*Damage_Throw_Corpse;	// 스킬 "화염구" 데미지
		bar();
		System.out.println(Name + "이 시체투하(을)를 시전합니다. " + Damage + "데미지를 받았습니다");

		return Damage;
	}
	
	public double Darkness_Area()
	{
		double Damage = 0;
		Damage = Attack*Damage_Darkness_Area;	// 스킬 "어둠의 영역" 데미지
		bar();
		System.out.println(Name + "이 어둠의 영역(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Fireball()
	{
		double Damage = 0;
		Damage = Attack*Damage_Fireball;		// 스킬 "화염구" 데미지
		bar();
		System.out.println(Name + "이 화염구(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
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
			Damage = Throw_Corpse();
		if(Skill_Num == 2)
			Damage = Darkness_Area();
		if(Skill_Num == 3)
			Damage = Fireball();
		return Damage;
	}

	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}
}
