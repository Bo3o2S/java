package Boss_Monster;

import java.util.Random;

import Character_Job.Babarian;
import Character_Job.Character_Job;
import Character_Job.Daemon_Hunter;
import Character_Job.Holy_Warrior;
import Character_Job.Magician;
import Character_Job.Monk;
import Character_Job.Witch_Doctor;
import Item_Jewelry_Unique.Unique_Jewelry_Attack;
import Item_Jewelry_Unique.Unique_Jewelry_Defence;
import Item_Weapon_Unique.Unique_Babarian_Giant_Sword;
import Item_Weapon_Unique.Unique_Daemon_Hunter_Bow;
import Item_Weapon_Unique.Unique_Holy_Warrior_Flail;
import Item_Weapon_Unique.Unique_Magician_Cane;
import Item_Weapon_Unique.Unique_Monk_Glove;
import Item_Weapon_Unique.Unique_Witch_Doctor_Ceremonial_Knife;
import Monster_Type.Boss_Monster;
import Monster_Unit.Monster_Unit;

public class Malthael_Boss_Stage5 extends Boss_Monster implements Monster_Unit{	// 5스테이지 보스 : 말티엘
	
	public Malthael_Boss_Stage5()
	{
		Name = "말티엘";
	}
	
	double Damage_Sprit_Ball= 4.0;						// 스킬 "영혼구" 공격배수
	double Damage_Spirit_Fog= 4.0;						// 스킬 "영혼의 안개" 공격배수
	double Damage_Ruin_Cloud= 5.0;						// 스킬 "파멸의 구름" 공격배수
	
	public double Sprit_Ball() // 스킬 "영혼구"
	{
		double Damage = 0;
		Damage = Attack*Damage_Sprit_Ball;				// 스킬 "영혼구" 데미지
		System.out.println("");
		System.out.println(Name + "이 영혼구(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Spirit_Fog() // 스킬 "영혼의 안개"
	{
		double Damage = 0;
		Damage = Attack*Damage_Spirit_Fog;				// 스킬 "영혼의 안개" 데미지
		System.out.println("");
		System.out.println(Name + "이 영혼의 안개(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Ruin_Cloud() // 스킬 "파멸의 구름"
	{
		double Damage = 0;
		Damage = Attack*Damage_Ruin_Cloud;				// 스킬 "파멸구름" 데미지
		System.out.println("");
		System.out.println(Name + "이 파멸의 구름(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public void Monster_Appear() {				// 몬스터 등장을 알림
		bar();
		System.out.println(Monster_Type + " " + Name + "가(이) 나타났습니다");
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

	@Override
	public Object Drop_Item(Character_Job character_job) {
		// TODO Auto-generated method stub
		if(character_job instanceof Babarian)
		{
			Unique_Babarian_Giant_Sword unique_sword = new Unique_Babarian_Giant_Sword();
			System.out.println(unique_sword.Item_Name + "을 드롭합니다");
			return unique_sword;
		}
		else if(character_job instanceof Daemon_Hunter)
		{
			Unique_Daemon_Hunter_Bow unique_bow = new Unique_Daemon_Hunter_Bow();
			System.out.println(unique_bow.Item_Name + "을 드롭합니다");
			return unique_bow;
		}
		else if(character_job instanceof Holy_Warrior)
		{
			Unique_Holy_Warrior_Flail unique_flail = new Unique_Holy_Warrior_Flail();
			System.out.println(unique_flail.Item_Name + "을 드롭합니다");
			return unique_flail;
		}
		else if(character_job instanceof Magician)
		{
			Unique_Magician_Cane unique_cane = new Unique_Magician_Cane();
			System.out.println(unique_cane.Item_Name + "을 드롭합니다");
			return unique_cane;
		}
		else if(character_job instanceof Monk)
		{
			Unique_Monk_Glove unique_glove = new Unique_Monk_Glove();
			System.out.println(unique_glove.Item_Name + "을 드롭합니다");
			return unique_glove;
		}
		else if(character_job instanceof Witch_Doctor)
		{
			Unique_Witch_Doctor_Ceremonial_Knife unique_knife = new Unique_Witch_Doctor_Ceremonial_Knife();
			System.out.println(unique_knife.Item_Name + "을 드롭합니다");
			return unique_knife;
		}
		return null;
	}
	
	@Override
	public Object Drop_Jewelry() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		if(rand.nextInt(100) < 50)
		{
			Unique_Jewelry_Attack unique_attack = new Unique_Jewelry_Attack();
			return unique_attack;
		}
		else
		{
			Unique_Jewelry_Defence unique_defence = new Unique_Jewelry_Defence();
			return unique_defence;
		}
	}
}