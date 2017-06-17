package Unique_Monster;

import java.util.Random;

import Character_Job.*;
import Item_Armor_Rare.*;
import Item_Jewelry_Common.Common_Jewelry_Attack;
import Item_Jewelry_Common.Common_Jewelry_Defence;
import Item_Jewelry_Rare.Rare_Jewelry_Attack;
import Item_Jewelry_Rare.Rare_Jewelry_Defence;
import Item_Weapon_Rare.*;
import Monster_Type.Unique_Monster;
import Monster_Unit.Monster_Unit;

public class Azrase_Unique_Monster extends Unique_Monster implements Monster_Unit, Runnable{	// 유니크 몬스터 : 악마피붙이 애즈래스
	
	public Azrase_Unique_Monster()
	{
		Name = "악마피붙이 애즈래스";
	}
	
	double Damage_Flame_Hell= 3.0;										// 스킬 "화염지옥" 공격배수
	double Damage_Thunderbolt_Raid= 3.0;								// 스킬 "번개작렬" 공격배수
	double Damage_Freezing= 3.0;										// 스킬 "빙결" 공격배수
	
	public double Flame_Hell() // 스킬 "화염지옥"
	{
		double Damage = 0;
		Damage = Attack*Damage_Flame_Hell;								// 스킬 "화염지옥" 데미지
		System.out.println("");
		System.out.println(Name + "가 화염지옥(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Thunderbolt_Raid() // 스킬 "번개작렬"
	{
		double Damage = 0;
		Damage = Attack*Damage_Thunderbolt_Raid;						// 스킬 "번개벼락" 데미지
		System.out.println("");
		System.out.println(Name + "가 번개벼락(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
		return Damage;
	}
	
	public double Freezing() // 스킬 "빙결"
	{
		double Damage = 0;
		Damage = Attack*Damage_Freezing;								// 스킬 "빙결" 데미지
		System.out.println("");
		System.out.println(Name + "가 빙결(을)를 시전합니다. " + Damage + "데미지를 받았습니다");
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
			System.out.println(Name + "를 처치하였습니다.");
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
			Damage = Flame_Hell();
		if(Skill_Num == 2)
			Damage = Thunderbolt_Raid();
		if(Skill_Num == 3)
			Damage = Freezing();
		return Damage;
	}
	
	@Override
	public double Monster_HP() {
		// TODO Auto-generated method stub
		return HP;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Monster_Attack();
	}

	@Override
	public Object Drop_Item(Character_Job character_job) {
		// TODO Auto-generated method stub
		Random random = new Random();
		if(character_job instanceof Babarian)
		{
			if(50 <= random.nextInt(100))
			{
				Rare_Babarian_Leather_Clothes rare_leather = new Rare_Babarian_Leather_Clothes();
				return rare_leather;
			}
			else
			{
				Rare_Babarian_Giant_Sword rare_sword = new Rare_Babarian_Giant_Sword();
				return rare_sword;
			}
		}
		else if(character_job instanceof Daemon_Hunter)
		{
			if(50 <= random.nextInt(100))
			{
				Rare_Daemon_Hunter_Cloak rare_cloak = new Rare_Daemon_Hunter_Cloak();
				return rare_cloak;
			}
			else
			{
				Rare_Daemon_Hunter_Bow rare_bow = new Rare_Daemon_Hunter_Bow();
				return rare_bow;
			}
			
		}
		else if(character_job instanceof Holy_Warrior)
		{
			if(50 <= random.nextInt(100))
			{
				Rare_Holy_Warrior_Holy_Armor rare_holy_armor = new Rare_Holy_Warrior_Holy_Armor();
				return rare_holy_armor;
			}
			else
			{
				Rare_Holy_Warrior_Flail rare_flail = new Rare_Holy_Warrior_Flail();
				return rare_flail;
			}
		}
		else if(character_job instanceof Magician)
		{
			if(50 <= random.nextInt(100))
			{
				Rare_Magician_Robe rare_robe = new Rare_Magician_Robe();
				return rare_robe;
			}
			else
			{
				Rare_Magician_Cane rare_cane = new Rare_Magician_Cane();
				return rare_cane;
			}
		}
		else if(character_job instanceof Monk)
		{
			if(50 <= random.nextInt(100))
			{
				Rare_Monk_Monk_Suit rare_monk_suit = new Rare_Monk_Monk_Suit();
				return rare_monk_suit;
			}
			else
			{
				Rare_Monk_Glove rare_glove = new Rare_Monk_Glove();
				return rare_glove;
			}
		}
		else if(character_job instanceof Witch_Doctor)
		{
			if(50 <= random.nextInt(100))
			{
				Rare_Witch_Doctor_Ceremonial_Clothes rare_witch_clothes = new Rare_Witch_Doctor_Ceremonial_Clothes();
				return rare_witch_clothes;
			}
			else
			{
				Rare_Witch_Doctor_Ceremonial_Knife rare_witch_knife = new Rare_Witch_Doctor_Ceremonial_Knife();
				return rare_witch_knife;
			}
		}
		return null;
	}

	@Override
	public Object Drop_Jewelry() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		if(rand.nextInt(100)<50)
		{
			Rare_Jewelry_Attack common_attack = new Rare_Jewelry_Attack();
			return common_attack;
		}
		else
		{
			Rare_Jewelry_Defence common_defence = new Rare_Jewelry_Defence();
			return common_defence;
		}
	}
}