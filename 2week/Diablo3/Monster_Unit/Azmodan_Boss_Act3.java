package Monster_Unit;

import Monster_Type.Boss_Monster;

public class Azmodan_Boss_Act3 extends Boss_Monster{		// 3번쨰 스테이지 보스 : 아즈모단
	public  Azmodan_Boss_Act3()							// 초기화
	{
		Name = "아즈모단";	
	}
	
	double Damage_Throw_Corpse= 4.0;
	double Damage_Darkness_Area= 4.0;
	double Damage_Fireball= 5.0;
	
	public double Throw_Corpse()
	{
		double Damage = 0;
		Damage = Attack*Damage_Throw_Corpse;
		bar();
		System.out.println(Name + "이 시체투하(을)를 시전합니다. " + Damage + "를 받았습니다!");

		return Damage;
	}
	
	public double Darkness_Area()
	{
		double Damage = 0;
		Damage = Attack*Damage_Darkness_Area;
		bar();
		System.out.println(Name + "이 어둠의 영역(을)를 시전합니다. " + Damage + "를 받았습니다!");
		return Damage;
	}
	
	public double Fireball()
	{
		double Damage = 0;
		Damage = Attack*Damage_Fireball;
		bar();
		System.out.println(Name + "이 화염구(을)를 시전합니다. " + Damage + "를 받았습니다!");
		return Damage;
	}
}
