package Common_Monster;

import Character_Job.*;
import Monster_Type.Common_Monster;
import Monster_Unit.Monster_Unit;

public class Compulsion_Common_Monster extends Common_Monster implements Monster_Unit{ 	//일반 몬스터 : 강제자
	
	
	public Compulsion_Common_Monster()
	{
		Name = "해골";
	}
	double Damage_Tightening= 1.5;								// 스킬 "조이기" 공격배수
	
	public double Tightening() //스킬 "조이기"
	{
		double Damage = 0;
		Damage = Attack*Damage_Tightening;		
		System.out.println(Name + "이 조이기(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		bar();
		return Damage;
	}
	
	public void Monster_Appear() {				// 몬스터 등장을 알림
		bar();
		System.out.println(Monster_Type + " " + Name + "이 나타났습니다");
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
		double Damage = 0;
		Damage = Tightening();
		return Damage;
	}
	
	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}

	@Override
	public Object Drop_Item(Character_Job character_job) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object Drop_Jewelry() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
