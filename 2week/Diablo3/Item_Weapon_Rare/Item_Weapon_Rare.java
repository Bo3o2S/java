package Item_Weapon_Rare;

import java.util.Random;

import Game.Damage_Calculator;
import Game.SharedResource_Battle;
import Item.Item_Interface;
import Item.Item_Jewelry_Hole;
import Item.Jewelry;
import Item.Weapon;
import Monster.MonSter;

public class Item_Weapon_Rare extends Weapon implements Item_Interface{
	public Item_Weapon_Rare()	// 일반 아이템 기본 세팅
	{
		Item_Type = "레어 아이템";	// 아이템 종류
		Item_Attack = 2500;		// 아이템 방어력
		Item_Vitality = 2500;		// 아이템 활력
		Item_Jewelry_Hole_Num = 2;  // 보석홈 개수
		
	}
	
	public String Thunder_Arrow = "전류 화살";
	public String Frozen_Skull = "얼어붙은 해골";
	public String Poison_Launch = "독발";
	double Thunder_Arrow_Attack_Rate = 1.2;
	double Frozen_Skull_Attack_Rate = 2.2;
	double Poison_Launch_Attack_Rate = 2.0;
	double Poison_Launch_Add_Attack_Rate = 0.1;
	
	public boolean Rare_Weapon_Skill(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		boolean weapon_skill_on = false;
		Random rand = new Random();
		if(rand.nextInt(3) == 0)
		{
			if(rand.nextInt(100)<15)
			{
				Thunder_Arrow(monster, sharedresource_battle);
				weapon_skill_on = true;
			}
		}
		else if(rand.nextInt(3) == 1)
		{
			if(rand.nextInt(100)<15)
			{
				Frozen_Skull(monster, sharedresource_battle);
				weapon_skill_on = true;
			}
		}
		else if(rand.nextInt(3) == 2)
		{
			if(rand.nextInt(100)<15)
			{
				Poison_Launch(monster, sharedresource_battle);
				weapon_skill_on = true;
			}
		}
		return weapon_skill_on;
	}
	
	
	public void Thunder_Arrow(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		bar();
		Thread thread = new Thread(new Runnable() 
		{
			@Override
			public void run() {
					double Damage = 0;
					int duration = 2;
					Damage = Item_Attack*Thunder_Arrow_Attack_Rate;
					System.out.println("레어 무기 고유 스킬 " + Thunder_Arrow + "이 발동합니다!");
					System.out.println(Damage + "만큼 데미지를 입힙니다!");
					Damage_Calculator damage_calculator = new Damage_Calculator(Damage, monster);
					Damage = damage_calculator.Damage_Conversion();
					sharedresource_battle.Character_Attack(Damage);
					monster.HP = sharedresource_battle.Monster_HP;
					System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
					if(sharedresource_battle.Monster_HP > 0)
						System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
				try {
						Thread.sleep(duration*1000);
						Damage = Item_Attack*Thunder_Arrow_Attack_Rate;
						System.out.println("레어 무기 고유 스킬 " + Thunder_Arrow + "이 발동합니다!");
						System.out.println(Damage + "만큼 데미지를 입힙니다!");
						Damage = damage_calculator.Damage_Conversion();
						sharedresource_battle.Character_Attack(Damage);
						monster.HP = sharedresource_battle.Monster_HP;
						System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
						if(sharedresource_battle.Monster_HP > 0)
							System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		bar();
	}
	
	public void Frozen_Skull(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		bar();
		Thread thread = new Thread(new Runnable() 
		{
			@Override
			public void run() {
				double Damage = 0;
				Damage = Item_Attack*Frozen_Skull_Attack_Rate;
				System.out.println("레어 무기 고유 스킬 " + Frozen_Skull + "이 발동합니다!");
				System.out.println(Damage + "만큼 데미지를 입힙니다!");
				Damage_Calculator damage_calculator = new Damage_Calculator(Damage, monster);
				Damage = damage_calculator.Damage_Conversion();
				sharedresource_battle.Character_Attack(Damage);
				monster.HP = sharedresource_battle.Monster_HP;
				System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
				if(sharedresource_battle.Monster_HP > 0)
					System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
			}
		});
		thread.start();
		bar();
	}
	
	public void Poison_Launch(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		bar();
		Thread thread = new Thread(new Runnable() 
		{
			int count = 0;
			@Override
			public void run() {
					double Damage = 0;
					int duration = 1;
					Damage = Item_Attack*Poison_Launch_Attack_Rate;
					System.out.println("레어 무기 고유 스킬 " + Poison_Launch + "이 발동합니다!");
					System.out.println(Damage + "만큼 데미지를 입힙니다!");
					Damage_Calculator damage_calculator = new Damage_Calculator(Damage, monster);
					Damage = damage_calculator.Damage_Conversion();
					sharedresource_battle.Character_Attack(Damage);
					monster.HP = sharedresource_battle.Monster_HP;
					System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
					if(sharedresource_battle.Monster_HP > 0)
						System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
				try {
						
						while(true)
						{
							bar();
							if(count > 4)
								break;
							Thread.sleep(duration*1000);
							Damage = Item_Attack*Poison_Launch_Add_Attack_Rate;
							System.out.println(Thunder_Arrow + "의 추가 독 데미지가 발동합니다!");
							System.out.println(Damage + "만큼 데미지를 입힙니다!");
							Damage = damage_calculator.Damage_Conversion();
							sharedresource_battle.Character_Attack(Damage);
							monster.HP = sharedresource_battle.Monster_HP;
							System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							count++;
							if(sharedresource_battle.Monster_HP > 0)
								System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
							bar();
						}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		bar();
	}
	
	
	
	public double Insert_Jewelry(Jewelry jewelry, int num)
	{
		if(num == 1)
		{
			System.out.println("1번 홈에 보석을 장착합니다");
			if(jewelry_hole.jewelry1 == null)
			{
				jewelry_hole.jewelry1 = jewelry;
				if(jewelry_hole.jewelry1.Attack != 0)
					return jewelry_hole.jewelry1.Attack;
				if(jewelry_hole.jewelry1.Defence != 0)
					return jewelry_hole.jewelry1.Defence;
			}
			else
				System.out.println("보석을 제거해야 장착 가능합니다");
		}
		else if(num == 2)
		{
			System.out.println("2번 홈에 보석을 장착합니다");
			if(jewelry_hole.jewelry2 == null)
			{
				jewelry_hole.jewelry2 = jewelry;
				if(jewelry_hole.jewelry2.Attack != 0)
					return jewelry_hole.jewelry2.Attack;
				if(jewelry_hole.jewelry2.Defence != 0)
					return jewelry_hole.jewelry2.Defence;
			}
			else
				System.out.println("보석을 제거해야 장착 가능합니다");
		}
		return 0;
	}
	
	public void Remove_Jewelry(int num)
	{
		if(num == 1)
		{
			jewelry_hole.jewelry1 = null;
			System.out.println("1번 홈의 보석을 제거하였습니다");
		}
		else if(num == 2)
		{
			jewelry_hole.jewelry2 = null;
			System.out.println("2번 홈의 보석을 제거하였습니다");
		}
	}
}


