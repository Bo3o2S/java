package Monster_Unit;

import java.util.Random;
import java.util.Scanner;

import Monster_Type.Champion_Monster;


public class Raise_Darkness_Champion_Monster extends Champion_Monster implements Monster_Unit{	// 챔피언 몬스터 : 어둠을 키우는 자
	
	static Scanner scan = new Scanner(System.in);
	
	public  Raise_Darkness_Champion_Monster() 							// 초기화
	{
		Name = "어둠을 키우는 자";
	}
	
	double Damage_Melting = 2.0;										// 스킬 "융해" 공격배수
	double Damage_Plague = 2.0;											// 스킬 "역병" 공격배수
	double Damage_Shelling = 2.0;										// 스킬 "포격" 공격배수
	
	
	public double Melting() // 스킬 "융해"
	{
		double Damage = 0;
		Damage = Attack*Damage_Melting;									// 스킬 "융해" 데미지
		bar();
		System.out.println(Name + "이 융해(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Plague() // 스킬 "역병"
	{
		double Damage = 0;
		Damage = Attack*Damage_Plague;									// 스킬 "역병" 데미지
		bar();
		System.out.println(Name + "이 역병(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Shelling() // 스킬 "포격"
	{
		double Damage = 0;
		Damage = Attack*Damage_Shelling;								// 스킬 "포격" 데미지
		bar();
		System.out.println(Name + "이 포격(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
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
	
	public double Monster_Attack() {
		// TODO Auto-generated method stub
		Random random = new Random();
		double Damage = 0;
		int Skill_Num = random.nextInt(3)+1;	// 스킬 1~3번까지 랜덤 선택하여 시전
		if(Skill_Num == 1)
			Damage = Melting();
		if(Skill_Num == 2)
			Damage = Plague();
		if(Skill_Num == 3)
			Damage = Shelling();
		return Damage;
	}
	
	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}
}
