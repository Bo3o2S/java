package Boss_Monster;

import java.util.Random;

import Character_Job.*;
import Item_Armor_Unique.*;
import Item_Weapon_Unique.Unique_Babarian_Giant_Sword;
import Item_Weapon_Unique.Unique_Daemon_Hunter_Bow;
import Item_Weapon_Unique.Unique_Holy_Warrior_Flail;
import Item_Weapon_Unique.Unique_Magician_Cane;
import Item_Weapon_Unique.Unique_Monk_Glove;
import Item_Weapon_Unique.Unique_Witch_Doctor_Ceremonial_Knife;
import Monster_Type.Boss_Monster;
import Monster_Unit.Monster_Unit;

public class Belial_Boss_Stage2 extends Boss_Monster implements Monster_Unit{ // 2번째 스테이지 보스
	
	public String Name = "베리얼";
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
}
