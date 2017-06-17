package Item_Weapon_Unique;

import Item.Item_Interface;
import Item.Item_Jewelry_Hole;
import Item.Jewelry;
import Item.Weapon;
import Monster.MonSter;

import java.util.Random;

import Character.Character;
import Game.Damage_Calculator;
import Game.SharedResource_Battle;

public class Item_Weapon_Unique extends Weapon implements Item_Interface{
	
	public Item_Weapon_Unique()	// 일반 아이템 기본 세팅
	{
		Item_Type = "유니크 아이템";	// 아이템 종류
		Item_Attack = 5000;		// 아이템 공격력
		Item_Vitality = 5000;		// 아이템 활력
		Item_Jewelry_Hole_Num = 3;  // 보석홈 개수
	}
	
	public String Thunder_of_Heaven = "하늘의 번개";
	public String Explosion = "익스플로전";
	public String Summons_Damon = "악마 소환";
	double Thunder_of_Heaven_Attack_Rate = 4.0;
	double Thunder_of_Heaven_Add_Attack_Rate = 1.0;
	double Explosion_Attack_Rate = 4.0;
	double Explosion_Add_Attack_Rate = 2.0;
	double Summons_Damon_Attack_Rate = 6.0;
	double Summons_Damon_Add_Attack_Rate = 10.0;
	
	public boolean Unique_Weapon_Skill(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		boolean weapon_skill_on = false;
		Random rand = new Random();
		if(rand.nextInt(3) == 0)
		{
			if(rand.nextInt(100)<30)
			{
				Thunder_of_Heaven(monster, sharedresource_battle);
				weapon_skill_on = true;
			}
		}
		else if(rand.nextInt(3) == 1)
		{
			if(rand.nextInt(100)<30)
			{
				Explosion(monster, sharedresource_battle);
				weapon_skill_on = true;
			}
		}
		else if(rand.nextInt(3) == 2)
		{
			if(rand.nextInt(100)<30)
			{
				Summons_Damon(monster, sharedresource_battle);
				weapon_skill_on = true;
			}
		}
		return weapon_skill_on;
	}
	
	
	public void Thunder_of_Heaven(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		bar();
		Thread thread = new Thread(new Runnable() 
		{
			int count = 0;
			@Override
			public void run() {
					double Damage = 0;
					int duration = 1;
					Damage = Item_Attack*Thunder_of_Heaven_Attack_Rate;
					System.out.println("유니크 무기 고유 스킬 " + Thunder_of_Heaven + "이 발동합니다!");
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
							if(count<3)
								break;
							bar();
							Thread.sleep(duration*1000);
							Damage = Item_Attack*Thunder_of_Heaven_Add_Attack_Rate;
							System.out.println(Thunder_of_Heaven + "의 추가 데미지가 발동합니다!");
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
	
	public void Explosion(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		bar();
		Thread thread = new Thread(new Runnable() 
		{
			
			int count = 0;
			int duration = 1;
			@Override
			public void run() {
				double Damage = 0;
				Damage = Item_Attack*Explosion_Attack_Rate;
				System.out.println("유니크 무기 고유 스킬 " + Explosion + "이 발동합니다!");
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
							if(count<2)
								break;
							bar();
							Thread.sleep(duration*1000);
							Damage = Item_Attack*Explosion_Add_Attack_Rate;
							System.out.println(Explosion + "의 추가 데미지가 발동합니다!");
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
	
	public void Summons_Damon(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		bar();
		Thread thread = new Thread(new Runnable() 
		{
			Random rand = new Random();
			@Override
			public void run() {
					double Damage = 0;
					int duration = 1;
					Damage = Item_Attack*Summons_Damon_Attack_Rate;
					System.out.println("유니크 무기 고유 스킬 " + Summons_Damon + "이 발동합니다!");
					System.out.println(Damage + "만큼 데미지를 입힙니다!");
					Damage_Calculator damage_calculator = new Damage_Calculator(Damage, monster);
					Damage = damage_calculator.Damage_Conversion();
					sharedresource_battle.Character_Attack(Damage);
					monster.HP = sharedresource_battle.Monster_HP;
					System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
					if(sharedresource_battle.Monster_HP > 0)
						System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
				try {
						if(rand.nextInt(10) < 1)
						{
							Thread.sleep(duration*1000);
							Damage = Item_Attack*Summons_Damon_Add_Attack_Rate;
							System.out.println(Summons_Damon + "의 추가 데미지가 발동합니다!");
							System.out.println(Damage + "만큼 데미지를 입힙니다!");
							Damage = damage_calculator.Damage_Conversion();
							sharedresource_battle.Character_Attack(Damage);
							monster.HP = sharedresource_battle.Monster_HP;
							System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
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
	
	public Item_Jewelry_Hole jewelry_hole = new Item_Jewelry_Hole();
	
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
		else if(num == 3)
		{
			System.out.println("3번 홈에 보석을 장착합니다");
			if(jewelry_hole.jewelry3 == null)
			{
				jewelry_hole.jewelry3 = jewelry;
				if(jewelry_hole.jewelry3.Attack != 0)
					return jewelry_hole.jewelry3.Attack;
				if(jewelry_hole.jewelry3.Defence != 0)
					return jewelry_hole.jewelry3.Defence;
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
		else if(num == 3)
		{
			jewelry_hole.jewelry3 = null;
			System.out.println("3번 홈의 보석을 제거하였습니다");
		}
	}
}
