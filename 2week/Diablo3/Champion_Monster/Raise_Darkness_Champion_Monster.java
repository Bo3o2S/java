package Champion_Monster;

import java.util.Random;
import java.util.Scanner;

import Character_Job.*;
import Item_Armor_Common.*;
import Item_Weapon_Common.*;
import Monster_Type.Champion_Monster;
import Monster_Unit.Monster_Unit;


public class Raise_Darkness_Champion_Monster extends Champion_Monster implements Monster_Unit{	// 챔피언 몬스터 : 어둠을 키우는 자
	
	static Scanner scan = new Scanner(System.in);
	
	public String Name = "어둠을 키우는 자";
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

	@Override
	public Object Drop_Item(Character_Job character_job) {
		// TODO Auto-generated method stub
		Random random = new Random();
		if(character_job instanceof Babarian)
		{
			if(50 <= random.nextInt(100))
			{
				Common_Babarian_Leather_Clothes common_leather = new Common_Babarian_Leather_Clothes();
				return common_leather;
			}
			else
			{
				Common_Babarian_Giant_Sword common_sword = new Common_Babarian_Giant_Sword();
				return common_sword;
			}
		}
		else if(character_job instanceof Daemon_Hunter)
		{
			if(50 <= random.nextInt(100))
			{
				Common_Daemon_Hunter_Cloak common_cloak = new Common_Daemon_Hunter_Cloak();
				return common_cloak;
			}
			else
			{
				Common_Daemon_Hunter_Bow common_bow = new Common_Daemon_Hunter_Bow();
				return common_bow;
			}
			
		}
		else if(character_job instanceof Holy_Warrior)
		{
			if(50 <= random.nextInt(100))
			{
				Common_Holy_Warrior_Holy_Armor common_holy_armor = new Common_Holy_Warrior_Holy_Armor();
				return common_holy_armor;
			}
			else
			{
				Common_Holy_Warrior_Flail common_flail = new Common_Holy_Warrior_Flail();
				return common_flail;
			}
		}
		else if(character_job instanceof Magician)
		{
			if(50 <= random.nextInt(100))
			{
				Common_Magician_Robe common_robe = new Common_Magician_Robe();
				return common_robe;
			}
			else
			{
				Common_Magician_Cane common_cane = new Common_Magician_Cane();
				return common_cane;
			}
		}
		else if(character_job instanceof Monk)
		{
			if(50 <= random.nextInt(100))
			{
				Common_Monk_Monk_Suit common_monk_suit = new Common_Monk_Monk_Suit();
				return common_monk_suit;
			}
			else
			{
				Common_Monk_Glove common_glove = new Common_Monk_Glove();
				return common_glove;
			}
		}
		else if(character_job instanceof Witch_Doctor)
		{
			if(50 <= random.nextInt(100))
			{
				Common_Witch_Doctor_Ceremonial_Clothes common_witch_clothes = new Common_Witch_Doctor_Ceremonial_Clothes();
				return common_witch_clothes;
			}
			else
			{
				Common_Witch_Doctor_Ceremonial_Knife common_witch_knife = new Common_Witch_Doctor_Ceremonial_Knife();
				return common_witch_knife;
			}
		}
		return null;
	}
}
