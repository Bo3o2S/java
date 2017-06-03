package Monster_Unit;

import java.util.Random;

import Monster_Type.Common_Monster;

public class Compulsion_Common_Monster extends Common_Monster implements Monster_Unit{ 	//일반 몬스터 : 강제자
	
	public  Compulsion_Common_Monster() // 초기화
	{
		Name = "강제자";
	}
	
	double Damage_Tightening= 1.5;								// 스킬 "조이기" 공격배수
	
	public double Tightening() //스킬 "조이기"
	{
		double Damage = 0;
		Damage = Attack*Damage_Tightening;		
		System.out.println(Name + "가 조이기(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		bar();
		return Damage;
	}
	
	public void Monster_Appear() {				// 몬스터 등장을 알림
		bar2();
		System.out.println(Name + "가(이) 나타났습니다");
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
		double Damage = 0;
		Damage = Tightening();
		return Damage;
	}
	
	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}
	
}
